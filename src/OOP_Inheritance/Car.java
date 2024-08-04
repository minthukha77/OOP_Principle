package OOP_Inheritance;

// Car.java
public class Car {
    private String make;
    private String model;
    private Engine engine; // Composition with Engine

    // Constructor
    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for engine
    public Engine getEngine() {
        return engine;
    }

    // Method to start the car
    public void startCar() {
        System.out.println("Starting car: " + make + " " + model);
        engine.start(); // Call the engine's start method
    }
}
