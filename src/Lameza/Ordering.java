/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lameza;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class Ordering extends javax.swing.JFrame {

    
    private DefaultTableModel tableModel;
    private javax.swing.JSpinner jSpinnerQuantity;
    
    
    
    public Ordering() {
        initComponents();
        initializeTableModel();
        initializeSpinner(); 
    }
    
    private void initializeTableModel() {
        // Define column headers (Remove "Subtotal" column)
        String[] columnNames = {"Item", "Price", "Quantity"};

        // Create the DefaultTableModel without "Subtotal" column
        tableModel = new DefaultTableModel(columnNames, 0);

        // Set the model for the existing JTable (jTableCart)
        jTableCart.setModel(tableModel);
        
        // Create the Reciept frame and pass the components to the constructor

    }

    // Initialize the JSpinner for quantity selection
    private void initializeSpinner() {
        // Initialize JSpinner only once
        jSpinnerQuantity = new JSpinner();
    }

    private void resetOrder() {
        tableModel.setRowCount(0);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jSpinner16.setValue(0);
        jSpinner17.setValue(0);
        jSpinner18.setValue(0);
        jSpinner19.setValue(0);
        jSpinner20.setValue(0);
        jSpinner21.setValue(0);
        jSpinner22.setValue(0);
        jSpinner23.setValue(0);
        jSpinner24.setValue(0);
        jSpinner25.setValue(0);
        jSpinner26.setValue(0);
        jSpinner27.setValue(0);
        jSpinner28.setValue(0);
        jSpinner29.setValue(0);
        jSpinner30.setValue(0);
        jSpinner31.setValue(0);
        jSpinner32.setValue(0);
        jSpinner33.setValue(0);
        jSpinner34.setValue(0);
        jSpinner35.setValue(0);
        jSpinner36.setValue(0);
        jSpinner37.setValue(0);
        jSpinner38.setValue(0);
        jSpinner39.setValue(0);
        jSpinner40.setValue(0);
        jSpinner41.setValue(0);
        jSpinner42.setValue(0);
        jSpinner43.setValue(0);
        jSpinner44.setValue(0);
        jSpinner45.setValue(0);
        jSpinner46.setValue(0);
        jPaymentMethod.setSelectedIndex(0); 
        jAmount.setText("");  // Clear the amount field
        jChange.setText("₱0.00"); 
    

    // Reset the totals (subtotal, tax, and total)
    updateTotals();  // This will recalculate and reset the displayed totals
}

      // Add item to cart method
    private void addItemToCart(String itemName, double price, JSpinner itemSpinner) {
        // Get the quantity from the spinner of the specific item
        int quantity = (int) itemSpinner.getValue();

        // Find if the item already exists in the table
        int rowIndex = findItemRowIndex(itemName);

        if (rowIndex != -1) {
            // Update the existing item in the table
            int currentQuantity = (int) tableModel.getValueAt(rowIndex, 2);
            int newQuantity = quantity; // Get the quantity from the spinner directly
            tableModel.setValueAt(newQuantity, rowIndex, 2); // Update quantity

            double newSubtotal = price * newQuantity;
            tableModel.setValueAt(newSubtotal, rowIndex, 3);  // Update subtotal
        } else {
            // Add new item to the table
            double subtotal = price * quantity;
            tableModel.addRow(new Object[]{itemName, price, quantity, subtotal});
        }

        // Update the totals (Subtotal, Tax, Total)
        updateTotals();
    }

    private int findItemRowIndex(String itemName) {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 0).equals(itemName)) {
                return i;  // Return the row index if the item is found
            }
        }
        return -1;  // Return -1 if the item is not found
    }

    // Update the subtotal, tax, and total labels
    private void updateTotals() {
        double subtotal = 0.0;

        // Loop through all rows to calculate the subtotal
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            double price = (double) tableModel.getValueAt(i, 1);
            int quantity = (int) tableModel.getValueAt(i, 2);
            subtotal += price * quantity;
        }

        // Calculate tax (10% of subtotal)
        double tax = subtotal * 0.10;

        // Calculate total (subtotal + tax)
        double total = subtotal + tax;

        // Update the labels for Subtotal, Tax, and Total
        jSubTotal.setText(String.format("%.2f", subtotal));   // Only the subtotal value
        jTax.setText(String.format("%.2f", tax)); 
        jTotal.setText(String.format("%.2f", total)); 
    }
    

    

    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jPanel232 = new javax.swing.JPanel();
        jLabel225 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel233 = new javax.swing.JPanel();
        jButton46 = new javax.swing.JButton();
        jLabel146 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel234 = new javax.swing.JPanel();
        jButton47 = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel235 = new javax.swing.JPanel();
        jButton48 = new javax.swing.JButton();
        jLabel148 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel236 = new javax.swing.JPanel();
        jButton49 = new javax.swing.JButton();
        jLabel149 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel237 = new javax.swing.JPanel();
        jButton50 = new javax.swing.JButton();
        jLabel150 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel238 = new javax.swing.JPanel();
        jButton51 = new javax.swing.JButton();
        jLabel151 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jPanel331 = new javax.swing.JPanel();
        jLabel313 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButtonMiniLobsterRoll = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButtonCompressed = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jButtonGoatCheese = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jButtonSmokedSalmonBlini = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jButtonCucumberCups = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jButtonSavoryPanna = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel332 = new javax.swing.JPanel();
        jLabel314 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jButtonTunaTartare = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jButtonLobsterMedallions = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jButtonBeefCarpaccio = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jButtonBurrata = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jButtonOysterRocke = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jButtonWildMushroom = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel333 = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jButtonLobsterBisque = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jButtonTomKhaGai = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jButtonSmokeTomato = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jButtonGrilledArti = new javax.swing.JButton();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jButtonClassicCaesar = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        jButtonWatermelonFeta = new javax.swing.JButton();
        jPanel55 = new javax.swing.JPanel();
        jPanel334 = new javax.swing.JPanel();
        jLabel316 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel91 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jButtonDryAgeRibeye = new javax.swing.JButton();
        jPanel95 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jSpinner20 = new javax.swing.JSpinner();
        jButtonDuckBreast = new javax.swing.JButton();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jSpinner34 = new javax.swing.JSpinner();
        jButtonStuffedBellPeppers = new javax.swing.JButton();
        jPanel99 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jSpinner22 = new javax.swing.JSpinner();
        jButtonGrilledDover = new javax.swing.JButton();
        jPanel117 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jSpinner23 = new javax.swing.JSpinner();
        jButtonPanSearedHalibut = new javax.swing.JButton();
        jPanel119 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jSpinner24 = new javax.swing.JSpinner();
        jButtonSeafoodPaella = new javax.swing.JButton();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jButtonLambShank = new javax.swing.JButton();
        jPanel123 = new javax.swing.JPanel();
        jPanel124 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jSpinner31 = new javax.swing.JSpinner();
        jButtonBraisedShortribs = new javax.swing.JButton();
        jPanel125 = new javax.swing.JPanel();
        jPanel126 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jSpinner33 = new javax.swing.JSpinner();
        jButtonRoastedCauli = new javax.swing.JButton();
        jPanel127 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jSpinner32 = new javax.swing.JSpinner();
        jButtonVealMilanese = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jPanel335 = new javax.swing.JPanel();
        jLabel317 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jSpinner25 = new javax.swing.JSpinner();
        jButtonOperaCake = new javax.swing.JButton();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jSpinner26 = new javax.swing.JSpinner();
        jButtonCremeBruleetrio = new javax.swing.JButton();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jSpinner27 = new javax.swing.JSpinner();
        jButtonMoltenChocolatefondant = new javax.swing.JButton();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jSpinner28 = new javax.swing.JSpinner();
        jButtonSeasonalFruitpavlova = new javax.swing.JButton();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jSpinner29 = new javax.swing.JSpinner();
        jButtonTarteauCitron = new javax.swing.JButton();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jSpinner30 = new javax.swing.JSpinner();
        jButtonBabaauRhum = new javax.swing.JButton();
        jPanel101 = new javax.swing.JPanel();
        jPanel337 = new javax.swing.JPanel();
        jLabel319 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel102 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel103 = new javax.swing.JPanel();
        jPanel104 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jSpinner35 = new javax.swing.JSpinner();
        jButtonElderflowerfizz = new javax.swing.JButton();
        jPanel106 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jSpinner36 = new javax.swing.JSpinner();
        jButtonBlackberryThymeMartini = new javax.swing.JButton();
        jPanel108 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jSpinner39 = new javax.swing.JSpinner();
        jButtonMatcha = new javax.swing.JButton();
        jPanel110 = new javax.swing.JPanel();
        jPanel150 = new javax.swing.JPanel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jSpinner38 = new javax.swing.JSpinner();
        jButtonPineappleGinger = new javax.swing.JButton();
        jPanel151 = new javax.swing.JPanel();
        jPanel152 = new javax.swing.JPanel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jSpinner40 = new javax.swing.JSpinner();
        jButtonrosemaryLemonade = new javax.swing.JButton();
        jPanel153 = new javax.swing.JPanel();
        jPanel154 = new javax.swing.JPanel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jSpinner41 = new javax.swing.JSpinner();
        jButtonVirginMojito = new javax.swing.JButton();
        jPanel155 = new javax.swing.JPanel();
        jPanel156 = new javax.swing.JPanel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jSpinner37 = new javax.swing.JSpinner();
        jButtonCitrusNegroni = new javax.swing.JButton();
        jPanel157 = new javax.swing.JPanel();
        jPanel158 = new javax.swing.JPanel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jSpinner42 = new javax.swing.JSpinner();
        jButtonLavenderHoney = new javax.swing.JButton();
        jPanel159 = new javax.swing.JPanel();
        jPanel160 = new javax.swing.JPanel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jSpinner43 = new javax.swing.JSpinner();
        jButtonJasminePearl = new javax.swing.JButton();
        jPanel161 = new javax.swing.JPanel();
        jPanel162 = new javax.swing.JPanel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jSpinner46 = new javax.swing.JSpinner();
        jButtonChamomile = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jPanel163 = new javax.swing.JPanel();
        jPanel164 = new javax.swing.JPanel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jSpinner44 = new javax.swing.JSpinner();
        jButtonBloodOrangeBasil = new javax.swing.JButton();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jSpinner45 = new javax.swing.JSpinner();
        jButtonCucumberMint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel100 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jAmount = new javax.swing.JTextField();
        jChange = new javax.swing.JTextField();
        jPaymentMethod = new javax.swing.JComboBox<>();
        jPanel59 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jSubTotal = new javax.swing.JTextField();
        jTax = new javax.swing.JTextField();
        jTotal = new javax.swing.JTextField();
        jPanel60 = new javax.swing.JPanel();
        jExit = new javax.swing.JButton();
        jPay = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jRemove = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel232.setBackground(new java.awt.Color(102, 51, 0));
        jPanel232.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel232.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 910, 50, 20));

        jPanel31.setBackground(new java.awt.Color(231, 213, 195));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel233.setBackground(new java.awt.Color(255, 255, 255));
        jPanel233.setLayout(new java.awt.BorderLayout());

        jButton46.setBackground(new java.awt.Color(102, 51, 0));
        jButton46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton46.setForeground(new java.awt.Color(231, 213, 195));
        jButton46.setText("AMUSE-BOUCHE");
        jButton46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel233.add(jButton46, java.awt.BorderLayout.PAGE_START);

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/melob.jpg"))); // NOI18N
        jPanel233.add(jLabel146, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 150));

        jPanel232.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 270, 170));

        jPanel32.setBackground(new java.awt.Color(231, 213, 195));
        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel234.setBackground(new java.awt.Color(255, 255, 255));
        jPanel234.setLayout(new java.awt.BorderLayout());

        jButton47.setBackground(new java.awt.Color(102, 51, 0));
        jButton47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton47.setForeground(new java.awt.Color(231, 213, 195));
        jButton47.setText("APPETIZER");
        jButton47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel234.add(jButton47, java.awt.BorderLayout.PAGE_START);

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/oyster.jpg"))); // NOI18N
        jPanel234.add(jLabel147, java.awt.BorderLayout.CENTER);

        jPanel32.add(jPanel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 150));

        jPanel232.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 270, 170));

        jPanel33.setBackground(new java.awt.Color(231, 213, 195));
        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel235.setBackground(new java.awt.Color(255, 255, 255));
        jPanel235.setLayout(new java.awt.BorderLayout());

        jButton48.setBackground(new java.awt.Color(102, 51, 0));
        jButton48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton48.setForeground(new java.awt.Color(231, 213, 195));
        jButton48.setText("SOUPS AND SALADS");
        jButton48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel235.add(jButton48, java.awt.BorderLayout.PAGE_START);

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/classic.jpg"))); // NOI18N
        jPanel235.add(jLabel148, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 150));

        jPanel232.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 270, 170));

        jPanel34.setBackground(new java.awt.Color(231, 213, 195));
        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel236.setBackground(new java.awt.Color(255, 255, 255));
        jPanel236.setLayout(new java.awt.BorderLayout());

        jButton49.setBackground(new java.awt.Color(102, 51, 0));
        jButton49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton49.setForeground(new java.awt.Color(231, 213, 195));
        jButton49.setText("MAIN COURSES");
        jButton49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel236.add(jButton49, java.awt.BorderLayout.PAGE_START);

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ribeye.jpg"))); // NOI18N
        jPanel236.add(jLabel149, java.awt.BorderLayout.CENTER);

        jPanel34.add(jPanel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 150));

        jPanel232.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 270, 170));

        jPanel35.setBackground(new java.awt.Color(231, 213, 195));
        jPanel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel237.setBackground(new java.awt.Color(255, 255, 255));
        jPanel237.setLayout(new java.awt.BorderLayout());

        jButton50.setBackground(new java.awt.Color(102, 51, 0));
        jButton50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton50.setForeground(new java.awt.Color(231, 213, 195));
        jButton50.setText("DESSERTS");
        jButton50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel237.add(jButton50, java.awt.BorderLayout.PAGE_START);

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/molten.jpg"))); // NOI18N
        jPanel237.add(jLabel150, java.awt.BorderLayout.CENTER);

        jPanel35.add(jPanel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 150));

        jPanel232.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, 270, 170));

        jPanel36.setBackground(new java.awt.Color(231, 213, 195));
        jPanel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel238.setBackground(new java.awt.Color(255, 255, 255));
        jPanel238.setLayout(new java.awt.BorderLayout());

        jButton51.setBackground(new java.awt.Color(102, 51, 0));
        jButton51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton51.setForeground(new java.awt.Color(231, 213, 195));
        jButton51.setText("BEVERAGES");
        jButton51.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel238.add(jButton51, java.awt.BorderLayout.PAGE_START);

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/blackberry.jpg"))); // NOI18N
        jPanel238.add(jLabel151, java.awt.BorderLayout.CENTER);

        jPanel36.add(jPanel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 150));

        jPanel232.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1090, 270, 170));

        jLabel6.setText("jLabel1");
        jPanel232.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 1270, -1, -1));

        jScrollPane15.setViewportView(jPanel232);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 880));

        jPanel23.setBackground(new java.awt.Color(231, 213, 195));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel331.setBackground(new java.awt.Color(102, 51, 0));
        jPanel331.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel313.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel313.setForeground(new java.awt.Color(231, 213, 195));
        jLabel313.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel313.setText("LAMÈZA  ");
        jPanel331.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 60));

        jButton6.setBackground(new java.awt.Color(231, 213, 195));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 51, 0));
        jButton6.setText("BACK");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel331.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 120, 30));

        jPanel23.add(jPanel331, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 70));

        jPanel24.setBackground(new java.awt.Color(102, 51, 0));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(231, 213, 195));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(102, 51, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(231, 213, 195));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/roll_1.jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 120));

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 213, 195));
        jLabel2.setText("Quantity:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel3.setBackground(new java.awt.Color(231, 213, 195));
        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 213, 195));
        jLabel3.setText("Buttered brioche with tarragon mayo.");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 213, 195));
        jLabel4.setText("Mini Lobster Roll ");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonMiniLobsterRoll.setBackground(new java.awt.Color(231, 213, 195));
        jButtonMiniLobsterRoll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMiniLobsterRoll.setForeground(new java.awt.Color(102, 51, 0));
        jButtonMiniLobsterRoll.setText("ADD");
        jButtonMiniLobsterRoll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonMiniLobsterRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMiniLobsterRollActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonMiniLobsterRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 220));

        jPanel7.setBackground(new java.awt.Color(102, 51, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(231, 213, 195));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/melob_1.jpg"))); // NOI18N
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(231, 213, 195));
        jLabel7.setText("Quantity:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel8.setBackground(new java.awt.Color(231, 213, 195));
        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(231, 213, 195));
        jLabel8.setText("Drizzled with aged balsamic and mint oil.");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(231, 213, 195));
        jLabel9.setText("Compressed Melon with Prosciutto ");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonCompressed.setBackground(new java.awt.Color(231, 213, 195));
        jButtonCompressed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCompressed.setForeground(new java.awt.Color(102, 51, 0));
        jButtonCompressed.setText("ADD");
        jButtonCompressed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCompressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompressedActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonCompressed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 360, 220));

        jPanel9.setBackground(new java.awt.Color(102, 51, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(231, 213, 195));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tart.jpg"))); // NOI18N
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(231, 213, 195));
        jLabel11.setText("Quantity:");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel12.setBackground(new java.awt.Color(231, 213, 195));
        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(231, 213, 195));
        jLabel12.setText("Topped with caramelized onions and a honey drizzle.");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(231, 213, 195));
        jLabel13.setText("Goat Cheese Mousse Tart");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonGoatCheese.setBackground(new java.awt.Color(231, 213, 195));
        jButtonGoatCheese.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonGoatCheese.setForeground(new java.awt.Color(102, 51, 0));
        jButtonGoatCheese.setText("ADD");
        jButtonGoatCheese.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonGoatCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoatCheeseActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonGoatCheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 360, 220));

        jPanel11.setBackground(new java.awt.Color(102, 51, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(231, 213, 195));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salmonn.jpg"))); // NOI18N
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 120));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(231, 213, 195));
        jLabel15.setText("Quantity:");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel16.setBackground(new java.awt.Color(231, 213, 195));
        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(231, 213, 195));
        jLabel16.setText("Dill crème, caviar, and a hint of lemon zest.");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(231, 213, 195));
        jLabel17.setText("Smoked Salmon Blini");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonSmokedSalmonBlini.setBackground(new java.awt.Color(231, 213, 195));
        jButtonSmokedSalmonBlini.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSmokedSalmonBlini.setForeground(new java.awt.Color(102, 51, 0));
        jButtonSmokedSalmonBlini.setText("ADD");
        jButtonSmokedSalmonBlini.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSmokedSalmonBlini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmokedSalmonBliniActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonSmokedSalmonBlini, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 220));

        jPanel13.setBackground(new java.awt.Color(102, 51, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(231, 213, 195));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cucumberr.jpg"))); // NOI18N
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(231, 213, 195));
        jLabel19.setText("Quantity:");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel20.setBackground(new java.awt.Color(231, 213, 195));
        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(231, 213, 195));
        jLabel20.setText("Lemon aioli and a touch of paprika.");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(231, 213, 195));
        jLabel21.setText("Cucumber Cups with Crab Salad");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonCucumberCups.setBackground(new java.awt.Color(231, 213, 195));
        jButtonCucumberCups.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCucumberCups.setForeground(new java.awt.Color(102, 51, 0));
        jButtonCucumberCups.setText("ADD");
        jButtonCucumberCups.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCucumberCups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCucumberCupsActionPerformed(evt);
            }
        });
        jPanel13.add(jButtonCucumberCups, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 360, 220));

        jPanel15.setBackground(new java.awt.Color(102, 51, 0));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(231, 213, 195));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savoryy.jpg"))); // NOI18N
        jPanel16.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(231, 213, 195));
        jLabel23.setText("Quantity:");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel24.setBackground(new java.awt.Color(231, 213, 195));
        jLabel24.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(231, 213, 195));
        jLabel24.setText("Parmesan panna cotta with a tomato-basil gelée.");
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(231, 213, 195));
        jLabel25.setText("Savory Panna Cotta");
        jPanel15.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonSavoryPanna.setBackground(new java.awt.Color(231, 213, 195));
        jButtonSavoryPanna.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSavoryPanna.setForeground(new java.awt.Color(102, 51, 0));
        jButtonSavoryPanna.setText("ADD");
        jButtonSavoryPanna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSavoryPanna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavoryPannaActionPerformed(evt);
            }
        });
        jPanel15.add(jButtonSavoryPanna, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 360, 220));

        jPanel24.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 470));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1140, 510));

        jTabbedPane1.addTab("amuse-bouche", jPanel23);

        jPanel25.setBackground(new java.awt.Color(231, 213, 195));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel332.setBackground(new java.awt.Color(102, 51, 0));
        jPanel332.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel314.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(231, 213, 195));
        jLabel314.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel314.setText("LAMÈZA  ");
        jPanel332.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 60));

        jButton5.setBackground(new java.awt.Color(231, 213, 195));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 51, 0));
        jButton5.setText("BACK");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel332.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 120, 30));

        jPanel25.add(jPanel332, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 70));

        jPanel26.setBackground(new java.awt.Color(102, 51, 0));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(231, 213, 195));
        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(102, 51, 0));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(231, 213, 195));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tuna.jpg"))); // NOI18N
        jPanel19.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(231, 213, 195));
        jLabel27.setText("Quantity:");
        jPanel18.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel28.setBackground(new java.awt.Color(231, 213, 195));
        jLabel28.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(231, 213, 195));
        jLabel28.setText("Ahi tuna with avocado, soy-lime dressing, and sesame crisps. ");
        jPanel18.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(231, 213, 195));
        jLabel29.setText(" Tuna Tartare ");
        jPanel18.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonTunaTartare.setBackground(new java.awt.Color(231, 213, 195));
        jButtonTunaTartare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTunaTartare.setForeground(new java.awt.Color(102, 51, 0));
        jButtonTunaTartare.setText("ADD");
        jButtonTunaTartare.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonTunaTartare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTunaTartareActionPerformed(evt);
            }
        });
        jPanel18.add(jButtonTunaTartare, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 220));

        jPanel20.setBackground(new java.awt.Color(102, 51, 0));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(231, 213, 195));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lobs.jpg"))); // NOI18N
        jPanel21.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(231, 213, 195));
        jLabel31.setText("Quantity:");
        jPanel20.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel32.setBackground(new java.awt.Color(231, 213, 195));
        jLabel32.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(231, 213, 195));
        jLabel32.setText("Butter-poached lobster with vanilla foam and edible flowers. ");
        jPanel20.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(231, 213, 195));
        jLabel33.setText("Lobster Medallions");
        jPanel20.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel20.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonLobsterMedallions.setBackground(new java.awt.Color(231, 213, 195));
        jButtonLobsterMedallions.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLobsterMedallions.setForeground(new java.awt.Color(102, 51, 0));
        jButtonLobsterMedallions.setText("ADD");
        jButtonLobsterMedallions.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonLobsterMedallions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLobsterMedallionsActionPerformed(evt);
            }
        });
        jPanel20.add(jButtonLobsterMedallions, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel17.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 360, 220));

        jPanel22.setBackground(new java.awt.Color(102, 51, 0));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(231, 213, 195));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/carpaccio.jpg"))); // NOI18N
        jPanel27.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel22.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(231, 213, 195));
        jLabel35.setText("Quantity:");
        jPanel22.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel36.setBackground(new java.awt.Color(231, 213, 195));
        jLabel36.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(231, 213, 195));
        jLabel36.setText("Thinly sliced beef tenderloin with capers, arugula, and truffle oil. ");
        jPanel22.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(231, 213, 195));
        jLabel37.setText("Beef Carpaccio");
        jPanel22.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonBeefCarpaccio.setBackground(new java.awt.Color(231, 213, 195));
        jButtonBeefCarpaccio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBeefCarpaccio.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBeefCarpaccio.setText("ADD");
        jButtonBeefCarpaccio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonBeefCarpaccio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBeefCarpaccioActionPerformed(evt);
            }
        });
        jPanel22.add(jButtonBeefCarpaccio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel17.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 360, 220));

        jPanel28.setBackground(new java.awt.Color(102, 51, 0));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(231, 213, 195));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/burrata.jpg"))); // NOI18N
        jPanel29.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 120));

        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(231, 213, 195));
        jLabel39.setText("Quantity:");
        jPanel28.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel40.setBackground(new java.awt.Color(231, 213, 195));
        jLabel40.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(231, 213, 195));
        jLabel40.setText("Creamy burrata, charred peppers, basil, and toasted sourdough.");
        jPanel28.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(231, 213, 195));
        jLabel41.setText("Burrata with Roasted Peppers (V)");
        jPanel28.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel28.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonBurrata.setBackground(new java.awt.Color(231, 213, 195));
        jButtonBurrata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBurrata.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBurrata.setText("ADD");
        jButtonBurrata.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonBurrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBurrataActionPerformed(evt);
            }
        });
        jPanel28.add(jButtonBurrata, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel17.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 220));

        jPanel30.setBackground(new java.awt.Color(102, 51, 0));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(231, 213, 195));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/oyster1.jpg"))); // NOI18N
        jPanel37.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel30.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(231, 213, 195));
        jLabel43.setText("Quantity:");
        jPanel30.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel44.setBackground(new java.awt.Color(231, 213, 195));
        jLabel44.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(231, 213, 195));
        jLabel44.setText("Baked oysters with spinach, breadcrumbs, and Pernod cream. ");
        jPanel30.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(231, 213, 195));
        jLabel45.setText("Oysters Rockefeller ");
        jPanel30.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel30.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonOysterRocke.setBackground(new java.awt.Color(231, 213, 195));
        jButtonOysterRocke.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonOysterRocke.setForeground(new java.awt.Color(102, 51, 0));
        jButtonOysterRocke.setText("ADD");
        jButtonOysterRocke.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonOysterRocke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOysterRockeActionPerformed(evt);
            }
        });
        jPanel30.add(jButtonOysterRocke, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel17.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 360, 220));

        jPanel38.setBackground(new java.awt.Color(102, 51, 0));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBackground(new java.awt.Color(231, 213, 195));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wild.jpg"))); // NOI18N
        jPanel39.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(231, 213, 195));
        jLabel47.setText("Quantity:");
        jPanel38.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel48.setBackground(new java.awt.Color(231, 213, 195));
        jLabel48.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(231, 213, 195));
        jLabel48.setText("Crispy risotto balls with porcini mushrooms and basil sauce.");
        jPanel38.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(231, 213, 195));
        jLabel49.setText("Wild Mushroom Arancini (V)");
        jPanel38.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel38.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonWildMushroom.setBackground(new java.awt.Color(231, 213, 195));
        jButtonWildMushroom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonWildMushroom.setForeground(new java.awt.Color(102, 51, 0));
        jButtonWildMushroom.setText("ADD");
        jButtonWildMushroom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonWildMushroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWildMushroomActionPerformed(evt);
            }
        });
        jPanel38.add(jButtonWildMushroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel17.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 360, 220));

        jPanel26.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 470));

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1140, 510));

        jTabbedPane1.addTab("appetizer", jPanel25);

        jPanel40.setBackground(new java.awt.Color(231, 213, 195));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel333.setBackground(new java.awt.Color(102, 51, 0));
        jPanel333.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel315.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(231, 213, 195));
        jLabel315.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel315.setText("LAMÈZA  ");
        jPanel333.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 60));

        jButton4.setBackground(new java.awt.Color(231, 213, 195));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 51, 0));
        jButton4.setText("BACK");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel333.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 120, 30));

        jPanel40.add(jPanel333, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 70));

        jPanel41.setBackground(new java.awt.Color(102, 51, 0));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel42.setBackground(new java.awt.Color(231, 213, 195));
        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel43.setBackground(new java.awt.Color(102, 51, 0));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setBackground(new java.awt.Color(231, 213, 195));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bisque.jpg"))); // NOI18N
        jPanel44.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel43.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(231, 213, 195));
        jLabel51.setText("Quantity:");
        jPanel43.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel52.setBackground(new java.awt.Color(231, 213, 195));
        jLabel52.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(231, 213, 195));
        jLabel52.setText("Lobster broth with a touch of sherry cream and lobster meat.");
        jPanel43.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(231, 213, 195));
        jLabel53.setText("Lobster Bisque");
        jPanel43.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel43.add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonLobsterBisque.setBackground(new java.awt.Color(231, 213, 195));
        jButtonLobsterBisque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLobsterBisque.setForeground(new java.awt.Color(102, 51, 0));
        jButtonLobsterBisque.setText("ADD");
        jButtonLobsterBisque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonLobsterBisque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLobsterBisqueActionPerformed(evt);
            }
        });
        jPanel43.add(jButtonLobsterBisque, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel42.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 220));

        jPanel45.setBackground(new java.awt.Color(102, 51, 0));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel46.setBackground(new java.awt.Color(231, 213, 195));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tom kha gai.jpg"))); // NOI18N
        jPanel46.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel45.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(231, 213, 195));
        jLabel55.setText("Quantity:");
        jPanel45.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel56.setBackground(new java.awt.Color(231, 213, 195));
        jLabel56.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(231, 213, 195));
        jLabel56.setText("Thai-inspired coconut soup with chicken, mushrooms.");
        jPanel45.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(231, 213, 195));
        jLabel57.setText("Tom Kha Gai");
        jPanel45.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel45.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonTomKhaGai.setBackground(new java.awt.Color(231, 213, 195));
        jButtonTomKhaGai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTomKhaGai.setForeground(new java.awt.Color(102, 51, 0));
        jButtonTomKhaGai.setText("ADD");
        jButtonTomKhaGai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonTomKhaGai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTomKhaGaiActionPerformed(evt);
            }
        });
        jPanel45.add(jButtonTomKhaGai, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel42.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 360, 220));

        jPanel47.setBackground(new java.awt.Color(102, 51, 0));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel48.setBackground(new java.awt.Color(231, 213, 195));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tomato.jpg"))); // NOI18N
        jPanel48.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel47.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(231, 213, 195));
        jLabel59.setText("Quantity:");
        jPanel47.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel60.setBackground(new java.awt.Color(231, 213, 195));
        jLabel60.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(231, 213, 195));
        jLabel60.setText("With basil oil and Parmesan croutons.");
        jPanel47.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(231, 213, 195));
        jLabel61.setText("Smoked Tomato Soup (V)");
        jPanel47.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel47.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonSmokeTomato.setBackground(new java.awt.Color(231, 213, 195));
        jButtonSmokeTomato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSmokeTomato.setForeground(new java.awt.Color(102, 51, 0));
        jButtonSmokeTomato.setText("ADD");
        jButtonSmokeTomato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSmokeTomato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmokeTomatoActionPerformed(evt);
            }
        });
        jPanel47.add(jButtonSmokeTomato, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel42.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 360, 220));

        jPanel49.setBackground(new java.awt.Color(102, 51, 0));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel50.setBackground(new java.awt.Color(231, 213, 195));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/artichoke.jpg"))); // NOI18N
        jPanel50.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel49.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(231, 213, 195));
        jLabel63.setText("Quantity:");
        jPanel49.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel64.setBackground(new java.awt.Color(231, 213, 195));
        jLabel64.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(231, 213, 195));
        jLabel64.setText("Baby arugula, shaved fennel, and lemon vinaigrette.");
        jPanel49.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(231, 213, 195));
        jLabel65.setText(" Grilled Artichoke Salad (V) ");
        jPanel49.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel49.add(jSpinner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonGrilledArti.setBackground(new java.awt.Color(231, 213, 195));
        jButtonGrilledArti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonGrilledArti.setForeground(new java.awt.Color(102, 51, 0));
        jButtonGrilledArti.setText("ADD");
        jButtonGrilledArti.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonGrilledArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrilledArtiActionPerformed(evt);
            }
        });
        jPanel49.add(jButtonGrilledArti, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel42.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 220));

        jPanel51.setBackground(new java.awt.Color(102, 51, 0));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel52.setBackground(new java.awt.Color(231, 213, 195));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/classic3.jpg"))); // NOI18N
        jPanel52.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel51.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(231, 213, 195));
        jLabel67.setText("Quantity:");
        jPanel51.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel68.setBackground(new java.awt.Color(231, 213, 195));
        jLabel68.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(231, 213, 195));
        jLabel68.setText("House-made croutons, anchovy dressing, and Parmesan tuile. ");
        jPanel51.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(231, 213, 195));
        jLabel69.setText("Classic Caesar Salad ");
        jPanel51.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel51.add(jSpinner17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonClassicCaesar.setBackground(new java.awt.Color(231, 213, 195));
        jButtonClassicCaesar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonClassicCaesar.setForeground(new java.awt.Color(102, 51, 0));
        jButtonClassicCaesar.setText("ADD");
        jButtonClassicCaesar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonClassicCaesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClassicCaesarActionPerformed(evt);
            }
        });
        jPanel51.add(jButtonClassicCaesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel42.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 360, 220));

        jPanel53.setBackground(new java.awt.Color(102, 51, 0));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel54.setBackground(new java.awt.Color(231, 213, 195));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/watermelon.jpg"))); // NOI18N
        jPanel54.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel53.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(231, 213, 195));
        jLabel71.setText("Quantity:");
        jPanel53.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel72.setBackground(new java.awt.Color(231, 213, 195));
        jLabel72.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(231, 213, 195));
        jLabel72.setText("Mint, pickled onions, and balsamic glaze.");
        jPanel53.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(231, 213, 195));
        jLabel73.setText("Watermelon and Feta Salad (V) ");
        jPanel53.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel53.add(jSpinner18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonWatermelonFeta.setBackground(new java.awt.Color(231, 213, 195));
        jButtonWatermelonFeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonWatermelonFeta.setForeground(new java.awt.Color(102, 51, 0));
        jButtonWatermelonFeta.setText("ADD");
        jButtonWatermelonFeta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonWatermelonFeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWatermelonFetaActionPerformed(evt);
            }
        });
        jPanel53.add(jButtonWatermelonFeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel42.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 360, 220));

        jPanel41.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 470));

        jPanel40.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1140, 510));

        jTabbedPane1.addTab("soup and salad", jPanel40);

        jPanel55.setBackground(new java.awt.Color(231, 213, 195));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel334.setBackground(new java.awt.Color(102, 51, 0));
        jPanel334.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel316.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel316.setForeground(new java.awt.Color(231, 213, 195));
        jLabel316.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel316.setText("LAMÈZA  ");
        jPanel334.add(jLabel316, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 60));

        jButton3.setBackground(new java.awt.Color(231, 213, 195));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 51, 0));
        jButton3.setText("BACK");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel334.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 120, 30));

        jPanel55.add(jPanel334, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 70));

        jPanel91.setBackground(new java.awt.Color(102, 51, 0));
        jPanel91.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel92.setBackground(new java.awt.Color(231, 213, 195));
        jPanel92.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel92.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel93.setBackground(new java.awt.Color(102, 51, 0));
        jPanel93.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel94.setBackground(new java.awt.Color(231, 213, 195));
        jPanel94.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ribeye1.jpg"))); // NOI18N
        jPanel94.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel93.add(jPanel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel136.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(231, 213, 195));
        jLabel136.setText("Quantity:");
        jPanel93.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel137.setBackground(new java.awt.Color(231, 213, 195));
        jLabel137.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(231, 213, 195));
        jLabel137.setText("Herb butter, pommes Anna, and charred broccolini.");
        jPanel93.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel138.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(231, 213, 195));
        jLabel138.setText("Dry-Aged Ribeye");
        jPanel93.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel93.add(jSpinner19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonDryAgeRibeye.setBackground(new java.awt.Color(231, 213, 195));
        jButtonDryAgeRibeye.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDryAgeRibeye.setForeground(new java.awt.Color(102, 51, 0));
        jButtonDryAgeRibeye.setText("ADD");
        jButtonDryAgeRibeye.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonDryAgeRibeye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDryAgeRibeyeActionPerformed(evt);
            }
        });
        jPanel93.add(jButtonDryAgeRibeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 220));

        jPanel95.setBackground(new java.awt.Color(102, 51, 0));
        jPanel95.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel96.setBackground(new java.awt.Color(231, 213, 195));
        jPanel96.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/duck.jpg"))); // NOI18N
        jPanel96.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel95.add(jPanel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel140.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(231, 213, 195));
        jLabel140.setText("Quantity:");
        jPanel95.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel141.setBackground(new java.awt.Color(231, 213, 195));
        jLabel141.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(231, 213, 195));
        jLabel141.setText("Thai-inspired coconut soup with chicken, mushrooms.");
        jPanel95.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel142.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(231, 213, 195));
        jLabel142.setText(" Duck Breast a l’Orange ");
        jPanel95.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel95.add(jSpinner20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonDuckBreast.setBackground(new java.awt.Color(231, 213, 195));
        jButtonDuckBreast.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDuckBreast.setForeground(new java.awt.Color(102, 51, 0));
        jButtonDuckBreast.setText("ADD");
        jButtonDuckBreast.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonDuckBreast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDuckBreastActionPerformed(evt);
            }
        });
        jPanel95.add(jButtonDuckBreast, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 360, 220));

        jPanel97.setBackground(new java.awt.Color(102, 51, 0));
        jPanel97.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel98.setBackground(new java.awt.Color(231, 213, 195));
        jPanel98.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bell.jpg"))); // NOI18N
        jPanel98.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel97.add(jPanel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel144.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(231, 213, 195));
        jLabel144.setText("Quantity:");
        jPanel97.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel145.setBackground(new java.awt.Color(231, 213, 195));
        jLabel145.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(231, 213, 195));
        jLabel145.setText("Filled with quinoa, roasted vegetables, and cashew cream.");
        jPanel97.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel176.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(231, 213, 195));
        jLabel176.setText("Stuffed Bell Peppers (V)");
        jPanel97.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel97.add(jSpinner34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonStuffedBellPeppers.setBackground(new java.awt.Color(231, 213, 195));
        jButtonStuffedBellPeppers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonStuffedBellPeppers.setForeground(new java.awt.Color(102, 51, 0));
        jButtonStuffedBellPeppers.setText("ADD");
        jButtonStuffedBellPeppers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonStuffedBellPeppers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStuffedBellPeppersActionPerformed(evt);
            }
        });
        jPanel97.add(jButtonStuffedBellPeppers, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 240, 360, 220));

        jPanel99.setBackground(new java.awt.Color(102, 51, 0));
        jPanel99.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel116.setBackground(new java.awt.Color(231, 213, 195));
        jPanel116.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dover.jpg"))); // NOI18N
        jPanel116.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel99.add(jPanel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel178.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(231, 213, 195));
        jLabel178.setText("Quantity:");
        jPanel99.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel179.setBackground(new java.awt.Color(231, 213, 195));
        jLabel179.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(231, 213, 195));
        jLabel179.setText("Brown butter, capers, and lemon served with sautéed spinach.");
        jPanel99.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel180.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(231, 213, 195));
        jLabel180.setText("Grilled Dover Sole");
        jPanel99.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel99.add(jSpinner22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonGrilledDover.setBackground(new java.awt.Color(231, 213, 195));
        jButtonGrilledDover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonGrilledDover.setForeground(new java.awt.Color(102, 51, 0));
        jButtonGrilledDover.setText("ADD");
        jButtonGrilledDover.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonGrilledDover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrilledDoverActionPerformed(evt);
            }
        });
        jPanel99.add(jButtonGrilledDover, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 220));

        jPanel117.setBackground(new java.awt.Color(102, 51, 0));
        jPanel117.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel118.setBackground(new java.awt.Color(231, 213, 195));
        jPanel118.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/halibut.jpg"))); // NOI18N
        jPanel118.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel117.add(jPanel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel182.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(231, 213, 195));
        jLabel182.setText("Quantity:");
        jPanel117.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel183.setBackground(new java.awt.Color(231, 213, 195));
        jLabel183.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(231, 213, 195));
        jLabel183.setText("Saffron risotto, asparagus, and lemon beurre blanc.");
        jPanel117.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel184.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(231, 213, 195));
        jLabel184.setText("Pan-Seared Halibut");
        jPanel117.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel117.add(jSpinner23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonPanSearedHalibut.setBackground(new java.awt.Color(231, 213, 195));
        jButtonPanSearedHalibut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPanSearedHalibut.setForeground(new java.awt.Color(102, 51, 0));
        jButtonPanSearedHalibut.setText("ADD");
        jButtonPanSearedHalibut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonPanSearedHalibut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPanSearedHalibutActionPerformed(evt);
            }
        });
        jPanel117.add(jButtonPanSearedHalibut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 360, 220));

        jPanel119.setBackground(new java.awt.Color(102, 51, 0));
        jPanel119.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel120.setBackground(new java.awt.Color(231, 213, 195));
        jPanel120.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paella.jpg"))); // NOI18N
        jPanel120.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel119.add(jPanel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel186.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(231, 213, 195));
        jLabel186.setText("Quantity:");
        jPanel119.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel187.setBackground(new java.awt.Color(231, 213, 195));
        jLabel187.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(231, 213, 195));
        jLabel187.setText("Mussels, clams, shrimp, saffron rice, and sofrito. ");
        jPanel119.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel188.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(231, 213, 195));
        jLabel188.setText("Seafood Paella");
        jPanel119.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel119.add(jSpinner24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonSeafoodPaella.setBackground(new java.awt.Color(231, 213, 195));
        jButtonSeafoodPaella.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSeafoodPaella.setForeground(new java.awt.Color(102, 51, 0));
        jButtonSeafoodPaella.setText("ADD");
        jButtonSeafoodPaella.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSeafoodPaella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeafoodPaellaActionPerformed(evt);
            }
        });
        jPanel119.add(jButtonSeafoodPaella, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 360, 220));

        jPanel121.setBackground(new java.awt.Color(102, 51, 0));
        jPanel121.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel122.setBackground(new java.awt.Color(231, 213, 195));
        jPanel122.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lamb.jpg"))); // NOI18N
        jPanel122.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel121.add(jPanel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel190.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(231, 213, 195));
        jLabel190.setText("Quantity:");
        jPanel121.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel191.setBackground(new java.awt.Color(231, 213, 195));
        jLabel191.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(231, 213, 195));
        jLabel191.setText("Braised in red wine, served with creamy polenta.");
        jPanel121.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel192.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(231, 213, 195));
        jLabel192.setText("Lamb Shank Osso Buco ");
        jPanel121.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel121.add(jSpinner21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonLambShank.setBackground(new java.awt.Color(231, 213, 195));
        jButtonLambShank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLambShank.setForeground(new java.awt.Color(102, 51, 0));
        jButtonLambShank.setText("ADD");
        jButtonLambShank.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonLambShank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLambShankActionPerformed(evt);
            }
        });
        jPanel121.add(jButtonLambShank, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 360, 220));

        jPanel123.setBackground(new java.awt.Color(102, 51, 0));
        jPanel123.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel124.setBackground(new java.awt.Color(231, 213, 195));
        jPanel124.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/braised.jpg"))); // NOI18N
        jPanel124.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 120));

        jPanel123.add(jPanel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel194.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(231, 213, 195));
        jLabel194.setText("Quantity:");
        jPanel123.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel195.setBackground(new java.awt.Color(231, 213, 195));
        jLabel195.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(231, 213, 195));
        jLabel195.setText("Red wine jus, parsnip purée, and glazed carrots.");
        jPanel123.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel196.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(231, 213, 195));
        jLabel196.setText("Braised Short Ribs");
        jPanel123.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel123.add(jSpinner31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonBraisedShortribs.setBackground(new java.awt.Color(231, 213, 195));
        jButtonBraisedShortribs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBraisedShortribs.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBraisedShortribs.setText("ADD");
        jButtonBraisedShortribs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonBraisedShortribs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBraisedShortribsActionPerformed(evt);
            }
        });
        jPanel123.add(jButtonBraisedShortribs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 360, 220));

        jPanel125.setBackground(new java.awt.Color(102, 51, 0));
        jPanel125.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel126.setBackground(new java.awt.Color(231, 213, 195));
        jPanel126.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cauli.jpg"))); // NOI18N
        jPanel126.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel125.add(jPanel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel198.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(231, 213, 195));
        jLabel198.setText("Quantity:");
        jPanel125.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel199.setBackground(new java.awt.Color(231, 213, 195));
        jLabel199.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(231, 213, 195));
        jLabel199.setText("Romesco sauce, toasted almonds, and golden raisins.");
        jPanel125.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel200.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(231, 213, 195));
        jLabel200.setText("Roasted Cauliflower Steak (V) ");
        jPanel125.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel125.add(jSpinner33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonRoastedCauli.setBackground(new java.awt.Color(231, 213, 195));
        jButtonRoastedCauli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRoastedCauli.setForeground(new java.awt.Color(102, 51, 0));
        jButtonRoastedCauli.setText("ADD");
        jButtonRoastedCauli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonRoastedCauli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRoastedCauliActionPerformed(evt);
            }
        });
        jPanel125.add(jButtonRoastedCauli, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, 360, 220));

        jPanel127.setBackground(new java.awt.Color(102, 51, 0));
        jPanel127.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel128.setBackground(new java.awt.Color(231, 213, 195));
        jPanel128.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/veal.jpg"))); // NOI18N
        jPanel128.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel127.add(jPanel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel202.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(231, 213, 195));
        jLabel202.setText("Quantity:");
        jPanel127.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel203.setBackground(new java.awt.Color(231, 213, 195));
        jLabel203.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(231, 213, 195));
        jLabel203.setText("Crispy veal cutlet with arugula and Parmesan salad.");
        jPanel127.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel204.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(231, 213, 195));
        jLabel204.setText("Veal Milanese ");
        jPanel127.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel127.add(jSpinner32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonVealMilanese.setBackground(new java.awt.Color(231, 213, 195));
        jButtonVealMilanese.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonVealMilanese.setForeground(new java.awt.Color(102, 51, 0));
        jButtonVealMilanese.setText("ADD");
        jButtonVealMilanese.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonVealMilanese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVealMilaneseActionPerformed(evt);
            }
        });
        jPanel127.add(jButtonVealMilanese, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel92.add(jPanel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 360, 220));
        jPanel92.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 460, -1, -1));

        jLabel75.setText("....");
        jPanel92.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 460, -1, -1));

        jScrollPane3.setViewportView(jPanel92);

        jPanel91.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 490));

        jPanel55.add(jPanel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1140, 510));

        jTabbedPane1.addTab("main courses", jPanel55);

        jPanel70.setBackground(new java.awt.Color(231, 213, 195));
        jPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel335.setBackground(new java.awt.Color(102, 51, 0));
        jPanel335.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel317.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(231, 213, 195));
        jLabel317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel317.setText("LAMÈZA  ");
        jPanel335.add(jLabel317, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 60));

        jButton2.setBackground(new java.awt.Color(231, 213, 195));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 0));
        jButton2.setText("BACK");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel335.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 120, 30));

        jPanel70.add(jPanel335, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 70));

        jPanel71.setBackground(new java.awt.Color(102, 51, 0));
        jPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel72.setBackground(new java.awt.Color(231, 213, 195));
        jPanel72.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel73.setBackground(new java.awt.Color(102, 51, 0));
        jPanel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel74.setBackground(new java.awt.Color(231, 213, 195));
        jPanel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/opera.jpg"))); // NOI18N
        jPanel74.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel73.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(231, 213, 195));
        jLabel99.setText("Quantity:");
        jPanel73.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel100.setBackground(new java.awt.Color(231, 213, 195));
        jLabel100.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(231, 213, 195));
        jLabel100.setText("Layers of almond sponge, coffee cream, and chocolate ganache.");
        jPanel73.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(231, 213, 195));
        jLabel101.setText("Opera Cake");
        jPanel73.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel73.add(jSpinner25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonOperaCake.setBackground(new java.awt.Color(231, 213, 195));
        jButtonOperaCake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonOperaCake.setForeground(new java.awt.Color(102, 51, 0));
        jButtonOperaCake.setText("ADD");
        jButtonOperaCake.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonOperaCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperaCakeActionPerformed(evt);
            }
        });
        jPanel73.add(jButtonOperaCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel72.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 220));

        jPanel75.setBackground(new java.awt.Color(102, 51, 0));
        jPanel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel76.setBackground(new java.awt.Color(231, 213, 195));
        jPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trio.jpg"))); // NOI18N
        jPanel76.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel75.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(231, 213, 195));
        jLabel103.setText("Quantity:");
        jPanel75.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel104.setBackground(new java.awt.Color(231, 213, 195));
        jLabel104.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(231, 213, 195));
        jLabel104.setText("Vanilla, pistachio, and lavender flavors.");
        jPanel75.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(231, 213, 195));
        jLabel105.setText("Crème Brûlée Trio");
        jPanel75.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel75.add(jSpinner26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonCremeBruleetrio.setBackground(new java.awt.Color(231, 213, 195));
        jButtonCremeBruleetrio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCremeBruleetrio.setForeground(new java.awt.Color(102, 51, 0));
        jButtonCremeBruleetrio.setText("ADD");
        jButtonCremeBruleetrio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCremeBruleetrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCremeBruleetrioActionPerformed(evt);
            }
        });
        jPanel75.add(jButtonCremeBruleetrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel72.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 360, 220));

        jPanel77.setBackground(new java.awt.Color(102, 51, 0));
        jPanel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel78.setBackground(new java.awt.Color(231, 213, 195));
        jPanel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/molten1.jpg"))); // NOI18N
        jPanel78.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel77.add(jPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(231, 213, 195));
        jLabel107.setText("Quantity:");
        jPanel77.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel108.setBackground(new java.awt.Color(231, 213, 195));
        jLabel108.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(231, 213, 195));
        jLabel108.setText("Raspberry coulis and Madagascar vanilla ice cream.");
        jPanel77.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(231, 213, 195));
        jLabel109.setText("Molten Chocolate Fondant");
        jPanel77.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel77.add(jSpinner27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonMoltenChocolatefondant.setBackground(new java.awt.Color(231, 213, 195));
        jButtonMoltenChocolatefondant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMoltenChocolatefondant.setForeground(new java.awt.Color(102, 51, 0));
        jButtonMoltenChocolatefondant.setText("ADD");
        jButtonMoltenChocolatefondant.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonMoltenChocolatefondant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoltenChocolatefondantActionPerformed(evt);
            }
        });
        jPanel77.add(jButtonMoltenChocolatefondant, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel72.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 360, 220));

        jPanel79.setBackground(new java.awt.Color(102, 51, 0));
        jPanel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel80.setBackground(new java.awt.Color(231, 213, 195));
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seasonal.jpg"))); // NOI18N
        jPanel80.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel79.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(231, 213, 195));
        jLabel111.setText("Quantity:");
        jPanel79.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel112.setBackground(new java.awt.Color(231, 213, 195));
        jLabel112.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(231, 213, 195));
        jLabel112.setText("Crisp meringue, whipped cream, and fresh fruits.");
        jPanel79.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(231, 213, 195));
        jLabel113.setText("Seasonal Fruit Pavlova");
        jPanel79.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel79.add(jSpinner28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonSeasonalFruitpavlova.setBackground(new java.awt.Color(231, 213, 195));
        jButtonSeasonalFruitpavlova.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSeasonalFruitpavlova.setForeground(new java.awt.Color(102, 51, 0));
        jButtonSeasonalFruitpavlova.setText("ADD");
        jButtonSeasonalFruitpavlova.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSeasonalFruitpavlova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeasonalFruitpavlovaActionPerformed(evt);
            }
        });
        jPanel79.add(jButtonSeasonalFruitpavlova, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel72.add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 220));

        jPanel81.setBackground(new java.awt.Color(102, 51, 0));
        jPanel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel82.setBackground(new java.awt.Color(231, 213, 195));
        jPanel82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tarte.jpg"))); // NOI18N
        jPanel82.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel81.add(jPanel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(231, 213, 195));
        jLabel115.setText("Quantity:");
        jPanel81.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel116.setBackground(new java.awt.Color(231, 213, 195));
        jLabel116.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(231, 213, 195));
        jLabel116.setText("Lemon tart with toasted Italian meringue and a raspberry glaze.");
        jPanel81.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(231, 213, 195));
        jLabel117.setText("Tarte au Citron");
        jPanel81.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel81.add(jSpinner29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonTarteauCitron.setBackground(new java.awt.Color(231, 213, 195));
        jButtonTarteauCitron.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonTarteauCitron.setForeground(new java.awt.Color(102, 51, 0));
        jButtonTarteauCitron.setText("ADD");
        jButtonTarteauCitron.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonTarteauCitron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTarteauCitronActionPerformed(evt);
            }
        });
        jPanel81.add(jButtonTarteauCitron, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel72.add(jPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 360, 220));

        jPanel83.setBackground(new java.awt.Color(102, 51, 0));
        jPanel83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel84.setBackground(new java.awt.Color(231, 213, 195));
        jPanel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baba.jpg"))); // NOI18N
        jPanel84.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel83.add(jPanel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(231, 213, 195));
        jLabel119.setText("Quantity:");
        jPanel83.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel120.setBackground(new java.awt.Color(231, 213, 195));
        jLabel120.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(231, 213, 195));
        jLabel120.setText("Rum-soaked brioche with Chantilly cream and orange zest.");
        jPanel83.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(231, 213, 195));
        jLabel121.setText("Baba au Rhum ");
        jPanel83.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel83.add(jSpinner30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonBabaauRhum.setBackground(new java.awt.Color(231, 213, 195));
        jButtonBabaauRhum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBabaauRhum.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBabaauRhum.setText("ADD");
        jButtonBabaauRhum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonBabaauRhum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBabaauRhumActionPerformed(evt);
            }
        });
        jPanel83.add(jButtonBabaauRhum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel72.add(jPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 360, 220));

        jPanel71.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 470));

        jPanel70.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1140, 510));

        jTabbedPane1.addTab("dessert", jPanel70);

        jPanel101.setBackground(new java.awt.Color(231, 213, 195));
        jPanel101.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel337.setBackground(new java.awt.Color(102, 51, 0));
        jPanel337.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel319.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(231, 213, 195));
        jLabel319.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel319.setText("LAMÈZA  ");
        jPanel337.add(jLabel319, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 60));

        jButton1.setBackground(new java.awt.Color(231, 213, 195));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 0));
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel337.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 120, 30));

        jPanel101.add(jPanel337, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 70));

        jPanel102.setBackground(new java.awt.Color(102, 51, 0));
        jPanel102.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel103.setBackground(new java.awt.Color(231, 213, 195));
        jPanel103.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel103.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel104.setBackground(new java.awt.Color(102, 51, 0));
        jPanel104.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel105.setBackground(new java.awt.Color(231, 213, 195));
        jPanel105.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/elderflower.jpg"))); // NOI18N
        jPanel105.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel104.add(jPanel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel153.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(231, 213, 195));
        jLabel153.setText("Quantity:");
        jPanel104.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel154.setBackground(new java.awt.Color(231, 213, 195));
        jLabel154.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(231, 213, 195));
        jLabel154.setText("Gin, St-Germain, cucumber, and sparkling water.");
        jPanel104.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel155.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(231, 213, 195));
        jLabel155.setText("Elderflower Fizz");
        jPanel104.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel104.add(jSpinner35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonElderflowerfizz.setBackground(new java.awt.Color(231, 213, 195));
        jButtonElderflowerfizz.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonElderflowerfizz.setForeground(new java.awt.Color(102, 51, 0));
        jButtonElderflowerfizz.setText("ADD");
        jButtonElderflowerfizz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonElderflowerfizz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElderflowerfizzActionPerformed(evt);
            }
        });
        jPanel104.add(jButtonElderflowerfizz, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 220));

        jPanel106.setBackground(new java.awt.Color(102, 51, 0));
        jPanel106.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel107.setBackground(new java.awt.Color(231, 213, 195));
        jPanel107.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/blckberry.jpg"))); // NOI18N
        jPanel107.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel106.add(jPanel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel157.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(231, 213, 195));
        jLabel157.setText("Quantity:");
        jPanel106.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel158.setBackground(new java.awt.Color(231, 213, 195));
        jLabel158.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(231, 213, 195));
        jLabel158.setText("Vodka, blackberry purée, fresh thyme, and lime. ");
        jPanel106.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel159.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(231, 213, 195));
        jLabel159.setText(" Blackberry Thyme Martini ");
        jPanel106.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel106.add(jSpinner36, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonBlackberryThymeMartini.setBackground(new java.awt.Color(231, 213, 195));
        jButtonBlackberryThymeMartini.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBlackberryThymeMartini.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBlackberryThymeMartini.setText("ADD");
        jButtonBlackberryThymeMartini.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonBlackberryThymeMartini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlackberryThymeMartiniActionPerformed(evt);
            }
        });
        jPanel106.add(jButtonBlackberryThymeMartini, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 360, 220));

        jPanel108.setBackground(new java.awt.Color(102, 51, 0));
        jPanel108.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel109.setBackground(new java.awt.Color(231, 213, 195));
        jPanel109.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/matcha.jpg"))); // NOI18N
        jPanel109.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel108.add(jPanel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel161.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(231, 213, 195));
        jLabel161.setText("Quantity:");
        jPanel108.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel162.setBackground(new java.awt.Color(231, 213, 195));
        jLabel162.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(231, 213, 195));
        jLabel162.setText("A rich creamy green tea with vibrant flavor and a smooth finish.");
        jPanel108.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel246.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(231, 213, 195));
        jLabel246.setText("Matcha");
        jPanel108.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel108.add(jSpinner39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonMatcha.setBackground(new java.awt.Color(231, 213, 195));
        jButtonMatcha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMatcha.setForeground(new java.awt.Color(102, 51, 0));
        jButtonMatcha.setText("ADD");
        jButtonMatcha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonMatcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatchaActionPerformed(evt);
            }
        });
        jPanel108.add(jButtonMatcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 240, 360, 220));

        jPanel110.setBackground(new java.awt.Color(102, 51, 0));
        jPanel110.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel150.setBackground(new java.awt.Color(231, 213, 195));
        jPanel150.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel247.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pineapple.jpg"))); // NOI18N
        jPanel150.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel110.add(jPanel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel248.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel248.setForeground(new java.awt.Color(231, 213, 195));
        jLabel248.setText("Quantity:");
        jPanel110.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel249.setBackground(new java.awt.Color(231, 213, 195));
        jLabel249.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel249.setForeground(new java.awt.Color(231, 213, 195));
        jLabel249.setText("Fresh pineapple juice, ginger beer, and a hint of lime.");
        jPanel110.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel250.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel250.setForeground(new java.awt.Color(231, 213, 195));
        jLabel250.setText("Pineapple Ginger Sparkle");
        jPanel110.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel110.add(jSpinner38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonPineappleGinger.setBackground(new java.awt.Color(231, 213, 195));
        jButtonPineappleGinger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonPineappleGinger.setForeground(new java.awt.Color(102, 51, 0));
        jButtonPineappleGinger.setText("ADD");
        jButtonPineappleGinger.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonPineappleGinger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPineappleGingerActionPerformed(evt);
            }
        });
        jPanel110.add(jButtonPineappleGinger, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 360, 220));

        jPanel151.setBackground(new java.awt.Color(102, 51, 0));
        jPanel151.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel152.setBackground(new java.awt.Color(231, 213, 195));
        jPanel152.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel251.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rosemary.jpg"))); // NOI18N
        jPanel152.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel151.add(jPanel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel252.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(231, 213, 195));
        jLabel252.setText("Quantity:");
        jPanel151.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel253.setBackground(new java.awt.Color(231, 213, 195));
        jLabel253.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel253.setForeground(new java.awt.Color(231, 213, 195));
        jLabel253.setText("House-made lemonade with rosemary syrup and a lemon twist.");
        jPanel151.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel254.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel254.setForeground(new java.awt.Color(231, 213, 195));
        jLabel254.setText("Rosemary Lemonade");
        jPanel151.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel151.add(jSpinner40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonrosemaryLemonade.setBackground(new java.awt.Color(231, 213, 195));
        jButtonrosemaryLemonade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonrosemaryLemonade.setForeground(new java.awt.Color(102, 51, 0));
        jButtonrosemaryLemonade.setText("ADD");
        jButtonrosemaryLemonade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonrosemaryLemonade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrosemaryLemonadeActionPerformed(evt);
            }
        });
        jPanel151.add(jButtonrosemaryLemonade, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 360, 220));

        jPanel153.setBackground(new java.awt.Color(102, 51, 0));
        jPanel153.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel154.setBackground(new java.awt.Color(231, 213, 195));
        jPanel154.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel255.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mojito.jpg"))); // NOI18N
        jPanel154.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel153.add(jPanel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel256.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(231, 213, 195));
        jLabel256.setText("Quantity:");
        jPanel153.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel257.setBackground(new java.awt.Color(231, 213, 195));
        jLabel257.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel257.setForeground(new java.awt.Color(231, 213, 195));
        jLabel257.setText("Mint, lime, and soda water with a touch of sweetness.");
        jPanel153.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel258.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(231, 213, 195));
        jLabel258.setText("Virgin Mojito");
        jPanel153.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel153.add(jSpinner41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonVirginMojito.setBackground(new java.awt.Color(231, 213, 195));
        jButtonVirginMojito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonVirginMojito.setForeground(new java.awt.Color(102, 51, 0));
        jButtonVirginMojito.setText("ADD");
        jButtonVirginMojito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonVirginMojito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVirginMojitoActionPerformed(evt);
            }
        });
        jPanel153.add(jButtonVirginMojito, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 360, 220));

        jPanel155.setBackground(new java.awt.Color(102, 51, 0));
        jPanel155.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel156.setBackground(new java.awt.Color(231, 213, 195));
        jPanel156.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel259.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/citrus.jpg"))); // NOI18N
        jPanel156.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel155.add(jPanel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel260.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(231, 213, 195));
        jLabel260.setText("Quantity:");
        jPanel155.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel261.setBackground(new java.awt.Color(231, 213, 195));
        jLabel261.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(231, 213, 195));
        jLabel261.setText("Orange-infused gin, Campari, and sweet vermouth.");
        jPanel155.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel262.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(231, 213, 195));
        jLabel262.setText("Citrus Negroni");
        jPanel155.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel155.add(jSpinner37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonCitrusNegroni.setBackground(new java.awt.Color(231, 213, 195));
        jButtonCitrusNegroni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCitrusNegroni.setForeground(new java.awt.Color(102, 51, 0));
        jButtonCitrusNegroni.setText("ADD");
        jButtonCitrusNegroni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCitrusNegroni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCitrusNegroniActionPerformed(evt);
            }
        });
        jPanel155.add(jButtonCitrusNegroni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 360, 220));

        jPanel157.setBackground(new java.awt.Color(102, 51, 0));
        jPanel157.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel158.setBackground(new java.awt.Color(231, 213, 195));
        jPanel158.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lavender.jpg"))); // NOI18N
        jPanel158.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 120));

        jPanel157.add(jPanel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel264.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(231, 213, 195));
        jLabel264.setText("Quantity:");
        jPanel157.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel265.setBackground(new java.awt.Color(231, 213, 195));
        jLabel265.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel265.setForeground(new java.awt.Color(231, 213, 195));
        jLabel265.setText("Subtle lavender paired with sweet honey, lightly carbonated.");
        jPanel157.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel266.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(231, 213, 195));
        jLabel266.setText("Lavender and Honey Sparkling Water");
        jPanel157.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel157.add(jSpinner42, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonLavenderHoney.setBackground(new java.awt.Color(231, 213, 195));
        jButtonLavenderHoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLavenderHoney.setForeground(new java.awt.Color(102, 51, 0));
        jButtonLavenderHoney.setText("ADD");
        jButtonLavenderHoney.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonLavenderHoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLavenderHoneyActionPerformed(evt);
            }
        });
        jPanel157.add(jButtonLavenderHoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 360, 220));

        jPanel159.setBackground(new java.awt.Color(102, 51, 0));
        jPanel159.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel160.setBackground(new java.awt.Color(231, 213, 195));
        jPanel160.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel267.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jas.jpg"))); // NOI18N
        jPanel160.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel159.add(jPanel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel268.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel268.setForeground(new java.awt.Color(231, 213, 195));
        jLabel268.setText("Quantity:");
        jPanel159.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel269.setBackground(new java.awt.Color(231, 213, 195));
        jLabel269.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel269.setForeground(new java.awt.Color(231, 213, 195));
        jLabel269.setText("Delicate green tea with floral jasmine aroma.");
        jPanel159.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel270.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel270.setForeground(new java.awt.Color(231, 213, 195));
        jLabel270.setText("Jasmine Pearl");
        jPanel159.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel159.add(jSpinner43, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonJasminePearl.setBackground(new java.awt.Color(231, 213, 195));
        jButtonJasminePearl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonJasminePearl.setForeground(new java.awt.Color(102, 51, 0));
        jButtonJasminePearl.setText("ADD");
        jButtonJasminePearl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonJasminePearl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJasminePearlActionPerformed(evt);
            }
        });
        jPanel159.add(jButtonJasminePearl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, 360, 220));

        jPanel161.setBackground(new java.awt.Color(102, 51, 0));
        jPanel161.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel162.setBackground(new java.awt.Color(231, 213, 195));
        jPanel162.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel271.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chamomile.jpg"))); // NOI18N
        jPanel162.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel161.add(jPanel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel272.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel272.setForeground(new java.awt.Color(231, 213, 195));
        jLabel272.setText("Quantity:");
        jPanel161.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel273.setBackground(new java.awt.Color(231, 213, 195));
        jLabel273.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(231, 213, 195));
        jLabel273.setText("Soothing herbal tea with light apple-like notes. ");
        jPanel161.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel274.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel274.setForeground(new java.awt.Color(231, 213, 195));
        jLabel274.setText("Chamomile");
        jPanel161.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel161.add(jSpinner46, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonChamomile.setBackground(new java.awt.Color(231, 213, 195));
        jButtonChamomile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonChamomile.setForeground(new java.awt.Color(102, 51, 0));
        jButtonChamomile.setText("ADD");
        jButtonChamomile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonChamomile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChamomileActionPerformed(evt);
            }
        });
        jPanel161.add(jButtonChamomile, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 240, 360, 220));
        jPanel103.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 460, -1, -1));

        jLabel79.setText("....");
        jPanel103.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(2220, 460, -1, -1));

        jPanel163.setBackground(new java.awt.Color(102, 51, 0));
        jPanel163.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel164.setBackground(new java.awt.Color(231, 213, 195));
        jPanel164.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel275.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/basil.jpg"))); // NOI18N
        jPanel164.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel163.add(jPanel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel276.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel276.setForeground(new java.awt.Color(231, 213, 195));
        jLabel276.setText("Quantity:");
        jPanel163.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel277.setBackground(new java.awt.Color(231, 213, 195));
        jLabel277.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel277.setForeground(new java.awt.Color(231, 213, 195));
        jLabel277.setText("Tart and slightly herbal with fresh blood orange and basil.");
        jPanel163.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel278.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(231, 213, 195));
        jLabel278.setText("Blood Orange and Basil Soda");
        jPanel163.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel163.add(jSpinner44, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonBloodOrangeBasil.setBackground(new java.awt.Color(231, 213, 195));
        jButtonBloodOrangeBasil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBloodOrangeBasil.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBloodOrangeBasil.setText("ADD");
        jButtonBloodOrangeBasil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonBloodOrangeBasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBloodOrangeBasilActionPerformed(evt);
            }
        });
        jPanel163.add(jButtonBloodOrangeBasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 360, 220));

        jPanel165.setBackground(new java.awt.Color(102, 51, 0));
        jPanel165.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel166.setBackground(new java.awt.Color(231, 213, 195));
        jPanel166.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel279.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cucumberrrr.jpg"))); // NOI18N
        jPanel166.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel165.add(jPanel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jLabel280.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(231, 213, 195));
        jLabel280.setText("Quantity:");
        jPanel165.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 30));

        jLabel281.setBackground(new java.awt.Color(231, 213, 195));
        jLabel281.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(231, 213, 195));
        jLabel281.setText("Crisp cucumber and cooling mint blended with sparkling water.");
        jPanel165.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jLabel282.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(231, 213, 195));
        jLabel282.setText("Cucumber Mint Cooler");
        jPanel165.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jSpinner45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel165.add(jSpinner45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jButtonCucumberMint.setBackground(new java.awt.Color(231, 213, 195));
        jButtonCucumberMint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCucumberMint.setForeground(new java.awt.Color(102, 51, 0));
        jButtonCucumberMint.setText("ADD");
        jButtonCucumberMint.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCucumberMint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCucumberMintActionPerformed(evt);
            }
        });
        jPanel165.add(jButtonCucumberMint, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 20));

        jPanel103.add(jPanel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 10, 360, 220));

        jScrollPane4.setViewportView(jPanel103);

        jPanel102.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 490));

        jPanel101.add(jPanel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1140, 510));

        jTabbedPane1.addTab("beverage", jPanel101);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1170, 630));

        jPanel3.setBackground(new java.awt.Color(231, 213, 195));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel100.setBackground(new java.awt.Color(102, 51, 0));
        jPanel100.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCart.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTableCart);

        jPanel100.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 490));

        jScrollPane2.setViewportView(jPanel100);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 520, 190));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(231, 213, 195));
        jLabel76.setText("RECEIPT");
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 230));

        jPanel56.setBackground(new java.awt.Color(102, 51, 0));
        jPanel56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel61.setBackground(new java.awt.Color(231, 213, 195));
        jPanel61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0)));
        jPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setText("Change:");
        jPanel58.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel83.setText("Payment Method:");
        jPanel58.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel84.setText("Amount:");
        jPanel58.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmountActionPerformed(evt);
            }
        });
        jPanel58.add(jAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 100, 30));

        jChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChangeActionPerformed(evt);
            }
        });
        jPanel58.add(jChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, 30));

        jPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", "E-Wallet", "Bank Trasfer", " " }));
        jPaymentMethod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel58.add(jPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 30));

        jPanel61.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 240, 190));

        jPanel59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0)));
        jPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel85.setText("Total:");
        jPanel59.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel86.setText("SubTotal:");
        jPanel59.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel87.setText("Tax:");
        jPanel59.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));
        jPanel59.add(jSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, 30));

        jTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxActionPerformed(evt);
            }
        });
        jPanel59.add(jTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 30));
        jPanel59.add(jTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, 30));

        jPanel61.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 190));

        jPanel60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0), new java.awt.Color(102, 51, 0)));
        jPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jExit.setText("EXIT");
        jExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jPanel60.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        jPay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPay.setText("PAY");
        jPay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPayActionPerformed(evt);
            }
        });
        jPanel60.add(jPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel60.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRemove.setText("REMOVE");
        jRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveActionPerformed(evt);
            }
        });
        jPanel60.add(jRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel60.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        jPanel61.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, 190));

        jPanel56.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 210));

        jPanel3.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 590, 230));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 1170, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButtonTunaTartareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTunaTartareActionPerformed
        addItemToCart("Tuna Tartare", 1500, jSpinner7);
    }//GEN-LAST:event_jButtonTunaTartareActionPerformed

    private void jButtonLobsterMedallionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLobsterMedallionsActionPerformed
        addItemToCart("Lobster Medallions", 2000, jSpinner8);
    }//GEN-LAST:event_jButtonLobsterMedallionsActionPerformed

    private void jButtonBeefCarpaccioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeefCarpaccioActionPerformed
        addItemToCart("Beef Carpaccio", 1500, jSpinner9);
    }//GEN-LAST:event_jButtonBeefCarpaccioActionPerformed

    private void jButtonBurrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBurrataActionPerformed
        addItemToCart("Burrata with Roasted Peppers", 1500, jSpinner10);
    }//GEN-LAST:event_jButtonBurrataActionPerformed

    private void jButtonOysterRockeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOysterRockeActionPerformed
        addItemToCart("Oysters Rockefeller", 2200, jSpinner11);
    }//GEN-LAST:event_jButtonOysterRockeActionPerformed

    private void jButtonWildMushroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWildMushroomActionPerformed
       addItemToCart("Wild Mushroom Arancini (V)", 1000, jSpinner12);
    }//GEN-LAST:event_jButtonWildMushroomActionPerformed

    private void jButtonLobsterBisqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLobsterBisqueActionPerformed
        addItemToCart("Lobster Bisque", 1500, jSpinner13);
    }//GEN-LAST:event_jButtonLobsterBisqueActionPerformed

    private void jButtonTomKhaGaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTomKhaGaiActionPerformed
        addItemToCart("Tom Kha Gai", 1500, jSpinner14);
    }//GEN-LAST:event_jButtonTomKhaGaiActionPerformed

    private void jButtonSmokeTomatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmokeTomatoActionPerformed
        addItemToCart("Smoked Tomato Soup", 1200, jSpinner15);
    }//GEN-LAST:event_jButtonSmokeTomatoActionPerformed

    private void jButtonGrilledArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrilledArtiActionPerformed
        addItemToCart("Grilled Artichoke Salad", 1200, jSpinner16);
    }//GEN-LAST:event_jButtonGrilledArtiActionPerformed

    private void jButtonClassicCaesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClassicCaesarActionPerformed
        addItemToCart("Classic Caesar Salad", 1000, jSpinner17);
    }//GEN-LAST:event_jButtonClassicCaesarActionPerformed

    private void jButtonWatermelonFetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWatermelonFetaActionPerformed
        addItemToCart("Watermelon and Feta Salad", 1000, jSpinner18);
    }//GEN-LAST:event_jButtonWatermelonFetaActionPerformed

    private void jButtonOperaCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperaCakeActionPerformed
        addItemToCart("Opera Cake", 1500, jSpinner25);
    }//GEN-LAST:event_jButtonOperaCakeActionPerformed

    private void jButtonCremeBruleetrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCremeBruleetrioActionPerformed
        addItemToCart("Crème Brûlée Trio", 1800, jSpinner26);
    }//GEN-LAST:event_jButtonCremeBruleetrioActionPerformed

    private void jButtonMoltenChocolatefondantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoltenChocolatefondantActionPerformed
        addItemToCart("Molten Chocolate Fondant", 1800, jSpinner27);
    }//GEN-LAST:event_jButtonMoltenChocolatefondantActionPerformed

    private void jButtonSeasonalFruitpavlovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeasonalFruitpavlovaActionPerformed
        addItemToCart("Seasonal Fruit Pavlova", 1500, jSpinner28);
    }//GEN-LAST:event_jButtonSeasonalFruitpavlovaActionPerformed

    private void jButtonTarteauCitronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTarteauCitronActionPerformed
        addItemToCart("Tarte au Citron", 1200, jSpinner29);
    }//GEN-LAST:event_jButtonTarteauCitronActionPerformed

    private void jButtonBabaauRhumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBabaauRhumActionPerformed
        addItemToCart("Baba au Rhum", 1200, jSpinner30);
    }//GEN-LAST:event_jButtonBabaauRhumActionPerformed

    private void jButtonSavoryPannaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavoryPannaActionPerformed
        addItemToCart("Savory Panna Cotta", 1000, jSpinner6);
    }//GEN-LAST:event_jButtonSavoryPannaActionPerformed

    private void jButtonCucumberCupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCucumberCupsActionPerformed
        addItemToCart("Cucumber Cups with Crab Salad", 1500, jSpinner5);
    }//GEN-LAST:event_jButtonCucumberCupsActionPerformed

    private void jButtonSmokedSalmonBliniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmokedSalmonBliniActionPerformed
        addItemToCart("Smoked Salmon Blini", 1500, jSpinner4);
    }//GEN-LAST:event_jButtonSmokedSalmonBliniActionPerformed

    private void jButtonGoatCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoatCheeseActionPerformed
        addItemToCart("Goat Cheese Mousse Tart", 1200, jSpinner3);
    }//GEN-LAST:event_jButtonGoatCheeseActionPerformed

    private void jButtonCompressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompressedActionPerformed
        addItemToCart("Compressed Melon with Prosciutto", 1000, jSpinner2);
    }//GEN-LAST:event_jButtonCompressedActionPerformed

    private void jButtonMiniLobsterRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMiniLobsterRollActionPerformed
        addItemToCart("Mini Lobster Roll", 1500.0, jSpinner1);
    }//GEN-LAST:event_jButtonMiniLobsterRollActionPerformed

    private void jButtonDryAgeRibeyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDryAgeRibeyeActionPerformed
        addItemToCart("Dry-Aged Ribeye", 3500, jSpinner19);
    }//GEN-LAST:event_jButtonDryAgeRibeyeActionPerformed

    private void jButtonDuckBreastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDuckBreastActionPerformed
        addItemToCart("Duck Breast a l’Orange", 2500, jSpinner20);
    }//GEN-LAST:event_jButtonDuckBreastActionPerformed

    private void jButtonStuffedBellPeppersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStuffedBellPeppersActionPerformed
        addItemToCart("Stuffed Bell Peppers", 1200, jSpinner34);
    }//GEN-LAST:event_jButtonStuffedBellPeppersActionPerformed

    private void jButtonGrilledDoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrilledDoverActionPerformed
        addItemToCart("Grilled Dover Sole", 3200,  jSpinner22);
    }//GEN-LAST:event_jButtonGrilledDoverActionPerformed

    private void jButtonPanSearedHalibutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPanSearedHalibutActionPerformed
        addItemToCart("Pan-Seared Halibut", 3000, jSpinner23);
    }//GEN-LAST:event_jButtonPanSearedHalibutActionPerformed

    private void jButtonSeafoodPaellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeafoodPaellaActionPerformed
        addItemToCart("Seafood Paella", 2500, jSpinner24);
    }//GEN-LAST:event_jButtonSeafoodPaellaActionPerformed

    private void jButtonLambShankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLambShankActionPerformed
        addItemToCart("Lamb Shank Osso Buco", 3200, jSpinner21);
    }//GEN-LAST:event_jButtonLambShankActionPerformed

    private void jButtonBraisedShortribsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBraisedShortribsActionPerformed
        addItemToCart("Braised Short Ribs", 2800, jSpinner31);
    }//GEN-LAST:event_jButtonBraisedShortribsActionPerformed

    private void jButtonRoastedCauliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRoastedCauliActionPerformed
        addItemToCart("Roasted Cauliflower Steak (V)", 1200, jSpinner33);
    }//GEN-LAST:event_jButtonRoastedCauliActionPerformed

    private void jButtonVealMilaneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVealMilaneseActionPerformed
        addItemToCart("Veal Milanese", 2800, jSpinner32);
    }//GEN-LAST:event_jButtonVealMilaneseActionPerformed

    private void jButtonElderflowerfizzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElderflowerfizzActionPerformed
        addItemToCart("Elderflower Fizz", 1000, jSpinner35);
    }//GEN-LAST:event_jButtonElderflowerfizzActionPerformed

    private void jButtonBlackberryThymeMartiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlackberryThymeMartiniActionPerformed
        addItemToCart("Blackberry Thyme Martini", 1200, jSpinner36);
    }//GEN-LAST:event_jButtonBlackberryThymeMartiniActionPerformed

    private void jButtonMatchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatchaActionPerformed
        addItemToCart("Matcha Latte", 800, jSpinner39);
    }//GEN-LAST:event_jButtonMatchaActionPerformed

    private void jButtonPineappleGingerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPineappleGingerActionPerformed
        addItemToCart("Pineapple Ginger Spritz", 1000, jSpinner38);
    }//GEN-LAST:event_jButtonPineappleGingerActionPerformed

    private void jButtonrosemaryLemonadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrosemaryLemonadeActionPerformed
        addItemToCart("Rosemary Lemonade", 800, jSpinner40);
    }//GEN-LAST:event_jButtonrosemaryLemonadeActionPerformed

    private void jButtonVirginMojitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVirginMojitoActionPerformed
        addItemToCart("Virgin Mojito", 800, jSpinner41);
    }//GEN-LAST:event_jButtonVirginMojitoActionPerformed

    private void jButtonCitrusNegroniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCitrusNegroniActionPerformed
        addItemToCart("Citrus Negroni", 1200, jSpinner37);
    }//GEN-LAST:event_jButtonCitrusNegroniActionPerformed

    private void jButtonLavenderHoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLavenderHoneyActionPerformed
        addItemToCart("Lavender Honey Tea", 800, jSpinner42);
    }//GEN-LAST:event_jButtonLavenderHoneyActionPerformed

    private void jButtonJasminePearlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJasminePearlActionPerformed
        addItemToCart("Jasmine Pearl Tea", 800, jSpinner43);
    }//GEN-LAST:event_jButtonJasminePearlActionPerformed

    private void jButtonChamomileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChamomileActionPerformed
        addItemToCart("Chamomile Tea", 800, jSpinner46);
    }//GEN-LAST:event_jButtonChamomileActionPerformed

    private void jButtonBloodOrangeBasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBloodOrangeBasilActionPerformed
        addItemToCart("Blood Orange Basil Mocktail", 1000, jSpinner44);
    }//GEN-LAST:event_jButtonBloodOrangeBasilActionPerformed

    private void jButtonCucumberMintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCucumberMintActionPerformed
        addItemToCart("Cucumber Mint Cooler", 800, jSpinner45);
    }//GEN-LAST:event_jButtonCucumberMintActionPerformed

    private void jAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmountActionPerformed

    private void jTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTaxActionPerformed

    private void jRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveActionPerformed
        int selectedRow = jTableCart.getSelectedRow(); // Get the selected row
     if (selectedRow != -1) {
         tableModel.removeRow(selectedRow); // Remove the row from the table
         updateTotals(); // Update the totals (subtotal, tax, total)
     } else {
         JOptionPane.showMessageDialog(this, "Please select an item to remove", "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_jRemoveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      // Clear the table
     tableModel.setRowCount(0);
     
     // Reset any input fields or spinners
     jSpinnerQuantity.setValue(1); // Reset quantity spinner to 1

     // Reset the totals
     updateTotals();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
      // Get data from the table (cart items)
    DefaultTableModel model = (DefaultTableModel) jTableCart.getModel();
    
    // Extract subtotal, tax, and total
    double subtotal = Double.parseDouble(jSubTotal.getText());
    double tax = Double.parseDouble(jTax.getText());
    double total = Double.parseDouble(jTotal.getText());

    // Get payment method, amount, and change
    String paymentMethod = jPaymentMethod.getSelectedItem().toString();
    String amount = jAmount.getText();
    String change = jChange.getText();
    
    // Create the Receipt frame and pass the data
    Reciept receiptFrame = new Reciept(
        jTableCart, // Pass the cart table
        jSubTotal, // Subtotal field
        jTax, // Tax field
        jTotal, // Total field
        new JTextField(paymentMethod), // Payment method
        new JTextField(amount), // Amount paid
        new JTextField(change) // Change
    );
    receiptFrame.setVisible(true); // Show the receipt frame
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
         int confirmExit = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
     
     if (confirmExit == JOptionPane.YES_OPTION) {
         System.exit(0);  // Exit the application
     }
    }//GEN-LAST:event_jExitActionPerformed

    private void jPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPayActionPerformed
     // Calculate the subtotal, tax, and total
double subtotal = 0.0;
double tax = 0.0;
double total = 0.0;

// Loop through the table to calculate the subtotal
for (int i = 0; i < tableModel.getRowCount(); i++) {
    double price = (double) tableModel.getValueAt(i, 1); // Get price
    int quantity = (int) tableModel.getValueAt(i, 2); // Get quantity
    subtotal += price * quantity; // Calculate subtotal
}

// Calculate tax (for example, 10% tax)
tax = subtotal * 0.10;

// Calculate total (subtotal + tax)
total = subtotal + tax;

// Display the total to the user and ask for confirmation
int result = JOptionPane.showConfirmDialog(this, 
    "Total Amount: ₱" + String.format("%.2f", total) + 
    "\nProceed with payment?", "Payment Confirmation", JOptionPane.YES_NO_OPTION);

if (result == JOptionPane.YES_OPTION) {
    // Get the selected payment method from the JComboBox
    String paymentMethod = (String) jPaymentMethod.getSelectedItem();

    // Check if a valid payment method is selected
    if (paymentMethod != null && !paymentMethod.isEmpty()) {
        // If the payment method is cash, get the amount paid from jAmount
        if (paymentMethod.equalsIgnoreCase("Cash")) {
            // Get the amount paid from the jAmount text field (or spinner)
            double amountPaid = Double.parseDouble(jAmount.getText()); // Assuming it's a JTextField

            // Check if the amount paid is sufficient
            if (amountPaid >= total) {
                // Calculate the change
                double change = amountPaid - total;

                // Display the change in jChange
                jChange.setText("₱" + String.format("%.2f", change));  // Display the change
                
                // Display a success message
                JOptionPane.showMessageDialog(this, 
                    "Payment of ₱" + String.format("%.2f", total) + " successful using " + paymentMethod + 
                    "\nChange: ₱" + String.format("%.2f", change), 
                    "Payment Successful", JOptionPane.INFORMATION_MESSAGE);

            } else {
                // If the amount paid is less than the total
                JOptionPane.showMessageDialog(this, 
                    "Amount paid is less than the total. Payment not successful.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // For other payment methods (e.g., Card, Online Payment), just process the payment
            JOptionPane.showMessageDialog(this, 
                "Payment of ₱" + String.format("%.2f", total) + " successful using " + paymentMethod + "!", 
                "Payment Successful", JOptionPane.INFORMATION_MESSAGE);

        }
    } else {
        // Show error if no payment method was selected
        JOptionPane.showMessageDialog(this, "Please select a payment method.", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    // Handle case if the user cancels the payment
    JOptionPane.showMessageDialog(this, "Payment cancelled.", 
                                  "Cancelled", JOptionPane.INFORMATION_MESSAGE);
}


    }//GEN-LAST:event_jPayActionPerformed

    private void jChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChangeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminTabForm adf = new AdminTabForm();
        adf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         AdminTabForm adf = new AdminTabForm();
        adf.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         AdminTabForm adf = new AdminTabForm();
        adf.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         AdminTabForm adf = new AdminTabForm();
        adf.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         AdminTabForm adf = new AdminTabForm();
        adf.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         AdminTabForm adf = new AdminTabForm();
        adf.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextField jAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonBabaauRhum;
    private javax.swing.JButton jButtonBeefCarpaccio;
    private javax.swing.JButton jButtonBlackberryThymeMartini;
    private javax.swing.JButton jButtonBloodOrangeBasil;
    private javax.swing.JButton jButtonBraisedShortribs;
    private javax.swing.JButton jButtonBurrata;
    private javax.swing.JButton jButtonChamomile;
    private javax.swing.JButton jButtonCitrusNegroni;
    private javax.swing.JButton jButtonClassicCaesar;
    private javax.swing.JButton jButtonCompressed;
    private javax.swing.JButton jButtonCremeBruleetrio;
    private javax.swing.JButton jButtonCucumberCups;
    private javax.swing.JButton jButtonCucumberMint;
    private javax.swing.JButton jButtonDryAgeRibeye;
    private javax.swing.JButton jButtonDuckBreast;
    private javax.swing.JButton jButtonElderflowerfizz;
    private javax.swing.JButton jButtonGoatCheese;
    private javax.swing.JButton jButtonGrilledArti;
    private javax.swing.JButton jButtonGrilledDover;
    private javax.swing.JButton jButtonJasminePearl;
    private javax.swing.JButton jButtonLambShank;
    private javax.swing.JButton jButtonLavenderHoney;
    private javax.swing.JButton jButtonLobsterBisque;
    private javax.swing.JButton jButtonLobsterMedallions;
    private javax.swing.JButton jButtonMatcha;
    private javax.swing.JButton jButtonMiniLobsterRoll;
    private javax.swing.JButton jButtonMoltenChocolatefondant;
    private javax.swing.JButton jButtonOperaCake;
    private javax.swing.JButton jButtonOysterRocke;
    private javax.swing.JButton jButtonPanSearedHalibut;
    private javax.swing.JButton jButtonPineappleGinger;
    private javax.swing.JButton jButtonRoastedCauli;
    private javax.swing.JButton jButtonSavoryPanna;
    private javax.swing.JButton jButtonSeafoodPaella;
    private javax.swing.JButton jButtonSeasonalFruitpavlova;
    private javax.swing.JButton jButtonSmokeTomato;
    private javax.swing.JButton jButtonSmokedSalmonBlini;
    private javax.swing.JButton jButtonStuffedBellPeppers;
    private javax.swing.JButton jButtonTarteauCitron;
    private javax.swing.JButton jButtonTomKhaGai;
    private javax.swing.JButton jButtonTunaTartare;
    private javax.swing.JButton jButtonVealMilanese;
    private javax.swing.JButton jButtonVirginMojito;
    private javax.swing.JButton jButtonWatermelonFeta;
    private javax.swing.JButton jButtonWildMushroom;
    private javax.swing.JButton jButtonrosemaryLemonade;
    private javax.swing.JTextField jChange;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel232;
    private javax.swing.JPanel jPanel233;
    private javax.swing.JPanel jPanel234;
    private javax.swing.JPanel jPanel235;
    private javax.swing.JPanel jPanel236;
    private javax.swing.JPanel jPanel237;
    private javax.swing.JPanel jPanel238;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel331;
    private javax.swing.JPanel jPanel332;
    private javax.swing.JPanel jPanel333;
    private javax.swing.JPanel jPanel334;
    private javax.swing.JPanel jPanel335;
    private javax.swing.JPanel jPanel337;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JButton jPay;
    private javax.swing.JComboBox<String> jPaymentMethod;
    private javax.swing.JButton jRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner28;
    private javax.swing.JSpinner jSpinner29;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner30;
    private javax.swing.JSpinner jSpinner31;
    private javax.swing.JSpinner jSpinner32;
    private javax.swing.JSpinner jSpinner33;
    private javax.swing.JSpinner jSpinner34;
    private javax.swing.JSpinner jSpinner35;
    private javax.swing.JSpinner jSpinner36;
    private javax.swing.JSpinner jSpinner37;
    private javax.swing.JSpinner jSpinner38;
    private javax.swing.JSpinner jSpinner39;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner40;
    private javax.swing.JSpinner jSpinner41;
    private javax.swing.JSpinner jSpinner42;
    private javax.swing.JSpinner jSpinner43;
    private javax.swing.JSpinner jSpinner44;
    private javax.swing.JSpinner jSpinner45;
    private javax.swing.JSpinner jSpinner46;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField jSubTotal;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTextField jTax;
    private javax.swing.JTextField jTotal;
    // End of variables declaration//GEN-END:variables
}
