/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lameza;

import Controller_Connector.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminTabForm extends javax.swing.JFrame {
    private Connection con;

    public AdminTabForm() {
           initComponents();
    DBConnect.getDBConnection(); // Ensure DB connection is initialized
    con = DBConnect.getConnection(); // Retrieve the connection
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Database connection failed. Check DB settings.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        
    }
    populateCategoryTable();
    loadProductData(); 
}
    public void deleteProduct(int SR) {
    String query = "DELETE FROM products WHERE SR = ?"; // Assuming SR is the primary key for products

    try (PreparedStatement pst = con.prepareStatement(query)) {
        pst.setInt(1, SR); // Set the product ID to delete

        int rowsDeleted = pst.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Product deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadProductData(); // Reload the data in the table after deleting
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete product.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error deleting product: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    
    private void openAddProductWindow() {
    new AddProduct(this).setVisible(true);  // Pass the current instance of AdminTabForm
}
     public void loadProductData() {
        DefaultTableModel model = (DefaultTableModel) jProductsTable.getModel();
        model.setRowCount(0); // Clear existing rows before loading new data

        try {
            String query = "SELECT * FROM products"; // Your products table
            Connection con = DBConnect.getConnection(); // Assuming DBConnect is your connection class
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Populate the table row by row
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("SR"),           // Assuming `id` is the primary key in the table
                    rs.getString("Name"),
                    rs.getString("Price"),
                    rs.getString("Category")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading products: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void addCategoryToTable(int SR, String name) {
    DefaultTableModel model = (DefaultTableModel) jCategoryTable.getModel();
    model.addRow(new Object[] { SR, name }); // Add both id and name to the table
}
   public void populateCategoryTable() {
    DefaultTableModel model = (DefaultTableModel) jCategoryTable.getModel();
    model.setRowCount(0); // Clear the existing rows
    String query = "SELECT SR, Name FROM category"; // Fetch category ID and Name

    try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("SR"),      // Category ID
                rs.getString("Name")  // Category Name
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading categories: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    public void updateCategoryInDatabase(int SR, String newName) {
    String query = "UPDATE category SET name = ? WHERE SR = ?"; 

    try (PreparedStatement pst = con.prepareStatement(query)) { // Correctly formatted try-with-resources
        pst.setString(1, newName);
        pst.setInt(2, SR);
        int rowsUpdated = pst.executeUpdate(); // Execute the update query

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Category updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No category found with the specified ID.", "Update Failed", JOptionPane.WARNING_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error updating category: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    private void loadReservationData() {
    DefaultTableModel model = (DefaultTableModel) reservationtable.getModel();
    model.setRowCount(0); // Clear existing rows before loading new data

    try {
        String query = "SELECT r.reservation_id, c.name, c.email, c.contact, r.reservationDate, r.reservationTime, r.table, r.status " +
                       "FROM reservations r " +
                       "JOIN customers c ON r.customer_id = c.customer_id";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("reservation_id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("contact"),
                rs.getDate("reservationDate").toString(),
                rs.getString("reservationTime"),
                rs.getInt("table"),
                rs.getString("status")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading reservations: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
 private void updateReservation(int reservationID, String reservationDate, String reservationTime, int table, String status) {
    String query = "UPDATE reservations SET reservationDate = ?, reservationTime = ?, table = ?, status = ? WHERE reservation_id = ?";

    try (PreparedStatement pst = con.prepareStatement(query)) {
        pst.setString(1, reservationDate);
        pst.setString(2, reservationTime);
        pst.setInt(3, table);
        pst.setString(4, status);
        pst.setInt(5, reservationID);

        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Reservation updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadReservationData(); // Reload table data
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update reservation.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error updating reservation: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
 }
 
 private void deleteReservation(int reservationID) {
    String query = "DELETE FROM reservations WHERE reservation_id = ?";

    try (PreparedStatement pst = con.prepareStatement(query)) {
        pst.setInt(1, reservationID);

        int rowsDeleted = pst.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Reservation deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadReservationData(); // Reload table data
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete reservation.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error deleting reservation: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}








    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jCategoryTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnCategoryAdd = new javax.swing.JButton();
        btnCategoryUpdate = new javax.swing.JButton();
        btnCategoryDelete = new javax.swing.JButton();
        jPanel332 = new javax.swing.JPanel();
        jLabel314 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel331 = new javax.swing.JPanel();
        jLabel313 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jProductsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnProductAdd = new javax.swing.JButton();
        btnProductUpdate = new javax.swing.JButton();
        btnProductDelete = new javax.swing.JButton();
        jPanel333 = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(231, 213, 195));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(102, 51, 0));
        jPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCategoryTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "SR#", "Name"
            }
        ));
        jScrollPane3.setViewportView(jCategoryTable);

        jPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 990, -1));

        jPanel3.add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 1030, 470));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("CATEGORY LIST");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        btnCategoryAdd.setText("ADD");
        btnCategoryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnCategoryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 80, 70));

        btnCategoryUpdate.setText("UPDATE");
        btnCategoryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnCategoryUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, -1, 70));

        btnCategoryDelete.setText("DELETE");
        btnCategoryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnCategoryDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, -1, 70));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1150, 760));

        jPanel332.setBackground(new java.awt.Color(102, 51, 0));
        jPanel332.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel314.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(231, 213, 195));
        jLabel314.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel314.setText("LAMÈZA  ");
        jPanel332.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 60));

        jPanel5.add(jPanel332, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1150, 80));

        jTabbedPane1.addTab("CATEGORY", jPanel5);

        jPanel1.setBackground(new java.awt.Color(231, 213, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(231, 213, 195));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservationtable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reservationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ReservationID", "CustomerID", "Date", "Time", "NumSeats", "Table", "Status"
            }
        ));
        jScrollPane1.setViewportView(reservationtable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 840));

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 810, -1, -1));

        jScrollPane2.setViewportView(jPanel2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 510));

        jButton1.setBackground(new java.awt.Color(231, 213, 195));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 0));
        jButton1.setText("VIEW");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 180, 40));

        jButton2.setBackground(new java.awt.Color(231, 213, 195));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 0));
        jButton2.setText("UPDATE");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 180, 40));

        jButton9.setBackground(new java.awt.Color(231, 213, 195));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 51, 0));
        jButton9.setText("CREATE");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 180, 40));

        jButton10.setBackground(new java.awt.Color(231, 213, 195));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 51, 0));
        jButton10.setText("DELETE");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 180, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 920, 640));

        jPanel331.setBackground(new java.awt.Color(102, 51, 0));
        jPanel331.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel313.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel313.setForeground(new java.awt.Color(231, 213, 195));
        jLabel313.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel313.setText("LAMÈZA  ");
        jPanel331.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 60));

        jPanel1.add(jPanel331, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1460, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homepage (5).jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1190, 810));

        jTabbedPane1.addTab("RESERVATION", jPanel1);

        jPanel9.setBackground(new java.awt.Color(231, 213, 195));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 5));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(102, 51, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProductsTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SR", "Name", "Category", "Price"
            }
        ));
        jScrollPane4.setViewportView(jProductsTable);
        if (jProductsTable.getColumnModel().getColumnCount() > 0) {
            jProductsTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 990, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 1030, 470));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("PRODUCTS");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        btnProductAdd.setText("ADD");
        btnProductAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductAddActionPerformed(evt);
            }
        });
        jPanel10.add(btnProductAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 80, 70));

        btnProductUpdate.setText("UPDATE");
        btnProductUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductUpdateActionPerformed(evt);
            }
        });
        jPanel10.add(btnProductUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, -1, 70));

        btnProductDelete.setText("DELETE");
        btnProductDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductDeleteActionPerformed(evt);
            }
        });
        jPanel10.add(btnProductDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, -1, 70));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1150, 760));

        jPanel333.setBackground(new java.awt.Color(102, 51, 0));
        jPanel333.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel315.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(231, 213, 195));
        jLabel315.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel315.setText("LAMÈZA  ");
        jPanel333.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 60));

        jPanel9.add(jPanel333, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1150, 80));

        jTabbedPane1.addTab("PRODUCTS", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1190, 900));

        jPanel79.setBackground(new java.awt.Color(102, 51, 0));
        jPanel79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel79.setForeground(new java.awt.Color(102, 51, 0));
        jPanel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel80.setBackground(new java.awt.Color(231, 213, 195));
        jPanel80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel80.setForeground(new java.awt.Color(102, 51, 0));
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel81.setBackground(new java.awt.Color(102, 51, 0));
        jPanel81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel80.add(jPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 160));

        jButton30.setBackground(new java.awt.Color(64, 32, 1));
        jButton30.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(231, 213, 195));
        jButton30.setText("MENU");
        jButton30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.setFocusPainted(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel80.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 210, 40));

        jButton31.setBackground(new java.awt.Color(64, 32, 1));
        jButton31.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton31.setForeground(new java.awt.Color(231, 213, 195));
        jButton31.setText("CATEGORY");
        jButton31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.setFocusPainted(false);
        jPanel80.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, 40));

        jButton32.setBackground(new java.awt.Color(64, 32, 1));
        jButton32.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton32.setForeground(new java.awt.Color(231, 213, 195));
        jButton32.setText("PRODUCTS");
        jButton32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton32.setFocusPainted(false);
        jPanel80.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 210, 40));

        jButton33.setBackground(new java.awt.Color(64, 32, 1));
        jButton33.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton33.setForeground(new java.awt.Color(231, 213, 195));
        jButton33.setText("RESERVATIONS");
        jButton33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.setFocusPainted(false);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel80.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 40));

        jButton34.setBackground(new java.awt.Color(64, 32, 1));
        jButton34.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton34.setForeground(new java.awt.Color(231, 213, 195));
        jButton34.setText("jButton9");
        jButton34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.setFocusPainted(false);
        jPanel80.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, 40));

        jButton35.setBackground(new java.awt.Color(64, 32, 1));
        jButton35.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(231, 213, 195));
        jButton35.setText("jButton9");
        jButton35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.setFocusPainted(false);
        jPanel80.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, 40));

        jPanel79.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 850));

        getContentPane().add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
