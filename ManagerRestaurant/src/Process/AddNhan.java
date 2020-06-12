
package Process;
import java.sql.*;
import javax.swing.*;
import DataConnect.*;
public class AddNhan {
     public static Connection conn = Connect.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs =null;
     public static void InsertNV(String manv,String tennv,JTextField ngaysinh, String gioitinh, String luong,String chucvu,String diachi, String sdt,String ghichu)
    {
        String sql="Insert into NhanVien (MaNV,TenNV,NgaySinh,GioiTinh,Luong,ChucVu,Diachi,SDT,GhiChu) values (?,?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,manv );
            pst.setString(2,tennv);
            pst.setString(3,(ngaysinh).getText());
            pst.setString(4,gioitinh);
            pst.setString(5,luong);
            pst.setString(6,chucvu);           
            pst.setString(7,diachi);           
            pst.setString(8,sdt);           
            pst.setString(9,ghichu);           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Nhân Viên  "+tennv+" thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã Nhân Viên  "+manv+" đã tồn tại không thể thêm ","Thông báo",1);
        }
    }
       public static void UpdateNV(String Ten,String manv,String tennv,JTextField ngaysinh, String gioitinh, String luong,String chucvu,String diachi, String sdt,String ghichu)
    {
     
         String sql = "Update NhanVien set MaNV=?,TenNV=?,NgaySinh=?,GioiTinh=?,Luong=?,ChucVu=?,Diachi=?,SDT=?,GhiChu=? where TenNV=N'"+Ten+"'";
        try {
           pst = conn.prepareStatement(sql);
            pst.setString(1,manv );
            pst.setString(2,tennv);
            pst.setString(3,(ngaysinh).getText());
            pst.setString(4,gioitinh);
            pst.setString(5,luong);
            pst.setString(6,chucvu);           
            pst.setString(7,diachi);           
            pst.setString(8,sdt);           
            pst.setString(9,ghichu);      
            pst.execute();
           JOptionPane.showMessageDialog(null, "Nhân Viên  "+Ten+" đã sửa thành "+tennv+" thành công ","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nhân Viên "+Ten+" đã tồn tại không sửa được ","Thông báo",1);
        }
    }
    public static void DeleteNV(String TNV)
    {
        String sql="Delete from NhanVien where TenNV=N'"+TNV+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
           JOptionPane.showMessageDialog(null,"Nhân Viên  "+TNV+" đã được Xoá","Thông Báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Nhân Viên  "+TNV+" đang được được sử dụng không thể Xoá","Thông Báo",1);
        }
    }
}
