/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_management;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sunil
 */
public class frmMeal extends javax.swing.JFrame {

    /**
     * Creates new form frmMeal
     */
    public frmMeal() {
        initComponents();
        DBConnection();
        DataTable = (DefaultTableModel) jTable.getModel();
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
        jComboBoxMemberName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDetele = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
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
        jLabel1.setText("Meal Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Member Name");

        jComboBoxMemberName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMemberName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jTextFieldQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });

        jButtonInsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDetele.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDetele.setText("Delete");
        jButtonDetele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeteleActionPerformed(evt);
            }
        });

        jTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Quantity", "Date"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Search");

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonHome.setText("Home");

        jLabel5.setText("-------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInsert)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDetele)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDetele)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(681, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jTable.removeColumn(jTable.getColumnModel().getColumn(0));
        LoadComboBox();
        ShowTableData();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        try {
            InputValue();
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date(0);
            String currentDT = dateFormat.format(date);

            for (Map.Entry cm : LoadMember.entrySet()) {
                if (jComboBoxMemberName.getSelectedItem().equals(cm.getValue())) {
                    Member_ID = (Integer) cm.getKey();
                    System.out.println(cm.getKey());
                }
            }

            String query = "insert into meal (Member_ID, Quantity, Date) value ('" + Member_ID + "', '" + Quantity + "', '"+ currentDT +"')";
            DBSta = DBCon.createStatement();
            DBSta.execute(query);
            DBSta.close();

            ShowTableData();
            InputValueReset();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        selectedRow = jTable.getSelectedRow();

        if (selectedRow >= 0) {
            ID = Integer.parseInt(DataTable.getValueAt(selectedRow, 0).toString());
            jComboBoxMemberName.setSelectedItem(DataTable.getValueAt(selectedRow, 1).toString());
            jTextFieldQuantity.setText(DataTable.getValueAt(selectedRow, 2).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No row selected");
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        if (ID >= 0) {
            try {

                InputValue();
                
                for (Map.Entry cm : LoadMember.entrySet()) {
                    if (jComboBoxMemberName.getSelectedItem().equals(cm.getValue())) {
                        Member_ID = (Integer) cm.getKey();
                        System.out.println(cm.getKey());
                    }
                }

                String query = "update meal set Member_ID = '" + Member_ID + "', Quantity = '" + Quantity + "' where ID = '" + ID + "'";

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

    private void jButtonDeteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeteleActionPerformed
        // TODO add your handling code here:
        if (ID >= 0) {
            try {
                String query = "delete from meal where ID = '" + ID + "'";
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
    }//GEN-LAST:event_jButtonDeteleActionPerformed

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

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
                jComboBoxMemberName.addItem(RS.getString("Member_Name"));
            }
            DBSta.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void InputValue() {
        Quantity = Double.parseDouble(jTextFieldQuantity.getText());
    }
    
    private void InputValueReset() {
        jComboBoxMemberName.setSelectedIndex(0);
        jTextFieldQuantity.setText("");
    }
    
    public void ShowTableData() {
        try {
            String query = "SELECT meal.ID, mess_member.Member_Name, meal.Quantity, meal.Date FROM mess_member, meal where mess_member.ID = meal.Member_ID";
            DBSta = DBCon.createStatement();
            ResultSet DatabaseRs = DBSta.executeQuery(query);
            DataTable.setRowCount(0);

            while (DatabaseRs.next()) {
                Object seaving[] = {
                    DatabaseRs.getInt("ID"),
                    DatabaseRs.getString("Member_Name"),
                    DatabaseRs.getDouble("Quantity"),
                    DatabaseRs.getDate("Date")
                };
                DataTable.addRow(seaving);
            }
            DBSta.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
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
            java.util.logging.Logger.getLogger(frmMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMeal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMeal().setVisible(true);
            }
        });
    }
    
    private int ID = -1;
    private int Member_ID;
    private double Quantity;
    private Date Date;
    private Connection DBCon;
    private Statement DBSta;
    private DefaultTableModel DataTable;
    private int selectedRow;
    private ResultSet RS;
    Map<Integer, String> LoadMember = new HashMap();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetele;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxMemberName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
