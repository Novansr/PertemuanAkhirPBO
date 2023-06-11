
package TugasUAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    
    private static Connection koneksi;
    public static Connection getkoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:/uaspbo";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            }
            catch (Exception e){
                System.err.println ("koneksi gagal "+e.getMessage());
            }
        }
        return koneksi;
    }
    public static void main (String args[]){
   }
}
