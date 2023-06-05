/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Mai Xuân Hải
 */
public class MenuControl extends javax.swing.JFrame {

    /**
     * Creates new form MenuControl
     */
    public MenuControl() {
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

        btnQLMT = new javax.swing.JButton();
        btnQLCBCT = new javax.swing.JButton();
        QLTCT = new javax.swing.JButton();
        btnQLKQT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQLMT.setText("Quản Lý Môn Thi");
        btnQLMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMTActionPerformed(evt);
            }
        });

        btnQLCBCT.setText("Quản Lý Cán Bộ Coi Thi");
        btnQLCBCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLCBCTActionPerformed(evt);
            }
        });

        QLTCT.setText("Quản Lý Tổ Chức Thi");
        QLTCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLTCTActionPerformed(evt);
            }
        });

        btnQLKQT.setText("Quản Lý Kết Quả Thi");
        btnQLKQT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKQTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLKQT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QLTCT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLCBCT)
                    .addComponent(btnQLMT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnQLMT)
                .addGap(38, 38, 38)
                .addComponent(btnQLCBCT)
                .addGap(38, 38, 38)
                .addComponent(QLTCT)
                .addGap(38, 38, 38)
                .addComponent(btnQLKQT)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMTActionPerformed
        // TODO add your handling code here:
        new QuanLyMonThi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLMTActionPerformed

    private void QLTCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLTCTActionPerformed
        // TODO add your handling code here:
        new QuanLyToChucThi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_QLTCTActionPerformed

    private void btnQLKQTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKQTActionPerformed
        // TODO add your handling code here:
        new QuanLyKetQuaThi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLKQTActionPerformed

    private void btnQLCBCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLCBCTActionPerformed
        // TODO add your handling code here:
        new QuanLyCanBoCoiThi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLCBCTActionPerformed

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
            java.util.logging.Logger.getLogger(MenuControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QLTCT;
    private javax.swing.JButton btnQLCBCT;
    private javax.swing.JButton btnQLKQT;
    private javax.swing.JButton btnQLMT;
    // End of variables declaration//GEN-END:variables
}