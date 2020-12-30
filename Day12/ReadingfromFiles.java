package com.example.textfiles;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {

        int sum = 0;
        int count = 0;
        double average;

        //creates new file object
        File file = new File ("OutputFile.txt");
        //if file exists, reads from scanner (parses file object, making connection)
        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);
            //as long as file has next integer:
            while (inputFile.hasNext())
            {
                //sum=sum+next integer in file
                sum = sum + inputFile.nextInt();
                //counts number of values (increments by 1 each time)
                count++;
            }

            //close file
            inputFile.close();

            average = sum / (double) count;

            JOptionPane.showMessageDialog(null,
                    "Sum of all values: " + sum + "\n" +
                    "The number of values: " + count + "\n" +
                   "The average is: " + average );
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "This file does" + " not exist!");
        }

    }
}
