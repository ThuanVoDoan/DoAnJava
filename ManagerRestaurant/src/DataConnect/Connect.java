/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataConnect;

import java.sql.*;
import javax.swing.*;
public class Connect {
    public static Connection getConnect()
    {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DOANTHUAN\\SQLEXPRESS:1432;databaseName=QLNH","ba","8888");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kết nối dữ liệu thất bại","Thông Báo",1);
            return null;
        }
    }
}
