/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucDon;
import java.sql.*;
import javax.swing.*;
import Process.*;
import DataConnect.*;
public class ADThucDon extends javax.swing.JFrame {

    /**
     * Creates new form ADThucDon
     */
    public ADThucDon() {
        initComponents();
        String cDM ="Select * from DanhMucTD";
          UpdataTable.Loaddatacb(cDM, this.cbDM, "TenDMTD");
        String cDVT ="Select * from DonViTinh";
          UpdataTable.Loaddatacb(cDVT, this.cbDVT, "TenDVT");
        ProcessCtr(true);
    }

    public static ResultSet rs=null;
    public static PreparedStatement pst=null;
    public static String manv;
    public static Connection conn=Connect.getConnect();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMatd = new javax.swing.JTextField();
        txtTentd = new javax.swing.JTextField();
        cbDM = new javax.swing.JComboBox();
        cbDVT = new javax.swing.JComboBox();
        txtghichu = new javax.swing.JTextField();
        btDM = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        txtgia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStt = new javax.swing.JTextField();
        btDV = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btNew = new javax.swing.JButton();

        txtMatd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMatd.setForeground(new java.awt.Color(0, 153, 153));

        txtTentd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTentd.setForeground(new java.awt.Color(0, 153, 153));

        cbDM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbDM.setForeground(new java.awt.Color(0, 153, 153));
        cbDM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn" }));

        cbDVT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbDVT.setForeground(new java.awt.Color(0, 153, 153));
        cbDVT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn" }));

        txtghichu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtghichu.setForeground(new java.awt.Color(0, 153, 153));

        btDM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDM.setForeground(new java.awt.Color(0, 153, 153));
        btDM.setText("+++");
        btDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDMActionPerformed(evt);
            }
        });

        btAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btAdd.setForeground(new java.awt.Color(0, 51, 51));
        btAdd.setText("Đồng ý");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btExit.setForeground(new java.awt.Color(0, 51, 51));
        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        txtgia.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("STT:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Mã TD:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Tên TD:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Danh Mục:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Đơn Vị:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Giá Bán:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Ghi chú:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Thêm Mới Thực Đơn");

        txtStt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtStt.setForeground(new java.awt.Color(0, 153, 153));

        btDV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDV.setForeground(new java.awt.Color(0, 153, 153));
        btDV.setText("+++");
        btDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDVActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("VNĐ");

        btNew.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btNew.setText("Làm Mới");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdd)
                        .addGap(56, 56, 56)
                        .addComponent(btExit)
                        .addGap(18, 18, 18)
                        .addComponent(btNew)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTentd)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbDM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbDVT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtgia))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btDV)))))
                                .addGap(1, 1, 1))
                            .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMatd, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtStt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(380, 380, 380))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNew)
                    .addComponent(btAdd)
                    .addComponent(btExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTentd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDM))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDV))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ProcessCtr(boolean b)
{
    this.btAdd.setEnabled(b);
    
}
    private void btDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDMActionPerformed
        
        new DanhMucTD().setVisible(true);
    }//GEN-LAST:event_btDMActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
       
        if(this.txtMatd.getText().length()==0)

        JOptionPane.showMessageDialog(null, "Mã Thực đơn  không được bỏ trống", "Thông Báo",1);

        else
        if(this.txtMatd.getText().length()>10)
        JOptionPane.showMessageDialog(null, "Mã Thực Đơn không được quá 10 ký tự ","Thông Báo",1);
        else

        if(this.txtTentd.getText().length()==0)
        JOptionPane.showMessageDialog(null,"Thực Đơn không được bỏ trống","Thông Báo",1);
        else
        if(this.txtgia.getText().length()==0)
        JOptionPane.showConfirmDialog(null, "Giá Thực Đơn không được bỏ trống","Thông Báo",1);
        else
        {
        
        AddTD.InsertTD(this.txtStt.getText(), this.txtMatd.getText().trim(),this.txtTentd.getText(),this.cbDM.getSelectedItem().toString(),this.cbDVT.getSelectedItem().toString(),this.txtgia.getText(),this.txtghichu.getText());
            
            ProcessCtr(true);
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDVActionPerformed
        new DSDonvi().setVisible(true);
    }//GEN-LAST:event_btDVActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
     
        this.txtStt.setText(null);
        this.txtMatd.setText(null);
        this.txtTentd.setText(null); 
        this.cbDM.setSelectedItem(null); 
        this.cbDVT.setSelectedItem(null); 
        this.txtgia.setText(null); 
        this.txtghichu.setText(null); 
        show();
    }//GEN-LAST:event_btNewActionPerformed

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
            java.util.logging.Logger.getLogger(ADThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADThucDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDM;
    private javax.swing.JButton btDV;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btNew;
    private javax.swing.JComboBox cbDM;
    private javax.swing.JComboBox cbDVT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtMatd;
    private javax.swing.JTextField txtStt;
    private javax.swing.JTextField txtTentd;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txtgia;
    // End of variables declaration//GEN-END:variables
}
