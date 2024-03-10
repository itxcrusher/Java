package Procedural;
import java.util.Arrays;

    // ! Use Array to Store multiple values in a single variable and perform operations on it

public class Array {
    public static void operations(){
        System.out.println();

        int[] numbers = {10, 20, 30, 40, 50};   // ? Declare array
        numbers[0] = 10;    // ? Store values

        // * Array Oprations
        System.out.println("The length of Array is: " + numbers.length);    // ? Find the length of array
        System.out.println("Values of array are:");
        for (int i : numbers) {
            System.out.print(" " + i);      // ? Display each array value
        }
        Arrays.sort(numbers);   // ? Sort array

        // * 2D Array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };    // ? Rows and Columns
        myNumbers[0][0] = 1;
    }
}