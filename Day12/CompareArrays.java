public class CompareArrays {
    public static void main(String[] args) {

        //declaring, initializing two arrays
        int[] numbers1 = {2, 4, 6, 8, 10};
        int[] numbers2 = {2, 5, 6, 8, 10};

        boolean arraysEqual = true;
        int i = 0;

        //if length of first array not equal to length of second, they're not equal (false)
        if (numbers1.length != numbers2.length) {
            arraysEqual = false;
        }

        //while true and i index less than length of first array
        while (arraysEqual && i < numbers1.length) {
            //if index element of array 1 and 2 not equal, arrays not equal
            if (numbers1[i] != numbers2[i]) {
                arraysEqual = false;
            }
            i++;
        }
        //if arrays equal (or boolean true) prints "They are the same!"
        if (arraysEqual) {
            System.out.println("They are the same!");
        } else {
            System.out.println("They are not the same!");
        }
    }
}
