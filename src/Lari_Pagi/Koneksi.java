/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lari_Pagi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author yhan4
 */
public class Koneksi {
    public static Connection konek(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection terkoneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/laripagi", "root", "");
            return terkoneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
