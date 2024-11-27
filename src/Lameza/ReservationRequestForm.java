package Lameza;

import Controller_Connector.DBConnect;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReservationRequestForm extends javax.swing.JFrame {

    // This will hold the reserved tables in memory
    private java.util.Set<String> reservedTables;
    private Connection con;

    /**
     * Creates new form ReservationRequestForm
     */
    public ReservationRequestForm() {
        initComponents();
        // Get the database connection using DBConnect class
        DBConnect dbc = new DBConnect();
        con = dbc.getConnection(); // DBConnect already returns a Connection object
        // Initialize the reservedTables set
        reservedTables = new java.util.HashSet<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jname = new javax.swing.JTextField();
        jcontact = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jyear = new javax.swing.JComboBox<>();
        jmonth = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtable = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jhour = new javax.swing.JComboBox<>();
        jmin = new javax.swing.JComboBox<>();
        jampm = new javax.swing.JComboBox<>();
        jday = new javax.swing.JComboBox<>();
        jseats = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(231, 213, 195));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1350, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(231, 213, 195));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LAMÈZA  ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 60));

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
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1470, 90));

        jLabel21.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 51, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(" LAMÈZA ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, 330, 60));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel3.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 250, 30));
        jPanel3.add(jcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 250, 30));

        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });
        jPanel3.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 30));

        jyear.setBackground(new java.awt.Color(231, 213, 195));
        jyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034" }));
        jyear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jyearActionPerformed(evt);
            }
        });
        jPanel3.add(jyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 90, 30));

        jmonth.setBackground(new java.awt.Color(231, 213, 195));
        jmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jmonth.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 70, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 213, 195));
        jLabel2.setText("NAME:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 213, 195));
        jLabel3.setText("CONTACT NUMBER:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 213, 195));
        jLabel4.setText("EMAIL:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(231, 213, 195));
        jLabel7.setText("CHOOSE TABLE:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(231, 213, 195));
        jLabel6.setText("DATE OF RESERVATION:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 213, 195));
        jLabel5.setText("NUMBER OF SEATS:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        jLabel22.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(231, 213, 195));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("reservation request");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(231, 213, 195));
        jLabel11.setText("TIME OF RESERVATION:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        jtable.setBackground(new java.awt.Color(231, 213, 195));
        jtable.setForeground(new java.awt.Color(102, 51, 0));
        jtable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jtable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 170, 30));

        jButton1.setBackground(new java.awt.Color(231, 213, 195));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 0));
        jButton1.setText("CONFIRM RESERVATION");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 230, 30));

        jhour.setBackground(new java.awt.Color(231, 213, 195));
        jhour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jhour.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jhour, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 70, 30));

        jmin.setBackground(new java.awt.Color(231, 213, 195));
        jmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", " " }));
        jmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 70, 30));

        jampm.setBackground(new java.awt.Color(231, 213, 195));
        jampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        jampm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jampm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 90, 30));

        jday.setBackground(new java.awt.Color(231, 213, 195));
        jday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        jday.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jday, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 70, 30));

        jseats.setBackground(new java.awt.Color(231, 213, 195));
        jseats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jseats.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jseatsActionPerformed(evt);
            }
        });
        jPanel3.add(jseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 250, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 490, 510));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homepage (2).jpg"))); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1470, 550));

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 630, 10));

        jPanel6.setBackground(new java.awt.Color(102, 51, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 700, 600, -1));

        jPanel8.setBackground(new java.awt.Color(102, 51, 0));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(231, 213, 195));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/royale (1).jpg"))); // NOI18N
        jLabel27.setText("TABLE 3");
        jLabel27.setOpaque(true);
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 290, 180));

        jPanel9.setBackground(new java.awt.Color(102, 51, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(204, 204, 255));
        jLabel29.setText("TABLE 1");
        jLabel29.setOpaque(true);
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 290, 180));

        jLabel30.setBackground(new java.awt.Color(0, 204, 204));
        jLabel30.setText("TABLE 4");
        jLabel30.setOpaque(true);
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 290, 180));

        jLabel31.setBackground(new java.awt.Color(255, 51, 102));
        jLabel31.setText("TABLE 3");
        jLabel31.setOpaque(true);
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 290, 180));

        jLabel32.setBackground(new java.awt.Color(255, 102, 153));
        jLabel32.setText("TABLE 5");
        jLabel32.setOpaque(true);
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 180));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 1460, 260));

        jPanel11.setBackground(new java.awt.Color(231, 213, 195));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setBackground(new java.awt.Color(231, 213, 195));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/amour (2).jpg"))); // NOI18N
        jLabel28.setOpaque(true);
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 310, 200));

        jLabel34.setBackground(new java.awt.Color(231, 213, 195));
        jLabel34.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(231, 213, 195));
        jLabel34.setText("Lamèza Serene ");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 230, -1, -1));

        jPanel15.setBackground(new java.awt.Color(231, 213, 195));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(231, 213, 195));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/harmonie.jpg"))); // NOI18N
        jLabel13.setText("TABLE 4");
        jLabel13.setOpaque(true);
        jPanel15.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 180));

        jPanel8.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 310, 200));

        jPanel14.setBackground(new java.awt.Color(231, 213, 195));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(231, 213, 195));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/serene (1).jpg"))); // NOI18N
        jLabel25.setText("TABLE 1");
        jLabel25.setOpaque(true);
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 180));

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 310, 200));

        jPanel16.setBackground(new java.awt.Color(231, 213, 195));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel36.setBackground(new java.awt.Color(231, 213, 195));
        jLabel36.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(231, 213, 195));
        jLabel36.setText("Lamèza Royale ");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jLabel37.setBackground(new java.awt.Color(231, 213, 195));
        jLabel37.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(231, 213, 195));
        jLabel37.setText("Lamèza Harmonie ");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        jLabel38.setBackground(new java.awt.Color(231, 213, 195));
        jLabel38.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(231, 213, 195));
        jLabel38.setText("Lamèza Amour ");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 1460, 270));

        jPanel5.setBackground(new java.awt.Color(102, 51, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(102, 51, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("TABLE 1");
        jLabel10.setOpaque(true);
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 290, 180));

        jLabel18.setBackground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("TABLE 4");
        jLabel18.setOpaque(true);
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 290, 180));

        jLabel19.setBackground(new java.awt.Color(255, 51, 102));
        jLabel19.setText("TABLE 3");
        jLabel19.setOpaque(true);
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 290, 180));

        jLabel24.setBackground(new java.awt.Color(255, 102, 153));
        jLabel24.setText("TABLE 5");
        jLabel24.setOpaque(true);
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 180));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 1460, 260));

        jLabel26.setBackground(new java.awt.Color(231, 213, 195));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/soleill.jpg"))); // NOI18N
        jLabel26.setText("TABLE 4");
        jLabel26.setOpaque(true);
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 290, 180));

        jPanel12.setBackground(new java.awt.Color(231, 213, 195));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(231, 213, 195));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/velours.jpg"))); // NOI18N
        jLabel14.setText("TABLE 5");
        jLabel14.setOpaque(true);
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 180));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 310, 200));

        jLabel35.setBackground(new java.awt.Color(231, 213, 195));
        jLabel35.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(231, 213, 195));
        jLabel35.setText("Lamèza Luxe");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 230, -1, -1));

        jPanel13.setBackground(new java.awt.Color(231, 213, 195));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(231, 213, 195));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/verre.jpg"))); // NOI18N
        jLabel12.setText("TABLE 3");
        jLabel12.setOpaque(true);
        jPanel13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 180));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 310, 200));

        jLabel39.setBackground(new java.awt.Color(231, 213, 195));
        jLabel39.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(231, 213, 195));
        jLabel39.setText("Lamèza Velour");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanel17.setBackground(new java.awt.Color(231, 213, 195));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 310, 200));

        jPanel18.setBackground(new java.awt.Color(231, 213, 195));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(231, 213, 195));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/luxe.jpg"))); // NOI18N
        jLabel8.setText("TABLE 1");
        jLabel8.setOpaque(true);
        jPanel18.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 180));

        jPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 310, 200));

        jLabel40.setBackground(new java.awt.Color(231, 213, 195));
        jLabel40.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(231, 213, 195));
        jLabel40.setText("Lamèza Verre");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jLabel41.setBackground(new java.awt.Color(231, 213, 195));
        jLabel41.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(231, 213, 195));
        jLabel41.setText("Lamèza Soleil");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1060, 1460, 270));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jseatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jseatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jname.getText();
