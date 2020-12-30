import javax.swing.*;

public class SentinelValues {
    public static void main(String[] args) {
        int value;
        int doubleValue;
        //reads string input with JOptionPane
        String input = JOptionPane.showInputDialog("Please enter a value to double " +
               "(0 to stop)" );

        //converts input to integer and saves into input
        value = Integer.parseInt(input);

        //when value=0, loop doesn't execute
        while (value != 0)
        {
            doubleValue = value * 2;

            //displays message with calculated double value, then asks for input again (if 0, stops)
            JOptionPane.showMessageDialog(null,
                    "" + value + " doubled is " + doubleValue);

            input = JOptionPane.showInputDialog("Please enter a value to double" +
                    "(0 to stop)");
            value = Integer.parseInt(input);
        }
        System.exit(0);

    }
}
