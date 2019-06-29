/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisoner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HomeLogin.HomeLogin;
/**
 *
 * @author Owe
 */
public class Prisoner extends javax.swing.JFrame {

    /**
     * Creates new form Prisoner
     */
    public Prisoner() {
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

        jStation = new javax.swing.JLabel();
        jstationame = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcounty = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jhealthCause = new javax.swing.JLabel();
        jCause = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jCourtName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jOfficerInCharge = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jdoctorNumber = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jVisitorName = new javax.swing.JTextField();
        jCmbID = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlogout = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jCostOfMedication1 = new javax.swing.JTextField();
        jcmbHealthState = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jStation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jStation.setText("prison  Name");
        getContentPane().add(jStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        jstationame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jstationame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstationameActionPerformed(evt);
            }
        });
        getContentPane().add(jstationame, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ID Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("County Arrested");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jcounty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcounty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcountyActionPerformed(evt);
            }
        });
        getContentPane().add(jcounty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Health State");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 30));

        jhealthCause.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jhealthCause.setText("cause of Arrest");
        getContentPane().add(jhealthCause, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        jCause.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCauseActionPerformed(evt);
            }
        });
        getContentPane().add(jCause, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Cell No.");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, 30));

        jCourtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCourtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCourtNameActionPerformed(evt);
            }
        });
        getContentPane().add(jCourtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 160, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Officers in charge");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 30));

        jOfficerInCharge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jOfficerInCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOfficerInChargeActionPerformed(evt);
            }
        });
        getContentPane().add(jOfficerInCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 160, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Bond");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, 30));

        jdoctorNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdoctorNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdoctorNumberActionPerformed(evt);
            }
        });
        getContentPane().add(jdoctorNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 160, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Visotors");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, 30));

        jVisitorName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jVisitorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisitorNameActionPerformed(evt);
            }
        });
        getContentPane().add(jVisitorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 160, 40));

        jCmbID.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jCmbID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Patient Name", "Kelvin", "Mwangi", "Owen", "Kibe" }));
        jCmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbIDActionPerformed(evt);
            }
        });
        getContentPane().add(jCmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 170, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No.", "Station name", "County", "Hospital name", "Cause ", "Officer Charge", "Finace Cost", "Visitor,s Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 910, 180));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 130, 30));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 30));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jButton4.setText("Disciplinary");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 30));

        jlogout.setText("LogOut");
        jlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 130, 30));

        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 890, 50));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("place of arrest");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, 30));

        jCostOfMedication1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCostOfMedication1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCostOfMedication1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCostOfMedication1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 160, 40));

        jcmbHealthState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcmbHealthState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Health Sate", "Good", "Bad", "Worse" }));
        getContentPane().add(jcmbHealthState, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jstationameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstationameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstationameActionPerformed

    private void jcountyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcountyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcountyActionPerformed

    private void jCauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCauseActionPerformed

    private void jCourtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCourtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCourtNameActionPerformed

    private void jOfficerInChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOfficerInChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOfficerInChargeActionPerformed

    private void jdoctorNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdoctorNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdoctorNumberActionPerformed

    private void jVisitorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisitorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVisitorNameActionPerformed

    private void jCmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbIDActionPerformed
        // Make the button auto fill the deatils of the individuals
        if(jCmbID.getSelectedItem().equals("Kibe"))
        {
            //perform the task here
            jstationame.setText("Kamiti Prison");
            jcounty.setText("Baringo");
            jcmbHealthState.getSelectedItem();
            jCause.setText("Too Much Cold");
            jCourtName.setText("Kenya Law Court");
            jOfficerInCharge.setText("Captain Mwangi");
            jdoctorNumber.setText("Ksh.15,000");
            jVisitorName.setText("Ian Njoroge");
        }
        else if (jCmbID.getSelectedItem().equals("Mwangi"))
        {
            //Perform System Closure to doctor in charge;
            jstationame.setText("Eldoret Prison");
            jcounty.setText("Bungoma");
            jcmbHealthState.getSelectedItem();
            jCause.setText("Depression");
            jCourtName.setText("Milimani Law Court");
            jOfficerInCharge.setText("Captain Kemboi");
            jdoctorNumber.setText("Ksh.1,500");
            jVisitorName.setText("Moses Talam");
        }
        else if (jCmbID.getSelectedItem().equals("Kelvin"))
        {
            jstationame.setText("Kapsoya Prison");
            jcounty.setText("Muranga");
            jcmbHealthState.getSelectedItem();
            jCause.setText("Malaria");
            jCourtName.setText("Swahili court");
            jOfficerInCharge.setText("Captain Omondi");
            jdoctorNumber.setText("Ksh.20,000");
            jVisitorName.setText("Ian Katui");
        }
    }//GEN-LAST:event_jCmbIDActionPerformed

    private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //delete added data to the table
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm Exit",
            "Prison ManageMent System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
    //TODO work on the Wrong password Enter to exit;
    {
        System.exit(0); // Automatic exit if more than 3 wrong trials
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //delete added data
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        if(jTable1.getSelectedRow()==-1)
        {
            if(jTable1.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(null,"No data to Delete",
                    "Prison Management System", JOptionPane.OK_OPTION);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Select Row To delete", "Prison Management System",
                    JOptionPane.OK_OPTION);
            }
        }
        else
        {
            tableModel.removeRow(jTable1.getSelectedRow());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Table update data
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        //update data to the table
        tableModel.addRow(new Object[]{
            jCmbID.getSelectedItem().toString(),
            jcounty.getText(),
            jcmbHealthState.getSelectedItem(),
            jCause.getText(),
            jCourtName.getText(),
            jOfficerInCharge.getText(),
            jdoctorNumber.getText(),
            jVisitorName.getText(),
        });

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutActionPerformed
        // logout t'he user from the system by retrning the user to the login page
        HomeLogin iLogin = new HomeLogin();
        iLogin.setVisible(true);
    }//GEN-LAST:event_jlogoutActionPerformed

    private void jCostOfMedication1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCostOfMedication1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCostOfMedication1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Return Home
        HomeLogin iLogin = new HomeLogin();
        iLogin.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prisoner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jCause;
    private javax.swing.JComboBox jCmbID;
    private javax.swing.JTextField jCostOfMedication1;
    private javax.swing.JTextField jCourtName;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jOfficerInCharge;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jStation;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jVisitorName;
    private javax.swing.JComboBox jcmbHealthState;
    private javax.swing.JTextField jcounty;
    private javax.swing.JTextField jdoctorNumber;
    private javax.swing.JLabel jhealthCause;
    private javax.swing.JButton jlogout;
    private javax.swing.JTextField jstationame;
    // End of variables declaration//GEN-END:variables
}
