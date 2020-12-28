package com.reading.input.scanner;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {

        //declaring two int variables
        int firstNumber;
        int secondNumber;

        //creating scanner object to read input
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter the first number");
        //reads first int as firstNumber
        firstNumber=kb.nextInt();

        System.out.println("Please enter the second number");
        //reads next int as secondNumber
        secondNumber=kb.nextInt();

        //calculates average using inputs, 2.0 to not throw away decimal
        double average = (firstNumber + secondNumber) / 2.0;

        System.out.println("The average is: " + average);

        //declares two String variables
        String name;
        String surname;

        //necessary to read first input (moves to next line)
        kb.nextLine();
        System.out.println("Please enter your name: ");
        name=kb.nextLine();

        System.out.println("Please enter your surname: ");
        surname=kb.nextLine();

        System.out.println(name + " " + surname);
        
    }

}
