/*
Write a function that receives a number’s string representation in base 2 and returns the
number itself as an int.
E.g. binaryToDecimal(“101”) -> 5
Tip: to iterate through the characters in a string, you can convert the string first to a char
array like so:
String numberInBinary = "110101";
char[] binaryDigits = numberInBinary.toCharArray();

 */
import java.lang.Math;
import java.util.Arrays;

public class BonusExercise10 {
    public static void main(String [] args) {
        String binaryNumberString = "110101";
        int decimalNumber=baseTwoToTen(binaryNumberString);
        System.out.println(binaryNumberString + " in base 10 is " + decimalNumber + ".");
    }

    // Turn a binary number into a decimal number.

    private static int baseTwoToTen(String binaryNumberString) {
        char[] binaryNumberChar = binaryNumberString.toCharArray();
        int decimalNumber = 0;
        int pow=binaryNumberChar.length-1;
        for (int i = 0; i < binaryNumberChar.length; i++) {
            if(binaryNumberChar[i] == '1'){
            int raiseToPower = (int)Math.pow(2, pow);
            decimalNumber= raiseToPower + decimalNumber;}
                    pow--;
        }
        return decimalNumber;
    }
}
