/*
Write a function that receives two sorted arrays and returns a new sorted array with elements from both arrays.
Tip: this is called the merge algorithm.
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {

        int[] arr01 = {7,19, 22, 23, 24};
        int[] arr02 = {1, 3, 5, 10, 11};
        System.out.printf("The new sorted array is: ");
        MergeTwoArrays(arr01, arr02);
    }

    private static void MergeTwoArrays(int[] arr01, int[] arr02) {
        int i = 0, j = 0, k = 0;
        int lengthArr01 = arr01.length;
        int lengthArr02 = arr02.length;

        //Create a new array with the length of both arrays.

        int[] sortedArray = new int[arr01.length + arr02.length];

        // We are comparing the elements of the two arrays. The smaller values will be moved first in the new array.

        while (i < lengthArr01 && j < lengthArr02) {
            if (arr01[i] < arr02[j]) {
                sortedArray[k++] = arr01[i++];

            }
            if (arr01[i] > arr02[j]) {
                sortedArray[k++] = arr02[j++];
            }
        }
        //Copy the remaining elements of Arr01 into the "sortedArray", if there are any.
        while (i < lengthArr01) {
            sortedArray[k++] = arr01[i++];
        }
        //Copy the remaining elements of Arr02 into the "sortedArray", if there are any.
        while (j < lengthArr02) {
            sortedArray[k++] = arr02[j++];
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
