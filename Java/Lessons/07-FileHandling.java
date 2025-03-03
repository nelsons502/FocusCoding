import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // CREATING A FILE
        try {
            File myFile = new File("example.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // WRITING TO A FILE
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a test file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        // READING A FILE
        try {
            File myFile = new File("example.txt");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println("File content: " + data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

/*
 * Exercise 1:
 * - Modify the program to write a user-inputted message to the file.
 *
 * Exercise 2:
 * - Extend the program to append text instead of overwriting it.
 */