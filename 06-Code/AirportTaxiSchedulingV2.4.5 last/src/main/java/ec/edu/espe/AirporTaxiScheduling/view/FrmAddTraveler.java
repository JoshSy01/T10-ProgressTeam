/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.AirporTaxiScheduling.view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.AirporTaxiScheduling.controller.TravelersdbController;
import ec.edu.espe.AirporTaxiScheduling.model.Traveler;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FrmAddTraveler extends javax.swing.JFrame {

    public FrmAddTraveler() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txt0 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        sp1 = new javax.swing.JSpinner();
        sp2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        txt3 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        sp3 = new javax.swing.JSpinner();
        bt1 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AÑADIR PASAJERO");

        btnBack.setText("<REGRESAR");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txt0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt0.setToolTipText("Ingrese el Id del pasajero que desee buscar :)");
        txt0.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt0ActionPerformed(evt);
            }
        });
        txt0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt0KeyTyped(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt2.setToolTipText("Solo 10 digitos");
        txt2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        buttonGroup1.add(rb1);
        rb1.setSelected(true);
        rb1.setText("Gmail");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        sp1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        sp1.setToolTipText("");
        sp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sp1KeyTyped(evt);
            }
        });

        sp2.setModel(new javax.swing.SpinnerNumberModel(2000, 1900, 2100, 1));
        sp2.setToolTipText("");
        sp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sp2KeyTyped(evt);
            }
        });

        jLabel2.setText("MES");

        jLabel3.setText("DIA");

        jLabel4.setText("AÑO");

        buttonGroup1.add(rb2);
        rb2.setText("Hotmail");

        txt3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt3.setToolTipText("Solo la primera parte del E-mail");
        txt3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt1.setToolTipText("Primero el nombre, despues el Apellido");
        txt1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        sp3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        sp3.setToolTipText("");
        sp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sp3KeyTyped(evt);
            }
        });

        bt1.setText("CREAR");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt5.setText("LIMPAIR");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nombre y Apellido");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Numero de telefono");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("E-Mail");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Cumpleaños");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel3))
                                            .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb1)
                                .addGap(83, 83, 83)
                                .addComponent(rb2)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AirportTaxiScheduling airportTaxiScheduling;
        airportTaxiScheduling = new AirportTaxiScheduling();
        this.setVisible(false);
        airportTaxiScheduling.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt0ActionPerformed

    }//GEN-LAST:event_txt0ActionPerformed

    private void txt0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt0KeyTyped
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if (!number) {
            evt.consume();
        }
        if (txt0.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txt0KeyTyped

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if (!number) {
            evt.consume();
        }
        if (txt2.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt2KeyTyped

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed

    }//GEN-LAST:event_rb1ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed

    }//GEN-LAST:event_txt3ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        int key = evt.getKeyChar();
        boolean letters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key == 32);
        if (!letters) {
            evt.consume();
        }
    }//GEN-LAST:event_txt1KeyTyped

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        if (txt0.getText().isEmpty() || txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, some fields are empty ");
        } else {
            MongoClient mongoClient = TravelersdbController.conection();
            MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
            MongoCollection<Document> collection = database.getCollection("Travelers");
            Bson filter = Filters.and(Filters.all("id", Integer.valueOf(txt0.getText())));
            MongoCursor<Document> cursor = collection.find(filter).iterator();
            if (collection.find(filter).first() == null) {
                Traveler traveler = new Traveler();
                traveler.setId(Integer.valueOf(txt0.getText()));
                traveler.setName(txt1.getText());
                traveler.setPhoneNumber(Integer.valueOf(txt2.getText()));
                if (rb1.isSelected() == true) {
                    String gmail = "@gmail.com";
                    traveler.setMail(txt3.getText() + gmail);
                } else {
                    String hotmail = "@hotmail.com";
                    traveler.setMail(txt3.getText() + hotmail);
                }
                traveler.setBirthdayDay((int) sp1.getValue());
                traveler.setBirthdayMonth((int) sp3.getValue());
                traveler.setYear((int) sp2.getValue());
                TravelersdbController.uploadDocumentMdb(traveler);
                cleanPanel();
                JOptionPane.showMessageDialog(null, "Pasajero Creado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "La Id ya se encuentra registrada");
            }

        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void sp1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sp1KeyTyped
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if(!number){
            evt.consume();
        }
        if(txt2.getText().length() >= 2){
            evt.consume();
        }
    }//GEN-LAST:event_sp1KeyTyped

    private void sp3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sp3KeyTyped
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if(!number){
            evt.consume();
        }
        if(txt2.getText().length() >= 2){
            evt.consume();
        }
    }//GEN-LAST:event_sp3KeyTyped

    private void sp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sp2KeyTyped
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if(!number){
            evt.consume();
        }
        if(txt2.getText().length() >= 4){
            evt.consume();
        }
    }//GEN-LAST:event_sp2KeyTyped

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        cleanPanel();
    }//GEN-LAST:event_bt5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try ( MongoClient mongoClient = TravelersdbController.conection()) {
            MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
            JOptionPane.showMessageDialog(null, "Conection successfully");
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new FrmAddTraveler().setVisible(true);
                }
            });
        } catch (InputMismatchException me) {
            JOptionPane.showMessageDialog(null, "Error al tratar de conectarse: " + me);
        }
    }

    private void cleanPanel() {
        txt0.setText("");
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        sp1.setValue(1);
        sp3.setValue(1);
        sp2.setValue(2000);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt5;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JSpinner sp1;
    private javax.swing.JSpinner sp2;
    private javax.swing.JSpinner sp3;
    private javax.swing.JTextField txt0;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
