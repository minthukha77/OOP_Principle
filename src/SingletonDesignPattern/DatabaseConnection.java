package SingletonDesignPattern;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DatabaseConnection {
            // Step 1: Create a private static instance of this class
            private static DatabaseConnection instance;

            // Step 2: Create a Connection object
            private Connection connection;

            // Database credentials
            private String url = "jdbc:mysql://localhost:3306/your_database_name";
            private String username = "your_username";
            private String password = "your_password";

            // Step 3: Private constructor so no other class can instantiate
            private DatabaseConnection() {
                try {
                    // Step 4: Establish the database connection
                    connection = DriverManager.getConnection(url, username, password);
                    System.out.println("Database connection established!");
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Failed to establish database connection!");
                }
            }

            // Step 5: Public static method to get the single instance of the class
            public static DatabaseConnection getInstance() {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
                return instance;
            }

            // Step 6: Provide a method to get the connection
            public Connection getConnection() {
                return connection;
            }
        }


