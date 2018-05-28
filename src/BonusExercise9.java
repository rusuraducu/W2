/*
*Starting with the solution for Exercise #9, write a more general function that receives a
*number and a base and returns a string with the number’s representation in that base.
 */

import java.util.Arrays;
import java.util.Scanner;
public class BonusExercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Decimal number: ");
        int decimal = scan.nextInt();

        System.out.println("Input the base: ");
        int base = scan.nextInt();
        if(base < 2 || base > 32 || base > decimal)
        {
            while(base < 2 || base > 32)
            {
                System.out.println("Input a value between 2 and 32.");
            }
        }
        if(base>decimal)
        {
            System.out.println("You should have entered a base bigger then the decimal.");
        }
        if(base<10)
        {
            System.out.println("The number " + decimal + " in base " + base + " is "+ baseUnder10(decimal, base) +".");
        }
        if(base>10)
        {
            System.out.println("The number " + decimal + " in base " + base + " is "+ baseOver10(decimal, base) +".");
        }
    }

    // For the numbers greater than 9 has been assigned letters. So, each time when the remainder of the division is
    // greater than 9, the program will assign a letter to that number.

    private static String baseOver10(int decimal, int base) {
        int remainder = 0;
        String convertedNumber= "";
        char[] numeringSystem = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            remainder=decimal%base;
            convertedNumber = numeringSystem[remainder] + convertedNumber;
            decimal=decimal/base;
        }
        return convertedNumber;
    }

    // Divide the decimal number by base and add the remainder of the division in the variable binaryNumber.

    private static String baseUnder10(int decimal, int base) {
        String convertedNumber= "";
        while (decimal > 0) {
            int remainder = decimal % base;
            convertedNumber= remainder+convertedNumber;
            decimal = decimal / base;
        }
        return convertedNumber;
    }
}
