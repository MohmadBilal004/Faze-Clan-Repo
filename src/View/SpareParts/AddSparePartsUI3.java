package View.SpareParts;

import View.MainUI;
import java.awt.Color;
import Model.SpareParts;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.lang.System.*;
import View.SpareParts.DisplaySparePartsUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.logging.Level;
import net.proteanit.sql.DbUtils;
import java.io.*;
import org.apache.ibatis.jdbc.ScriptRunner;

/**
 *
 * @author theCodeMonster
 */
public class AddSparePartsUI3 extends javax.swing.JFrame {

    private static final String URL = "jdbc:mysql://localhost/timetickerDB";
    private static final String user = "root";
    private static final String password = "";

    SpareParts spControll;
    Connection conn = null;
//    Statement st;
    PreparedStatement st;

    ArrayList<SpareParts> spArr;
    public String[] header = new String[]{"SparePart ID", "Name Of Item", "Category", "Brands", "Quantity"};
    DefaultTableModel dtm;
    public int row, col;

    /**
     * Creates new form AddSpareParts
     */
    public AddSparePartsUI3() {
        initComponents();
        showData();

        jPanel1.setBackground(new Color(0, 0, 0, 0.5f));

        spArr = new ArrayList<>();
        dtm = new DefaultTableModel(header, 0);

        jTable1.setModel(dtm);
        this.setLocationRelativeTo(null);

    }

//=========================================Functions=============================================
   
//======================================End Functions============================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        spNameBox = new javax.swing.JTextField();
        spIDBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spBrandBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        spQuantityBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spCategoryBox = new javax.swing.JComboBox<>();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        ShowDataButton = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        spNameBox.setFont(new java.awt.Font("Heiti TC", 0, 18)); // NOI18N
        spNameBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        spNameBox.setOpaque(true);
        spNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spNameBoxActionPerformed(evt);
            }
        });

        spIDBox.setFont(new java.awt.Font("Heiti TC", 0, 18)); // NOI18N
        spIDBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        spIDBox.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Heiti TC", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name of Item");

        jLabel3.setFont(new java.awt.Font("Heiti TC", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Spare Part ID");

        jLabel4.setFont(new java.awt.Font("Heiti TC", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");

        jLabel5.setFont(new java.awt.Font("Heiti TC", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        spBrandBox.setFont(new java.awt.Font("Heiti TC", 0, 18)); // NOI18N
        spBrandBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        spBrandBox.setOpaque(true);
        spBrandBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spBrandBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Heiti TC", 0, 20)); // NOI18N

        spQuantityBox.setFont(new java.awt.Font("Heiti TC", 0, 18)); // NOI18N
        spQuantityBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        spQuantityBox.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Heiti TC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Brand");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Spare Parts Details");

        spCategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Smart Watch", "Casual Watch", "Sports Watch", "Digital Watch" }));
        spCategoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spCategoryBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(spQuantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(299, 299, 299))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel1)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spNameBox, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                .addComponent(spCategoryBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                            .addComponent(spBrandBox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spCategoryBox)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spBrandBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spQuantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, 400));

        kButton1.setText("Add Item");
        kButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton1.setkBorderRadius(50);
        kButton1.setkEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(0, 0, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 140, -1));

        kButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kButton2.setText("Return");
        kButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton2.setkBorderRadius(50);
        kButton2.setkEndColor(new java.awt.Color(153, 0, 153));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(102, 0, 102));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(153, 0, 153));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 110, -1));

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SparePart ID", "Name Of Item", "Category", "Brand"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 510, 520));

        kButton3.setText("Search");
        kButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton3.setkBorderRadius(50);
        kButton3.setkEndColor(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(0, 0, 0));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 120, -1));

        kButton4.setText("Delete");
        kButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton4.setkBorderRadius(50);
        kButton4.setkEndColor(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton4.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(0, 0, 0));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 120, -1));

        kButton5.setText("Update");
        kButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton5.setkBorderRadius(50);
        kButton5.setkEndColor(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton5.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton5.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(0, 0, 0));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 120, -1));

        kButton6.setText("Display");
        kButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton6.setkBorderRadius(50);
        kButton6.setkEndColor(new java.awt.Color(255, 204, 0));
        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverEndColor(new java.awt.Color(255, 51, 51));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(255, 51, 204));
        kButton6.setkStartColor(new java.awt.Color(255, 153, 0));
        kButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kButton6MouseExited(evt);
            }
        });
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 130, -1));

        kButton7.setText("Exit");
        kButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        kButton7.setkBorderRadius(50);
        kButton7.setkEndColor(new java.awt.Color(0, 51, 204));
        kButton7.setkHoverEndColor(new java.awt.Color(153, 255, 0));
        kButton7.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverStartColor(new java.awt.Color(255, 255, 0));
        kButton7.setkPressedColor(new java.awt.Color(255, 0, 102));
        kButton7.setkStartColor(new java.awt.Color(51, 51, 255));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 90, -1));

        ShowDataButton.setText("Show Data");
        ShowDataButton.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ShowDataButton.setkBorderRadius(50);
        ShowDataButton.setkEndColor(new java.awt.Color(102, 102, 0));
        ShowDataButton.setkHoverEndColor(new java.awt.Color(255, 204, 0));
        ShowDataButton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        ShowDataButton.setkHoverStartColor(new java.awt.Color(204, 255, 51));
        ShowDataButton.setkPressedColor(new java.awt.Color(0, 102, 102));
        ShowDataButton.setkStartColor(new java.awt.Color(102, 102, 0));
        ShowDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 590, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/mohamedazwar/Desktop/OOP Project/Photos/Spare-Parts-2.jpeg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        MainUI main = new MainUI();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton2ActionPerformed


    private void spNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spNameBoxActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        String input = JOptionPane.showInputDialog(rootPane, "Search SparePart ID: ", "Search", 3);
        for (int i = 0; i < spArr.size(); i++) {
            if (spArr.get(i).getSparePartID() == Integer.parseInt(input)) {
                JOptionPane.showMessageDialog(rootPane, "Found!!", "Search SparePart", 2);
                spNameBox.setText(spArr.get(i).getNameOfItem());
                spIDBox.setText(String.valueOf(spArr.get(i).getSparePartID()));
                String category = spArr.get(i).getCategory();
                spBrandBox.setText(spArr.get(i).getBrand());
                spQuantityBox.setText(String.valueOf(spArr.get(i).getQuantity()));
//                jTextField4.setText(dtm.getValueAt(row, 3).toString());
                
                return; // quit after found
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Not Found!!", "Search", 2);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        
        int sparePartID = Integer.parseInt(spIDBox.getText());
        String nameOfItem = spNameBox.getText();
        String category = spCategoryBox.getSelectedItem().toString();
        String brand = spBrandBox.getText();
        int quantity = Integer.parseInt(spQuantityBox.getText());

//        Connection conn = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, user, password);

            String insert = "INSERT INTO timetickerDB.SpareParts  VALUES ('" + sparePartID + "', '" + nameOfItem + "', '" + category + "', '" + brand + "', '" + quantity + "');";
            st = conn.prepareStatement(insert); // "(Statement)" you can put this on after '=' sign

//            int sparePartID = Integer.parseInt(spIDBox.getText());
//            String nameOfItem = spNameBox.getText();
//            String category = spCategoryBox.getSelectedItem().toString();
//            String brand = spBrandBox.getText();
//            int quantity = Integer.parseInt(spQuantityBox.getText());
            

            st.executeQuery();
            
            System.out.println("Connected Succesfully...");

        } catch (Exception ex) {
            System.err.println(ex);
        }

        
        dtm.setRowCount(0); // reset data model 
        showData();
        clearField();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(rootPane, "Delete This Data", "Delete", dialogButton);
        if (dialogResult == 0) {
            dtm.removeRow(row);

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, user, password);

                Statement st = conn.createStatement(); // "(Statement)" you can put this on after = sign

                String delete = "DELETE FROM timetickerDB.SpareParts WHERE SparePartID=" + spArr.get(row).getSparePartID() + ";"; //spArr.get(row).getSparePartID()

                st.executeUpdate(delete);

                System.out.println("Connected Succesfully...");

            } catch (SQLException | ClassNotFoundException ex) {
                System.err.println("Errors: " + ex);
            }

            

            dtm.setRowCount(0);
            
            clearField();
        } else {

        }

    }//GEN-LAST:event_kButton4ActionPerformed

    private void spCategoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spCategoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spCategoryBoxActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        String updatenameOfItem = spNameBox.getText();
        int updatesparePartID = Integer.parseInt(spIDBox.getText());
        String updatescategory = spCategoryBox.getSelectedItem().toString();
        String updatesbrand = spBrandBox.getText();
        int updatequantity = Integer.parseInt(spQuantityBox.getText());

        dtm.setRowCount(0);
        

        clearField();

    }//GEN-LAST:event_kButton5ActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        dtm.setRowCount(0);
        clearField();
        showData();
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        row = jTable1.getSelectedRow();
        col = jTable1.getSelectedColumn();
        System.out.println(row + ", " + col);
        spIDBox.setText(dtm.getValueAt(row, 0).toString());
        spNameBox.setText(dtm.getValueAt(row, 1).toString());
        String category = dtm.getValueAt(row, 2).toString();
        spBrandBox.setText(dtm.getValueAt(row, 3).toString());
        spQuantityBox.setText(dtm.getValueAt(row, 4).toString());
        for (int i = 0; i < (spCategoryBox.getItemCount()); i++) {
            if (spCategoryBox.getItemAt(i).equalsIgnoreCase(category)) {
                spCategoryBox.setSelectedIndex(i);
            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        DisplaySparePartsUI display = new DisplaySparePartsUI();
        display.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Confirm do you want to Exit? ", "Exit", JOptionPane.YES_NO_OPTION) == (JOptionPane.YES_OPTION)) {
            System.exit(0);
        }
    }//GEN-LAST:event_kButton7ActionPerformed

    private void spBrandBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spBrandBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spBrandBoxActionPerformed

    private void kButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton6MouseExited

    private void ShowDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataButtonActionPerformed
        dtm.setRowCount(0);
        clearField();
        showData();
    }//GEN-LAST:event_ShowDataButtonActionPerformed

    public void showData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, user, password);

            Statement st = conn.createStatement();
            // sql query
            String query = "SELECT * FROM timetickerDB.SpareParts";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String spID = String.valueOf(rs.getInt("SparePartID"));
                String spName = rs.getString("NameofItem");
                String spCategory = rs.getString("Category");
                String spBrand = rs.getString("Brand");
                String spQuantity = String.valueOf(rs.getInt("Quantity"));

                String[] tbData = {spID, spName, spCategory, spBrand, spQuantity};
                DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
                dtm2.addRow(tbData);

            }

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public void clearField() {
        spNameBox.requestFocus();
        spNameBox.setText("");
        spIDBox.setText("");
        spCategoryBox.setSelectedIndex(0);
        spBrandBox.setText("");
        spQuantityBox.setText("");
    }

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
            java.util.logging.Logger.getLogger(AddSparePartsUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSparePartsUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSparePartsUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSparePartsUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        AddSparePartsUI3 adsp = new AddSparePartsUI3();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adsp.showData();
                new AddSparePartsUI3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton ShowDataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    public com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    public javax.swing.JTextField spBrandBox;
    public javax.swing.JComboBox<String> spCategoryBox;
    public javax.swing.JTextField spIDBox;
    public javax.swing.JTextField spNameBox;
    public javax.swing.JTextField spQuantityBox;
    // End of variables declaration//GEN-END:variables

}
