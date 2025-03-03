import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {
    public static void main(String[] args) {
        // === STACK (LIFO: Last In, First Out) ===
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        
        int topElement = stack.pop();
        System.out.println("Popped from stack: " + topElement);
        System.out.println("Stack after pop: " + stack);

        // === QUEUE (FIFO: First In, First Out) ===
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("\nQueue: " + queue);
        String firstElement = queue.poll();
        System.out.println("Dequeued: " + firstElement);
        System.out.println("Queue after poll: " + queue);
    }
}

/*
 * Exercise 1:
 * - Implement a method that reverses a string using a stack.
 *
 * Exercise 2:
 * - Simulate a print queue using a Queue (add and remove print jobs).
 */