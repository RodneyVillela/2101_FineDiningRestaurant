/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservationform;

public class ReservationForm {

    public static void main(String[] args) {
        // Launch the ReservationRequestForm JFrame
        javax.swing.SwingUtilities.invokeLater(() -> {
            new ReservationRequestForm().setVisible(true);
        });
    }
}

