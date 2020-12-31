package com.example.arrays;

import java.util.ArrayList;

public class TheArrayList {
    public static void main(String[] args) {

        //creates ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        //adding strings (names) to list
        names.add("James");//0
        names.add("Peter");//1
        names.add("John");//2

        names.add("Jake");//3
        names.add("Paul");//4
        names.add("Peters");//5

        //for loop to print each name in list on new line
        for (int i=0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }
    }
}
