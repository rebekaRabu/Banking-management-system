/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author R-38 (1245310)
 */
public class Withdraw extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    
    
    
    public Withdraw() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFAccountNo = new javax.swing.JTextField();
        TFName = new javax.swing.JTextField();
        TFOB = new javax.swing.JTextField();
        TFWithdraw = new javax.swing.JTextField();
        txtwith2 = new javax.swing.JTextField();
        TotalButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BTWithdraw = new javax.swing.JButton();
        txtidno = new javax.swing.JTextField();
        BTSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Withdraw Form");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 11, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Account No ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Old Balance");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bank ID NO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Witdraw");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        TFAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAccountNoActionPerformed(evt);
            }
        });
        jPanel1.add(TFAccountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 242, -1));

        TFName.setEnabled(false);
        TFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNameActionPerformed(evt);
            }
        });
        jPanel1.add(TFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 242, -1));

        TFOB.setEnabled(false);
        jPanel1.add(TFOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 242, -1));
        jPanel1.add(TFWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 99, -1));

        txtwith2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwith2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtwith2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 281, 112, -1));

        TotalButton.setText("Total");
        TotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalButtonActionPerformed(evt);
            }
        });
        jPanel1.add(TotalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 280, 70, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTWithdraw.setText("Withdraw");
        BTWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTWithdrawActionPerformed(evt);
            }
        });
        jPanel2.add(BTWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 332, 487, 50));

        txtidno.setEnabled(false);
        jPanel1.add(txtidno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 240, -1));

        BTSearch.setText("Search");
        BTSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSearchActionPerformed(evt);
            }
        });
        jPanel1.add(BTSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        setSize(new java.awt.Dimension(503, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAccountNoActionPerformed

    private void TFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNameActionPerformed

    private void txtwith2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwith2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwith2ActionPerformed

    private void BTSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSearchActionPerformed
        //search task
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","123");

            //ID_No, Acc, Name, Balance
            String query = "select* from balance_sheet  where Acc=?";
            pstm=con.prepareStatement(query);
            pstm.setString(1, TFAccountNo.getText().toString());
            rs=pstm.executeQuery();

            if(rs.next()){
                String acc= rs.getString("Acc");
                TFAccountNo.setText(acc);
                
                String Name= rs.getString("Name");
                TFName.setText(Name);
                
                String idno= rs.getString("ID_No");
                txtidno.setText(idno);
                
                String balance= rs.getString("Balance");
                TFOB.setText(balance);
                //String mode= rs.getString("Mode");
                //jComboBox1.setSelectedItem(mode);
                //Date date= rs.getDate("Date");
                //DCCurrentDate.setDate(date);

            }else{
                JOptionPane.showMessageDialog(rootPane, " plz enter your correct Account Number. ");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTSearchActionPerformed

    private void BTWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTWithdrawActionPerformed
        // FOR withdraw
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","123");
            String a1= TFAccountNo.getText();
            //String a2= TFWithdraw.getText();
            String a3=txtwith2.getText();
            
             //String a4 =((JTextField)DCCurrentDate.getDateEditor().getUiComponent()).getText();
            
            //Acc, Name, Mode, Current_Balance, Deposit_Amount, Date, Debit
            
            //Debit = '"+a2+"' ,
            String query = "update balance_sheet set Balance='"+a3+"'  where Acc ='"+a1+"'   " ;
            
            pstm =con.prepareStatement(query);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Withdraw Successful");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTWithdrawActionPerformed

    private void TotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalButtonActionPerformed
        //total button
        try{
            //String a1=tfAccountNo.getText();
            String a1=TFOB.getText();
            String a2= TFWithdraw.getText();
            int sum =Integer.parseInt(a1) - Integer.parseInt(a2);
            String totalSum= String.valueOf(sum);
            txtwith2.setText(totalSum);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_TotalButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTSearch;
    private javax.swing.JButton BTWithdraw;
    private javax.swing.JTextField TFAccountNo;
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFOB;
    private javax.swing.JTextField TFWithdraw;
    private javax.swing.JButton TotalButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtidno;
    private javax.swing.JTextField txtwith2;
    // End of variables declaration//GEN-END:variables
}