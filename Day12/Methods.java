package com.example.methods;

public class Methods {
    public static void main(String[] args) {
        //void method performs task and terminates without returning anything
        //ex: System.out.println("void method");
        //value-returning method performs task and sends value back
        //to code that called it
        //ex: int number = integer.parseInt("700");

        //calls method, arguments 20 and 30 (passed to printAverage)
        //printAverage(20,30);

        //double average = getAverage(30,30);
        //System.out.println("Average: " + average);

        //String fullName = fullName("John", "Rambo");
        //System.out.println(fullName);

        int value = 10;
        //calls isValid() method with argument value (10) passed
        if (isValid(value))
        {
            System.out.println("The value is in range!");
        }
        else
        {
            System.out.println("The value is not in range!");
        }
    }

    /**
     * This method prints the average of the two numbers
     * @param val1 The first number
     * @param val2 The second number
     */
    //void method (doesn't return value, has parameters val1, val2)
    public static void printAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        System.out.println("Average: " + average);
    }

    /**
     * This method calculates the average and returns it
     * @param val1 The first value
     * @param val2 The second value
     * @return The average of the 2 values
     */
    //double and not void so that double average returned
    public static double getAverage(int val1, int val2)
    {
        return (val1 + val2) / 2.0;
    }
    //returns strings name surname (with name and surname as parameters)
    public static String fullName(String name, String surname)
    {
        return name + " " + surname;
    }
    //method returns number in range 1-100 with number as parameter
    public static boolean isValid(int number)
    {
        return (number >= 1 && number <= 100);
    }

}
