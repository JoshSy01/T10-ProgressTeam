package ec.edu.espe.AirporTaxiScheduling.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class AirportTaxiScheduling extends javax.swing.JFrame {

    /**
     * Creates new form taxiScheduling
     */
    public AirportTaxiScheduling() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mnubAirportTaxiScheduling = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitAbout = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mitAddTaxiDriver = new javax.swing.JMenuItem();
        mitViewTaxiDriver = new javax.swing.JMenuItem();
        mitUpdateTaxiDriver = new javax.swing.JMenuItem();
        mitDeleteTaxiDriver = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mitAddTraveler = new javax.swing.JMenuItem();
        mitViewTraveler = new javax.swing.JMenuItem();
        mitUpdateTraveler = new javax.swing.JMenuItem();
        mitDeleteTraveler = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mitTravel = new javax.swing.JMenuItem();
        mitAccounting = new javax.swing.JMenuItem();
        mitReminder = new javax.swing.JMenuItem();
        mitCalculateTripPrice = new javax.swing.JMenuItem();
        mitHistory = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mitContactSupport = new javax.swing.JMenuItem();
        mitCommonProblem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airport Taxi Scheduling");
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Team Progress ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        mnubAirportTaxiScheduling.setToolTipText("Airport Taxi Scheduling");

        jMenu1.setText("Airport Taxi Sheduling");

        mitAbout.setText("Acerca de");
        mitAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAboutActionPerformed(evt);
            }
        });
        jMenu1.add(mitAbout);

        miExit.setText("Salir");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        mnubAirportTaxiScheduling.add(jMenu1);

        jMenu4.setText("Conductor");

        mitAddTaxiDriver.setText("Añadir conductor");
        mitAddTaxiDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAddTaxiDriverActionPerformed(evt);
            }
        });
        jMenu4.add(mitAddTaxiDriver);

        mitViewTaxiDriver.setText("Buscar conductor");
        mitViewTaxiDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitViewTaxiDriverActionPerformed(evt);
            }
        });
        jMenu4.add(mitViewTaxiDriver);

        mitUpdateTaxiDriver.setText("Actualizar conductor");
        mitUpdateTaxiDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitUpdateTaxiDriverActionPerformed(evt);
            }
        });
        jMenu4.add(mitUpdateTaxiDriver);

        mitDeleteTaxiDriver.setText("Eliminar conductor");
        mitDeleteTaxiDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDeleteTaxiDriverActionPerformed(evt);
            }
        });
        jMenu4.add(mitDeleteTaxiDriver);

        mnubAirportTaxiScheduling.add(jMenu4);

        jMenu5.setText("Pasajero");

        mitAddTraveler.setText("Añadir pasajero");
        mitAddTraveler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAddTravelerActionPerformed(evt);
            }
        });
        jMenu5.add(mitAddTraveler);

        mitViewTraveler.setText("Buscar pasajero");
        mitViewTraveler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitViewTravelerActionPerformed(evt);
            }
        });
        jMenu5.add(mitViewTraveler);

        mitUpdateTraveler.setText("Actualizar pasajero");
        mitUpdateTraveler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitUpdateTravelerActionPerformed(evt);
            }
        });
        jMenu5.add(mitUpdateTraveler);

        mitDeleteTraveler.setText("Eliminar pasajero");
        mitDeleteTraveler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDeleteTravelerActionPerformed(evt);
            }
        });
        jMenu5.add(mitDeleteTraveler);

        mnubAirportTaxiScheduling.add(jMenu5);

        jMenu3.setText("Servicios");

        mitTravel.setText("Viajes");
        mitTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTravelActionPerformed(evt);
            }
        });
        jMenu3.add(mitTravel);

        mitAccounting.setText("Contabilidad");
        mitAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAccountingActionPerformed(evt);
            }
        });
        jMenu3.add(mitAccounting);

        mitReminder.setText("Recordatorio");
        mitReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitReminderActionPerformed(evt);
            }
        });
        jMenu3.add(mitReminder);

        mitCalculateTripPrice.setText("Tarifas");
        mitCalculateTripPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitCalculateTripPriceActionPerformed(evt);
            }
        });
        jMenu3.add(mitCalculateTripPrice);

        mitHistory.setText("Reporte");
        mitHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitHistoryActionPerformed(evt);
            }
        });
        jMenu3.add(mitHistory);

        mnubAirportTaxiScheduling.add(jMenu3);

        jMenu2.setText("Ayuda");

        mitContactSupport.setText("Contactar al Soporte");
        mitContactSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitContactSupportActionPerformed(evt);
            }
        });
        jMenu2.add(mitContactSupport);

        mitCommonProblem.setText("Problemas Comunes");
        mitCommonProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitCommonProblemActionPerformed(evt);
            }
        });
        jMenu2.add(mitCommonProblem);

        mnubAirportTaxiScheduling.add(jMenu2);

        setJMenuBar(mnubAirportTaxiScheduling);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAboutActionPerformed
        FrmAbout about;
        about = new FrmAbout();
        about.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_mitAboutActionPerformed

    private void mitAddTravelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAddTravelerActionPerformed
        // TODO add your handling code here:
    FrmAddTraveler frmAddTraveler;
    frmAddTraveler =  new FrmAddTraveler();
    frmAddTraveler.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitAddTravelerActionPerformed

    private void mitViewTravelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitViewTravelerActionPerformed
        // TODO add your handling code here:
          FrmViewTraveler frmViewTraveler;
    frmViewTraveler =  new FrmViewTraveler();
    frmViewTraveler.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitViewTravelerActionPerformed

    private void mitUpdateTravelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitUpdateTravelerActionPerformed
        // TODO add your handling code here:
        FrmUpdateTraveler frmUpdateTraveler;
    frmUpdateTraveler =  new FrmUpdateTraveler();
    frmUpdateTraveler.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitUpdateTravelerActionPerformed

    private void mitDeleteTravelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDeleteTravelerActionPerformed
        // TODO add your handling code here:
         FrmDeleteTraveler frmDeleteTraveler;
    frmDeleteTraveler =  new FrmDeleteTraveler();
    frmDeleteTraveler.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitDeleteTravelerActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
            this.dispose();
    }//GEN-LAST:event_miExitActionPerformed

    private void mitAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAccountingActionPerformed
        // TODO add your handling code here:
        FrmAccounting frmAccounting;
    frmAccounting =  new FrmAccounting();
    frmAccounting.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitAccountingActionPerformed

    private void mitAddTaxiDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAddTaxiDriverActionPerformed
        // TODO add your handling code here:
         FrmAddTaxiDriver frmAddTaxiDriver;
    frmAddTaxiDriver =  new FrmAddTaxiDriver();
    frmAddTaxiDriver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitAddTaxiDriverActionPerformed

    private void mitViewTaxiDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitViewTaxiDriverActionPerformed
        // TODO add your handling code here:
         FrmViewTaxiDriver frmViewTaxiDriver;
    frmViewTaxiDriver =  new FrmViewTaxiDriver();
    frmViewTaxiDriver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitViewTaxiDriverActionPerformed

    private void mitUpdateTaxiDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitUpdateTaxiDriverActionPerformed
        // TODO add your handling code here:
        FrmUpdateTaxiDriver frmUpdateTaxiDriver;
    frmUpdateTaxiDriver =  new FrmUpdateTaxiDriver();
    frmUpdateTaxiDriver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitUpdateTaxiDriverActionPerformed

    private void mitDeleteTaxiDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDeleteTaxiDriverActionPerformed
        // TODO add your handling code here:
        FrmDeleteTaxiDriver frmDeleteTaxiDriver;
    frmDeleteTaxiDriver =  new FrmDeleteTaxiDriver();
    frmDeleteTaxiDriver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitDeleteTaxiDriverActionPerformed

    private void mitReminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitReminderActionPerformed
        // TODO add your handling code here:
        FrmReminder frmReminder;
    frmReminder =  new FrmReminder();
    frmReminder.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitReminderActionPerformed

    private void mitCalculateTripPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitCalculateTripPriceActionPerformed
        // TODO add your handling code here:
        FrmTarif frmCalculateTripPrice;
    frmCalculateTripPrice =  new FrmTarif();
    frmCalculateTripPrice.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitCalculateTripPriceActionPerformed

    private void mitHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitHistoryActionPerformed
        // TODO add your handling code here:
        FrmHistory frmHistory;
    frmHistory =  new FrmHistory();
    frmHistory.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitHistoryActionPerformed

    private void mitContactSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitContactSupportActionPerformed
        // TODO add your handling code here:
        FrmContactSupport frmContactSupport;
    frmContactSupport =  new FrmContactSupport();
    frmContactSupport.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitContactSupportActionPerformed

    private void mitCommonProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitCommonProblemActionPerformed
        // TODO add your handling code here:
        FrmCommonProblems frmCommonProblems;
    frmCommonProblems =  new FrmCommonProblems();
    frmCommonProblems.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitCommonProblemActionPerformed

    private void mitTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTravelActionPerformed
        FrmTravels travelsMain = new FrmTravels();
        travelsMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mitTravelActionPerformed

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
            java.util.logging.Logger.getLogger(AirportTaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirportTaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirportTaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirportTaxiScheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirportTaxiScheduling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem mitAbout;
    private javax.swing.JMenuItem mitAccounting;
    private javax.swing.JMenuItem mitAddTaxiDriver;
    private javax.swing.JMenuItem mitAddTraveler;
    private javax.swing.JMenuItem mitCalculateTripPrice;
    private javax.swing.JMenuItem mitCommonProblem;
    private javax.swing.JMenuItem mitContactSupport;
    private javax.swing.JMenuItem mitDeleteTaxiDriver;
    private javax.swing.JMenuItem mitDeleteTraveler;
    private javax.swing.JMenuItem mitHistory;
    private javax.swing.JMenuItem mitReminder;
    private javax.swing.JMenuItem mitTravel;
    private javax.swing.JMenuItem mitUpdateTaxiDriver;
    private javax.swing.JMenuItem mitUpdateTraveler;
    private javax.swing.JMenuItem mitViewTaxiDriver;
    private javax.swing.JMenuItem mitViewTraveler;
    private javax.swing.JMenuBar mnubAirportTaxiScheduling;
    // End of variables declaration//GEN-END:variables
}