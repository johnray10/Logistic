/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import static Module.PM.jTable2;
import Module.ServerConnection;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeWindow;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jayjomjohn
 */
public class PM_RequestMaterials extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public PM_RequestMaterials() {
        initComponents();
        conn=ServerConnection.ConnecrDb();
        
        autoID() ;
        materials();
    }
//==================================================================================================
 public final void materials() {
        try{
            String sql = "SELECT * FROM Log1_Requestmaterials";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){        
        }
}            
//==================================================================================================
 public final void Requestmaterials() {
        try{
            String sql = "SELECT * FROM Log1_Requestmaterials";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
          Module.Warehouse.jTable3_Materials.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){        
        }
}            
//================================================================================================== 
  public final void Requestmaterialrecords() {
        try{
            String sql = "SELECT * FROM Log1_Requestmaterials";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
           Module.Warehouse.jTable2.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));

        }
        catch(SQLException e){        
        }
}            
//================================================================================================== 
 
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox<>();
        ma1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ma2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Purpose = new javax.swing.JTextArea();
        ma3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(940, 550));
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

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 550));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Request Materials");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 240, 30));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel22.setText("Category");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 30));

        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Computer", "Electric parts", "Hardware", "others", " " }));
        jPanel1.add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 250, 30));

        ma1.setEditable(false);
        ma1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ma1.setText(" ");
        ma1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RequestID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        ma1.setOpaque(false);
        jPanel1.add(ma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 370, 50));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Cancel_25px.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 40, 31));

        ma2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ma2.setText(" ");
        ma2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        jPanel1.add(ma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 360, 50));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel25.setText("Date Needed");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 80, 30));

        jDateChooser1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 280, 40));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setText("Purpose");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, 30));

        Purpose.setColumns(20);
        Purpose.setRows(5);
        jScrollPane1.setViewportView(Purpose);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 280, 60));

        ma3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ma3.setText(" ");
        ma3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        ma3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ma3KeyTyped(evt);
            }
        });
        jPanel1.add(ma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 360, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 880, 10));

        jPanel3.setBackground(new java.awt.Color(58, 83, 155));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Send_File_27px.png"))); // NOI18N
        jButton1.setText("Send To Warehouse");
        jButton1.setBorderPainted(false);
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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 240, 60));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 880, 10));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Status");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 60, 20));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Pending", "Approved" }));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 280, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 480, 350));

        jPanel4.setBackground(new java.awt.Color(150, 40, 27));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Delete_File_27px.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 170, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 190, 60));

        jPanel5.setBackground(new java.awt.Color(30, 130, 76));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Edit_File_27px.png"))); // NOI18N
        jButton3.setText("Edit");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 170, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 190, 60));

        jPanel6.setBackground(new java.awt.Color(149, 165, 166));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Erase_25px.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 190, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 210, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
         int x = JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Exit?","System message!",JOptionPane.YES_NO_OPTION);
    if (x==0) {    
      this.dispose();
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
      jButton1.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
      jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
      jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12));
      jButton1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jButton1MouseExited
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

        if(Category.getSelectedItem()=="-SELECT-" ||Category.getSelectedItem().equals("-SELECT-")
                ||ma2.getText().isEmpty()
                ||ma3.getText().isEmpty()
                ||((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()
                ||Purpose.getText().isEmpty()
                ||status.getSelectedItem()=="-SELECT-"||status.getSelectedItem().equals("-SELECT-")){
              JOptionPane.showMessageDialog(null,"This field cannot be empty!","ERROR!",JOptionPane.ERROR_MESSAGE);
        }else{
        
        int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Add Record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(x==0){  
        try {
            String sql = "INSERT INTO Log1_requestmaterials "
            + "(RequestID, category, Subcategory, quantity, dateneeded, purpose, status)"
            + "VALUES (?,?,?,?,?,?,?)";

            pst=conn.prepareStatement(sql);
            pst.setString(1,ma1.getText());
            pst.setString(2,Category.getSelectedItem().toString());
            pst.setString(3,ma2.getText());
            pst.setString(4,ma3.getText());
            pst.setString(5,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            pst.setString(6,Purpose.getText());
            pst.setString(7, status.getSelectedItem().toString());      
            pst.executeUpdate();  
            Requestmaterials();
            materials();
            Requestmaterialrecords();
            
            JOptionPane.showMessageDialog(null, "Submit Successfull! ");  
              
            NoticeWindow noticeWindow = new NoticeWindow("New Item From Request Materials To Warehouse", NPosition.TOP_LEFT);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
      jButton3.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
      jButton3.setForeground(Color.white);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12));
       jButton3.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
       jButton2.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
       jButton2.setForeground(Color.white);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
       jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12));
       jButton2.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Update Record?","Update",JOptionPane.YES_NO_OPTION);     
  if(x==0){
        if(!jTable1.getSelectionModel().isSelectionEmpty()){
      try { 
       int row =jTable1.getSelectedRow();
        String value = (jTable1.getModel().getValueAt(row, 0).toString());
        String sql ="UPDATE Log1_requestmaterials SET requestid=?, "
                + "category=?, "
                + "subcategory=?, "
                + "quantity=?,"
                + "dateneeded=?, "
                + "purpose=?, status=? where requestid="+value;
          pst=conn.prepareStatement(sql);
           
            pst.setString(1,ma1.getText());
            pst.setString(2,Category.getSelectedItem().toString());
            pst.setString(3,ma2.getText());
            pst.setString(4,ma3.getText());
            pst.setString(5,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            pst.setString(6,Purpose.getText());
            pst.setString(7, status.getSelectedItem().toString());                
            pst.executeUpdate(); 
          
            materials();
            Requestmaterialrecords();
         
       
            JOptionPane.showMessageDialog(null, "Updated! Successfull!");
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
  }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try{
            int row = jTable1.getSelectedRow();
            String Tableclick=(jTable1.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM Log1_requestmaterials WHERE requestid='"+Tableclick+"' ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()) { 
            ma1.setText(rs.getString("RequestID"));
            Category.setSelectedItem(rs.getString("category"));
            ma2.setText(rs.getString("Subcategory"));
            ma3.setText(rs.getString("Quantity"));
            ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(rs.getString("Dateneeded"));
            Purpose.setText(rs.getString("Purpose"));
            status.setSelectedItem(rs.getString("Status"));
            }
            
        }catch(Exception e) {            
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int p = JOptionPane.showConfirmDialog(null,"Do You Really Want To Delete?","DELETE",JOptionPane.YES_NO_OPTION);
    if(p==0){
    
        try{
            int row =jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            String sql ="DELETE FROM Log1_requestmaterials WHERE requestid="+value;
            pst=conn.prepareStatement(sql);         
            pst.executeUpdate();
            materials();
            Requestmaterialrecords();
            JOptionPane.showMessageDialog(null,"Entry Successfully Deleted","Deleted", 3);
        
            }catch(SQLException e){
                   JOptionPane.showMessageDialog(this, e);   
        }        
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Category.setSelectedIndex(0);
    ma2.setText("");
    ma3.setText("");
    ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
    Purpose.setText("");
    status.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ma3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ma3KeyTyped
       if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
       }
    }//GEN-LAST:event_ma3KeyTyped
//==================================================================================================
public void autoID() {
     try {
         String sql = "SELECT RequestID FROM Log1_requestmaterials ORDER BY requestid DESC";
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next())
         {
             String rnno = rs.getString("RequestID");
             int co = rnno.length();
             String txt = rnno.substring(0, 2);
             String num = rnno.substring(2, co);
             int n = Integer.parseInt(num);
             n++;
             String snum=Integer.toString(n);
             String ftxt=txt+snum;
             ma1.setText(ftxt);
         }else{
             ma1.setText("100");
         }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(PM_RequestMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PM_RequestMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PM_RequestMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PM_RequestMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PM_RequestMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextArea Purpose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static final javax.swing.JTable jTable1 = new javax.swing.JTable();
    private javax.swing.JTextField ma1;
    private javax.swing.JTextField ma2;
    private javax.swing.JTextField ma3;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
