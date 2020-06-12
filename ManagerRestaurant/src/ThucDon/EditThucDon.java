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
public class EditThucDon extends javax.swing.JFrame {

   public static String TD;
    public static String sql="select distinct  STT , MaTD as'Mã Thực Đơn', TenTD as 'Tên Thực Đơn', TenDMTD as 'Danh Mục', TenDVTD as'Loại Thực Đơn',GiaBanTD as'Giá Bán', Ghichu as'Mô tả ' from ThucDon order by STT asc";
    
    public EditThucDon() {
        initComponents();
            String cDM ="Select * from DanhMucTD";
          UpdataTable.Loaddatacb(cDM, this.cbDM, "TenDMTD");
        String cDVT ="Select * from DonViTinh";
          UpdataTable.Loaddatacb(cDVT, this.cbDVT, "TenDVT");
          showCT();
        ProcessCtr(true);
    }
  public static ResultSet rs=null;
    public static PreparedStatement pst=null;
    public static String manv;
    public static Connection conn=Connect.getConnect();
    
     public void showCT()
    {
        UpdataTable.LoadData(sql, tbEdittd);     
       
    }
    public void ProcessCtr(boolean b)
{
    this.btEdit.setEnabled(b);
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNew = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTentd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbDM = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbDVT = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtghichu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btDM = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btEdit = new javax.swing.JButton();
        txtStt = new javax.swing.JTextField();
        btExit = new javax.swing.JButton();
        btDV = new javax.swing.JButton();
        txtgia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMatd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEdittd = new javax.swing.JTable();

        setTitle("Sửa Thực Đơn");

        btNew.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btNew.setText("Làm Mới");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Tên TD:");

        txtTentd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTentd.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Danh Mục:");

        cbDM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbDM.setForeground(new java.awt.Color(0, 153, 153));
        cbDM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Đơn Vị:");

        cbDVT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbDVT.setForeground(new java.awt.Color(0, 153, 153));
        cbDVT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Giá Bán:");

        txtghichu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtghichu.setForeground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Ghi chú:");

        btDM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDM.setForeground(new java.awt.Color(0, 153, 153));
        btDM.setText("+++");
        btDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDMActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Sửa Thực Đơn");

        btEdit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btEdit.setForeground(new java.awt.Color(0, 51, 51));
        btEdit.setText("Đồng ý");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        txtStt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtStt.setForeground(new java.awt.Color(0, 153, 153));

        btExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btExit.setForeground(new java.awt.Color(0, 51, 51));
        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btDV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDV.setForeground(new java.awt.Color(0, 153, 153));
        btDV.setText("+++");
        btDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDVActionPerformed(evt);
            }
        });

        txtgia.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("STT:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("VNĐ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Mã TD:");

        txtMatd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMatd.setForeground(new java.awt.Color(0, 153, 153));

        tbEdittd.setModel(new javax.swing.table.DefaultTableModel(
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
        tbEdittd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEdittdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEdittd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
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
                                            .addComponent(cbDM, 0, 436, Short.MAX_VALUE)
                                            .addComponent(cbDVT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtgia))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMatd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtStt, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btNew))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btEdit)
                        .addGap(56, 56, 56)
                        .addComponent(btExit)
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNew)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtStt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMatd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEdit)
                        .addComponent(btExit)
                        .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed

        this.txtStt.setText(null);
        this.txtMatd.setText(null);
        this.txtTentd.setText(null);
        this.cbDM.setSelectedItem(null);
        this.cbDVT.setSelectedItem(null);
        this.txtgia.setText(null);
        this.txtghichu.setText(null);
    }//GEN-LAST:event_btNewActionPerformed

    private void btDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDMActionPerformed

        new DanhMucTD().setVisible(true);
    }//GEN-LAST:event_btDMActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed

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

            AddTD.UpdateTD(TD,this.txtStt.getText(), this.txtMatd.getText().trim(),this.txtTentd.getText(),this.cbDM.getSelectedItem().toString(),this.cbDVT.getSelectedItem().toString(),this.txtgia.getText(),this.txtghichu.getText());

            ProcessCtr(false);
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDVActionPerformed
        new DSDonvi().setVisible(true);
    }//GEN-LAST:event_btDVActionPerformed

    private void tbEdittdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEdittdMouseClicked
       ProcessCtr(true);      
        try {
            int row = this.tbEdittd.getSelectedRow();
            String IDrow =(this.tbEdittd.getModel().getValueAt(row, 2)).toString();
            String sql1="select distinct * from ThucDon where TenTD=N'"+IDrow+"'";
            ResultSet rs = UpdataTable.ShowTextField(sql1);
            if(rs.next())
            {
                TD =rs.getString("TenTD");
                   this.txtStt.setText(rs.getString("STT"));                  
                   this.txtMatd.setText(rs.getString("MaTD"));                  
                   this.txtTentd.setText(rs.getString("TenTD"));                  
                   this.cbDM.setSelectedItem(rs.getString("TenDMTD"));                  
                   this.cbDVT.setSelectedItem(rs.getString("TenDVTD"));                  
                   this.txtgia.setText(rs.getString("GiaBanTD"));                  
                   this.txtghichu.setText(rs.getString("Ghichu")); 
                   
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbEdittdMouseClicked

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
            java.util.logging.Logger.getLogger(EditThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditThucDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditThucDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDM;
    private javax.swing.JButton btDV;
    private javax.swing.JButton btEdit;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEdittd;
    private javax.swing.JTextField txtMatd;
    private javax.swing.JTextField txtStt;
    private javax.swing.JTextField txtTentd;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txtgia;
    // End of variables declaration//GEN-END:variables
}
