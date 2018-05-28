/*
 **Write a function that sorts an array of numbers using merge sort.
 */

import java.util.Arrays;
public class BonusExtraExercise11 {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 55, 44, 22, 77, 66, 33, 22, 1, 66, 44, 1, 11, 22};

        //Call the merge sort method
        String sortedArray = Arrays.toString(SortArray(unsortedArray));
        System.out.println(sortedArray);
    }

    // The method SortArray divides the arrays in halves.

    public static int[] SortArray(int[] unsortedArray) {
        if (unsortedArray.length == 1) {
            return unsortedArray; // Array is a single element.
        }
        int[] leftSide = new int[0];
        int[] rightSide = new int[0];
        int[] sortedArray;

        // Find the midpoint point to divide the array into two halves

        int midpoint = unsortedArray.length / 2;
        int remainder = unsortedArray.length % 2;

        // Establish the length of the halves.

        if (remainder == 0) {
            leftSide = new int[midpoint];
            rightSide = new int[midpoint];
        }
        if (remainder == 1) {
            leftSide = new int[midpoint];
            rightSide = new int[midpoint + 1];
        }

        // Populate the halves.

        for (int i = 0; i < leftSide.length; i++) {
            leftSide[i] = unsortedArray[i];
        }
        int n = 0;
        for (int j = midpoint; j < unsortedArray.length; j++) {
            rightSide[n] = unsortedArray[j];
            n++;
        }

        // Call the method SortArray for each of the halves.

        leftSide = SortArray(leftSide);
        rightSide = SortArray(rightSide);

        // Merge the elements into a sorted array.

        sortedArray = Merge(leftSide, rightSide);
        return sortedArray;
    }

    // The next method merge the arrays divided above.

    public static int[] Merge(int[] leftSide, int[] rightSide) {
        int lengthSortedArray = leftSide.length + rightSide.length;
        int[] sortedArray = new int[lengthSortedArray];
        int indexL = 0;
        int indexR = 0;
        int indexSortArr = 0;

        // The smaller numbers are moved at the beginning of the array...

        while (indexL < leftSide.length || indexR < rightSide.length) {
            if (indexL < leftSide.length && indexR < rightSide.length) {
                if (leftSide[indexL] <= rightSide[indexR]) {
                    sortedArray[indexSortArr++] = leftSide[indexL++];
                } else {
                    sortedArray[indexSortArr++] = rightSide[indexR++];
                }
            } else {
                if (indexL < leftSide.length) {
                    sortedArray[indexSortArr++] = leftSide[indexL++];
                }
                if (indexR < rightSide.length) {
                    sortedArray[indexSortArr++] = rightSide[indexR++];
                }
            }
        }
        return sortedArray;
    }
}
