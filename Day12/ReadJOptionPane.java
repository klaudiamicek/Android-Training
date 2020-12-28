package com.example.read.joptionpane;

import javax.swing.*;

public class ReadJOptionPane {
    public static void main(String[] args) {

        //declares String variables
        String name;
        String surname;

        //using JOptionPane class to get input names
        name = JOptionPane.showInputDialog("Please enter your name: ");
        surname = JOptionPane.showInputDialog("Please enter your surname: ");

        //displays message (no input) in middle of screen (null)
        JOptionPane.showMessageDialog(null,name + " " + surname);

        //declares int variables
        int firstNumber;
        int secondNumber;
        String input;

        input = JOptionPane.showInputDialog("Please enter the first number: ");
        //converts input to integer and saves into first number
        firstNumber = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Please enter the second number: ");
        //converts input to integer and saves into second number
        secondNumber = Integer.parseInt(input);

        //calculates average
        double average = (firstNumber + secondNumber) / 2.0;

        //displays message (no input) in middle of screen (null)
        JOptionPane.showMessageDialog(null,"Average: " + average);


    }

}
