public class TouchMonitor extends Monitor implements TurnOnOff {
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
     * Method to turn on the monitor
     */
    @Override
    public void TurnOn() {
        logger.log(logger.infoFlag + "Monitor TurnOn method called");
        if (!isTurnedOn) {
            isTurnedOn = true;
            System.out.println("Monitor is turned on");
        } else {
            System.out.println("Monitor is already turned on");
        }
    }

    /**
     * Method to turn off the monitor
     */
    @Override
    public void TurnOff() {
        logger.log(logger.infoFlag + "Method Monitor TurnOff called");
        if (isTurnedOn) {
            isTurnedOn = false;
            System.out.println("Monitor is turned off");
        } else {
            System.out.println("Monitor is already turned off");
        }
    }

    /**
     * Overridden method to change frequency
     *
     * @param frequency
     */
    @Override
    public void ChangeFrequency(int frequency) {
        logger.log(logger.infoFlag + "Monitor method ChangeFrequency called");
        if (!isTurnedOn)
            System.out.println("You can't change frequency. Firstly, you need to turn on the monitor");
        else {
            System.out.println("Frequency was changed to " + frequency);
            screen.setFrequency(frequency);
        }
    }

    @Override
    public String toString() {
        return "TouchMonitor: \n" +
                "onOffButton = " + getOnOffButton() +
                "\npowerSupply = " + getPowerSupply() +
                "\nscreen = " + getScreen() +
                "\nisTurnedOn = " + isTurnedOn();
    }
}
