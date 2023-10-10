public class Shop implements Room {
    private double area;
    private int floor;

    public Shop(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Shop: -area: " + area + "; -floor: " + floor + ";");
    }
}
