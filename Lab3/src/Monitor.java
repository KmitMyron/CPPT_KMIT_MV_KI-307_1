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