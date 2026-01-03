import java.sql.*;
import java.util.*;

public class OrderProcessor {
    private static final String DB_PASSWORD = "admin_password_123!"; // Security Hotspot
    
    public void processOrder(int orderId) {
        try {
            // Docker mein 'localhost' ki jagah 'host.docker.internal' use karna par sakta hai
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "admin", DB_PASSWORD);
            
            String query = "SELECT * FROM orders WHERE id = " + orderId; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Query executed for Order ID: " + orderId);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // --- YE NAYA SECTION ADD KIYA HAI ---
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        System.out.println("Docker Container Started: Processing Order...");
        
        // Method call kar rahe hain taake program kuch kaam kare
        processor.processOrder(101);
    }
    // ------------------------------------

    public void myMethodName() { // Naming convention fixed for Sonar
        System.out.println("Testing SonarQube");
    }
}