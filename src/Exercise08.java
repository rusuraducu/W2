/*
Write a function that receives an int and returns its base 2 representation as a string.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the decimal number: ");
        // Input a decimal number.
        int number = scan.nextInt();
        // Print the result.
        System.out.println("The number " + number + " in base 2 is " + zecimalToBinary(number));
    }

    // In the next method is calculated the binary number.
    private static String zecimalToBinary(int number) {

        //The digits of the binary number will be stored in a String variable.
        String binaryNumber = "";

        // Divide the decimal number by two and add the remainder of the division in the variable binaryNumber.

        int remainder = 0;
        while(number>0)
        {
            remainder=number%2;
            binaryNumber=remainder+binaryNumber;
            number=number/2;
        }

        //Return the binary number.
        return binaryNumber;
    }
}
