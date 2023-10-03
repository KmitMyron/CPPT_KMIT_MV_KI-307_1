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