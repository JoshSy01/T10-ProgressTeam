package ec.edu.espe.AirporTaxiScheduling.view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.AirporTaxiScheduling.controller.TarifDbController;
import ec.edu.espe.AirporTaxiScheduling.model.Tarif;
import ec.edu.espe.AirporTaxiScheduling.model.TarifSingleton;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class FrmTarif extends javax.swing.JFrame {

    /**
     * Creates new form FrmTarif
     */
    public FrmTarif() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static String texto= "";
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
                    jButton1 = new javax.swing.JButton();
                    jLabel2 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    jLabel4 = new javax.swing.JLabel();
                    jLabel5 = new javax.swing.JLabel();
                    lblValue = new javax.swing.JLabel();
                    txtExitAdress = new javax.swing.JTextField();
                    txtArrivalAdress = new javax.swing.JTextField();
                    txtKilometre = new javax.swing.JTextField();
                    btnAccept = new javax.swing.JButton();
                    jScrollPane1 = new javax.swing.JScrollPane();
                    tbTarifs = new javax.swing.JTable();
                    btnViewTarifs = new javax.swing.JButton();
                    btnClean = new javax.swing.JButton();
                    tarifd = new javax.swing.JLabel();
                    jPanel2 = new javax.swing.JPanel();
                    jLabel6 = new javax.swing.JLabel();
                    txtNewTarif = new javax.swing.JTextField();
                    btnModify = new javax.swing.JButton();
                    jLabel7 = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setResizable(false);

                    jLabel1.setText("TARIFAS");

                    jButton1.setText("<REGRESAR");
                    jButton1.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton1ActionPerformed(evt);
                              }
                    });

                    jLabel2.setText("Direccion salida:");

                    jLabel3.setText("Direccion llegada:");

                    jLabel4.setText("Kilometros:");

                    jLabel5.setText("Valor a pagar:");

                    lblValue.setText("                          ");

                    txtExitAdress.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtExitAdressKeyTyped(evt);
                              }
                    });

                    txtArrivalAdress.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtArrivalAdressKeyTyped(evt);
                              }
                    });

                    txtKilometre.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtKilometreKeyTyped(evt);
                              }
                    });

                    btnAccept.setText("ACEPTAR");
                    btnAccept.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnAcceptActionPerformed(evt);
                              }
                    });

                    tbTarifs.setModel(new javax.swing.table.DefaultTableModel(
                              new Object [][] {
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null},
                                        {null, null, null, null}
                              },
                              new String [] {
                                        "Direccion salida", "Direccion Llegada", "Kilometros", "Valor a pagar"
                              }
                    ));
                    jScrollPane1.setViewportView(tbTarifs);

                    btnViewTarifs.setText("VER TARIFAS");
                    btnViewTarifs.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnViewTarifsActionPerformed(evt);
                              }
                    });

                    btnClean.setText("LIMPIAR");
                    btnClean.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnCleanActionPerformed(evt);
                              }
                    });

                    jPanel2.setBackground(new java.awt.Color(102, 102, 102));
                    jPanel2.setForeground(new java.awt.Color(153, 153, 153));
                    jPanel2.setToolTipText("");
                    jPanel2.setEnabled(false);

                    jLabel6.setText("Modificar valor de la tarifa");

                    txtNewTarif.setToolTipText("");
                    txtNewTarif.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        txtNewTarifKeyTyped(evt);
                              }
                    });

                    btnModify.setText("MODIFICAR");
                    btnModify.setEnabled(false);
                    btnModify.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnModifyActionPerformed(evt);
                              }
                    });
                    btnModify.addKeyListener(new java.awt.event.KeyAdapter() {
                              public void keyTyped(java.awt.event.KeyEvent evt) {
                                        btnModifyKeyTyped(evt);
                              }
                    });

                    jLabel7.setText("10 = $ 0.1");

                    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                    jPanel2.setLayout(jPanel2Layout);
                    jPanel2Layout.setHorizontalGroup(
                              jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                      .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                      .addComponent(txtNewTarif))
                                                            .addGap(27, 27, 27))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jLabel6)
                                                            .addContainerGap())))
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                    );
                    jPanel2Layout.setVerticalGroup(
                              jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNewTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModify)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                    jPanel1.setLayout(jPanel1Layout);
                    jPanel1Layout.setHorizontalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(74, 74, 74)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addComponent(jLabel3)
                                                                      .addComponent(jLabel2)
                                                                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel4))))
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addContainerGap()
                                                            .addComponent(jButton1)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(9, 9, 9)
                                                            .addComponent(jLabel1))
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(27, 27, 27)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(btnClean)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                          .addComponent(txtExitAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                                                          .addComponent(txtArrivalAdress)
                                                                                          .addComponent(txtKilometre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblValue)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                                                                .addComponent(tarifd, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(30, 30, 30))))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(32, 32, 32)
                                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(158, 158, 158)
                                                            .addComponent(btnAccept))
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(223, 223, 223)
                                                            .addComponent(btnViewTarifs)))
                                        .addGap(69, 69, 69))
                    );
                    jPanel1Layout.setVerticalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel1)
                                                  .addComponent(jButton1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel2)
                                                                      .addComponent(txtExitAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel3)
                                                                      .addComponent(txtArrivalAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel4)
                                                                      .addComponent(txtKilometre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(9, 9, 9)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addComponent(tarifd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(lblValue))))
                                                  .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(btnAccept)
                                                  .addComponent(btnClean))
                                        .addGap(29, 29, 29)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnViewTarifs)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(24, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                    );

                    pack();
                    setLocationRelativeTo(null);
          }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        Tarif tarif = new Tarif();
        DecimalFormat df = new DecimalFormat("#.##");
        TarifSingleton tarifS = TarifSingleton.getInstance();
        tarifd.setText("Valor del kilometo:   " + "$" + (df.format(tarifS.getTarifValue())) );
        tarif.setExitAdress(txtExitAdress.getText());
        tarif.setArrivalAdress(txtArrivalAdress.getText());
        tarif.setKilometres(Integer.parseInt(txtKilometre.getText()));
        float value;
        value = tarifS.totalTarif(tarif.getKilometres());
        tarif.setValueToPay(value);
        TarifDbController.uploadDocumentMdb(tarif);
        lblValue.setText(String.valueOf(tarif.getValueToPay()));
        JOptionPane.showMessageDialog(null, "Tarifa guardad");


    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleanForm();
            }//GEN-LAST:event_btnCleanActionPerformed

    private void cleanForm() {
        txtArrivalAdress.setText("");
        txtExitAdress.setText("");
        txtKilometre.setText("");
        lblValue.setText("");
    }

    private void btnViewTarifsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTarifsActionPerformed
        cleanForm();

        Tarif tarif = new Tarif();
        ArrayList<Tarif> tarifs = new ArrayList<Tarif>();
        MongoClient mongoClient = TarifDbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        String[] titles = {"Direccion salida", "Direccion llegada", "Kilometros", "Valor a pagar"};
        String[] TarifString = new String[4];
        DefaultTableModel tableOfTravelersM = new DefaultTableModel(null, titles);
        tbTarifs.setModel(tableOfTravelersM);
        TarifDbController.loadFromDatabase(tarifs, database, "Tarifs");
        for (int i = 0; i < tarifs.size(); i++) {
            TarifString[0] = "" + tarifs.get(i).getExitAdress() + "";
            TarifString[1] = "" + tarifs.get(i).getArrivalAdress() + "";
            TarifString[2] = "" + tarifs.get(i).getKilometres() + "";
            TarifString[3] = "" + tarifs.get(i).getValueToPay() + "";

            tableOfTravelersM.addRow(TarifString);
        }

        tbTarifs.setModel(tableOfTravelersM);
        tbTarifs.setDefaultEditor(Object.class, null);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tbTarifs.getModel());
        sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(1, SortOrder.DESCENDING)));
        tbTarifs.setRowSorter(sorter);
        tbTarifs.repaint();

    }//GEN-LAST:event_btnViewTarifsActionPerformed

    private void txtKilometreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometreKeyTyped
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if (!number) {
            evt.consume();
        }
        if (txtKilometre.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtKilometreKeyTyped

    private void txtExitAdressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExitAdressKeyTyped
        int key = evt.getKeyChar();
        boolean letters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key == 32);
        if (!letters) {
            evt.consume();
        }
    }//GEN-LAST:event_txtExitAdressKeyTyped

    private void txtArrivalAdressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArrivalAdressKeyTyped
        int key = evt.getKeyChar();
        boolean letters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key == 32);
        if (!letters) {
            evt.consume();
        }
    }//GEN-LAST:event_txtArrivalAdressKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AirportTaxiScheduling airportTaxiScheduling;
        airportTaxiScheduling = new AirportTaxiScheduling();
        this.setVisible(false);
        airportTaxiScheduling.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        Tarif tarif = new Tarif();
        FrmUser frmUser;
        frmUser = new FrmUser();
        texto = txtNewTarif.getText();
        this.setVisible(false);
        frmUser.setVisible(true);

    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnModifyKeyTyped
      
    }//GEN-LAST:event_btnModifyKeyTyped

    private void txtNewTarifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewTarifKeyTyped
          if(txtNewTarif.getText().isEmpty()==false){
            btnModify.setEnabled(true);
        }else{
            btnModify.setEnabled(false);
        }
    }//GEN-LAST:event_txtNewTarifKeyTyped

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
            java.util.logging.Logger.getLogger(FrmTarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTarif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTarif().setVisible(true);
            }
        });
    }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton btnAccept;
          private javax.swing.JButton btnClean;
          private javax.swing.JButton btnModify;
          private javax.swing.JButton btnViewTarifs;
          private javax.swing.JButton jButton1;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JLabel jLabel5;
          private javax.swing.JLabel jLabel6;
          private javax.swing.JLabel jLabel7;
          private javax.swing.JPanel jPanel1;
          private javax.swing.JPanel jPanel2;
          private javax.swing.JScrollPane jScrollPane1;
          private javax.swing.JLabel lblValue;
          private javax.swing.JLabel tarifd;
          private javax.swing.JTable tbTarifs;
          private javax.swing.JTextField txtArrivalAdress;
          private javax.swing.JTextField txtExitAdress;
          private javax.swing.JTextField txtKilometre;
          private javax.swing.JTextField txtNewTarif;
          // End of variables declaration//GEN-END:variables
}
