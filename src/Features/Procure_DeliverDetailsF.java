/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import Module.ServerConnection;
import Module.Warehouse;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayjomjohn
 */
public class Procure_DeliverDetailsF extends javax.swing.JFrame {

        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        
    public Procure_DeliverDetailsF() {
        initComponents();
        conn=ServerConnection.ConnecrDb();
    
        autoID();
    }
//=====================================================================================
     public void tblDeliver() {
            DefaultTableModel model = (DefaultTableModel) Warehouse.tableDeliverdetail.getModel(); 
        try{
            String sql ="SELECT * FROM Log1_procure_Deliverdetail ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            Warehouse.tableDeliverdetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }     
//=====================================================================================    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        exit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        PDOdate = new com.toedter.calendar.JDateChooser();
        PDRdate = new com.toedter.calendar.JDateChooser();
        OrderReleasedate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtitemDescrip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Deliver Details Form");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 10, 180, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 420));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 350, 10));

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Cancel_25px.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 25));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("PDO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 110, 25));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setText("PDR");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 25));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setText("Order Released");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 25));

        txtQty.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, 30));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtID.setOpaque(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, 30));
        jPanel1.add(PDOdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 200, 30));
        jPanel1.add(PDRdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 200, 30));
        jPanel1.add(OrderReleasedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 200, 30));

        jPanel3.setBackground(new java.awt.Color(34, 49, 63));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Add_File_27px.png"))); // NOI18N
        jButton1.setText("Send");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 120, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 350, 10));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Item Description");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 25));

        txtitemDescrip.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtitemDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose();
    }//GEN-LAST:event_exitMouseClicked
int xx,xy;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
          int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
           xx = evt.getX();
         xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    jButton1.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
    jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14));
    jButton1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jButton1MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
               for (double i = 0.0; i <= 1.0; i = i +0.1) {
            String  val = i + " ";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){              
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
 
        int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Add Record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(x==0){      
        try{
        String sql = "INSERT INTO Log1_procure_Deliverdetail "
            + "(ID, ItemDescription, Quantity, PDO, PDR, OrderReleased)"
            + "values(?,?,?,?,?,?)";

            pst=conn.prepareStatement(sql);  
            pst.setString(1,txtID.getText());
            pst.setString(2,txtitemDescrip.getText());
            pst.setString(3,txtQty.getText());
        
            pst.setString(4, ((JTextField)PDOdate.getDateEditor().getUiComponent()).getText());
            pst.setString(5, ((JTextField)PDRdate.getDateEditor().getUiComponent()).getText());
            pst.setString(6, ((JTextField)OrderReleasedate.getDateEditor().getUiComponent()).getText());
                          
            pst.executeUpdate();
            tblDeliver();
            this.dispose();
            
            JOptionPane.showMessageDialog(null, "Add Successfull! ");             
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//==================================================================================================
 public void autoID() {
     try {
         String sql = "SELECT ID FROM  Log1_procure_Deliverdetail  ORDER BY ID DESC";
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next())
         {
             String rnno = rs.getString("ID");
             int co = rnno.length();
             String txt = rnno.substring(0, 2);
             String num = rnno.substring(2, co);
             int n = Integer.parseInt(num);
             n++;
             String snum=Integer.toString(n);
             String ftxt=txt+snum;
             txtID.setText(ftxt);
         }else{
              txtID.setText("111");
         }
     } catch (NumberFormatException | SQLException e) {
         JOptionPane.showMessageDialog(rootPane, e);
     }
 }    
//==================================================================================================
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Procure_DeliverDetailsF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procure_DeliverDetailsF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procure_DeliverDetailsF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procure_DeliverDetailsF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procure_DeliverDetailsF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser OrderReleasedate;
    private com.toedter.calendar.JDateChooser PDOdate;
    private com.toedter.calendar.JDateChooser PDRdate;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtitemDescrip;
    // End of variables declaration//GEN-END:variables
}
