import javax.swing.*;

public class UserControlledLoop {
    public static void main(String[] args) {
        int maxValue;
        //getting input with JPOptionPane
        String input = JOptionPane.showInputDialog(
                "How high should I go to square the nr?");
        //converts input to integer and saves into first number
        maxValue = Integer.parseInt(input);

        System.out.println("Number          Number squared");
        System.out.println("------------------------------");
        //for loop, prints input number of times
        for (int number = 1; number <= maxValue; number++)
        {
            // prints number 3 \t (tabs) and number^2
            System.out.println(number + "\t\t\t" + number*number);
        }
    }
}
