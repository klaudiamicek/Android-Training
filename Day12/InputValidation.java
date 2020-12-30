package com.example.calculations;

import javax.swing.*;

public class InputValidation {
    public static void main(String[] args) {
        //getting input with JPOptionPane
        String input = JOptionPane.showInputDialog(
                "Please enter a number in the range of 1 through 100");
        //converts input to integer and saves into first number
        int number = Integer.parseInt(input);

        //while loop (while not in range, displays message and asks for input until in range)
        while (number < 1 || number > 100) {
            JOptionPane.showMessageDialog(null,
                    "That number is not valid!");
            input = JOptionPane.showInputDialog(
                    "Please enter a number in the range of 1 through 100");
            number = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "Correct!");
    }
}
