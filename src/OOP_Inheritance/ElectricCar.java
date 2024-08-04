package OOP_Inheritance;

// ElectricCar.java
public class ElectricCar extends Car {
    private int batteryCapacity; // Specific to ElectricCar

    // Constructor
    public ElectricCar(String make, String model, Engine engine, int batteryCapacity) {
       super(make, model, engine); // Calling the superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding the startCar method
    @Override
    public void startCar() {
        System.out.println("Starting electric car: " + getMake() + " " + getModel());
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
        getEngine().start(); // Using the inherited engine's start method
    }

    // Getter for battery capacity
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
