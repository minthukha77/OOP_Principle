package SingletonDesignPattern;

public class Principal {
    
        // Step 1: Create a private static instance of the class
        private static Principal instance;
    
        // Step 2: Make the constructor private so no one else can create an instance
        private Principal() {
            System.out.println("Principal is now assigned!");
        }
    
        // Step 3: Provide a public static method to get the single instance of the class
        public static Principal getInstance() {
            if (instance == null) {
                // If no instance exists, create one
                instance = new Principal();
            }
            return instance;
        }
    
        public void announce() {
            System.out.println("This is the principal speaking!");
        }
    
    
}
