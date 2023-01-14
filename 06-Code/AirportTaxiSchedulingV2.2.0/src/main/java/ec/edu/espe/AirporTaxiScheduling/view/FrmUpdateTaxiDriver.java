/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.AirporTaxiScheduling.view;

import ec.edu.espe.AirporTaxiScheduling.controller.MongoData;
import ec.edu.espe.AirporTaxiScheduling.model.TaxiDriver;
import ec.edu.espe.AirporTaxiScheduling.view.AirportTaxiScheduling;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class FrmUpdateTaxiDriver extends javax.swing.JFrame {

    /**
     * Creates new form FrmUpdateDriver
     */
    public FrmUpdateTaxiDriver() {
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

        btnBack = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        cmbVehicleMarck = new javax.swing.JComboBox<>();
        cmbVehicleYear = new javax.swing.JComboBox<>();
        txtVehiclePlate = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        spnAge = new javax.swing.JSpinner();
        cmbAdress = new javax.swing.JComboBox<>();
        rbGmail = new javax.swing.JRadioButton();
        rbHotmail = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAccept.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnAccept.setText("ACCEPT");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE DRIVER");

        jLabel3.setText("Name:");

        jLabel4.setText("PhoneNumber:");

        jLabel5.setText("Age:");

        jLabel6.setText("Adress:");

        jLabel7.setText("C.I:");

        jLabel8.setText("Email:");

        jLabel9.setText("Gender:");

        jLabel10.setText("vehicle Marck:");

        jLabel11.setText("vehicle Plate:");

        jLabel12.setText("vehicle Year:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other" }));

        cmbVehicleMarck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Nissan", "Jac", "Cherry", "Other" }));

        cmbVehicleYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCIKeyTyped(evt);
            }
        });

        cmbAdress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quito", "Ibarra", "Riombamba", "Pifo", "Puembo", "Tumbaco", "Sangolqui", "Calderon", "Carcelen", "Carapungo" }));

        rbGmail.setText("@gmail.com");

        rbHotmail.setText("@hotmail.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtPhoneNumber)
                                    .addComponent(cmbAdress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCI)
                                    .addComponent(txtEmail)
                                    .addComponent(cmbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbVehicleMarck, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVehiclePlate)
                                        .addComponent(cmbVehicleYear, 0, 88, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbGmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbHotmail))
                                    .addComponent(btnAccept))))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGmail)
                    .addComponent(rbHotmail))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbVehicleMarck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtVehiclePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbVehicleYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnAccept)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         AirportTaxiScheduling airportTaxiSheduling = new AirportTaxiScheduling();
        airportTaxiSheduling.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        String[] Datos = new String[10];
        Datos[0] = txtCI.getText();
        Datos[1] = txtName.getText();
        Datos[2] = txtPhoneNumber.getText();
        Datos[3] = spnAge.getValue().toString();
        Datos[4] = cmbAdress.getSelectedItem().toString();
        Datos[5] = txtEmail.getText();
        Datos[6] = cmbGender.getSelectedItem().toString();
        Datos[7] = cmbVehicleMarck.getSelectedItem().toString();
        Datos[8] = txtVehiclePlate.getText();
        Datos[9] = cmbVehicleYear.getSelectedItem().toString();
        
        if(rbGmail.isSelected()==true){
                String gmail = "@gmail.com";
                Datos[5]=(txtEmail.getText()+gmail);
            }else{
                String gmail = "@hotmail.com";
                Datos[5]=(txtEmail.getText()+gmail);
            }
        TaxiDriver driver = new TaxiDriver(Datos[0], Datos[1], Long.valueOf(Datos[2]), Datos[3], Datos[4], Datos[5], Datos[6], Datos[7], Datos[8], Datos[9]);
        MongoData.updateDriver(driver);
        JOptionPane.showMessageDialog(this, "Driver uptade successfully");

        txtName.setText("");
        txtPhoneNumber.setText("");
        txtCI.setText("");
        txtEmail.setText("");
        txtVehiclePlate.setText(""); 
        cmbAdress.setSelectedIndex(0);
        cmbGender.setSelectedIndex(0);
        cmbVehicleMarck.setSelectedIndex(0);
        cmbVehicleYear.setSelectedIndex(0);

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();

        if ((Character.isLetter(c)) || (Character.isWhitespace(c)) || (Character.isISOControl(c))) {
            txtName.setEditable(true);
        } else {
            txtName.setEditable(false);
            JOptionPane.showMessageDialog(this, c + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
        // TODO add your handling code here:
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if(!number){
            evt.consume();
                        JOptionPane.showMessageDialog(this, number + " only numbers", "Warning on input data", JOptionPane.WARNING_MESSAGE);

        }
        if(txtCI.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        // TODO add your handling code here:
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if(!number){
            evt.consume();
                        JOptionPane.showMessageDialog(this, number + " only numbers", "Warning on input data", JOptionPane.WARNING_MESSAGE);

        }
        if(txtPhoneNumber.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

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
            java.util.logging.Logger.getLogger(FrmUpdateTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateTaxiDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateTaxiDriver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbAdress;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbVehicleMarck;
    private javax.swing.JComboBox<String> cmbVehicleYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbGmail;
    private javax.swing.JRadioButton rbHotmail;
    private javax.swing.JSpinner spnAge;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtVehiclePlate;
    // End of variables declaration//GEN-END:variables
}
