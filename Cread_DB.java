import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cread_DB {
   static final String DB_URL = "jdbc:mysql://localhost:3307/students";
   static final String USER = "root";
   static final String PASS = "root";

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();) {
            String createMaleTable = "CREATE TABLE Male (" + "id INT AUTO_INCREMENT PRIMARY KEY, " + "name VARCHAR(50) NOT NULL, " + "age INT NOT NULL, " + "email VARCHAR(100) UNIQUE)"; 
            stmt.executeUpdate(createMaleTable); 
            System.out.println("Table 'Male' created successfully..."); 
         //







         
         // Create a new database with a unique name
         String sql = "CREATE DATABASE students";
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully...");
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
