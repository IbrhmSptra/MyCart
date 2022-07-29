/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Ibrahim Saputra
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseMyCart {
    Connection cn;
    public static Connection bukakoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_mycart","root","");
            return cn;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database Tidak Ditemukan!!","Warning",JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }
}