Ordering od = new Ordering();


// Prompt for the reservation ID using a dialog
String reservationId = JOptionPane.showInputDialog(od, "Please enter your reservation ID:", "Reservation ID", JOptionPane.QUESTION_MESSAGE);

// Check if the user provided a reservation ID
if (reservationId != null && !reservationId.trim().isEmpty()) {
    // Handle the reservation ID (e.g., verify or save it)
    System.out.println("Reservation ID: " + reservationId);
   
od.setVisible(true);

    // You could pass the ID to the Ordering frame if needed
} else {
    // Handle the case where the user cancels or doesn't enter anything
    JOptionPane.showMessageDialog(od, "No Reservation ID entered. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
}

        

    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int selectedRow = reservationtable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a reservation to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this reservation?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // Cancel the deletion if the user chooses "No"
        }

        // Retrieve reservationID from the selected row
        int reservationID = (int) reservationtable.getValueAt(selectedRow, 0); // Assuming the first column contains reservationID

        // Call deleteReservation method
        deleteReservation(reservationID);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        ReservationRequestForm rrf = new ReservationRequestForm();
        rrf.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int selectedRow = reservationtable.getSelectedRow(); // Get selected row index

if (selectedRow != -1) { // Ensure a row is selected
    // Retrieve current data from the selected row
    int reservationID = (int) reservationtable.getValueAt(selectedRow, 0);
    String[] fields = {"Name", "Contact", "Email", "Number of Seats", "Date", "Time", "Table", "Status"};
    String[] currentValues = {
        (String) reservationtable.getValueAt(selectedRow, 1),
        (String) reservationtable.getValueAt(selectedRow, 2),
        (String) reservationtable.getValueAt(selectedRow, 3),
        reservationtable.getValueAt(selectedRow, 4).toString(),
        (String) reservationtable.getValueAt(selectedRow, 5),
        (String) reservationtable.getValueAt(selectedRow, 6),
        reservationtable.getValueAt(selectedRow, 7).toString(),
        (String) reservationtable.getValueAt(selectedRow, 8) // Assuming 8th column is "Status"
    };

    // Let user choose which field to update
    String selectedField = (String) JOptionPane.showInputDialog(
        this,
        "Select the field to update:",
        "Update Field",
        JOptionPane.QUESTION_MESSAGE,
        null,
        fields,
        fields[0]
    );

    if (selectedField != null) { // User did not cancel
        int fieldIndex = java.util.Arrays.asList(fields).indexOf(selectedField);
        String newValue;

        // If updating "Status," show predefined options
        if (selectedField.equals("Status")) {
            String[] statusOptions = {"Pending", "Confirmed", "Cancelled", "Completed"};
            newValue = (String) JOptionPane.showInputDialog(
                this,
                "Select new status:",
                "Update Status",
                JOptionPane.QUESTION_MESSAGE,
                null,
                statusOptions,
                currentValues[fieldIndex]
            );
        } else { // For other fields, allow text input
            newValue = JOptionPane.showInputDialog(this, "Enter new value for " + selectedField, currentValues[fieldIndex]);
        }

        if (newValue != null && !newValue.trim().isEmpty()) { // User provided a valid input
            try {
                String updateQuery = "UPDATE lameza_reservation SET " + getColumnName(selectedField) + " = ? WHERE reservationID = ?";
                try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
                    // Set parameters based on selected field
                    if (fieldIndex == 3 || fieldIndex == 6) { // For int fields: Number of Seats or Table
                        pst.setInt(1, Integer.parseInt(newValue));
                    } else {
                        pst.setString(1, newValue); // For other fields
                    }
                    pst.setInt(2, reservationID); // Set reservationID

                    int rowsUpdated = pst.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Reservation updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                        // Handle notification if status is "Confirmed"
                        if (selectedField.equals("Status") && newValue.equals("Confirmed")) {
                            notifyCustomer(reservationID); // Call notification method
                        }

                        loadReservationData(); // Reload table data to show the updates
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to update reservation.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error updating reservation: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Invalid input for " + selectedField + ". Please enter a valid value.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Update cancelled or invalid input.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
} else {
    JOptionPane.showMessageDialog(this, "Please select a reservation to update.", "Error", JOptionPane.ERROR_MESSAGE);
}
}

// Helper method to map field names to column names in the database
private String getColumnName(String field) {
    switch (field) {
        case "Name":
            return "name";
        case "Contact":
            return "contact";
        case "Email":
            return "email";
        case "Number of Seats":
            return "num_of_seats";
        case "Date":
            return "date";
        case "Time":
            return "time";
        case "Table":
            return "num_table";
        case "Status":
            return "status"; // Map "Status" to the database column
        default:
            throw new IllegalArgumentException("Unknown field: " + field);
    }
}

private void notifyCustomer(int reservationID) {
    try {
        // Retrieve customer details from the reservation ID
        String query = "SELECT c.name, c.email FROM customers c "
                     + "JOIN reservations r ON c.customerID = r.customerID "
                     + "WHERE r.reservationID = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, reservationID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String customerName = rs.getString("name");
                String customerEmail = rs.getString("email");

                // Simulate sending a notification (e.g., email or system notification)
                JOptionPane.showMessageDialog(this, 
                    "Notification sent to " + customerName + " (" + customerEmail + ").", 
                    "Notification Sent", 
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Customer not found for Reservation ID: " + reservationID, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, 
            "Error retrieving customer details: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadReservationData();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCategoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryDeleteActionPerformed
        int selectedRow = jCategoryTable.getSelectedRow(); // Get the selected row from the table

        if (selectedRow != -1) { // Ensure a row is selected
            int categoryId = (int) jCategoryTable.getValueAt(selectedRow, 0); // Get the category ID (SR)
            String categoryName = (String) jCategoryTable.getValueAt(selectedRow, 1); // Get the category name

            // Confirm the deletion with the user
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete the category: " + categoryName + "?",
                "Delete Category",
                JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) { // If the user confirms deletion
                try {
                    String deleteQuery = "DELETE FROM category WHERE SR = ?"; // SQL to delete the category from the database
                    try (PreparedStatement pst = con.prepareStatement(deleteQuery)) {
                        pst.setInt(1, categoryId); // Set the category ID to delete
                        int rowsDeleted = pst.executeUpdate();

                        if (rowsDeleted > 0) {
                            JOptionPane.showMessageDialog(this, "Category deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            populateCategoryTable(); // Reload the table data to reflect the deletion
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to delete the category.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error deleting category: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a category to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCategoryDeleteActionPerformed

    private void btnCategoryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryUpdateActionPerformed
        int selectedRow = jCategoryTable.getSelectedRow(); // Get selected row index

        if (selectedRow != -1) { // Ensure a row is selected
            // Retrieve current data from the selected row
            int categoryId = (int) jCategoryTable.getValueAt(selectedRow, 0); // Get category SR (ID)
            String currentCategoryName = (String) jCategoryTable.getValueAt(selectedRow, 1); // Get category Name

            // Field to update (in this case, only the name can be updated)
            String newCategoryName = JOptionPane.showInputDialog(
                this,
                "Enter new name for category \"" + currentCategoryName + "\":",
                "Update Category",
                JOptionPane.QUESTION_MESSAGE
            );

            if (newCategoryName != null && !newCategoryName.trim().isEmpty()) { // Ensure user entered a new name
                // Update the category in the database
                try {
                    String updateQuery = "UPDATE category SET name = ? WHERE SR = ?"; // SR is the category ID

                    try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
                        pst.setString(1, newCategoryName.trim()); // Set the new category name
                        pst.setInt(2, categoryId); // Set the category ID (SR)

                        int rowsUpdated = pst.executeUpdate();
                        if (rowsUpdated > 0) {
                            JOptionPane.showMessageDialog(this, "Category updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            populateCategoryTable(); // Reload table data to show the updates
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to update category.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error updating category: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Update cancelled or invalid input.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a category to update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCategoryUpdateActionPerformed

    private void btnCategoryAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryAddActionPerformed
        // Prompt the user for the new category name
        String newCategoryName = JOptionPane.showInputDialog(this, "Enter the new category name:");

        if (newCategoryName != null && !newCategoryName.trim().isEmpty()) {
            // Proceed with adding the new category to the database
            try {
                String insertQuery = "INSERT INTO category (Name) VALUES (?)"; // Insert into the 'category' table
                try (PreparedStatement pst = con.prepareStatement(insertQuery)) {
                    pst.setString(1, newCategoryName.trim()); // Set the new category name
                    int rowsInserted = pst.executeUpdate();

                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Category added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        populateCategoryTable(); // Reload the table data to show the new category
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to add category.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error adding category: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Category name is invalid or empty.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCategoryAddActionPerformed

    private void btnProductAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductAddActionPerformed
        new AddProduct(this).setVisible(true);
    }//GEN-LAST:event_btnProductAddActionPerformed

    private void btnProductUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductUpdateActionPerformed
        int selectedRow = jProductsTable.getSelectedRow(); // Get selected row index

    if (selectedRow != -1) { // Ensure a row is selected
        // Retrieve current data from the selected row
        int SR = (int) jProductsTable.getValueAt(selectedRow, 0);
        String[] fields = {"Name", "Price", "Category"};
        String[] currentValues = {
            (String) jProductsTable.getValueAt(selectedRow, 1),
            (String) jProductsTable.getValueAt(selectedRow, 2),
            (String) jProductsTable.getValueAt(selectedRow, 3)
        };

        // Let user choose which field to update
        String selectedField = (String) JOptionPane.showInputDialog(
            this,
            "Select the field to update:",
            "Update Field",
            JOptionPane.QUESTION_MESSAGE,
            null,
            fields,
            fields[0]
        );

        if (selectedField != null) { // User did not cancel
            int fieldIndex = java.util.Arrays.asList(fields).indexOf(selectedField);
            String newValue = JOptionPane.showInputDialog(this, "Enter new value for " + selectedField, currentValues[fieldIndex]);

            if (newValue != null && !newValue.trim().isEmpty()) { // User provided a valid input
                // Update only the selected field
                try {
                    String updateQuery = "UPDATE products SET " + mapFieldToColumn(selectedField) + " = ? WHERE SR = ?";
                    try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
                        // Set parameters based on selected field
                        if (fieldIndex == 1) { // For Price field (index 1), handle as double
                            try {
                                double price = Double.parseDouble(newValue); // Convert to double
                                pst.setDouble(1, price); // Set price as double
                            } catch (NumberFormatException nfe) {
                                JOptionPane.showMessageDialog(this, "Invalid price entered. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                                return; // Exit if invalid input
                            }
                        } else {
                            pst.setString(1, newValue); // For Name and Category, just set as String
                        }
                        pst.setInt(2, SR); // Set product ID

                        int rowsUpdated = pst.executeUpdate();
                        if (rowsUpdated > 0) {
                            JOptionPane.showMessageDialog(this, "Product updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            loadProductData(); // Reload table data to show the updates
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to update product.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error updating product: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Update cancelled or invalid input.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a product to update.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Helper method to map field names to column names in the database
private String mapFieldToColumn(String field) {
    switch (field) {
        case "Name":
            return "name";
        case "Price":
            return "price";  // Ensure the correct column name for price
        case "Category":
            return "category";
        default:
            throw new IllegalArgumentException("Unknown field: " + field);
    }

    }//GEN-LAST:event_btnProductUpdateActionPerformed

    private void btnProductDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductDeleteActionPerformed
        int selectedRow = jProductsTable.getSelectedRow(); // Get selected row index

    if (selectedRow != -1) { // Ensure a row is selected
        // Retrieve the product ID from the selected row (assuming SR is the ID column)
        int productId = (int) jProductsTable.getValueAt(selectedRow, 0); // SR is the ID column

        // Confirm before deleting
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this product?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            deleteProduct(productId); // Call the delete method
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a product to delete.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnProductDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    AdminTabForm adminTabForm = new AdminTabForm(); // Create an instance of AdminTabForm
    new AddProduct(adminTabForm).setVisible(true); 
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
            java.util.logging.Logger.getLogger(AdminTabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTabForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTabForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoryAdd;
    private javax.swing.JButton btnCategoryDelete;
    private javax.swing.JButton btnCategoryUpdate;
    private javax.swing.JButton btnProductAdd;
    private javax.swing.JButton btnProductDelete;
    private javax.swing.JButton btnProductUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton9;
    private javax.swing.JTable jCategoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel331;
    private javax.swing.JPanel jPanel332;
    private javax.swing.JPanel jPanel333;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTable jProductsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable reservationtable;
    // End of variables declaration//GEN-END:variables
}
