package com.example.arrays;

public class StringArrays {
    public static void main(String[] args) {
        //array of String names equals method with object array
        String [] names = getNames();

        //for loop to print first index character of each string in array on new line
        for (int i = 0; i < names.length; i++)
        {
            if(names[i] != null) {
                System.out.println(names[i].charAt(0));
            }
        }
    }
    //getNames() method, returns names (not void)
    public static String [] getNames()
    {
        //creates String array object
        String [] names = new String[6];

        names[0] = "John";
        names[1] = "Peter";
        names[2] = "Paul";
        names[3] = "Simon";
        names[4] = "Chuck";

        return names;
    }
}
