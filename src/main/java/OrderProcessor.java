import java.sql.*;
import java.util.*;

public class OrderProcessor {
    private static final String DB_PASSWORD = "admin_password_123!"; // Security Hotspot
    
    public void processOrder(int orderId) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "admin", DB_PASSWORD);
            // SQL Injection Risk below
            String query = "SELECT * FROM orders WHERE id = " + orderId; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        } catch (Exception e) {
            // Empty catch block - Sonar will hate this
        }
    }

    public void My_Method_Name() { // Naming convention violation
        System.out.println("Testing SonarQube");
    }
}