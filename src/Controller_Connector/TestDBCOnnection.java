/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller_Connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBCOnnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fine_dining_restaurant";
        String user = "root";
        String password = "";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            if (con != null) {
                System.out.println("Database connected successfully!");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.err.println("Connection failed:");
            System.err.println("Message: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
        }
    }
}


