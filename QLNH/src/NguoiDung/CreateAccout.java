/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguoiDung;

import java.sql.*;
import javax.swing.*;
import Process.*;
import DataConnect.*;
public class CreateAccout extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccout
     */
    public CreateAccout() {
        initComponents();
           showCT();
        ProcessCtr(true);
    }
 public static String sql="select distinct ID, UserName as 'Tên Tài Khoản', Password as 'Mật Khẩu', Manager as'Quản lý' from UserConnect order by ID asc";
    public static String tk;
    
    public void showCT()
    {
        UpdataTable.LoadData(sql, tbAC);
        
    }
    
public void ProcessCtr(boolean b)
{
    this.btTao.setEnabled(b);
    this.btxoa.setEnabled(b);

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtuse = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtMana = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAC = new javax.swing.JTable();
        btTao = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        bthoat = new javax.swing.JButton();
        btnew = new javax.swing.JButton();

        setTitle("Tạo Tài khoản");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Thông Tin Tài Khoản");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("User:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Manager:");

        txtid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtuse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtMana.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tbAC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbACMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAC);

        btTao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btTao.setText("Tạo");
        btTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaoActionPerformed(evt);
            }
        });

        btxoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btxoa.setText("Xoá");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        bthoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bthoat.setText("Thoát");
        bthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthoatActionPerformed(evt);
            }
        });

        btnew.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnew.setText("Làm Mới");
        btnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(txtMana)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(bthoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btTao)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuse, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtid)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btxoa)
                                .addGap(27, 27, 27)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnew))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnew)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTao)
                            .addComponent(btxoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(bthoat)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewActionPerformed
            ProcessCtr(false);
        this.btTao.setEnabled(true);
        this.txtid.setText(null);
        this.txtuse.setText(null);
        this.txtpass.setText(null);
        this.txtMana.setText(null);
    }//GEN-LAST:event_btnewActionPerformed

    private void bthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthoatActionPerformed
       dispose();
    }//GEN-LAST:event_bthoatActionPerformed

    private void tbACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbACMouseClicked
        ProcessCtr(true);
        this.btTao.setEnabled(false);

        try {
            int row = this.tbAC.getSelectedRow();
            String IDrow =(this.tbAC.getModel().getValueAt(row, 1)).toString();
            String sql1="select distinct * from UserConnect where UserName='"+IDrow+"'";
            ResultSet rs = UpdataTable.ShowTextField(sql1);
            if(rs.next())
            {
                tk =rs.getString("UserName");

                this.txtid.setText(rs.getString("ID"));
                this.txtuse.setText(rs.getString("UserName"));
                this.txtpass.setText(rs.getString("Password"));
                this.txtMana.setText(rs.getString("Manager"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbACMouseClicked

    private void btTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaoActionPerformed
         if(this.txtid.getText().length()==0)

        JOptionPane.showMessageDialog(null, "Mã Tài Khoản  không được bỏ trống", "Thông Báo",1);

        else
        if(this.txtid.getText().length()>10)
        JOptionPane.showMessageDialog(null, "Mã Tài Khoản không được quá 10 ký tự ","Thông Báo",1);
        else

        if(this.txtuse.getText().length()==0)
        JOptionPane.showMessageDialog(null,"Tên Tài Khoản không được bỏ trống","Thông Báo",1);
        else
        if(this.txtpass.getText().length()==0)
        JOptionPane.showConfirmDialog(null, "Mật Khẩu  không được bỏ trống","Thông Báo",1);
        else
        if(this.txtMana.getText().length()==0)
        JOptionPane.showMessageDialog(null,"Quản lý không được bỏ trống", "Thông Báo",1);
        
        else
        {

            ManagerAccout.InsertTK(this.txtid.getText().trim(), this.txtuse.getText(),this.txtpass.getText(),this.txtMana.getText());
            showCT();
            ProcessCtr(false);
        }
    }//GEN-LAST:event_btTaoActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        if(this.txtuse.getText().length()==0)

        JOptionPane.showMessageDialog(null, "Bạn cần chọn Tài Khoản để xoá", "Thông Báo",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn đã xoá Tài Khoản "+tk+"  ","Thông Báo",2)==0);
            ManagerAccout.DeleteTK(tk);
            showCT();
            ProcessCtr(false);

        }
    }//GEN-LAST:event_btxoaActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTao;
    private javax.swing.JButton bthoat;
    private javax.swing.JButton btnew;
    private javax.swing.JButton btxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAC;
    private javax.swing.JTextField txtMana;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuse;
    // End of variables declaration//GEN-END:variables
}
