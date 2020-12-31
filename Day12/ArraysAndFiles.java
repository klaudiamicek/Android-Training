import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArraysAndFiles {
    public static void main(String[] args) throws IOException {

        //creating array object
        int[] values = new int[12];

        int i = 0;

        //creates new file object
        File file = new File("Values.txt");
        //if file exists, reads from scanner (parses file object, making connection)
        if (file.exists()) {
            Scanner inputFile = new Scanner(file);
            //as long as file has next integer:
            while (inputFile.hasNext() && i < values.length) {
                values[i] = inputFile.nextInt();
                i++;
            }
            //closes file
            inputFile.close();

            //for loop to print each value in file
            for (int value : values) {

                System.out.println(value);

            }
        }
    }
}
