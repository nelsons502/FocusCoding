import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataStructures {
    public static void main(String[] args) {
        // === ARRAYLIST ===
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("ArrayList Elements: " + names);
        names.remove("Bob");
        System.out.println("After removal: " + names);

        // === HASHMAP ===
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 22);

        System.out.println("\nBob's Age: " + ages.get("Bob"));
        ages.remove("Charlie");
        System.out.println("HashMap after removal: " + ages);

        // === HASHSET ===
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate, won't be added

        System.out.println("\nHashSet Elements: " + uniqueNames);
    }
}

/*
 * Exercise 1:
 * - Create an ArrayList of integers and sum all elements.
 *
 * Exercise 2:
 * - Create a HashMap storing cities and their populations, then print the largest.
 *
 * Exercise 3:
 * - Use a HashSet to remove duplicates from a list of words.
 */