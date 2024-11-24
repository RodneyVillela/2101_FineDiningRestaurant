/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller_Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

//class for DB Connection
public class DBConnect {
    
    private static String url = "jdbc:mysql://localhost:3306/fine_dining_restaurant";
    private static String user = "root";
    private static String userPassword = "";
    
    private static Connection con;
    private static DBConnect dbCon;
    
    public DBConnect(){
        //Get Connection
        con = null;
        try {
            con =  DriverManager.getConnection(url, user, userPassword);
            JOptionPane.showMessageDialog(null, "Connected Successfully");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Error"+ e.getMessage());
             e.printStackTrace();
        }
               
    }
    public static DBConnect getDBConnection(){
        if(dbCon == null){
            dbCon = new DBConnect();
        }
        return dbCon;
    }
    public static Connection getConnection(){
        return con;
    }
    
}
