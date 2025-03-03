import java.util.Scanner; // import the Scanner class for reading user input

// all code in java must be inside a class
public class Basics { // our class name must match the file name
    public static void main(String[] args) {
        // in java, the main method is the entry point of any java program

        // we can create output with the command System.out.println()
        System.out.println("Hello World");

        // we can also create variables
        // variables are containers for storing data values
        // in java, we must declare the type and name of the variable
        int myNum = 5;

        // we can then print the variable
        System.out.println(myNum);

        // we can also change the value of the variable
        myNum = 10;
        // as well as combine int variables together
        int otherNum = 5;
        int sum = myNum + otherNum;
        System.out.println(sum);

        // we can also create variables of other types
        // the most common types are int, double, char, and boolean
        double myDouble = 5.99; // double is a number with a decimal point
        char myLetter = 'D'; // char is a single character
        boolean myBool = true; // boolean is a true or false value
        // these are known as primitive data types
        // there are many more, but we will not cover them here

        // we can also create strings, which are a common type of Object
        // an Object is like a variable, but it can store multiple values
        // strings are used to store text
        String myText = "Hello";
        System.out.println(myText);

        // we can also combine strings together
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // we can also use the + operator to add numbers and strings together
        int x = 5;
        int y = 6;
        String result = "The sum of " + x + " and " + y + " is " + (x + y);
        System.out.println(result);

        // finally, we can also use the Scanner class to get input from the user as Strings
        // this is useful for creating interactive programs
        // we will cover this in more detail in the next section, but here is a preview...
        // import the Scanner class. This is done at the top of the file
        // it looks like this: `import java.util.Scanner;`
        // create a Scanner object
        Scanner myScanner = new Scanner(System.in);
        // ask the user for their name
        System.out.print("Enter your name: "); // note: `System.out.print()` does not add a newline at the end
        // get the user's input
        String userName = myScanner.nextLine();
        // print the user's name
        System.out.println("Hello " + userName + " :)");


        /*
         * Exercise1: Create a program that...
         * - prints the sum of 5 and 10
         * - prints an additional data type of your choice (boolean, char, double, etc.)
         * - asks the user for their name
         * - prints the user's name along with a greeting
         */

        /*
         * Exercise2: Create a program that...
         * - plays a Mad Libs game!
         * - i.e. https://www.thewordfinder.com/wordlibs/story-28952/
         */

    }
}