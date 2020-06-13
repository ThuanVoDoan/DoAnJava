/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.sql.*;
import javax.swing.*;
import Process.*;
import DataConnect.*;
public class ConnectLogin extends javax.swing.JFrame {

    /**
     * Creates new form ConnectLogin
     */
    public ConnectLogin() {
        initComponents();
         String User ="Select * from UserConnect";
         
          UpdataTable.Loaddatacb(User, this.cbUser, "UserName");
          this.lbConnect.setText(CheckLog.testConnect());
    }
public static ResultSet rs=null;
public static PreparedStatement pst=null;
public static String manv;

public static Connection conn=Connect.getConnect();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPass = new javax.swing.JPasswordField();
        cbUser = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLog = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        lbConnect = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setMinimumSize(new java.awt.Dimension(457, 320));
        setPreferredSize(new java.awt.Dimension(457, 320));
        getContentPane().setLayout(null);

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        getContentPane().add(txtPass);
        txtPass.setBounds(160, 170, 164, 36);

        cbUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tài Khoản" }));
        getContentPane().add(cbUser);
        cbUser.setBounds(160, 120, 163, 32);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_login.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 90, 110, 116);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Tài Khoản:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 116, 88, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Mật Khẩu:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 175, 85, 22);

        btLog.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btLog.setText("Đăng Nhập");
        btLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogActionPerformed(evt);
            }
        });
        btLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btLogKeyReleased(evt);
            }
        });
        getContentPane().add(btLog);
        btLog.setBounds(30, 220, 97, 25);

        btReset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btReset.setText("Đăng Nhập Lại");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        getContentPane().add(btReset);
        btReset.setBounds(150, 220, 117, 25);

        btExit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit);
        btExit.setBounds(290, 220, 65, 25);

        lbConnect.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbConnect.setForeground(new java.awt.Color(51, 255, 204));
        lbConnect.setText("Kiểm tra kết nối Database");
        getContentPane().add(lbConnect);
        lbConnect.setBounds(90, 262, 260, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Golden Wing Restaurant");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(133, 20, 210, 40);

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        getContentPane().add(txtUser);
        txtUser.setBounds(225, 150, 6, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loginn.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-3, 0, 460, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void Log()
{
        if(String.valueOf(this.txtPass.getPassword()).length()==0)
        {
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập  Mật Khẩu","Thông Báo",1);

        }
        else
        {
            rs=CheckLog.cLog(this.cbUser.getSelectedItem().toString(), String.valueOf(this.txtPass.getPassword()));
            try {
                if(rs.next())
                {
                    // Đăng nhập thành công
                    manv=this.cbUser.getSelectedItem().toString();
                  
                   new Main().setVisible(true);
                   
                    JOptionPane.showMessageDialog(null,"Welcome To Golden Wing Restaurant","Thông Báo",1);
                }
                else
                {
                    // Đăng nhập thất Bại
                    JOptionPane.showMessageDialog(null,"Tài Khoản không tồn tại","Thông Báo",0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e,"Thông Báo",1);
            }
        }
        
}
    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Log();

        }
    }//GEN-LAST:event_txtPassKeyReleased

    private void btLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogActionPerformed
        Log();
    }//GEN-LAST:event_btLogActionPerformed

    private void btLogKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btLogKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER)
        {
            Log();

        }
    }//GEN-LAST:event_btLogKeyReleased

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed

        this.txtUser.setText(null);
        this.txtPass.setText(null);
    }//GEN-LAST:event_btResetActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn thoát chương trình hay không","Thông Báo",2)==0)
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtPass.requestFocus();

        }
    }//GEN-LAST:event_txtUserKeyReleased

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
            java.util.logging.Logger.getLogger(ConnectLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLog;
    private javax.swing.JButton btReset;
    private javax.swing.JComboBox cbUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbConnect;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
