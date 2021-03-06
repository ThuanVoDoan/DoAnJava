/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DataConnect.Connect;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Shark
 */
public class XuatDS extends javax.swing.JInternalFrame {

    /**
     * Creates new form XuatDS
     */
    public XuatDS() {
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

        btnhanvien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btkhachhang = new javax.swing.JButton();
        btthucdon = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Xuất Thông Tin");

        btnhanvien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnhanvien.setText("Xuất Danh Sách Nhân Viên");
        btnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhanvienActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Xuất Thông Tin");

        btkhachhang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btkhachhang.setText("Xuất Danh Sách Khách Hàng");
        btkhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhachhangActionPerformed(evt);
            }
        });

        btthucdon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btthucdon.setText("Xuất Danh Sách Thực Đơn");
        btthucdon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthucdonActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Thoát");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btthucdon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btthucdon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btthucdonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthucdonActionPerformed
          try {
            String report = "E:\\Study\\ManagerRestaurant\\src\\XuatDS\\XuatTD.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            Connection conn = new Connect().getConnect();
            JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
            JasperViewer.viewReport(jp);
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Notice", JOptionPane.OK_OPTION); 
        } 
          dispose();
    }//GEN-LAST:event_btthucdonActionPerformed

    private void btnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhanvienActionPerformed
       try {
            String report = "E:\\Study\\ManagerRestaurant\\src\\XuatDS\\XuatNV.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            Connection conn = new Connect().getConnect();
            JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
            JasperViewer.viewReport(jp);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Notice", JOptionPane.OK_OPTION); 
        } 
         dispose();
    }//GEN-LAST:event_btnhanvienActionPerformed

    private void btkhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhachhangActionPerformed
       try {
            String report = "E:\\Study\\ManagerRestaurant\\src\\XuatDS\\XuatKH.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            Connection conn = new Connect().getConnect();
            JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
            JasperViewer.viewReport(jp);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Notice", JOptionPane.OK_OPTION); 
        } 
         dispose();
    }//GEN-LAST:event_btkhachhangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btkhachhang;
    private javax.swing.JButton btnhanvien;
    private javax.swing.JButton btthucdon;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
