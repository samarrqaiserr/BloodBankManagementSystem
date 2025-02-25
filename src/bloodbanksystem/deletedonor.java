/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbanksystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Shano
 */
public class deletedonor extends javax.swing.JFrame {

    /**
     * Creates new form deletedonor
     */
    public deletedonor() {
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
        jLabel2 = new javax.swing.JLabel();
        tfdonorid = new javax.swing.JTextField();
        tfdelete = new javax.swing.JButton();
        tfback = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(180, 0, 1010, 714));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Donor ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        getContentPane().add(tfdonorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 200, 30));

        tfdelete.setText("Delete");
        tfdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(tfdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 130, 40));

        tfback.setText("Back");
        tfback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfbackActionPerformed(evt);
            }
        });
        getContentPane().add(tfback, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shano\\Documents\\NetBeansProjects\\BloodBankSystem\\src\\bloodbanksystem\\icons\\menu.gif")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfbackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
	mainp su = new mainp();
	su.setVisible(true);
    }//GEN-LAST:event_tfbackActionPerformed

    private void tfdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdeleteActionPerformed
        // TODO add your handling code here:
         try
            {
                Conn con = new Conn();
            
                String donorid = tfdonorid.getText();
                String bloodgroup = null;
                 int unit = 0;
                                
                                ResultSet rs = con.s.executeQuery("select * from donorrr where id = '"+donorid+"'");
                                if(rs.next())
                                {
                                bloodgroup = rs.getString(5);
                                unit = rs.getInt(7);
                                }
                               String q1 = "update bank set units = units - " + unit + " where bloodgroup = '" + bloodgroup + "'";
                                 con.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Bank Updated Successfully");
                
                
                String sql2 = "DELETE FROM donorrr WHERE id='"+donorid+"'";
                PreparedStatement st2= con.c.prepareStatement(sql2);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(	null, "Donor has been removed");
        }catch(Exception e){
                System.out.println(e);
 }
    }//GEN-LAST:event_tfdeleteActionPerformed

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
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletedonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletedonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton tfback;
    private javax.swing.JButton tfdelete;
    private javax.swing.JTextField tfdonorid;
    // End of variables declaration//GEN-END:variables
}
