/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitors;

//imoport statements
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import HomeLogin.HomeLogin;
import disciplinary.Disciplinary;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Owe
 */
public class Visitors extends javax.swing.JFrame {

    /**
     * Creates new form Visitors
     */
    public Visitors() {
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

        jLabel1 = new javax.swing.JLabel();
        jStation = new javax.swing.JLabel();
        jIDNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        iTimeIn = new javax.swing.JTextField();
        jhealthCause = new javax.swing.JLabel();
        jTimeOut = new javax.swing.JTextField();
        jCmbID = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jlogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jcmbRelationShip = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Visitor's Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 460, 60));

        jStation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jStation.setText("ID No");
        getContentPane().add(jStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jIDNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jIDNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIDNoActionPerformed(evt);
            }
        });
        getContentPane().add(jIDNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Relation to victim");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Time in");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        iTimeIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        iTimeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iTimeInActionPerformed(evt);
            }
        });
        getContentPane().add(iTimeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 170, 30));

        jhealthCause.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jhealthCause.setText("Time out");
        getContentPane().add(jhealthCause, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        jTimeOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTimeOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTimeOutActionPerformed(evt);
            }
        });
        getContentPane().add(jTimeOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 170, 30));

        jCmbID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCmbID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Victim's Name", "Kelvin", "Mwangi", "Owen", "Njoroge", "William" }));
        jCmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbIDActionPerformed(evt);
            }
        });
        getContentPane().add(jCmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 170, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Visitor's Name", "ID No", "Relation", "Time in", "Time Out"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 960, 180));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 220, 60));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 220, 60));

        jButton4.setText("Disciplinary");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 220, 50));

        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 50));

        jlogout.setText("LogOut");
        jlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 140, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 140, 60));

        jcmbRelationShip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Relation", "Family", "Workmate", "Friend" }));
        getContentPane().add(jcmbRelationShip, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIDNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIDNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIDNoActionPerformed

    private void iTimeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iTimeInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iTimeInActionPerformed

    private void jTimeOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTimeOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTimeOutActionPerformed

    private void jCmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbIDActionPerformed
        // Make the button auto fill the deatils of the individuals
        if(jCmbID.getSelectedItem().equals("Owen"))
        {
            //perform the task here
            jIDNo.setText("35145698");
            jcmbRelationShip.getSelectedItem();
           iTimeIn.setText("5:05 PM");
           jTimeOut.setText("5:45 PM");
            
        }
        else if (jCmbID.getSelectedItem().equals("Mwangi"))
        {
            //Perform System Closure to doctor in charge;
            jIDNo.setText("35145698");
            jcmbRelationShip.getSelectedItem();
           iTimeIn.setText("5:05 PM");
           jTimeOut.setText("5:45 PM");
            
        }
        else if (jCmbID.getSelectedItem().equals("Kelvin"))
        {
            jIDNo.setText("35145698");
            jcmbRelationShip.getSelectedItem();
           iTimeIn.setText("5:05 PM");
           jTimeOut.setText("5:45 PM");
            
        }
        else if (jCmbID.getSelectedItem().equals("Njoroge"))
        {
            jIDNo.setText("35145698");
            jcmbRelationShip.getSelectedItem();
           iTimeIn.setText("5:05 PM");
           jTimeOut.setText("5:45 PM");
            
        }
        else if (jCmbID.getSelectedItem().equals("William"))
        {
             jIDNo.setText("35145698");
            jcmbRelationShip.getSelectedItem();
           iTimeIn.setText("5:05 PM");
           jTimeOut.setText("5:45 PM");
            
        }
        else if (jCmbID.getSelectedItem().equals("Victim's Name"))
        {
            jIDNo.setText("35145698");
            jcmbRelationShip.getSelectedItem();
           iTimeIn.setText("5:05 PM");
           jTimeOut.setText("5:45 PM");
            
        }
        else
        {
            //make sure to entwe data
        }
    }//GEN-LAST:event_jCmbIDActionPerformed

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
            jIDNo.getText(),
            jcmbRelationShip.getSelectedItem(),
            iTimeIn.getText(),
            jTimeOut.getText(),
         
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Disciplinary iDisciplinary = new Disciplinary();
        iDisciplinary.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Court Home Page
        HomeLogin iLogin = new HomeLogin();
        iLogin.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutActionPerformed
        // logout t'he user from the system by retrning the user to the login page
        HomeLogin iLogin = new HomeLogin();
        iLogin.setVisible(true);
    }//GEN-LAST:event_jlogoutActionPerformed

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

    private JFrame frame;
    
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
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iTimeIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jCmbID;
    private javax.swing.JTextField jIDNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jStation;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTimeOut;
    private javax.swing.JComboBox jcmbRelationShip;
    private javax.swing.JLabel jhealthCause;
    private javax.swing.JButton jlogout;
    // End of variables declaration//GEN-END:variables
}
