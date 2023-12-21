public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(new PowerSupply(700, "Brand"), new Screen("1920x1080", 144));

        monitor.TurnOn();
        monitor.TurnOff();

        monitor.ChangeFrequency(60);
        monitor.TurnOn();
        monitor.ChangeFrequency(60);
        System.out.println(monitor);
    }
}