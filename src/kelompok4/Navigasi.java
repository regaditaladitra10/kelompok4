
package kelompok4;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Navigasi extends javax.swing.JFrame {

    public Navigasi() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        select = new javax.swing.JToggleButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kelompok4/ggggggg.png"))); // NOI18N
        jLabel2.setText("logo");

        select.setBackground(new java.awt.Color(204, 204, 255));
        select.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        select.setText("PRINT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // button select
                   GenerateReport generatereport = new GenerateReport(); 
        generatereport.generateReport();
    }//GEN-LAST:event_selectActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
             this.dispose();
            navigasimenu ok = new navigasimenu();
            ok.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Navigasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Navigasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Navigasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Navigasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navigasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton select;
    // End of variables declaration//GEN-END:variables


}
