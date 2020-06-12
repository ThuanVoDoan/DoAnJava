/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import java.sql.*;
import javax.swing.*;
import DataConnect.*;
import java.awt.*;
import java.util.*;
import net.proteanit.sql.*;
public class UpdataTable {
    public static PreparedStatement pst=null;
    public static ResultSet rs=null;
    public static Connection conn=Connect.getConnect();
    
    public static void Checkdate(JComboBox ngay,JComboBox thang,JComboBox nam)
    {
        
        for(int i =1;i<=31;i++){
           ngay.addItem(i);
        }
        for (int j = 1; j <= 12; j++) {
            thang.addItem(j);
        }
        for (int k = 1950; k <= 2015; k++) {
            nam.addItem(k);
        }
    }
    public static void LoadData (String sql, JTable tb)
    {
        try {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tb.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Thông Báo Lỗi",1);
        }
    }
    
    public static ResultSet  ShowTextField(String sql)
    {
        try {
            pst=conn.prepareStatement(sql);
            return pst.executeQuery();
            
        } catch (Exception e) {
            return null;
           // JOptionPane.showMessageDialog(null, e,"Thông Báo Lỗi",1);
        }
    }
    
    public static void Loaddatacb(String sql, JComboBox cb, String team)
{
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next())
        {
            cb.addItem(rs.getString(team));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e,"Thông Báo Lỗi",1);
    }
}
        public static void Loaddatacb1(String sql, JTextField cb, String team)
{
    try {
        PreparedStatement pst = conn.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next())
        {
            cb.setText(rs.getString(team));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e,"Thông Báo Lỗi",1);
    }
}
}
