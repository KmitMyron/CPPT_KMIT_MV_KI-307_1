public class Main {
    public static void main(String[] args) {
        TouchMonitor monitor = new TouchMonitor(new PowerSupply(700, "Brand"), new Screen("1920x1080", 144));

        monitor.TurnOn();
        monitor.TurnOff();
        monitor.ChangeFrequency(60);
        monitor.TurnOn();
        monitor.ChangeFrequency(60);

        // Print the TouchMonitor object
        System.out.println(monitor);
    }
}