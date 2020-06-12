/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.sql.*;
import javax.swing.*;
import DataConnect.*;
public class CheckLog {
    public static Connection conn=null;
    public static ResultSet rs=null;
    public static PreparedStatement pst=null;
    public static String testConnect()
    {
        try {
            conn=Connect.getConnect();
            return "Kết nối Database thành công";
        } catch (Exception e) {
            return "Kết nối Database thất bại";
        }
    }
    public static ResultSet cLog(String user, String pass)
    {
        String sql = "select *from UserConnect where UserName=? and Password=? ";
        try 
        {
        pst=conn.prepareStatement(sql);
        pst.setString(1, user);
        pst.setString(2, pass);
        
        return rs=pst.executeQuery();
        } catch (Exception e) {
            return rs=null;
        }
        
       
        
        
    }
}
