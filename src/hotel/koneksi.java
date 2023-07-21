package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi;
    
    public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/messi", "root", "");
            
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}