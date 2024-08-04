package OOP_Inheritance;

public class Main {
    public static void main(String[] args) {
        // Create an engine for a regular car
        Engine petrolEngine = new Engine("Petrol", 150);

        // Create a regular car with a petrol engine
        Car regularCar = new Car("Toyota", "Camry", petrolEngine);

        // Start the regular car
        regularCar.startCar();

        System.out.println();

        // Create an engine for an electric car
        Engine electricEngine = new Engine("Electric", 300);

        // Create an electric car with an electric engine
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", electricEngine, 100);

        // Start the electric car
        tesla.startCar();
    }
}
