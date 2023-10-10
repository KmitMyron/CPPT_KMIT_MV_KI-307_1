public class Office implements Room{
	// Клас, який реалізує інтерфейс
    private double area;
    private int floor;
    private double price;


    /**
     * Constructor
     * @param area
     * @param floor
     * @param price
     */
    public Office(double area, int floor, double price)
    {
        this.area = area;
        this.floor = floor;
        this.price = price;
    }

    /**
     * Setter for area
     * @param area
     */
    public void setArea(double area)
    {
        this.area = area;
    }

    /**
     * Getter for floors
     * @return floor
     */
    public int getFloor()
    {
        return floor;
    }

    /**
     * Setter for floors
     * @param floor
     */
    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    /**
     * Getter for price
     * @return price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Setter for price
     * @param price
     */
    public void setPrice(double price)
    {
        this.price = price;
    }


    /**
     * Overrided method for area
     * @return
     */
    @Override
    public double getArea()
    {
        return area;
    }

    /**
     * Overrided method PrintInfo
     */
    @Override
    public void PrintInfo()
    {
        System.out.println("Office: -area: " + area + "; -floor: " + floor + "; -price: " + price);
    }
}