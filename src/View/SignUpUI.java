package View;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author theCodeMonster
 */
public class SignUpUI extends javax.swing.JFrame {

    
    private static final String URL = "jdbc:mysql://localhost/timetickerDB";
    private static final String user = "root";
    private static final String password = "";
    
    /**
     * Creates new form SignUpUI
     */
    public SignUpUI() {
        initComponents();
        jPanel1.setBackground(new Color(0f, 0f, 0f, 0.5f));

    }

//=========================================Functions=================================================
    
    public void clearField(){
        empIDBox.setText("");
        empNameBox.setText("");
        empJobBox.setSelectedIndex(0);
        empPhoneBox.setText("");
        empIDBox.setText("");
        empMailBox.setText("");
        empPwdBox.setText("");
        empPwdBox2.setText("");
        
        
    }
    
//=========================================End Functions=============================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regButton1 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        empNameBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        empIDBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        empPhoneBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        empMailBox = new javax.swing.JTextField();
        empJobBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        empPwdBox = new javax.swing.JPasswordField();
        empPwdBox2 = new javax.swing.JPasswordField();
        empPhonelbl = new javax.swing.JLabel();
        empJoblbl = new javax.swing.JLabel();
        empIDlbl = new javax.swing.JLabel();
        empNamelbl = new javax.swing.JLabel();
        empPasslbl = new javax.swing.JLabel();
        empMaillbl = new javax.swing.JLabel();
        empPass2lbl = new javax.swing.JLabel();
        regButton = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regButton1.setText("LogIn");
        regButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        regButton1.setkBorderRadius(50);
        regButton1.setkEndColor(new java.awt.Color(204, 204, 204));
        regButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        regButton1.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        regButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        regButton1.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        regButton1.setkPressedColor(new java.awt.Color(153, 153, 153));
        regButton1.setkStartColor(new java.awt.Color(255, 255, 255));
        regButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(regButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 100, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jLabel2.setSize(new java.awt.Dimension(28, 0));

        empNameBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        empNameBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        empNameBox.setSize(new java.awt.Dimension(28, 0));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee ID");
        jLabel3.setSize(new java.awt.Dimension(28, 0));

        empIDBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        empIDBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        empIDBox.setSize(new java.awt.Dimension(28, 0));
        empIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Job Role");
        jLabel4.setSize(new java.awt.Dimension(28, 0));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jLabel5.setSize(new java.awt.Dimension(28, 0));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");
        jLabel6.setSize(new java.awt.Dimension(28, 0));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone");
        jLabel7.setSize(new java.awt.Dimension(28, 0));

        empPhoneBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        empPhoneBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        empPhoneBox.setSize(new java.awt.Dimension(28, 0));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mail");
        jLabel8.setSize(new java.awt.Dimension(28, 0));

        empMailBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        empMailBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        empMailBox.setSize(new java.awt.Dimension(28, 0));

        empJobBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administator", "Repair Job", "Manage SpareParts", "Manage Suppliers", "Manage Invoices", "Manage Monthly Reports" }));
        empJobBox.setBorder(null);
        empJobBox.setSize(new java.awt.Dimension(28, 0));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create an Account");

        empPhonelbl.setForeground(new java.awt.Color(255, 102, 102));
        empPhonelbl.setText(" ");

        empJoblbl.setForeground(new java.awt.Color(255, 102, 102));
        empJoblbl.setText(" ");

        empIDlbl.setForeground(new java.awt.Color(255, 102, 102));
        empIDlbl.setText(" ");

        empNamelbl.setForeground(new java.awt.Color(255, 102, 102));
        empNamelbl.setText(" ");

        empPasslbl.setForeground(new java.awt.Color(255, 102, 102));
        empPasslbl.setText(" ");

        empMaillbl.setForeground(new java.awt.Color(255, 102, 102));
        empMaillbl.setText(" ");

        empPass2lbl.setForeground(new java.awt.Color(255, 102, 102));
        empPass2lbl.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(667, 667, 667))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empNameBox)
                                    .addComponent(empJobBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(empIDBox)
                                    .addComponent(empPwdBox)
                                    .addComponent(empJoblbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(empIDlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(empNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(empPass2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empPasslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(empPwdBox2)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empPhonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(empMailBox, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                        .addComponent(empPhoneBox, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                    .addComponent(empMaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(378, 378, 378))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(empIDBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empIDlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(empNameBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(empNamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(empJobBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(empJoblbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empPhoneBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(empPhonelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empMailBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empMaillbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empPwdBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(empPasslbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(empPwdBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empPass2lbl)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 460, 490));

        regButton.setText("Register");
        regButton.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        regButton.setkBorderRadius(50);
        regButton.setkEndColor(new java.awt.Color(204, 204, 204));
        regButton.setkForeGround(new java.awt.Color(0, 0, 0));
        regButton.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        regButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        regButton.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        regButton.setkPressedColor(new java.awt.Color(153, 153, 153));
        regButton.setkStartColor(new java.awt.Color(255, 255, 255));
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/mohamedazwar/Desktop/OOP Project/Program/ManageTimeTickerWatchSpareParts/src/main/java/Photos/watchWallpaper1.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDBoxActionPerformed

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        
        int empID = Integer.parseInt(empIDBox.getText()); // this is the username
        String empName = empNameBox.getText();
        String empJob = empJobBox.getSelectedItem().toString();
        int empPhone = Integer.parseInt(empPhoneBox.getText());
        String empMail = empMailBox.getText();
        String empPass = empPwdBox.getText(); // this is the password
        String empPass2 = empPwdBox2.getText();
        
//        if (empIDBox.equals()){
//            empIDlbl.setText("Must Input Your ID");
//        }
//        
        try {
            Connection conn;
            Statement st = null;
            int updateQuery = 0;
            // create our mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/timetickerDB", "root", "");
            Class.forName(myDriver);

            // our SQL SELECT query. 
            String query = "INSERT INTO signuptable VALUES (" + empID + ", '"+empName+"', '"+empJob+"', "+empPhone+",'"+empMail+"', '"+empPass+"', '"+empPass2+"');";
            // create the java statement
            st = conn.createStatement();

            // execute the query, and get a java resultset
            updateQuery = st.executeUpdate(query);
            System.out.println("Connection Successfull...");
            st.close();
            conn.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_regButtonActionPerformed

    private void regButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empIDBox;
    private javax.swing.JLabel empIDlbl;
    private javax.swing.JComboBox<String> empJobBox;
    private javax.swing.JLabel empJoblbl;
    private javax.swing.JTextField empMailBox;
    private javax.swing.JLabel empMaillbl;
    private javax.swing.JTextField empNameBox;
    private javax.swing.JLabel empNamelbl;
    private javax.swing.JLabel empPass2lbl;
    private javax.swing.JLabel empPasslbl;
    private javax.swing.JTextField empPhoneBox;
    private javax.swing.JLabel empPhonelbl;
    private javax.swing.JPasswordField empPwdBox;
    private javax.swing.JPasswordField empPwdBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton regButton;
    private com.k33ptoo.components.KButton regButton1;
    // End of variables declaration//GEN-END:variables
}
