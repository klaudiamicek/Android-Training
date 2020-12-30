import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals
{
    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales = 0.0; //running total

        //to format how decimal will look like
        //# means if something in this position, if not then nothing
        //0 means if something in this position, show it and if not then 0
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String input = JOptionPane.showInputDialog(
                "For how many days do you have sales" + " figures?");
        //converts input to integer and saves into first number
        days = Integer.parseInt(input);

        //for loop (days number of times)
        for (int count = 1; count <= days; count++)
        {
            input = JOptionPane.showInputDialog(
                    "Enter the sales for the day" + count);
            //converts input to double and saves into input
            sales = Double.parseDouble(input);

            totalSales += sales;
        }
        JOptionPane.showMessageDialog(null,
                "The total sales are: $" + dollar.format(totalSales));

        System.exit(0);
    }
}
