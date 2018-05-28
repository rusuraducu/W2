/*
///*Write a function that checks whether an array is sorted or not.
 */
public class Exercise07 {
    public static void main(String[] args) {
        int[] array = {2,2,3};
        checkIfTheArrayIsSorted(array);
    }

    public static void checkIfTheArrayIsSorted(int[] array) {
        // The variable 'isArray' checks if the variable 'array' has the length greater then 1.
        boolean isArray = array.length > 1;

        //If isArray == true then check if the number from the current index is smaller than the previous one.

        if (isArray) {
            boolean isSorted = true;
            for (int i = 1; i < array.length; i++) {
                //If the current number is smaller than the previous one then the array is not sorted. Break!
                if (array[i] < array[i - 1]) {
                    isSorted = false;
                    break;
                }
            }

            //If the value of the 'isSorted' variable hasn't been changed after the 'for loop' then we have a sorted array.

            String Message = isSorted ? "The array is sorted." : "The array is not sorted.";
            System.out.println(Message);
        } else
            System.out.println("The length of the variable is to short to be an array.");
    }
}