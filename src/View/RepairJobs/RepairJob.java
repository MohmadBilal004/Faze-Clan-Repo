package View.RepairJobs;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author manujatheekshana
 */
public class RepairJob extends javax.swing.JFrame {

    /**
     * Creates new form RepairJob
     */
    public RepairJob() {
        initComponents();
        currentDate();
        RandomID();
        tableData();
    }
    Connection con;
    PreparedStatement pst;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtrno = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtissue = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        txtda = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcustName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfee = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        txtstatus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Watch Repairing job");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Repair Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel2.setText("Repair No");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel4.setText("Customer Mail");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel5.setText("Model No");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel6.setText("Issue");

        txtrno.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        txtrno.setForeground(new java.awt.Color(255, 51, 51));
        txtrno.setText("jLabel11");

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        txtmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodelActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtissue);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel11.setText("Customer ID");

        txtda.setText("Date");

        jLabel12.setText("Customer Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(88, 88, 88)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtrno)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCustID)
                                .addComponent(txtcustName, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtrno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtda)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtcustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmodel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel7.setText("Repair Fee");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel8.setText("Pay");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel9.setText("Balance");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel10.setText("Status");

        txtpay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpayKeyReleased(evt);
            }
        });

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Completed" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbalance)
                    .addComponent(txtpay)
                    .addComponent(txtfee)
                    .addComponent(txtstatus, 0, 110, Short.MAX_VALUE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Repair No", "Customer", "Mail", "Model", "issue", "Date", "Repair Fee", "Pay", "Balance", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(18, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void currentDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        String dd = sdf.format(d);
        lblDate.setText(dd);

    }
    public void connection() {

        try {
            //connecting the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetickerDB", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //to get a random orded no to the rapair no as a defoult 
    public void RandomID() {

        try {
            connection();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(repairno) from Repair");
            rs.next();
            rs.getString("MAX(repairno)");
            if (rs.getString("MAX(repairno)") == null) {
                txtrno.setText("RE001");
            } else {
                long id = Long.parseLong(rs.getString("MAX(repairno)").substring(2, rs.getString("MAX(repairno)").length()));
                id++;
                txtrno.setText("RE" + String.format("%03d", id));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Add() {
        String repairno = txtrno.getText();
        String customerName = txtcustName.getText();
        String customerId = txtCustID.getText();
        String CustomerMail = txtMail.getText();
        String modelno = txtmodel.getText();
        String issue = txtissue.getText();
        String fee = txtfee.getText();
        String pay = txtpay.getText();
        String balance = txtbalance.getText();
        String status = txtstatus.getSelectedItem().toString(); //becouse is a combo box

        connection();
        try {
            pst = con.prepareStatement("insert into repair(repairno,custname,customerId,model,issue,fee,pay,balance,status)values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, repairno);
            pst.setString(2, customerName);
            pst.setString(3, customerId);
            pst.setString(4, CustomerMail);
            pst.setString(5, modelno);
            pst.setString(6, issue);
            pst.setString(7, fee);
            pst.setString(8, pay);
            pst.setString(9, balance);
            pst.setString(10, status);
            pst.executeUpdate();  //added in database table

            JOptionPane.showMessageDialog(this, "Record added....."); //message

            txtrno.setText("");
            txtcustName.setText("");
            txtCustID.setText("");
            txtMail.setText("");
            txtmodel.setText("");
            txtissue.setText("");
            txtfee.setText("");
            txtpay.setText("");
            txtbalance.setText("");
            txtstatus.setSelectedIndex(-1);

            txtcustName.requestFocus(); //that the component is displayable,visible and have all it's ancestors be visible too
            RandomID();
            tableData();

        } catch (SQLException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //to show in the j table
    public void tableData() {
        connection();
        try {
            pst = con.prepareStatement("select * from repair");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsd = (ResultSetMetaData) rs.getMetaData();
            int c;
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
            dft.setRowCount(0);

            //to automatically fill the chart
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("repairno"));                   
                    v2.add(rs.getString("custname"));
                    v2.add(rs.getString("custId"));
                    v2.add(rs.getString("customermail"));
                    v2.add(rs.getString("model"));
                    v2.add(rs.getString("issue"));
                    v2.add(rs.getString("fee"));
                    v2.add(rs.getString("pay"));
                    v2.add(rs.getString("balance"));
                    v2.add(rs.getString("status"));
                }
                dft.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Add(); //call the add code for the add button
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpayKeyReleased
        // TODO add your handling code here:
        int fee = Integer.parseInt(txtfee.getText());
        int pay = Integer.parseInt(txtpay.getText());

        int tot = fee - pay;
        txtbalance.setText(String.valueOf(tot));

        //when enter the fee the balance will be automatically calculate and display 

    }//GEN-LAST:event_txtpayKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        try {

            String rno = (dft.getValueAt(selectedIndex, 0).toString());
            // String repairno = txtrno.getText();
            
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the Record", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetickerDB", "root", "");

            pst = con.prepareStatement("delete from repair where repairno = ?");
            pst.setString(1, rno); 
            
            
            pst.executeUpdate();  //delete in database table
            
            

            JOptionPane.showMessageDialog(this, "Successfully Deleted....."); //message
            tableData();

            txtrno.setText("");
            txtcustName.setText("");
            txtCustID.setText("");
            txtMail.setText("");
            txtmodel.setText("");
            txtissue.setText("");
            txtfee.setText("");
            txtpay.setText("");
            txtbalance.setText("");
            txtstatus.setSelectedIndex(-1);
            txtcustName.requestFocus();
            
            }
            

          



        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // when select the table values it shows everywhere 
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

        txtrno.setText(dft.getValueAt(selectedIndex, 0).toString());
        txtcustName.setText(dft.getValueAt(selectedIndex, 1).toString());
        txtCustID.setText(dft.getValueAt(selectedIndex, 2).toString());
        txtMail.setText(dft.getValueAt(selectedIndex, 3).toString());
        txtmodel.setText(dft.getValueAt(selectedIndex, 4).toString());
        txtissue.setText(dft.getValueAt(selectedIndex, 5).toString());
        txtfee.setText(dft.getValueAt(selectedIndex, 6).toString());
        txtpay.setText(dft.getValueAt(selectedIndex, 7).toString());
        txtbalance.setText(dft.getValueAt(selectedIndex, 8).toString());
//for the combobox
        String combobox = jTable1.getValueAt(selectedIndex, 9).toString();
        for (int i = 0; i < txtstatus.getItemCount(); i++) {
            if (txtstatus.getItemAt(i).equalsIgnoreCase(combobox)) {
                txtstatus.setSelectedIndex(i);
            }
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

        try {

            String rno = (dft.getValueAt(selectedIndex, 0).toString());
            // String repairno = txtrno.getText();
            String customerName  = txtcustName.getText();
            String customerId = txtCustID.getText();
            String CustomerMail = txtMail.getText();
            String modelno = txtmodel.getText();
            String issue = txtissue.getText();
            String fee = txtfee.getText();
            String pay = txtpay.getText();
            String balance = txtbalance.getText();
            String status = txtstatus.getSelectedItem().toString();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetickerDB", "root", "");

            pst = con.prepareStatement("update repair set custname=?,customerId=?,model=?,issue=?,fee=?,pay=?,balance=?,status=? where repairno=? ");
            // pst.setString(1, repairno);
            pst.setString(1, customerName );
            pst.setString(2, customerId );
            pst.setString(3, CustomerMail);
            pst.setString(4, modelno);
            pst.setString(5, issue);
            pst.setString(6, fee);
            pst.setString(7, pay);
            pst.setString(8, balance);
            pst.setString(9, status);
            pst.setString(10,rno);

            pst.executeUpdate();  //update in database table
            
            if (status.equals("complete")) {

                //inside if body function  search in customer tables for customer Name and email where Customer ID= given ID

                String address = CustomerMail;//rs.getString(mail);
                String sub = "repairs complete";
                String body =  " your order number  " + rno + " is complete please pick it up from the store";
                //declare variables to hold email and name

                // initialize var using records from table
                testmails mails = new testmails(address, sub, body);
            }

            JOptionPane.showMessageDialog(this, "Record updated....."); //message
            tableData();
            if(status.equals("complete"))
            {
             
             //inside if body function  search in customer tables for customer Name and email where Customer ID= given ID
        /*     Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetickerDB", "root", "");
            Statement s = con.createStatement();
            ResultSet rs= s.executeQuery("select CustomerName,mail from customer where CustID = "+customerID );
            rs.next(); */
            
            //String address=rs.getString(customerMail );
            String address= CustomerMail ;
             String sub="repairs complete";
             String body= "Dear "+ customerName +" , your order number  "+ rno+ " is complete please pick it up from the store";
             //declare variables to hold email and name
  
             // initialize var using records from table
         
        
        testmails mails= new testmails(address,sub,body);
            }

            txtrno.setText("");
            txtcustName.setText("");
            txtMail.setText("");
            txtmodel.setText("");
            txtissue.setText("");
            txtfee.setText("");
            txtpay.setText("");
            txtbalance.setText("");
            txtstatus.setSelectedIndex(-1);

            txtcustName.requestFocus();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RepairJob.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RepairJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepairJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepairJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepairJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepairJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcustName;
    private javax.swing.JLabel txtda;
    private javax.swing.JTextField txtfee;
    private javax.swing.JTextPane txtissue;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtpay;
    private javax.swing.JLabel txtrno;
    private javax.swing.JComboBox<String> txtstatus;
    // End of variables declaration//GEN-END:variables
}
