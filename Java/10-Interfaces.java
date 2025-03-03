// Defining an Interface
interface Vehicle {
    void start(); // Abstract method
    void stop();
}

// Implementing the Interface in a class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

// Another class implementing the same interface
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}

/*
 * Exercise 1:
 * - Create a `Boat` class that implements the `Vehicle` interface.
 *
 * Exercise 2:
 * - Add a `speed` attribute to `Vehicle` (hint: use default methods in interfaces).
 */