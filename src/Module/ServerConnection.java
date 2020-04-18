/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jayjomjohn
 */
public class ServerConnection {
      public static Connection ConnecrDb() {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=SIS";
        String user2 = "sa";
        String pass = "admin123"; 
        
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,user2,pass);
            System.out.println("You Are Connected to SQLServer 2014");
            return conn;   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
}
    } 
}