String contact = jcontact.getText();
String email = jemail.getText();
String numSeats = (String) jseats.getSelectedItem(); // Ensure this is provided by the UI
String year = (String) jyear.getSelectedItem();
String month = (String) jmonth.getSelectedItem();
String day = (String) jday.getSelectedItem();
String hour = (String) jhour.getSelectedItem();
String minutes = (String) jmin.getSelectedItem();
String ampm = (String) jampm.getSelectedItem();
String table = (String) jtable.getSelectedItem();

// Combine hour, minute, and AM/PM for time
String time = hour + ":" + minutes + " " + ampm;
String date = year + "-" + month + "-" + day; // SQL-friendly date format (YYYY-MM-DD)

// Validate inputs
if (name.isEmpty() || contact.isEmpty() || email.isEmpty() || numSeats.isEmpty() || date.isEmpty() || table.isEmpty()) {
    JOptionPane.showMessageDialog(
        this,
        "Please fill out all fields before submitting.",
        "Missing Information",
        JOptionPane.WARNING_MESSAGE
    );
    return;
}

// Check if the table is already reserved
if (reservedTables.contains(table)) {
    JOptionPane.showMessageDialog(
        this,
        "Table " + table + " is already reserved. Please choose another table.",
        "Table Already Reserved",
        JOptionPane.WARNING_MESSAGE
    );
    return;
}

