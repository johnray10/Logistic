/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

/**
 *
 * @author Jayjomjohn
 */
public class Splashz {
    
     public static void main(String[] args) {
      Splash sp= new Splash();
         sp.setVisible(true);     
     try {
         
         for (int i=0; i<=100; i++) {
          Thread.sleep(40);
         // sp.per.setText(" "+i);
          sp.jProgressBar1.setValue(i);
             if (i==100) {
                 Module.Login m = new Module.Login();
                 sp.setVisible(false);
                 m.setVisible(true);
             }
         }
     } catch (Exception e) {
        
     }
      
    }
}
