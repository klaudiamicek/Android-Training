package com.example.loops;

public class Loops {
    public static void main(String[] args) {
        //loop control variable
       int x = 0;
        //while loop (while x less than 5, prints message on new line)
        //pre-test loop
        while (x < 5)
        {
            System.out.println("Hello World!");
            //incrementing x by 1 (or x+=1 or x++)
            x = x + 1;
        }
        System.out.println("");

        //do-while loop

        //loop control variable
        int y = 0;

        //executes while y<5
        do {
            System.out.println("Hello World!");
            //incrementing y by 1
            y++;
        } while(y < 5); //post-test loop

        System.out.println("");


        //for loop
        //declaring and initializing variable, then condition i<5, and incrementing each time
        for (int i = 0; i < 5; i++) //pre-test loop
        {
            System.out.println("Hello World!");
        }

    }
}
