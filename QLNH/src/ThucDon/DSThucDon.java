/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucDon;

import DataConnect.Connect;
import static DataConnect.Connect.getConnect;
import Process.*;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author Shark
 */
public class DSThucDon extends javax.swing.JInternalFrame {

     public static String sql="select distinct  STT , MaTD as'Mã Thực Đơn', TenTD as 'Tên Thực Đơn', TenDMTD as 'Danh Mục', TenDVTD as'Loại Thực Đơn',GiaBanTD as'Giá Bán', Ghichu as'Mô tả ' from ThucDon order by STT asc";
      public static String sql11="select distinct TenDMTD as 'Tên DM'  from DanhMucTD order by TenDMTD asc";
     public static int DSTD;
    public static String madm;
    public DSThucDon() {
        initComponents();
        showCT();
        ProcessCtr(true);
    }
       public void showCT()
    {
        UpdataTable.LoadData(sql, tbTD);
         UpdataTable.LoadData(sql11, tbdmm);
        this.lbTong.setText("Trong Danh Sách  có "+this.tbTD.getRowCount( )+" Thực Đơn");
    }
public void ProcessCtr(boolean b)
{
    this.btAdd.setEnabled(b);
    this.btEdit.setEnabled(b);
    this.btDelete.setEnabled(b);
}
   public void bLook()
        {
            if(this.txtLook.getText().length()==0)
                JOptionPane.showConfirmDialog(null, "Bạn chưa nhập từ khoá cần tìm","Thông Báo",1);
                else
                {
                    String sql1="Select distinct STT , MaTD as'Mã Thực Đơn', TenTD as 'Tên Thực Đơn', TenDMTD as 'Danh Mục', TenDVTD as'Loại Thực Đơn',GiaBanTD as'Giá Bán', Ghichu as'Mô tả '  from ThucDon where  TenTD like N'%"+this.txtLook.getText()+"%' or TenDMTD like N'%"+this.txtLook.getText()+"%' or GiaBanTD like '%"+this.txtLook.getText()+"%' ";
                    UpdataTable.LoadData(sql1, tbTD);
                    this.lbTong.setText("Có "+this.tbTD.getRowCount()+" thực đơn");
                }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTD = new javax.swing.JTable();
        btEdit = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btlook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdmm = new javax.swing.JTable();
        txtLook = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbTong = new javax.swing.JLabel();
        btexit = new javax.swing.JButton();
        btlammoi1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Danh Sách Thực Đơn");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Danh Sách Thực Đơn");

        tbTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTD);

        btEdit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Actions-dialog-close-icon-24.png"))); // NOI18N
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btlook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btlook.setText("Tìm Kiếm");
        btlook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlookActionPerformed(evt);
            }
        });

        tbdmm.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbdmm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbdmm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdmmMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdmm);

        txtLook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Danh Mục");

        lbTong.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbTong.setText("Trong Danh Sách");

        btexit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btexit.setText("Thoát");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        btlammoi1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btlammoi1.setText("Refresh");
        btlammoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlammoi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320)
                                .addComponent(lbTong))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btlammoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(btAdd)
                        .addGap(33, 33, 33)
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(txtLook, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btlook))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(299, 299, 299))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btlook)
                                .addComponent(btAdd)
                                .addComponent(txtLook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btlammoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbTong))))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
      new ADThucDon().show();
    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
       new EditThucDon().show();
    }//GEN-LAST:event_btEditActionPerformed

    private void tbTDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTDMouseClicked
        ProcessCtr(true);      
        try {
            int row = this.tbTD.getSelectedRow();
            String IDrow =(this.tbTD.getModel().getValueAt(row, 0)).toString().trim();
            int a = Integer.parseInt(IDrow);
            String sql1="select  * from ThucDon where STT='"+a+"'";
            ResultSet rs = UpdataTable.ShowTextField(sql1);
            if(rs.next())
            {
                DSTD =rs.getInt("STT");
                this.txtLook.setText(rs.getString("TenTD"));                  
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbTDMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
       if(this.txtLook.getText().length()==0)

        JOptionPane.showMessageDialog(null, "Bạn cần chọn Món để xoá", "Thông Báo",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn muốn xoá Món "+DSTD+"  ","Thông Báo",2)==0);
            AddTD.DeleteTD(DSTD);
            showCT();
           

        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
      dispose();
    }//GEN-LAST:event_btexitActionPerformed

    private void btlookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlookActionPerformed
       bLook();
    }//GEN-LAST:event_btlookActionPerformed

    private void tbdmmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdmmMouseClicked
           ProcessCtr(true);
            try {
            int row = this.tbdmm.getSelectedRow();
            String IDrow =(this.tbdmm.getModel().getValueAt(row, 0)).toString();
            String sql1="select distinct * from DanhMucTD where TenDMTD=N'"+IDrow+"'";
            ResultSet rs = UpdataTable.ShowTextField(sql1);
            if(rs.next())
            {
               madm =rs.getString("TenDMTD");                
                this.txtLook.setText(rs.getString("TenDMTD"));              
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
      
    }//GEN-LAST:event_tbdmmMouseClicked

    private void btlammoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlammoi1ActionPerformed
       showCT();
       this.txtLook.setText(null);
    }//GEN-LAST:event_btlammoi1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btlammoi1;
    private javax.swing.JButton btlook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTong;
    private javax.swing.JTable tbTD;
    private javax.swing.JTable tbdmm;
    private javax.swing.JTextField txtLook;
    // End of variables declaration//GEN-END:variables
}
