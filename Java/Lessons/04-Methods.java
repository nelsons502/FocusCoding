import java.util.Scanner; // import the Scanner class

public class Methods {
    // A method is a block of code that performs a specific task
    // Methods help us reuse code and make our programs more organized

    // This is a simple method that prints a greeting
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // This method takes parameters (inputs) and returns a value
    public static int add(int a, int b) {
        return a + b;
    }

    // This method asks for user input and returns it
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        // Calling a method
        greet();

        // Calling a method with parameters
        int sum = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);

        // Calling a method that returns a value
        String name = getUserInput();
        System.out.println("Hello, " + name + "!");
    }
}

/*
 * Exercise 1:
 * - Write a method that multiplies two numbers and returns the result.
 *
 * Exercise 2:
 * - Write a method that takes a name as an argument and prints a personalized greeting.
 */