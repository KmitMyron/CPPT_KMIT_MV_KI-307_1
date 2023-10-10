public class Main {
    public static void main(String[] args) {
        Mall<? super Room> building = new Mall<>();

        building.AddItem(new Office(45.4, 4, 3));
        building.AddItem(new Shop(41.2, 7));
        building.AddItem(new Shop(22.6, 6));
        building.AddItem(new Shop(85.2, 2));
        building.AddItem(new Office(45.4, 4, 33));
        building.AddItem(new Office(127.4, 9, 100));
        building.AddItem(new Office(109.2, 10, 90));
        building.AddItem(new Office(134.9, 15, 334));
        building.AddItem(new Office(121.4, 10, 96));

        var max = building.FindMax();

        System.out.print("Max element: ");
        max.PrintInfo();
    }
}
