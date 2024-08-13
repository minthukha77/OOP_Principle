package SingletonDesignPattern;

public class School {
        public static void main(String[] args) {
            // Trying to get the principal instance
            Principal principal1 = Principal.getInstance();
            principal1.announce();
    
            // Trying to get another instance of the principal
            Principal principal2 = Principal.getInstance();
            principal2.announce();
    
            // Checking if both references point to the same instance
            if (principal1 == principal2) {
                System.out.println("There is only one principal!");
            } else {
                System.out.println("There are multiple principals!");
            }
        }
    
}
