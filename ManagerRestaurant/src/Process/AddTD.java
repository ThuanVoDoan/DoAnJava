/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import java.sql.*;
import javax.swing.*;
import DataConnect.*;
public class AddTD 
{
    public static Connection conn = Connect.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs =null;
    
    
     public static void InsertTD(String Stt, String maTD,String tenTD,String tenDM, String tenDVT, String giaTD, String ghiChu)
    {
        String sql="Insert into ThucDon (STT,MaTD,TenTD,TenDMTD,TenDVTD,GiaBanTD,Ghichu) values (?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,Stt);
            pst.setString(2,maTD);
            pst.setString(3,tenTD);
            pst.setString(4,tenDM);
            pst.setString(5,tenDVT);
            pst.setString(6,giaTD);
            pst.setString(7,ghiChu);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Thực Đơn "+tenTD+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Thực Đơn "+maTD+" đã tồn tại không thể thêm ","Thông báo",1);
        }
    }
       public static void UpdateTD(String Ten,String Stt, String maTD,String tenTD,String tenDM, String tenDVT, String giaTD, String ghiChu)
    {
     
         String sql = "Update ThucDon set STT=?,MaTD=?,TenTD=?,TenDMTD=?,TenDVTD=?,GiaBanTD=?,Ghichu=? where MaTD='"+Ten+"'";
        try {
           pst = conn.prepareStatement(sql);
            pst.setString(1,Stt);
            pst.setString(2,maTD);
            pst.setString(3,tenTD);
            pst.setString(4,tenDM);
            pst.setString(5,tenDVT);
            pst.setString(6,giaTD);
            pst.setString(7,ghiChu);
            pst.execute();
           JOptionPane.showMessageDialog(null, "Thực Đơn "+Ten+" đã sửa thành "+tenTD+" thành công ","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thực Đơn "+Ten+" đã tồn tại không sửa được ","Thông báo",1);
        }
    }
    public static void DeleteTD(String TenTD)
    {
        String sql="Delete from ThucDon where TenTD='"+TenTD+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null,"Thực Đơn "+TenTD+" sẽ được Xoá","Thông Báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Thực Đơn "+TenTD+" đang được được sử dụng không thể Xoá","Thông Báo",1);
        }
    }
}
