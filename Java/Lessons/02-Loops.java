import java.util.Scanner; // import the Scanner class for user input

public class Loops {
    public static void main(String[] args) {
        // Loops allow us to repeat code multiple times
        // There are three types of loops in Java: for, while, and do-while

        // FOR LOOP
        // The for loop runs a block of code a specific number of times
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // WHILE LOOP
        // The while loop runs as long as a condition is true
        System.out.println("\nWhile Loop Example:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // DO-WHILE LOOP
        // The do-while loop runs at least once, then repeats as long as the condition is true
        System.out.println("\nDo-While Loop Example:");
        int num = 1;
        do {
            System.out.println("Number is: " + num);
            num++;
        } while (num <= 5);

        // USER INPUT IN A LOOP
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            System.out.print("\nEnter a word (or 'exit' to stop): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }

        System.out.println("Loop ended. Goodbye!");
    }
}

/*
 * Exercise 1:
 * - Write a for loop that prints all even numbers from 2 to 20.
 *
 * Exercise 2:
 * - Create a guessing game where the user has to guess a number (use a while loop).
 */