import java.util.Arrays; // import Arrays utility class

public class ArraysLesson {
    public static void main(String[] args) {
        // Arrays allow us to store multiple values in a single variable

        // DECLARING AND INITIALIZING ARRAYS
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("First element: " + numbers[0]); // Accessing an element

        // MODIFYING AN ARRAY
        numbers[2] = 35; // Changing the value at index 2
        System.out.println("Updated third element: " + numbers[2]);

        // LOOPING THROUGH AN ARRAY
        System.out.println("Printing all elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // ENHANCED FOR LOOP
        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // MULTIDIMENSIONAL ARRAYS
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\nElement at row 2, col 3: " + matrix[1][2]); // Accessing a value
    }
}

/*
 * Exercise 1:
 * - Create an array of 5 names and print each name using a loop.
 *
 * Exercise 2:
 * - Create a 3x3 array (matrix) and print it in a grid format.
 */