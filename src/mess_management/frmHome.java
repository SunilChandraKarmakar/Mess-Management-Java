/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_management;

/**
 *
 * @author Sunil
 */
public class frmHome extends javax.swing.JFrame {

    /**
     * Creates new form frmHome
     */
    public frmHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonSavings = new javax.swing.JButton();
        jButtonMeal = new javax.swing.JButton();
        jButtonCosting = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Member Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonSavings.setText("Savings");
        jButtonSavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavingsActionPerformed(evt);
            }
        });

        jButtonMeal.setText("Meal Details");
        jButtonMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMealActionPerformed(evt);
            }
        });

        jButtonCosting.setText("Costing");
        jButtonCosting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCostingActionPerformed(evt);
            }
        });

        jButtonReport.setBackground(new java.awt.Color(255, 0, 153));
        jButtonReport.setText("Total Report");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButtonSavings)
                .addGap(18, 18, 18)
                .addComponent(jButtonMeal)
                .addGap(18, 18, 18)
                .addComponent(jButtonCosting)
                .addGap(18, 18, 18)
                .addComponent(jButtonReport)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonSavings)
                    .addComponent(jButtonMeal)
                    .addComponent(jButtonCosting)
                    .addComponent(jButtonReport))
                .addContainerGap(340, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(644, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmMember member = new frmMember();
        member.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavingsActionPerformed
        // TODO add your handling code here:
        frmSavings savings = new frmSavings();
        savings.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonSavingsActionPerformed

    private void jButtonMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMealActionPerformed
        // TODO add your handling code here:
        frmMeal meal = new frmMeal();
        meal.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonMealActionPerformed

    private void jButtonCostingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCostingActionPerformed
        // TODO add your handling code here:
        frmCost costing = new frmCost();
        costing.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonCostingActionPerformed

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed
        // TODO add your handling code here:
        frmReport report = new frmReport();
        report.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonReportActionPerformed

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCosting;
    private javax.swing.JButton jButtonMeal;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonSavings;
    // End of variables declaration//GEN-END:variables
}
