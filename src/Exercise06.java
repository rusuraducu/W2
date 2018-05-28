/*
*Write a function that takes an array of numbers and prints the numbers that appear on
*consecutive positions in the array:
 */

import java.util.Arrays;
public class Exercise06 {
    public static void main(String[] args) {
        int[] array = {2,3,4,4,5,7,7,9,10,10,11,12,12};
        numbersOnConsecutivePositions(array);
    }

    // The method 'numbersOnConsecutivePositions' will return an array with the numbers on consecutive positions.

    private static void numbersOnConsecutivePositions(int array[]) {
        int lengthNewArray = newArrayLength(array);
        int[] numbersOnConsecutivePositions = new int[lengthNewArray];
        // Start with the number from the index 1 of the array and compare it with the previous number.
        int n = 0;
        for (int i = 1; i <= array.length - 1; i++) {
            // If the current number is equal with the previous one then move it into in a new array.
            if (array[i] == array[i - 1]){
                numbersOnConsecutivePositions[n] = array[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(numbersOnConsecutivePositions));
    }

    // The method 'newArrayLength' calculates the length of the new array.

    private static int newArrayLength(int[] array) {
        int newArrayLength = 0;
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] == array[i - 1]) {
                newArrayLength++;
            }
        }
        return newArrayLength;
    }
}

