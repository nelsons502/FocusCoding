// A class defines a blueprint for objects
class Car {
    // Attributes (Instance Variables)
    String brand;
    int year;

    // Constructor (runs when an object is created)
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method (behavior of an object)
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating objects from the Car class
        Car myCar = new Car("Toyota", 2020);
        Car anotherCar = new Car("Ford", 2018);

        // Calling methods on objects
        myCar.displayInfo();
        anotherCar.displayInfo();
    }
}

/*
 * Exercise 1:
 * - Create a `Person` class with `name` and `age` attributes and a `greet()` method.
 * - Create an object and call `greet()`.
 *
 * Exercise 2:
 * - Extend the `Car` class to include a `drive()` method that prints "Driving..."
 */