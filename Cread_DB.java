import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cread_DB {
   static final String DB_URL = "jdbc:mysql://localhost:3307";
   static final String USER = "root";
   static final String PASS = "root";

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();) {
         
         // Create a new database with a unique name
         String sql = "CREATE DATABASE Girl";
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully...");
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
