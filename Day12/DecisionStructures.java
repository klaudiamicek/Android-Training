package com.example.decisions;

public class DecisionStructures {
    public static void main(String[] args) {
       //declaring and assigning int variables
        int x = 5;
        int y = 6;
        int p = 7;

        //declaring and assigning boolean (true or false)

       //will print false since 5<6
        boolean expression = !(x<y);
        //will print false since 5 not equal to 6
        //also false if expression= x==y
        //true if expression = x<y, !(x>p), (y>x)||(y>p)



        System.out.println(expression);
    }
}
