package OOP_Inheritance;


// Engine.java
public class Engine {
    private String type;
    private int horsepower;

    // Constructor
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    // Method to start the engine
    public void start() {
        System.out.println("Engine started: " + type + " with " + horsepower + " horsepower.");
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Getter for horsepower
    public int getHorsepower() {
        return horsepower;
    }
}
