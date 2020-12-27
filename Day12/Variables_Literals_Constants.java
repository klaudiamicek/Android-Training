package com.example;

public class Variables_Literals_Constants {
    public static void main(String[] args) {
        //declaring two int variables, FIRST_NUMBER is a constant (doesn't change)
        final int FIRST_NUMBER;
        int secondNumber;

        //assigning int variables
        FIRST_NUMBER = 11;
        secondNumber = 20;

        //variable average to get decimals
        double average;

        //calculates average (with 2.0 to not have integer division)
        //with 2.0 answer is 15.5, not 15.0, can do (double) instead
        average = (FIRST_NUMBER + secondNumber) / 2.0;

        //prints "Average": double average, then new line
        System.out.println("Average: " + average);

        //declaring two String variables
        String name;
        String surname;

        //assigning String variables
        name = "John";
        surname = "Rambo";

        //prints name surname
        System.out.println(name + " " + surname);

        //declaring boolean (true or false) variable
        boolean value;

        //assigning boolean variable
        value = false;

        //prints boolean
        System.out.println(value);

        //declaring char variable
        char letter;

        //assigning char variable
        letter = 'j';

        //prints char
        System.out.println(letter);


    }
}
