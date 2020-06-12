
package Process;
import java.sql.*;
import javax.swing.*;
import DataConnect.*;
public class AddKhach {
     public static Connection conn = Connect.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs =null;
    
     public static void InsertKH(String id,String tenkh,String loaikhach, String gioitinh, String diachi, String sdt)
    {
        String sql="Insert into KhachHang (ID,TenKhach,LoaiKhach,GioiTinh,Diachi,SDT) values (?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,id );
            pst.setString(2,tenkh);
            pst.setString(3,loaikhach);
            pst.setString(4,gioitinh);
            pst.setString(5,diachi);
            pst.setString(6,sdt);           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Khách "+tenkh+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Khách  "+id+" đã tồn tại không thể thêm ","Thông báo",1);
        }
    }
       public static void UpdateKH(String Ten,String id,String tenkh,String loaikhach, String gioitinh, String diachi, String sdt)
    {
     
         String sql = "Update KhachHang set ID=?,TenKhach=?,LoaiKhach=?,GioiTinh=?,Diachi=?,SDT=? where ID='"+Ten+"'";
        try {
           pst = conn.prepareStatement(sql);
            pst.setString(1,id );
            pst.setString(2,tenkh);
            pst.setString(3,loaikhach);
            pst.setString(4,gioitinh);
            pst.setString(5,diachi);
            pst.setString(6,sdt);     
            pst.execute();
           JOptionPane.showMessageDialog(null, "Đã sửa thành "+tenkh+" thành công ","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Khách "+Ten+" đã tồn tại không sửa được ","Thông báo",1);
        }
    }
    public static void DeleteKH(String TKH)
    {
        String sql="Delete from KhachHang where TenKhach=N'"+TKH+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null,"Khách  "+TKH+" đã được Xoá","Thông Báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Khách  "+TKH+" đang được được sử dụng không thể Xoá","Thông Báo",1);
        }
    }
}
