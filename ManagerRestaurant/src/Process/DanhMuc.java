
package Process;

import java.sql.*;
import javax.swing.*;
import DataConnect.*;
public class DanhMuc {
    public static Connection conn = Connect.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs =null;
    
    
     public static void InsertDM(String MaDM, String TenDM,String Ghi)
    {
        String sql="Insert into DanhMucTD (MaDMTD,TenDMTD,Ghichu) values (?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,MaDM);
            pst.setString(2,TenDM);
            pst.setString(3,Ghi);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Danh Mục "+TenDM+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Danh Mục "+MaDM+" đã tồn tại không thể thêm ","Thông báo",1);
        }
    }
       public static void UpdateDM(String Ten,String MaDM, String TenDM,String Ghichu)
    {
     
         String sql = "Update DanhMucTD set MaDMTD=?,TenDMTD=?,Ghichu=? where MaDMTD='"+Ten+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,MaDM);
            pst.setString(2,TenDM);
            pst.setString(3,Ghichu);
            ;
            pst.execute();
           JOptionPane.showMessageDialog(null, "Danh Mục "+Ten+" đã sửa thành "+TenDM+" thành công ","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Danh Mục "+Ten+" đã tồn tại không sửa được ","Thông báo",1);
        }
    }
    public static void DeleteDM(String Madm)
    {
        String sql="Delete from DanhMucTD where MaDMTD='"+Madm+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null,"Danh Mục "+Madm+" đã được Xoá","Thông Báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Danh Mục "+Madm+" đang được được sử dụng không thể Xoá","Thông Báo",1);
        }
    }
}
