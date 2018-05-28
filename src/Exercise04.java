/*
Write a function that returns a string representation of an array of doubles, e.g [1, 2, 3] ->
“[1, 2, 3]”. Format number with two decimals.
*There are 3 methods: getArrayLength, getArrayOfDoubles and StringRepresentation.
 */

import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {
        double[] aDoubleArray = {1, 2, 3};
        String stringRepresentationOfAnArray = new String(StringRepresentation(aDoubleArray));
        System.out.println("\""+stringRepresentationOfAnArray+"\"");
    }
    // We write a new method called StringRepresentation.
    // We will use the "Arrays.toString()" statement.

    private static String StringRepresentation(double[] aDoubleArray) {
        String StringRepresentation = Arrays.toString(aDoubleArray);
        return StringRepresentation;
    }

}