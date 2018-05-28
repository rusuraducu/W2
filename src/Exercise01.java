/*
 * Write a function that receives an array and returns a new array sorted by insertion sort.
 */
//
//// Rewritten with do while statement.
//

import java.util.Arrays;
public class Exercise01 {
    public static void main (String [] args)
    {
            int []  array = {10,2,42,1,20,17};
            boolean isSorted = false;
            int temp = 0;
            //The loop 'do while' will run as long as isSorted variable is true.
            do {
                isSorted = false;
                for(int i = 1; i<array.length; i++)
                {
                    if(array[i]<array[i-1])
                    {
                        temp = array[i-1];
                        array[i-1]=array[i];
                        array[i]=temp;
                        isSorted = true;
                    }
                }
            }
            while(isSorted);
        System.out.printf("The sorted array is: " + Arrays.toString(array) +".");
        }
    }

