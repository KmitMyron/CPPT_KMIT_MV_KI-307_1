public class Monitor
{
    private final Button onOffButton = new Button("On - Off button");
    private PowerSupply powerSupply;
    private Screen screen;
    private Logger logger = Logger.getLogger("logs.txt");
    private boolean isTurnedOn = false;

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
     * Method to turn on monitor
     */
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
     * Method to change frequency
     * @param frequency
     */
    public void ChangeFrequency(int frequency)
    {
        logger.log(logger.infoFlag + "Monitor method ChangeFrequency called");
        if (!isTurnedOn)
            System.out.println("You can't change frequency. Firstly you need to turn on monitor");
        else
        {
            System.out.println("Frequency was changed to " + frequency);
            screen.setFrequency(frequency);
        }
    }

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