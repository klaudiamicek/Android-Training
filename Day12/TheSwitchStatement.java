package com.example.decision;

import javax.swing.*;

public class TheSwitchStatement {
    public static void main(String[] args) {

        int number;

        String input;

        input = JOptionPane.showInputDialog("Please enter 1, 2, or 3: ");
        //converts input to integer and saves into first number
        number = Integer.parseInt(input);
        //number is tested for equality against different numbers/cases
        switch (number)
        {
            //number=1, displays message
            case 1:
                JOptionPane.showMessageDialog(null, "You entered 1!");
                //break to not go to next case
                break;
            //number=2, displays message
            case 2:
                JOptionPane.showMessageDialog(null, "You entered 2!");
                break;
            //number=3, displays message
            case 3:
                JOptionPane.showMessageDialog(null, "You entered 3!");
                break;
            //like else statement, displays message
            default:
                JOptionPane.showMessageDialog(null,
                        "You did not enter a 1, 2, or a 3!");


        }

       char letter;
        input = JOptionPane.showInputDialog("Please enter a, b, or c: ");
        //letter is character at first index 0
        letter = input.charAt(0);
        //letter is tested for equality against different characters/cases
        switch (letter)
        {
            //if letter=A or a
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null, "You entered a!");
                break;
            //if letter=B or b
            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null, "You entered b!");
                break;
            //if letter=C or c
            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null, "You entered c!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You did not enter a correct letter!!");
                break;

        }
        //exits program, status=0(no errors)
        System.exit(0);

    }
}
