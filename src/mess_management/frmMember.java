/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_management;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sunil
 */
public class frmMember extends javax.swing.JFrame {

    /**
     * Creates new form frmMember
     */
    public frmMember() {
        initComponents();
        DBConnection();
        DataTable = (DefaultTableModel) jTableShowMember.getModel();
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
        jTextFieldMember = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShowMember = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member Details - Mess Management");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 2, 30)); // NOI18N
        jLabel1.setText("Member Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Member Name");

        jTextFieldMember.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMemberActionPerformed(evt);
            }
        });

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

        jTableShowMember.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableShowMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name"
            }
        ));
        jTableShowMember.setRowHeight(20);
        jTableShowMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableShowMember);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sunil\\Documents\\GitHub\\Mess-Management-Java\\images\\search-icon.png")); // NOI18N

        jTextFieldSearch.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jLabel4.setText("------------------------------------------------------------------------------------");

        jButtonHome.setBackground(new java.awt.Color(102, 102, 255));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sunil\\Documents\\GitHub\\Mess-Management-Java\\images\\home-icon.png")); // NOI18N
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMember, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInsert)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHome)))
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(729, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        try {

            InputValue();
            String query = "insert into mess_member (Member_Name) value ('" + Member_Name + "')";
            DBSta = DBCon.createStatement();
            DBSta.execute(query);
            DBSta.close();

            InputValueReset();
            ShowTableData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jTableShowMember.removeColumn(jTableShowMember.getColumnModel().getColumn(0));
        ShowTableData();
    }//GEN-LAST:event_formWindowOpened

    private void jTableShowMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowMemberMouseClicked
        // TODO add your handling code here:
        selectedRow = jTableShowMember.getSelectedRow();

        if (selectedRow >= 0) {
            ID = Integer.parseInt(DataTable.getValueAt(selectedRow, 0).toString());
            jTextFieldMember.setText(DataTable.getValueAt(selectedRow, 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No row selected");
        }
    }//GEN-LAST:event_jTableShowMemberMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        if (ID >= 0) {
            try {

                InputValue();
                String query = "update mess_member set Member_Name = '" + Member_Name + "' where ID = '" + ID + "'";

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

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        if (ID >= 0) {
            try {
                String query = "delete from mess_member where ID = '" + ID + "'";
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
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMemberActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        frmHome home = new frmHome();
        home.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(DataTable);
        jTableShowMember.setRowSorter(trs);
        String text = jTextFieldSearch.getText();
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + text));
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    /**
     * @param args the command line arguments
     */
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

    private void InputValue() {
        Member_Name = jTextFieldMember.getText();
    }

    private void InputValueReset() {
        jTextFieldMember.setText("");
    }

    private void ShowTableData() {
        try {
            String query = "select ID, Member_name from mess_member";
            DBSta = DBCon.createStatement();
            ResultSet DatabaseRs = DBSta.executeQuery(query);
            DataTable.setRowCount(0);

            while (DatabaseRs.next()) {
                Object mess_member[] = {
                    DatabaseRs.getInt("ID"),
                    DatabaseRs.getString("Member_Name")
                };
                DataTable.addRow(mess_member);
            }
            DBSta.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(frmMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMember().setVisible(true);
            }
        });
    }

    private int ID = -1;
    private String Member_Name;
    private Connection DBCon;
    private Statement DBSta;
    private DefaultTableModel DataTable;
    private int selectedRow;
    private ResultSet RS;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableShowMember;
    private javax.swing.JTextField jTextFieldMember;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
