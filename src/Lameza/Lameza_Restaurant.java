/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lameza;

import Controller_Connector.DBConnect;


public class Lameza_Restaurant {

    public static void main(String[] args) {
         DBConnect dbc = new DBConnect();
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }
}

