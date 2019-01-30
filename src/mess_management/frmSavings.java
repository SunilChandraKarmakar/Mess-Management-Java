/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_management;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sunil
 */
public class frmSavings extends javax.swing.JFrame {

    /**
     * Creates new form frmSavings
     */
    public frmSavings() {
        initComponents();
        DBConnection();
        DataTable = (DefaultTableModel) jTableShowSavings.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbMemberName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShowSavings = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonHome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 2, 30)); // NOI18N
        jLabel1.setText("Savings");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Member Name");

        cmbMemberName.setBackground(new java.awt.Color(0, 204, 153));
        cmbMemberName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMemberName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Amount");

        jTextFieldAmount.setBackground(new java.awt.Color(0, 204, 153));
        jTextFieldAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonInsert.setBackground(new java.awt.Color(0, 204, 153));
        jButtonInsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonInsert.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sunil\\Documents\\GitHub\\Mess-Management-Java\\images\\Save-as-icon.png")); // NOI18N
        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 153));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sunil\\Documents\\GitHub\\Mess-Management-Java\\images\\Text-Edit-icon.png")); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sunil\\Documents\\GitHub\\Mess-Management-Java\\images\\Delete-icon.png")); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTableShowSavings.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableShowSavings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Amount", "Date"
            }
        ));
        jTableShowSavings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowSavingsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableShowSavings);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Search");

        jTextFieldSearch.setBackground(new java.awt.Color(0, 204, 153));
        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jButtonHome.setBackground(new java.awt.Color(102, 102, 255));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sunil\\Documents\\GitHub\\Mess-Management-Java\\images\\home-icon.png")); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jLabel5.setText("---------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldAmount)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInsert)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)))
                .addGap(18, 18, 18)
                .addComponent(jButtonHome)
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(761, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DBConnection() {
        String url = "jdbc:mysql://localhost:3306/mess_management";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            DBCon = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void LoadComboBox() {
        try {
            String query = "select * from mess_member";
            DBSta = DBCon.createStatement();
            RS = DBSta.executeQuery(query);

            while (RS.next()) {
                LoadMember.put(RS.getInt("ID"), RS.getString("Member_Name"));
                cmbMemberName.addItem(RS.getString("Member_Name"));
            }
            DBSta.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jTableShowSavings.removeColumn(jTableShowSavings.getColumnModel().getColumn(0));
        LoadComboBox();
        ShowTableData();
    }//GEN-LAST:event_formWindowOpened

    private void InputValue() {
        // Member_ID = cmbMemberName.getSelectedItem();
        Amount = Double.parseDouble(jTextFieldAmount.getText());
    }

    public void InputValueReset() {
        cmbMemberName.setSelectedIndex(0);
        jTextFieldAmount.setText("");
    }

    public void ShowTableData() {
        try {
            String query = "SELECT savings.ID, mess_member.Member_Name, savings.Amount, savings.Date FROM mess_member, savings where mess_member.ID = savings.Member_ID";
            DBSta = DBCon.createStatement();
            ResultSet DatabaseRs = DBSta.executeQuery(query);
            DataTable.setRowCount(0);

            while (DatabaseRs.next()) {
                Object seaving[] = {
                    DatabaseRs.getInt("ID"),
                    DatabaseRs.getString("Member_Name"),
                    DatabaseRs.getDouble("Amount"),
                    DatabaseRs.getDate("Date")
                };
                DataTable.addRow(seaving);
            }
            DBSta.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        if(jTextFieldAmount.getText() == "") {
            try {
            InputValue();

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date(0);
            String currentDT = dateFormat.format(date);

            for (Map.Entry cm : LoadMember.entrySet()) {
                if (cmbMemberName.getSelectedItem().equals(cm.getValue())) {
                    Member_ID = (Integer) cm.getKey();
                    System.out.println(cm.getKey());
                }
            }

            String query = "insert into savings (Member_ID, Amount, Date) value ('" + Member_ID + "', '" + Amount + "', '" + currentDT + "')";
            DBSta = DBCon.createStatement();
            DBSta.execute(query);
            DBSta.close();

            ShowTableData();
            InputValueReset();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Member Name and Amount");
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        if (ID >= 0) {
            try {
                String query = "delete from savings where ID = '" + ID + "'";
                DBSta = DBCon.createStatement();
                DBSta.execute(query);
                DBSta.close();

                ShowTableData();
                InputValueReset();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No row selected");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableShowSavingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowSavingsMouseClicked
        // TODO add your handling code here:
        selectedRow = jTableShowSavings.getSelectedRow();

        if (selectedRow >= 0) {
            ID = Integer.parseInt(DataTable.getValueAt(selectedRow, 0).toString());
            cmbMemberName.setSelectedItem(DataTable.getValueAt(selectedRow, 1).toString());
            jTextFieldAmount.setText(DataTable.getValueAt(selectedRow, 2).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No row selected");
        }
    }//GEN-LAST:event_jTableShowSavingsMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        if (ID >= 0) {
            try {

                InputValue();

                for (Map.Entry cm : LoadMember.entrySet()) {
                    if (cmbMemberName.getSelectedItem().equals(cm.getValue())) {
                        Member_ID = (Integer) cm.getKey();
                        System.out.println(cm.getKey());
                    }
                }

                String query = "update savings set Member_ID = '" + Member_ID + "', Amount = '" + Amount + "' where ID = '" + ID + "'";

                DBSta = (Statement) DBCon.createStatement();
                DBSta.execute(query);
                DBSta.close();

                ShowTableData();
                InputValueReset();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No row selected");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        frmHome home = new frmHome();
        home.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        // TODO add your handling code here:
       TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(DataTable);
       jTableShowSavings.setRowSorter(trs);
       String text = jTextFieldSearch.getText();
       trs.setRowFilter(RowFilter.regexFilter("(?i)" + text));
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

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
            java.util.logging.Logger.getLogger(frmSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSavings().setVisible(true);
            }
        });
    }

    private int ID = -1;
    private int Member_ID;
    private double Amount;
    private Connection DBCon;
    private Statement DBSta;
    private DefaultTableModel DataTable;
    private int selectedRow;
    private ResultSet RS;
    Map<Integer, String> LoadMember = new HashMap();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbMemberName;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableShowSavings;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
