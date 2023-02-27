
package ec.edu.espe.AirporTaxiScheduling.view;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FrmAbout extends javax.swing.JFrame {

    /**
     * Creates new form FrmAbout
     */
    public FrmAbout() {
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

                    jMenu1 = new javax.swing.JMenu();
                    jMenu2 = new javax.swing.JMenu();
                    pnlAbout = new javax.swing.JPanel();
                    jLabel4 = new javax.swing.JLabel();
                    jLabel1 = new javax.swing.JLabel();
                    jLabel2 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    btnOk = new javax.swing.JButton();

                    jMenu1.setText("jMenu1");

                    jMenu2.setText("jMenu2");

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setResizable(false);

                    jLabel4.setText("Airport Taxi Scheduling");

                    jLabel1.setText("Progress Team");

                    jLabel2.setText("Copyright (c) 2023 ProgressTeam. All rights reserved");

                    jLabel3.setText("Licensed to Sherily ");

                    btnOk.setText("Ok");
                    btnOk.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnOkActionPerformed(evt);
                              }
                    });

                    javax.swing.GroupLayout pnlAboutLayout = new javax.swing.GroupLayout(pnlAbout);
                    pnlAbout.setLayout(pnlAboutLayout);
                    pnlAboutLayout.setHorizontalGroup(
                              pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(pnlAboutLayout.createSequentialGroup()
                                        .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(pnlAboutLayout.createSequentialGroup()
                                                            .addGap(162, 162, 162)
                                                            .addComponent(jLabel1))
                                                  .addGroup(pnlAboutLayout.createSequentialGroup()
                                                            .addGap(57, 57, 57)
                                                            .addComponent(jLabel2))
                                                  .addGroup(pnlAboutLayout.createSequentialGroup()
                                                            .addGap(147, 147, 147)
                                                            .addComponent(jLabel4))
                                                  .addGroup(pnlAboutLayout.createSequentialGroup()
                                                            .addGap(156, 156, 156)
                                                            .addComponent(jLabel3)))
                                        .addContainerGap(71, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAboutLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnOk)
                                        .addGap(183, 183, 183))
                    );
                    pnlAboutLayout.setVerticalGroup(
                              pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAboutLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOk)
                                        .addContainerGap(25, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(pnlAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnlAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                    );

                    pack();
                    setLocationRelativeTo(null);
          }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
       AirportTaxiScheduling frmTaxiScheduling; 
       frmTaxiScheduling = new AirportTaxiScheduling();
       this.setVisible(false);
       frmTaxiScheduling.setVisible(true);
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAbout().setVisible(true);
            }
        });
    }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton btnOk;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JMenu jMenu1;
          private javax.swing.JMenu jMenu2;
          private javax.swing.JPanel pnlAbout;
          // End of variables declaration//GEN-END:variables
}
