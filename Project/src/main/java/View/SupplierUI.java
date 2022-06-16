package View;

import java.util.ArrayList;
import Models.Supplier;
import Controller.SupplierController;
import DBLayer.DatabaseConnection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SupplierUI extends javax.swing.JFrame {

    DatabaseConnection D;
    Supplier SupObj;
    SupplierController Supcontroller;
    ArrayList<Supplier> SupList; //
    int index; //to store current Supplier is stored 

    public SupplierUI() {
        initComponents();
        Supcontroller = new SupplierController();
        SupList = new ArrayList<>(100);
        index = 0; // here initially index is zero
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSno = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSearchSupplier = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtRemoveSupplier = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        txt_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parts Supplier Management");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 10));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Supplier Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 90, 130, 25);

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Supplier ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 130, 120, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Contact No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 170, 120, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Location");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 210, 100, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 250, 81, 25);

        txtSno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnoActionPerformed(evt);
            }
        });
        jPanel1.add(txtSno);
        txtSno.setBounds(180, 130, 200, 30);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(180, 90, 200, 30);

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel1.add(txtLocation);
        txtLocation.setBounds(180, 210, 200, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(180, 250, 200, 30);

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtContactNo);
        txtContactNo.setBounds(180, 170, 200, 30);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Add Supplier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 300, 150, 40);

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Search Supplier");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 90, 140, 30);

        txtSearchSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSupplierActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchSupplier);
        txtSearchSupplier.setBounds(560, 90, 198, 30);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(770, 90, 120, 31);

        txtRemoveSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveSupplierActionPerformed(evt);
            }
        });
        jPanel1.add(txtRemoveSupplier);
        txtRemoveSupplier.setBounds(570, 170, 195, 30);

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Remove Supplier");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 170, 160, 25);

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(770, 170, 120, 31);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setText("Manage Parts Supplier");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 0, 350, 60);
        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(680, 320, 0, 1);

        SupplierTable.setForeground(new java.awt.Color(51, 51, 51));

        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Supplier ID", "Contact No.", "Location", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierTable.setColumnSelectionAllowed(true);
        SupplierTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SupplierTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        SupplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierTable);
        SupplierTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (SupplierTable.getColumnModel().getColumnCount() > 0) {
            SupplierTable.getColumnModel().getColumn(4).setMinWidth(6);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 350, 490, 402);

        txt_update.setBackground(new java.awt.Color(153, 153, 255));
        txt_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_update.setText("Update Supplier");
        txt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updateActionPerformed(evt);
            }
        });
        jPanel1.add(txt_update);
        txt_update.setBounds(360, 300, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete Supplier? ", "Delete", JOptionPane.YES_NO_OPTION);

        String RemoveName = txtRemoveSupplier.getText();
        for (Supplier S : SupList) {
            if (S.getSname().contains(RemoveName) && p == 0) {
                JOptionPane.showMessageDialog(rootPane, "Part Supplier has been successfully deleted", "Info ", 0);
                SupList.remove(S);
                return;
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Supplier not found", "Info ", 0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String SearchName = txtSearchSupplier.getText();
        for (Supplier S : SupList) {
            if (S.getSname().contains(SearchName)) {
                JOptionPane.showMessageDialog(rootPane, S.toString(), "Info ", 0);
                return;
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Supplier not found", "Info ", 0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchSupplierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtName.getText();
            int sno = Integer.parseInt(txtSno.getText());
            int contactNo = Integer.parseInt(txtContactNo.getText());
            String location = txtLocation.getText();
            String email = txtEmail.getText();
            SupObj = new Supplier(name, sno, contactNo, email, location);
            SupObj = Supcontroller.addSuplier(name, sno, contactNo, email, location);
            boolean result = Supcontroller.insertSupplierToDB(SupObj);
            SupList.add(SupObj);
            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, "Part Supplier has been successfully added" + "\nThe No.of index is " + index, "Sucess", 1);
                //lblDetails.setText(SupObj.toString());
                DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel(); ///Gets selected row inex
                model.addRow(new Object[]{txtName.getText(), txtSno.getText(), txtContactNo.getText(), txtLocation.getText(), txtEmail.getText()});
            } /*else {
                JOptionPane.showMessageDialog(rootPane, "Error in adding", "Error", 0);
            }*/
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "So noob", "Error", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnoActionPerformed

    private void txtRemoveSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveSupplierActionPerformed

    private void SupplierTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SupplierTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierTableAncestorAdded

    private void SupplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTableMouseClicked
        // TODO add your handling code here:
        int i = SupplierTable.getSelectedRow();
        txtName.setText((String) SupplierTable.getValueAt(i, 0));
        txtSno.setText((String) SupplierTable.getValueAt(i, 1));
        txtContactNo.setText((String) SupplierTable.getValueAt(i, 2));
        txtLocation.setText((String) SupplierTable.getValueAt(i, 3));
        txtEmail.setText((String) SupplierTable.getValueAt(i, 4));
    }//GEN-LAST:event_SupplierTableMouseClicked

    private void txt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updateActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtName.getText();
            int sno = Integer.parseInt(txtSno.getText());
            int contactNo = Integer.parseInt(txtContactNo.getText());
            String location = txtLocation.getText();
            String email = txtEmail.getText();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_txt_updateActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SupplierTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRemoveSupplier;
    private javax.swing.JTextField txtSearchSupplier;
    private javax.swing.JTextField txtSno;
    private javax.swing.JButton txt_update;
    // End of variables declaration//GEN-END:variables
}
