/**
 * Class Button
 * @author
 * @version 1.0
 */
public class Button
{
    private String action;

    /**
     * Constructor
     * @param action
     */
    public Button(String action) {
        this.action = action;
    }

    /**
     * Getter for action
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * Setter for action
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Button{ " +
                "action = '" + action + '\'' +
                '}';
    }
}
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class Logger. Was created to log information, errors and warnings. Also there was implemented Singelton
 * @author
 * @version 1.0
 */
public class Logger
{
    private static Logger logger;
    private final String fileName;

    protected final String infoFlag = new String("[INFO] ");
    protected final String errorFlag = new String("[ERROR] ");
    protected final String warningFlag = new String("[WARNING] ");

    /**
     * Constructor
     * @param fileName
     */
    private Logger(String fileName)
    {
        this.fileName = fileName;
        File loggerFile = null;
        FileWriter fout = null;
        try
        {
            loggerFile = new File(fileName);
            fout = new FileWriter(loggerFile, true);
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            fout.write("[" + formatter.format(date) + "] " + "Logger start to work\n");
        }
        catch (IOException e)
        {
            System.err.println("Something wrong with log file" + e.getMessage());
            System.exit(1);
        }
        finally
        {
            try
            {
                fout.flush();
                fout.close();
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Method to do logging
     * @param massege
     */
    public void log(String massege)
    {
        File loggerFile = null;
        FileWriter fout = null;
        try
        {
            loggerFile = new File(this.fileName);
            fout = new FileWriter(loggerFile, true);
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            fout.write("[" + formatter.format(date) + "] " + massege +  "\n");
        }
        catch (IOException e)
        {
            System.err.println("Something wrong with log file" + e.getMessage());
            System.exit(1);
        }
        finally
        {
            try
            {
                fout.flush();
                fout.close();
            }
            catch (IOException | NullPointerException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Singleton implementation
     * @param fileName
     * @return
     */
    public static Logger getLogger(String fileName)
    {
        if (logger == null)
        {
            logger = new Logger(fileName);
        }
        return logger;
    }

    /**
     * Getter for logger
     * @return logger
     */
    public static Logger getLogger()
    {
        return logger;
    }

}
/**
 * Class Monitor
 * @author
 * @version 1.0
 */
public abstract class Monitor
{ 
    protected final Button onOffButton = new Button("On - Off button");
    protected PowerSupply powerSupply;
    protected Screen screen;
    protected Logger logger = Logger.getLogger("logs.txt");
    protected boolean isTurnedOn = false;

    /**
     * Constructor
     * @param powerSupply
     * @param screen
     */
    public Monitor(PowerSupply powerSupply, Screen screen) {
        this.powerSupply = powerSupply;
        this.screen = screen;
        logger.log(logger.infoFlag + "Monitor constructor called");
    }
    

    /**
     * Method to change frequency
     * @param frequency
     */
    public abstract void ChangeFrequency(int frequency);

    public Button getOnOffButton() {
        return onOffButton;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    @Override
    public String toString() {
        return "Monitor: \n" +
                "onOffButton = " + onOffButton +
                "\npowerSupply = " + powerSupply +
                "\nscreen = " + screen +
                "\nisTurnedOn = " + isTurnedOn;
    }
}
public class PowerSupply
{
    private int power;
    private String brand;

    public PowerSupply(int power, String brand) {
        this.power = power;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "PowerSupply{ " +
                "power = " + power +
                "w. , brand = '" + brand + '\'' +
                '}';
    }
}
public class Screen
{
    private String expansion;
    private int frequency;

    public Screen(String expansion, int frequency)
    {
        this.expansion = expansion;
        this.frequency = frequency;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Screen{ " +
                "expansion = '" + expansion + '\'' +
                ", frequency = " + frequency +
                "}";
    }
}
public class TouchMonitor extends Monitor implements TurnOnOff
{
    /**
     * Constructor
     *
     * @param powerSupply
     * @param screen
     */
    public TouchMonitor(PowerSupply powerSupply, Screen screen) {
        super(powerSupply, screen);
    }

    /**
     * Method to turn on monitor
     */
    @Override
    public void TurnOn()
    {
        logger.log(logger.infoFlag + "Monitor TurnOn method called");
        if(!isTurnedOn)
        {
            isTurnedOn = true;
            System.out.println("Monitor is turned on");
        }
        else
        {
            System.out.println("Monitor is already turned on");
        }
    }

    /**
     * Method to turn off monitor
     */
    @Override
    public void TurnOff()
    {
        logger.log(logger.infoFlag + "Method Monitor TurnOff called");
        if(isTurnedOn)
        {
            isTurnedOn = false;
            System.out.println("Monitor is turned off");
        }
        else
        {
            System.out.println("Monitor is already turned off");
        }
    }

    /**
     * Overrided method to change frequency
     * @param frequency
     */
    @Override
    public void ChangeFrequency(int frequency) {
        logger.log(logger.infoFlag + "Monitor method ChangeFrequency called");
        if (!isTurnedOn)
            System.out.println("You can't change frequency. Firstly you need to turn on monitor");
        else
        {
            System.out.println("Frequency was changed to " + frequency);
            screen.setFrequency(frequency);
        }
    }

    @Override
    public String toString() {
        return "TouchMonitor: \n" +
                "\nonOffButton = " + onOffButton +
                "\npowerSupply = " + powerSupply +
                "\nscreen = " + screen +
                "\nisTurnedOn = " + isTurnedOn;
    }
}
public interface TurnOnOff
{
    void TurnOn();
    void TurnOff();
}
public class Main {
    public static void main(String[] args) {
        TouchMonitor monitor = new TouchMonitor(new PowerSupply(700, "Brand"), new Screen("1920x1080", 144));

        monitor.TurnOn();
        monitor.TurnOff();

        monitor.ChangeFrequency(60);
        monitor.TurnOn();
        monitor.ChangeFrequency(60);