public class CopyArrays {
    public static void main(String[] args) {
        //declaring, initializing array
        int[] array1 = {2, 4, 6, 8, 10};
        //creating new object array 2 with same length
        int[] array2 = new int[array1.length];

        //for loop so each array2 element = array1 element
        //both arrays not pointing to same object or array
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        array1[1] = 5;
        //calls method printArray, passing array, then second array after new line
        printArray(array1);
        System.out.println();
        printArray(array2);
    }
    //void method with array parameter
    public static void printArray(int[] array) {
        for (int value : array) {
            //prints each value in array (passed in main)
            System.out.println(value);
        }
    }
}
