
package Process;

import java.sql.*;
import javax.swing.*;
import DataConnect.*;
public class BanH {
    public static Connection conn = Connect.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs =null;
    
     public static void InsertBH(String mabh,String tenkh,String tentd, int gia,int tt,int ban)
    {
        String sql="Insert into BanHang (MaBH,TenKhach,TenTD,GiaBanTD,TongTien,IdBan) values (?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,mabh );
            pst.setString(2,tenkh);
            pst.setString(3,tentd);
            pst.setInt(4,gia);  
            pst.setInt(5, tt);
            pst.setInt(6, ban);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm món "+tentd+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Bán Hàng  "+mabh+" đã tồn tại không thể thêm ","Thông báo",1);
        }
    }
     
    public static void DeleteBH(String TKH)
    {
        String sql="Delete from BanHang where STT=N'"+TKH+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null,"Hóa đơn số  "+TKH+" đã được xóa","Thông Báo",0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Hóa đơn số "+TKH+" đang được được sử dụng không thể Huỷ","Thông Báo",0);
        }
    }
}
