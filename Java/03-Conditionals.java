import java.util.Scanner; // import the Scanner class for reading user input

public class Conditionals {
    public static void main(String[] args) {
        // Conditionals allow us to make decisions in our programs
        // The most common conditional statements are if, else if, and else

        Scanner scanner = new Scanner(System.in);

        // IF-ELSE STATEMENT
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        // NESTED CONDITIONALS
        System.out.print("\nEnter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // SWITCH STATEMENT
        System.out.print("\nEnter a day number (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
    }
}

/*
 * Exercise 1:
 * - Ask the user for a number and print whether it is positive, negative, or zero.
 *
 * Exercise 2:
 * - Create a simple calculator that asks the user for two numbers and an operation (+, -, *, /),
 *   then prints the result using a switch statement.
 */