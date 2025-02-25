/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbanksystem;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;
/**
 *
 * @author Shano
 */
public class viewdetails extends javax.swing.JFrame {

    public viewdetails() {
        initComponents();
    }
    
    private boolean checkDonorExistence(String id) {
    try {
        Conn c = new Conn();
        ResultSet rs = c.s.executeQuery("select * from donorrr where id = '" + id + "'");
        return rs.next(); // If next() is true, donor ID exists; otherwise, it doesn't
    } catch (Exception e) {
        e.printStackTrace(); // Handle the exception appropriately
        return false; // Assume donor ID does not exist in case of an exception
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        tffirstname = new javax.swing.JTextField();
        tfphonenumber = new javax.swing.JTextField();
        tflastname = new javax.swing.JTextField();
        tfbloodgroup = new javax.swing.JTextField();
        tfgender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        viewbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfunit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setBounds(new java.awt.Rectangle(180, 0, 1010, 714));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Details of Donors");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Units Donated:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Blood Group:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });
        getContentPane().add(tfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 390, 30));
        getContentPane().add(tffirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 250, 40));
        getContentPane().add(tfphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 250, 40));
        getContentPane().add(tflastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 250, 40));
        getContentPane().add(tfbloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 250, 40));
        getContentPane().add(tfgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 250, 40));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter your ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        viewbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));
        getContentPane().add(tfunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 250, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shano\\Documents\\NetBeansProjects\\BloodBankSystem\\src\\bloodbanksystem\\icons\\menu.gif")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        String id = tfid.getText();
        
        try{
                    boolean donorExists = checkDonorExistence(id);

                if (!donorExists) {
                    JOptionPane.showMessageDialog(null, "Donor ID does not exist.");
                } 
                    else
                    {
                         Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from donorrr where id = '"+id+"'");
                    if(rs.next()){
                        tffirstname.setText(rs.getString(2));  
                        tflastname.setText(rs.getString(3));
                        tfphonenumber.setText(rs.getString(4));  
                        tfbloodgroup.setText(rs.getString(5));
                        tfgender.setText(rs.getString(6));
                        tfunit.setText(rs.getString(7));
                    }
                    }
                   
                }catch(Exception e){ }
        
    }//GEN-LAST:event_viewbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          setVisible(false);
		mainp su = new mainp();
		su.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(viewdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfbloodgroup;
    private javax.swing.JTextField tffirstname;
    private javax.swing.JTextField tfgender;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tflastname;
    private javax.swing.JTextField tfphonenumber;
    private javax.swing.JTextField tfunit;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
