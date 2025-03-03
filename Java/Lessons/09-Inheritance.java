// Parent class (Super class)
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call parent constructor
    }

    // Overriding the method
    @Override
    public void makeSound() {
        System.out.println(name + " barks!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        myAnimal.makeSound();

        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // Calls overridden method
    }
}

/*
 * Exercise 1:
 * - Create a `Cat` class that extends `Animal` and overrides `makeSound()`.
 *
 * Exercise 2:
 * - Add an `age` attribute to `Animal`, and display it in `makeSound()`.
 */