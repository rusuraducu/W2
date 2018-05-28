/*
*Write a function that takes an array of numbers and returns a new array with only the
*odd numbers.
 */

import java.util.Arrays;
public class Exercise05 {
    public static void main(String[] args) {
        int[] array = {33,55,22};
        oddNumbers(array);
    }

    // The next method is going to move the odd numbers in a new array.

    private static void oddNumbers(int[] array) {

        // We create a new array for the odd number.
        // The length of the new array has been found out in the method 'lengthArrayOddNumbers'.
        // We move the odd numbers in the 'oddNumbersArray'.

        int[] oddNumbersArray = new int[lengthArrayOddNumbers(array)];

        int n=0;
        for (int i = 0; i <=array.length-1; i++) {
            if (array[i] % 2 == 1) {
            oddNumbersArray[n] = array[i];
            n++;
            }
        }
        //Print the results.
        System.out.print("The odd numbers are: ");
        System.out.println(Arrays.toString(oddNumbersArray));
    }

    // The next method is going to find out the length of the odd numbers array.

    private static int lengthArrayOddNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
