public class Arrays {
    public static void main(String[] args) {
        //creating array object with 4 elements
        int [] numbers = new int[4];
        //number in [] is index starting with 0, 4 elements
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;

        //creating second array with elements in { }
        int [] numbers2 = {10, 15, 20, 25, 30};

        //loop executes array length number of times
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        System.out.println();

        for (int val : numbers)
        {
            //prints each int from numbers array
            System.out.println(val);
        }

    }
}
