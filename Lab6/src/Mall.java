import java.util.ArrayList;
import java.util.List;

public class Mall <T extends Room> // створюєм параметризований клас, який параметром може прийняти тільки той об'єкт, який реалізовує інтерфейс
{
    private final List<T> buildings;

    /**
     * Constructor
     */
    public Mall() // створєм список об'єктів
    {
        this.buildings = new ArrayList<T>();
    }

    /**
     * Method to find max area building
     * @return max
     */
    public T FindMax() //метод для пошуку максимального об'єкта
    {
        if (buildings.isEmpty())
        {
            return null;
        }
        else
        {
            T max = buildings.get(0);
            for (int i = 1; i < buildings.size(); i++)
            {
                if (buildings.get(i).getArea() > max.getArea())
                {
                    max = buildings.get(i);
                }
            }
            return max;
        }
    }

    /**
     * Method to add item
     * @param item
     */
    public void AddItem(T item)
    { // метод для додавання об'єктів
        buildings.add(item);
        var index = buildings.indexOf(item);
        System.out.print("Element was added: index - " + index + "; ");
        item.PrintInfo();
    }

    /**
     * Method to delete item
     * @param i
     */
    public void DeleteItem(int i)
    {// метод для видалення об'єктів
        System.out.print("Element on index " + i + " was deleted: ");
        buildings.get(i).PrintInfo();
        buildings.remove(i);
    }

    /**
     * Method to PrintAllItems
     */
    public void PrintAllItems()
    {// метод для виводу всіх об'єктів на екран
        for (T el : buildings)
        {
            el.PrintInfo();
        }
    }
}