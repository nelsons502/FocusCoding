import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // User input with possible exception
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // Might throw an InputMismatchException

            // Division with possible exception
            int result = 100 / number; // Might throw an ArithmeticException
            System.out.println("100 divided by " + number + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("This always runs, whether an exception occurs or not.");
            scanner.close(); // Always close the scanner
        }

        System.out.println("Program continues...");
    }
}

/*
 * Exercise 1:
 * - Modify the program to catch `InputMismatchException` separately.
 *
 * Exercise 2:
 * - Ask the user for two numbers and handle potential division errors.
 */