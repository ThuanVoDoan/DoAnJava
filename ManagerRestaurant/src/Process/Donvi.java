/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import java.sql.*;
import javax.swing.*;
import DataConnect.*;
public class Donvi {
    public static Connection conn = Connect.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs =null;
    
    
     public static void InsertDV(String MaDV, String TenDV,String Ghi)
    {
        String sql="Insert into DonViTinh (MaDVTD,TenDVT,Ghichu) values (?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,MaDV);
            pst.setString(2,TenDV);
            pst.setString(3,Ghi);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Đơn vị "+TenDV+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Đơn vị "+MaDV+" đã tồn tại không thể thêm ","Thông báo",1);
        }
    }
     
     public static void UpdateDV(String Ten,String MaDV, String TenDV,String Ghi)
    {
     
         String sql = "Update DonViTinh set MaDVTD=?,TenDVT=?,Ghichu=? where MaDVTD='"+Ten+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,MaDV);
            pst.setString(2,TenDV);
            pst.setString(3,Ghi);
            
            pst.execute();
           JOptionPane.showMessageDialog(null, "Đơn Vị "+Ten+" đã sửa thành "+TenDV+" thành công ","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đơn Vị "+Ten+" đã tồn tại không sửa được ","Thông báo",1);
        }
    }
    public static void DeleteDV(String Madv)
    {
        String sql="Delete from DonViTinh where MaDVTD='"+Madv+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null,"Đơn Vị "+Madv+" đã được Xoá","Thông Báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Đơn Vị "+Madv+" đang được được sử dụng không thể Xoá","Thông Báo",1);
        }
    }
}
