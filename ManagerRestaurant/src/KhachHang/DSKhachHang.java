/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachHang;

import Process.*;
import java.*;
import javax.swing.*;
import java.sql.*;
import DataConnect.*;

public class DSKhachHang extends javax.swing.JInternalFrame {

    public static String sql11="select distinct ID , TenKhach as   'Tên Khách ', LoaiKhach as 'Loại Khách', GioiTinh as 'Giới Tính', Diachi as 'Địa Chỉ', SDT  from KhachHang order by ID asc";
    public static String kh;
    public DSKhachHang() {
        initComponents();
        Show();
          ProcessCtr(true);
    }
    public void  Show()
    {
        UpdataTable.LoadData(sql11, tbKhach);
    }
public static ResultSet rs=null;
    public static PreparedStatement pst=null;
    public static String manv;
    public static Connection conn=Connect.getConnect();
  public void ProcessCtr(boolean b)
{
    this.btThem.setEnabled(b);
    this.btsua.setEnabled(b);
    this.btXoa.setEnabled(b);
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btLook = new javax.swing.JButton();
        txtLook = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhach = new javax.swing.JTable();
        lbTong = new javax.swing.JLabel();
        btHome = new javax.swing.JButton();
        btexit2 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Danh Sách Khách Hàng");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Danh Sách Thông Tin Khách Hàng");

        btThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btsua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btXoa.setText("Xoá");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btLook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btLook.setText("Tìm....");
        btLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLookActionPerformed(evt);
            }
        });

        txtLook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tbKhach.setModel(new javax.swing.table.DefaultTableModel(
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
        tbKhach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhach);

        lbTong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btHome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btHome.setText("Refresh");
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        btexit2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btexit2.setText("Thoát");
        btexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btHome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lbTong, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLook, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLook))
                            .addComponent(btexit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLook)
                            .addComponent(txtLook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btHome))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexit2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void bLook()
        {
            if(this.txtLook.getText().length()==0)
                JOptionPane.showConfirmDialog(null, "Bạn chưa nhập từ khoá cần tìm","Thông Báo",1);
                else
                {
                    String sqll="Select distinct ID , TenKhach as   'Tên Khách ', LoaiKhach as 'Loại Khách', GioiTinh as 'Giới Tính', Diachi as 'Địa Chỉ', SDT  from KhachHang where TenKhach  like N'%"+this.txtLook.getText()+"%' or LoaiKhach like N'%"+this.txtLook.getText()+"%' "  ;
                    UpdataTable.LoadData(sqll, tbKhach);
                    this.lbTong.setText("Có "+this.tbKhach.getRowCount()+" Khách Hàng");
                }
        }
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
      new AddKhachHang().show();
    }//GEN-LAST:event_btThemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
       new EditKhachHang().show();
    }//GEN-LAST:event_btsuaActionPerformed

    private void tbKhachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachMouseClicked
         ProcessCtr(true);      
        try {
            int row = this.tbKhach.getSelectedRow();
            String IDrow =(this.tbKhach.getModel().getValueAt(row, 1)).toString();
            String sql1="select distinct * from KhachHang where TenKhach=N'"+IDrow+"'";
            ResultSet rs = UpdataTable.ShowTextField(sql1);
            if(rs.next())
            {
                kh =rs.getString("TenKhach");
                   this.txtLook.setText(rs.getString("TenKhach"));                  
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbKhachMouseClicked

    private void btLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLookActionPerformed
       bLook();
    }//GEN-LAST:event_btLookActionPerformed

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        Show();
        this.txtLook.setText(null);
    }//GEN-LAST:event_btHomeActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
      if(this.txtLook.getText().length()==0)

        JOptionPane.showMessageDialog(null, "Bạn cần chọn Khách để xoá", "Thông Báo",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn đã xoá Khách  "+kh+"  ","Thông Báo",0)==0);
            AddKhach.DeleteKH(kh);
           
            Show();

        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexit2ActionPerformed
        dispose();
    }//GEN-LAST:event_btexit2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHome;
    private javax.swing.JButton btLook;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btexit2;
    private javax.swing.JButton btsua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTong;
    private javax.swing.JTable tbKhach;
    private javax.swing.JTextField txtLook;
    // End of variables declaration//GEN-END:variables
}
