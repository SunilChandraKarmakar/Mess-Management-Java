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
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sunil
 */
public class frmReport extends javax.swing.JFrame {

    /**
     * Creates new form frmReport
     */
    public frmReport() {
        initComponents();
        DBConnection();
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
        jTextFieldTotalSavings = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTotalCost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTotalMeal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPerMeal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxMemberName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPersonalSavings = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPersonalCost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPersonalMeal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldExtraMoney = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 2, 20)); // NOI18N
        jLabel1.setText("Total Report");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Total Savings");

        jTextFieldTotalSavings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Total Cost");

        jTextFieldTotalCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total Meal");

        jTextFieldTotalMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Per Meal");

        jTextFieldPerMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Select Member To View Details");

        jComboBoxMemberName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMemberName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBoxMemberName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMemberNameItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Personal Savings");

        jTextFieldPersonalSavings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Personal Cost");

        jTextFieldPersonalCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Personal Meal");

        jTextFieldPersonalMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Extra Money");

        jTextFieldExtraMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jTextFieldTotalSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3))
                            .addComponent(jTextFieldTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4))
                            .addComponent(jTextFieldTotalMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5))
                            .addComponent(jTextFieldPerMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7))
                            .addComponent(jTextFieldPersonalSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel8))
                                    .addComponent(jTextFieldPersonalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel9))
                                    .addComponent(jTextFieldPersonalMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel10))
                                    .addComponent(jTextFieldExtraMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jComboBoxMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPerMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotalSavings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotalMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExtraMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPersonalSavings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPersonalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPersonalMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        setSize(new java.awt.Dimension(749, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LoadComboBox();
        TotalSavings();
        TotalCost();
        TotalMeal();
        PerMeal();
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxMemberNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMemberNameItemStateChanged
        // TODO add your handling code here:
        PersonalMeal();
        PersonalSevings();
        PersonalCost();
        ExtraMoney();
    }//GEN-LAST:event_jComboBoxMemberNameItemStateChanged

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
    
    private void TotalSavings() {
        try {
            String query = "SELECT SUM(Amount) as TotalAmount FROM savings";
            DBSta = DBCon.createStatement();
            RS = DBSta.executeQuery(query);
            RS.next();
            jTextFieldTotalSavings.setText(RS.getString("TotalAmount"));
            DBSta.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void TotalCost() {
        try {
            String query = "SELECT SUM(Amount) as TotalCost FROM costing";
            DBSta = DBCon.createStatement();
            RS = DBSta.executeQuery(query);
            RS.next();
            jTextFieldTotalCost.setText(RS.getString("TotalCost"));
            DBSta.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void TotalMeal() {
        try {
            String query = "SELECT SUM(Quantity) as TotalMeal FROM meal";
            DBSta = DBCon.createStatement();
            RS = DBSta.executeQuery(query);
            RS.next();
            jTextFieldTotalMeal.setText(RS.getString("TotalMeal"));
            DBSta.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void PerMeal() {
        Double PerMealRate = Double.parseDouble(jTextFieldTotalCost.getText()) / Double.parseDouble(jTextFieldTotalMeal.getText());
        jTextFieldPerMeal.setText(PerMealRate.toString());
    }
    
    private void PersonalMeal() {
        try {
            String query = "SELECT SUM(Quantity) as PersonalMeal FROM meal, mess_member WHERE mess_member.Member_Name = '"+ jComboBoxMemberName.getSelectedItem() +"' AND mess_member.ID = meal.Member_ID";
            DBSta = DBCon.createStatement();
            RS = DBSta.executeQuery(query);
            RS.next();
            jTextFieldPersonalMeal.setText(RS.getString("PersonalMeal"));
            DBSta.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void PersonalSevings() {
        try {
            String query = "SELECT SUM(Amount) as PersonalSevings FROM savings, mess_member WHERE mess_member.Member_Name = '"+ jComboBoxMemberName.getSelectedItem() +"' AND mess_member.ID = savings.Member_ID";
            DBSta = DBCon.createStatement();
            RS = DBSta.executeQuery(query);
            RS.next();
            jTextFieldPersonalSavings.setText(RS.getString("PersonalSevings"));
            DBSta.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void PersonalCost() {
        Double personalCost = Double.parseDouble(jTextFieldPersonalMeal.getText()) * Double.parseDouble(jTextFieldPerMeal.getText());
        jTextFieldPersonalCost.setText(personalCost.toString());
    }
    
    private void ExtraMoney() {
        Double extraMoney = Double.parseDouble(jTextFieldPersonalSavings.getText()) - Double.parseDouble(jTextFieldPersonalCost.getText());
        jTextFieldExtraMoney.setText(extraMoney.toString());
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
            java.util.logging.Logger.getLogger(frmReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReport().setVisible(true);
            }
        });
    }

    private Connection DBCon;
    private Statement DBSta;
    private DefaultTableModel DataTable;
    private int selectedRow;
    private ResultSet RS;
    Map<Integer, String> LoadMember = new HashMap();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxMemberName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldExtraMoney;
    private javax.swing.JTextField jTextFieldPerMeal;
    private javax.swing.JTextField jTextFieldPersonalCost;
    private javax.swing.JTextField jTextFieldPersonalMeal;
    private javax.swing.JTextField jTextFieldPersonalSavings;
    private javax.swing.JTextField jTextFieldTotalCost;
    private javax.swing.JTextField jTextFieldTotalMeal;
    private javax.swing.JTextField jTextFieldTotalSavings;
    // End of variables declaration//GEN-END:variables
}
