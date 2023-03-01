package ec.edu.espe.AirporTaxiScheduling.view;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.AirporTaxiScheduling.controller.TraveldbController;
import ec.edu.espe.AirporTaxiScheduling.controller.TravelerdbController;
import ec.edu.espe.AirporTaxiScheduling.model.Travel;
import ec.edu.espe.AirporTaxiScheduling.model.Traveler;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FrmUncollectedTravel extends javax.swing.JFrame {

          /**
           * Creates new form FrmUncollectedTravel
           */
          TraveldbController dataBaseManager = new TraveldbController();
          String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
          String databaseName = "AirportTaxiScheduling";
          String collectionName = "UncollectedTravels";

          public FrmUncollectedTravel() {
                    initComponents();
                    viewTravels();
          }

          /**
           * This method is called from within the constructor to initialize the
           * form. WARNING: Do NOT modify this code. The content of this method
           * is always regenerated by the Form Editor.
           */
          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
          private void initComponents() {

                    jPanel1 = new javax.swing.JPanel();
                    jScrollPane3 = new javax.swing.JScrollPane();
                    jtblTravels = new javax.swing.JTable();
                    jLabel1 = new javax.swing.JLabel();
                    lblID = new javax.swing.JLabel();
                    btnPay = new javax.swing.JButton();
                    jLabel2 = new javax.swing.JLabel();
                    lblTaxiDriver = new javax.swing.JLabel();
                    btnBACK = new javax.swing.JButton();
                    jLabel3 = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setResizable(false);

                    jtblTravels.setModel(new javax.swing.table.DefaultTableModel(
                              new Object [][] {

                              },
                              new String [] {
                                        "Id", "Conductor", "Pasajero", "Direccion", "Fecha", "Precio", "Pagado"
                              }
                    ));
                    jtblTravels.addMouseListener(new java.awt.event.MouseAdapter() {
                              public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        jtblTravelsMouseClicked(evt);
                              }
                    });
                    jScrollPane3.setViewportView(jtblTravels);

                    jLabel1.setText("Carrera:");

                    btnPay.setText("Marcar como pagado");
                    btnPay.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnPayActionPerformed(evt);
                              }
                    });

                    jLabel2.setText("Conductor:");

                    btnBACK.setText("<REGRESAR");
                    btnBACK.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btnBACKActionPerformed(evt);
                              }
                    });

                    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel3.setText("VIAJES A PAGAR");

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                    jPanel1.setLayout(jPanel1Layout);
                    jPanel1Layout.setHorizontalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(btnBACK)
                                        .addGap(229, 229, 229)
                                        .addComponent(jLabel3)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(26, 26, 26))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(53, 53, 53)
                                                            .addComponent(jLabel2)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(lblTaxiDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(151, 151, 151)
                                                            .addComponent(btnPay)
                                                            .addGap(68, 68, 68))))
                    );
                    jPanel1Layout.setVerticalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(btnBACK)
                                                                                .addGap(15, 15, 15))
                                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(18, 18, 18)))
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                      .addComponent(btnPay)
                                                                      .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel1))))
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                      .addComponent(lblTaxiDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(jLabel2))
                                                            .addGap(4, 4, 4)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(22, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                    );

                    pack();
                    setLocationRelativeTo(null);
          }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
              if (lblID.getText().isEmpty() == false) {
                        int option = JOptionPane.showConfirmDialog(this, "Do you want to continue?");
                        if (option == 0) {

                                  payTravel(lblID.getText());

                        } else {
                                  cleanForm();
                        }
                        viewTravels();
              } else {
                        JOptionPane.showMessageDialog(null, "No se ha seleccionado a un viaje por cambiar");
              }

    }//GEN-LAST:event_btnPayActionPerformed

    private void jtblTravelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblTravelsMouseClicked
              int row = jtblTravels.rowAtPoint(evt.getPoint());
              lblID.setText(jtblTravels.getValueAt(row, 0).toString());
              lblTaxiDriver.setText(jtblTravels.getValueAt(row, 1).toString());
    }//GEN-LAST:event_jtblTravelsMouseClicked

          private void btnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBACKActionPerformed
                    AirportTaxiScheduling airportTaxiScheduling;
                    airportTaxiScheduling = new AirportTaxiScheduling();
                    this.setVisible(false);
                    airportTaxiScheduling.setVisible(true);
          }//GEN-LAST:event_btnBACKActionPerformed

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
                              java.util.logging.Logger.getLogger(FrmUncollectedTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(FrmUncollectedTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(FrmUncollectedTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(FrmUncollectedTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(() -> {
                              new FrmUncollectedTravel().setVisible(true);
                    });
          }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton btnBACK;
          private javax.swing.JButton btnPay;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JPanel jPanel1;
          private javax.swing.JScrollPane jScrollPane3;
          private javax.swing.JTable jtblTravels;
          private javax.swing.JLabel lblID;
          private javax.swing.JLabel lblTaxiDriver;
          // End of variables declaration//GEN-END:variables

          private void viewTravels() {
                    cleanForm();
                    dataBaseManager = TraveldbController.connectToDatabase(uri, databaseName, dataBaseManager);
                    ArrayList<Travel> travelsView = new ArrayList<>();
                    String[] titles = {"Id", "Conductor", "Pasajero", "Direccion", "Fecha", "Precio", "Pagado", "Nota"};
                    String[] travelsString = new String[8];
                    DefaultTableModel tableOfTravels = new DefaultTableModel(null, titles);
                    TraveldbController.load(travelsView, dataBaseManager.getDatabase(), collectionName);

                    for (int i = 0; i < travelsView.size(); i++) {
                              travelsString[0] = "" + travelsView.get(i).getId() + "";
                              travelsString[1] = "" + travelsView.get(i).getDriver() + "";
                              travelsString[2] = "" + travelsView.get(i).getTraveler() + "";
                              travelsString[3] = "" + travelsView.get(i).getAddress() + "";
                              travelsString[4] = "" + travelsView.get(i).getDateOfOcurrence() + "";
                              travelsString[5] = "" + travelsView.get(i).getPrice() + "";
                              travelsString[6] = "" + String.valueOf(travelsView.get(i).isPayed()) + "";
                              travelsString[7] = "" + travelsView.get(i).getAnnotation() + "";
                              tableOfTravels.addRow(travelsString);
                    }

                    jtblTravels.setModel(tableOfTravels);
                    jtblTravels.setDefaultEditor(Object.class, null);
          }

          private void cleanForm() {
                    lblID.setText("");
                    lblTaxiDriver.setText("");
          }

          private void payTravel(String travelId) {
                    dataBaseManager = TraveldbController.connectToDatabase(uri, databaseName, dataBaseManager);
                    int travelIdentifier = Integer.parseInt(travelId);
                    ArrayList<Travel> travelsView = new ArrayList<Travel>();

                    Traveler traveler1 = new Traveler();
                    TraveldbController.deleteOne(dataBaseManager.getDatabase(), collectionName, travelIdentifier);
                    TraveldbController.load(travelsView, dataBaseManager.getDatabase(), "Travels");
                    for (int i = 0; i < travelsView.size(); i++) {
                              if (travelIdentifier == travelsView.get(i).getId()) {

                                        MongoCollection<Document> travelsCollection = dataBaseManager.getDatabase().getCollection("Travels");

                                        traveler1 = TravelerdbController.findDocumentdb(traveler1, travelsView.get(i).getIdTraveler());
                                        FindIterable<Document> result = travelsCollection.find(Filters.eq("id", travelIdentifier));
                                        travelsCollection.updateOne(result.first(), Updates.set("payed", true));
                                        traveler1.setOutstandingBalance(traveler1.getOutstandingBalance() - travelsView.get(i).getPrice());
                                        TravelerdbController.updateDocumentdb(traveler1, travelsView.get(i).getIdTraveler());

                              }
                    }

          }

}
