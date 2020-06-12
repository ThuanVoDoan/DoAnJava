/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import DataConnect.*;
import java.sql.*;
import javax.swing.*;
public class ManagerAccout {
     public static Connection conn = Connect.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs =null;
    
    public static void InsertTK(String id, String user,String pass, String manager)
    {
        String sql="Insert into UserConnect (ID,UserName,Password,Manager) values (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,id);
            pst.setString(2,user);
            pst.setString(3,pass);
            pst.setString(4,manager);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Tài Khoản  "+user+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Tài Khoản "+id+" đã tồn tại không thể thêm ","Thông báo",1);
        }
    }
     
     public static void UpdateTK(String Ten,String pass,String use)
    {
     
         String sql = "Update UserConnect set  UserName=?,Password=?  where UserName ='"+Ten+"'";
        try {
            pst = conn.prepareStatement(sql);           
            pst.setString(1,use);
            pst.setString(2,pass);
     
            
            pst.execute();
           JOptionPane.showMessageDialog(null, "Đổi mật khẩu  thành công ","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thành công ","Thông báo",1);
        }
    }
    public static void DeleteTK(String id)
    {
        String sql="Delete from UserConnect where UserName='"+id+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null," Tài Khoản "+id+" đã được Xoá","Thông Báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Tài Khoản  "+id+" đang được được sử dụng không thể Xoá","Thông Báo",1);
        }
    }
    
    public static ResultSet cLog( String pass)
    {
        String sql = "select *from UserConnect where  Password=? ";
        try 
        {
        pst=conn.prepareStatement(sql);        
        pst.setString(1, pass);
        return rs=pst.executeQuery();
        } catch (Exception e) {
            return rs=null;
        }
    }
}
