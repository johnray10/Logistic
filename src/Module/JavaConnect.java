/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jayjomjohn
 */
public class JavaConnect {
     public static Connection ConnecrDb(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlogistic1","root","");
          return conn;
          
      }
      catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null,e);
          return null;
      }
       
}
}