try {
    // Start transaction
    con.setAutoCommit(false);

    // Insert into Customers table
    String insertCustomerQuery = "INSERT INTO customers (name, email, contact) VALUES (?, ?, ?)";
    int customerId;

    try (PreparedStatement customerPst = con.prepareStatement(insertCustomerQuery, Statement.RETURN_GENERATED_KEYS)) {
        customerPst.setString(1, name);
        customerPst.setString(2, email);
        customerPst.setString(3, contact);

        int customerRows = customerPst.executeUpdate();
        if (customerRows > 0) {
            ResultSet generatedKeys = customerPst.getGeneratedKeys();
            if (generatedKeys.next()) {
                customerId = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Failed to retrieve customer ID.");
            }
        } else {
            throw new SQLException("Failed to insert customer data.");
        }
    }

    // Insert into Reservations table
    String insertReservationQuery = "INSERT INTO reservations (reservation_id, customer_id, reservationDate, reservationTime, table, numSeats, status) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement reservationPst = con.prepareStatement(insertReservationQuery)) {
        reservationPst.setInt(1, customerId);               // Link customer ID
        reservationPst.setString(2, date);                 // Reservation date
        reservationPst.setString(3, time);                 // Reservation time
        reservationPst.setInt(4, Integer.parseInt(table)); // Reserved table
        reservationPst.setInt(5, Integer.parseInt(numSeats)); // Number of seats
        reservationPst.setString(6, "Pending");            // Default status

        int reservationRows = reservationPst.executeUpdate();
        if (reservationRows > 0) {
            // Commit transaction
            con.commit();
            JOptionPane.showMessageDialog(this, "Reservation submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            reservedTables.add(table); // Mark table as reserved
            AdminTabForm adf = new AdminTabForm();
            adf.setVisible(true);
        } else {
            throw new SQLException("Failed to insert reservation data.");
        }
    }
} catch (Exception e) {
    try {
        con.rollback(); // Roll back transaction on error
    } catch (SQLException rollbackEx) {
        rollbackEx.printStackTrace();
    }
    JOptionPane.showMessageDialog(this, "Error while submitting reservation: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
} finally {
    try {
        con.setAutoCommit(true); // Restore default behavior
    } catch (SQLException autoCommitEx) {
        autoCommitEx.printStackTrace();
    }
}

    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jyearActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminTabForm adf = new AdminTabForm();
        adf.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
    /* Initialize database connection */
    DBConnect dbc = new DBConnect();

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                ReservationRequestForm form = new ReservationRequestForm();
                form.setTitle("Reservation Management");
                form.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error initializing application: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jampm;
    private javax.swing.JTextField jcontact;
    private javax.swing.JComboBox<String> jday;
    private javax.swing.JTextField jemail;
    private javax.swing.JComboBox<String> jhour;
    private javax.swing.JComboBox<String> jmin;
    private javax.swing.JComboBox<String> jmonth;
    private javax.swing.JTextField jname;
    private javax.swing.JComboBox<String> jseats;
    private javax.swing.JComboBox<String> jtable;
    private javax.swing.JComboBox<String> jyear;
    // End of variables declaration//GEN-END:variables
}
