import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class App
 * @version 1.0
 * @since version 1.0
 */

public class MyronKmit {
    /**
     * Статичний метод main є точкою входу в програму
    10 *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;

        String filler;
        Scanner in = new Scanner(System.in);

        File dataFile = new File("output-lab2.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter the size of the square matrix: ");
        nRows = in.nextInt();
        in.nextLine();
        char[][] arr = new char[nRows][nRows];

        System.out.print("\nEnter the placeholder: ");
        filler = in.nextLine();

        if(filler.length() != 1)
        {
            System.out.println("The placeholder character was entered incorrectly");
            System.exit(1);
        }

        for (int i = 1; i <= nRows; i++) {
            int rowIndex = i - 1;
            for (int j = 1; j <= nRows; j++) {
                int columnJndex = j - 1;

                if((i >= nRows / 2 && j <= nRows / 2) || (i <= nRows / 2 && j >= nRows / 2 + 1)){
                    arr[rowIndex][columnJndex] = (char) filler.codePointAt(0);
                }else{
                    arr[rowIndex][columnJndex] = (char) "  ".codePointAt(0);
                }

            }
        }

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            fout.print("\n");
            System.out.print("\n");
        }
        fout.flush();
        fout.close();
    }
}