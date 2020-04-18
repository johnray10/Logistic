/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

import static Features.Asset_DisposedList.DisposeTbl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jayjomjohn
 */
public class Asset extends javax.swing.JPanel {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
     
      
    public Asset() {
        initComponents();
       conn=ServerConnection.ConnecrDb();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
        
       jTable_Assets.setShowGrid(true);
       jTable_Assets.setGridColor(Color.DARK_GRAY);
       jTable_Assets.setSelectionBackground(Color.lightGray);      
       JTableHeader th = jTable_Assets.getTableHeader();
       th.setForeground(Color.BLACK);
       th.setFont(new Font("Century Gothic", Font.BOLD, 14));
       
        Assettable();
        Requestform() ;
        tblware() ;
        Assettbl();
        assetrequests();
        assettable4();
    }
   private void dis_tbl() {
        
      try{
          String sql= "select * from RequestForm where Status = 'Dispose'";
          pst = conn.prepareStatement(sql);
          rs = pst.executeQuery();
          DisposeTbl.setModel(DbUtils.resultSetToTableModel(rs));
                   
      }
      catch(Exception e){          
      }
    }     
//==================================================================================================    
     private void main_tble() {
        try{
               String sql= "Select * from log1_AssetRepair where Status = 'Repair'";
               pst=conn.prepareStatement(sql);
               rs=pst.executeQuery();
               Features.Asset_RepairList.RepairTbl.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        }
    }       
//==================================================================================================
    public void Assettable() {
        DefaultTableModel model = (DefaultTableModel) jTable_Assets.getModel(); 
        try{       
            String sql ="SELECT * FROM Log1_Assetlist";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable_Assets.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            jTable_Assets.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);                                                                                                          
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
     }finally{
                        try{
                             rs.close();
                             pst.close();
                            }catch(Exception e){            
                          }
                    }
    } 
//==================================================================================================
  public void Requestform() {
        DefaultTableModel model = (DefaultTableModel) Module.Asset.jTable3_Requestform.getModel(); 
        try{
            String sql ="SELECT * FROM Log1_ware_Requestform ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           jTable3_Requestform.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
  }   
//==================================================================================================
    public void Assettbl() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel(); 
        try{       
            String sql ="SELECT * FROM Log1_Assetlist";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable2.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
     }    finally{
                        try{
                             rs.close();
                             pst.close();
                            }catch(Exception e){            
                          }
                    }
    } 
//==================================================================================================
   public void assetrequests() {
        DefaultTableModel model = (DefaultTableModel) Module.Asset.jTable3.getModel(); 
        try{
            String sql ="SELECT * FROM Log1_AssetRequests";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           jTable3.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
  }        
//==================================================================================================
 public void assettable4() {
        DefaultTableModel model = (DefaultTableModel) Module.Asset.jTable4.getModel(); 
        try{
            String sql ="SELECT * FROM Log1_Assetlist";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           jTable4.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
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

        SidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTN1 = new javax.swing.JPanel();
        PN1 = new javax.swing.JPanel();
        jLabel2_assetlist = new javax.swing.JLabel();
        BTN2 = new javax.swing.JPanel();
        PN2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BTN3 = new javax.swing.JPanel();
        PN3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BTN4 = new javax.swing.JPanel();
        PN4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_notif = new javax.swing.JLabel();
        BTN5 = new javax.swing.JPanel();
        PN5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        AssetList = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Button1 = new javax.swing.JPanel();
        RequestAsset = new javax.swing.JButton();
        Button2 = new javax.swing.JPanel();
        Print = new javax.swing.JButton();
        Button3 = new javax.swing.JPanel();
        Manage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Button4 = new javax.swing.JPanel();
        Add_asset = new javax.swing.JButton();
        Find = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Maintenance = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        PanelBack = new javax.swing.JPanel();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        f4_owner = new javax.swing.JTextField();
        f5_subcat = new javax.swing.JTextField();
        f6 = new javax.swing.JTextField();
        f7 = new javax.swing.JTextField();
        f8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        branches = new javax.swing.JComboBox<>();
        category = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        PanelBTN1 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Repair = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        Dispose = new javax.swing.JButton();
        AssetValuation = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtsource = new javax.swing.JTextField();
        txtassetid = new javax.swing.JTextField();
        txtpn = new javax.swing.JTextField();
        txtsn = new javax.swing.JTextField();
        txtbranches = new javax.swing.JTextField();
        txtdept = new javax.swing.JTextField();
        txtowner = new javax.swing.JTextField();
        txtcategory = new javax.swing.JTextField();
        txtsubcat = new javax.swing.JTextField();
        txtcost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtbrand = new javax.swing.JTextField();
        txtservice = new javax.swing.JTextField();
        txtservdate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtdecrip = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Panelbody = new javax.swing.JPanel();
        Pstraight = new javax.swing.JPanel();
        txt_useful = new javax.swing.JTextField();
        txt_Cost = new javax.swing.JTextField();
        txt_salvage = new javax.swing.JTextField();
        txt_AD = new javax.swing.JTextField();
        txt_Depvalue = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        Pdouble = new javax.swing.JPanel();
        Units = new javax.swing.JPanel();
        r1 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();
        r3 = new javax.swing.JTextField();
        r4 = new javax.swing.JTextField();
        TD = new javax.swing.JTextField();
        total1 = new javax.swing.JTextField();
        total2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        Sum = new javax.swing.JPanel();
        Receiveitem = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jLabel18 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1330, 580));
        setMinimumSize(new java.awt.Dimension(1330, 580));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1330, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        SidePanel.setMaximumSize(new java.awt.Dimension(250, 510));
        SidePanel.setMinimumSize(new java.awt.Dimension(250, 510));
        SidePanel.setOpaque(false);
        SidePanel.setPreferredSize(new java.awt.Dimension(250, 510));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Person_Female_100px.png"))); // NOI18N
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 13, 130, -1));

        BTN1.setBackground(new java.awt.Color(58, 83, 155));
        BTN1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        BTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout PN1Layout = new javax.swing.GroupLayout(PN1);
        PN1.setLayout(PN1Layout);
        PN1Layout.setHorizontalGroup(
            PN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        PN1Layout.setVerticalGroup(
            PN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jLabel2_assetlist.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2_assetlist.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2_assetlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Search_Property_30px.png"))); // NOI18N
        jLabel2_assetlist.setText("Asset List");
        jLabel2_assetlist.setToolTipText("");

        javax.swing.GroupLayout BTN1Layout = new javax.swing.GroupLayout(BTN1);
        BTN1.setLayout(BTN1Layout);
        BTN1Layout.setHorizontalGroup(
            BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN1Layout.createSequentialGroup()
                .addComponent(PN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 211, Short.MAX_VALUE))
            .addGroup(BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTN1Layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jLabel2_assetlist, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        BTN1Layout.setVerticalGroup(
            BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2_assetlist, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        SidePanel.add(BTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 70));

        BTN2.setBackground(new java.awt.Color(34, 49, 63));
        BTN2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        BTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN2MousePressed(evt);
            }
        });

        PN2.setOpaque(false);

        javax.swing.GroupLayout PN2Layout = new javax.swing.GroupLayout(PN2);
        PN2.setLayout(PN2Layout);
        PN2Layout.setHorizontalGroup(
            PN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        PN2Layout.setVerticalGroup(
            PN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Maintenance_30px.png"))); // NOI18N
        jLabel3.setText("Maintenance");

        javax.swing.GroupLayout BTN2Layout = new javax.swing.GroupLayout(BTN2);
        BTN2.setLayout(BTN2Layout);
        BTN2Layout.setHorizontalGroup(
            BTN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN2Layout.createSequentialGroup()
                .addComponent(PN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 211, Short.MAX_VALUE))
            .addGroup(BTN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        BTN2Layout.setVerticalGroup(
            BTN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BTN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        SidePanel.add(BTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 70));

        BTN3.setBackground(new java.awt.Color(34, 49, 63));
        BTN3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        BTN3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN3MousePressed(evt);
            }
        });

        PN3.setOpaque(false);

        javax.swing.GroupLayout PN3Layout = new javax.swing.GroupLayout(PN3);
        PN3.setLayout(PN3Layout);
        PN3Layout.setHorizontalGroup(
            PN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        PN3Layout.setVerticalGroup(
            PN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Coins_35px.png"))); // NOI18N
        jLabel4.setText("Asset Valuation");

        javax.swing.GroupLayout BTN3Layout = new javax.swing.GroupLayout(BTN3);
        BTN3.setLayout(BTN3Layout);
        BTN3Layout.setHorizontalGroup(
            BTN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN3Layout.createSequentialGroup()
                .addComponent(PN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(BTN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN3Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        BTN3Layout.setVerticalGroup(
            BTN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BTN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        SidePanel.add(BTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 230, 70));

        BTN4.setBackground(new java.awt.Color(34, 49, 63));
        BTN4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        BTN4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN4MousePressed(evt);
            }
        });

        PN4.setOpaque(false);

        javax.swing.GroupLayout PN4Layout = new javax.swing.GroupLayout(PN4);
        PN4.setLayout(PN4Layout);
        PN4Layout.setHorizontalGroup(
            PN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        PN4Layout.setVerticalGroup(
            PN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Data_Transfer_27px.png"))); // NOI18N
        jLabel5.setText("Receiving Item");

        lbl_notif.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_notif.setForeground(new java.awt.Color(204, 204, 204));
        lbl_notif.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_notif.setText("---");
        lbl_notif.setToolTipText("Notif");

        javax.swing.GroupLayout BTN4Layout = new javax.swing.GroupLayout(BTN4);
        BTN4.setLayout(BTN4Layout);
        BTN4Layout.setHorizontalGroup(
            BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN4Layout.createSequentialGroup()
                .addComponent(PN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN4Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
            .addGroup(BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTN4Layout.createSequentialGroup()
                    .addContainerGap(189, Short.MAX_VALUE)
                    .addComponent(lbl_notif, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        BTN4Layout.setVerticalGroup(
            BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_notif, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        SidePanel.add(BTN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 230, 70));

        BTN5.setBackground(new java.awt.Color(34, 49, 63));
        BTN5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        BTN5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN5MousePressed(evt);
            }
        });

        PN5.setOpaque(false);

        javax.swing.GroupLayout PN5Layout = new javax.swing.GroupLayout(PN5);
        PN5.setLayout(PN5Layout);
        PN5Layout.setHorizontalGroup(
            PN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        PN5Layout.setVerticalGroup(
            PN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Data_Transfer_27px.png"))); // NOI18N
        jLabel6.setText("Delivered Item");

        javax.swing.GroupLayout BTN5Layout = new javax.swing.GroupLayout(BTN5);
        BTN5.setLayout(BTN5Layout);
        BTN5Layout.setHorizontalGroup(
            BTN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN5Layout.createSequentialGroup()
                .addComponent(PN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(BTN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTN5Layout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        BTN5Layout.setVerticalGroup(
            BTN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BTN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        SidePanel.add(BTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 230, 70));

        add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 540));

        PanelBody.setMaximumSize(new java.awt.Dimension(1040, 560));
        PanelBody.setMinimumSize(new java.awt.Dimension(1040, 560));
        PanelBody.setOpaque(false);
        PanelBody.setLayout(new java.awt.CardLayout());

        AssetList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Asset List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        AssetList.setOpaque(false);
        AssetList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AssetList.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1000, 10));

        Button1.setBackground(new java.awt.Color(31, 58, 147));

        RequestAsset.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        RequestAsset.setForeground(new java.awt.Color(204, 204, 204));
        RequestAsset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Form_27px.png"))); // NOI18N
        RequestAsset.setText("Request Asset");
        RequestAsset.setContentAreaFilled(false);
        RequestAsset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RequestAsset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RequestAssetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RequestAssetMouseExited(evt);
            }
        });
        RequestAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestAssetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button1Layout = new javax.swing.GroupLayout(Button1);
        Button1.setLayout(Button1Layout);
        Button1Layout.setHorizontalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(RequestAsset)
                .addContainerGap())
        );
        Button1Layout.setVerticalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RequestAsset, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        AssetList.add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 170, 40));

        Button2.setBackground(new java.awt.Color(31, 58, 147));

        Print.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Print.setForeground(new java.awt.Color(204, 204, 204));
        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Printer_27px.png"))); // NOI18N
        Print.setText("Print");
        Print.setContentAreaFilled(false);
        Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintMouseExited(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button2Layout = new javax.swing.GroupLayout(Button2);
        Button2.setLayout(Button2Layout);
        Button2Layout.setHorizontalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Button2Layout.setVerticalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        AssetList.add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 120, 40));

        Button3.setBackground(new java.awt.Color(31, 58, 147));

        Manage.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Manage.setForeground(new java.awt.Color(204, 204, 204));
        Manage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Edit_Property_27px.png"))); // NOI18N
        Manage.setText("Manage");
        Manage.setContentAreaFilled(false);
        Manage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Manage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageMouseExited(evt);
            }
        });
        Manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button3Layout = new javax.swing.GroupLayout(Button3);
        Button3.setLayout(Button3Layout);
        Button3Layout.setHorizontalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manage, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        Button3Layout.setVerticalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manage, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        AssetList.add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 30, 140, 40));

        jTable_Assets.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable_Assets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Asset_ID", "PN", "SN", "Branches", "Department", "Owner", "Category", "Sub_Category", "Cost", "Brand", "Service_Life", "Source", "Service_date", "Description"
            }
        ));
        jTable_Assets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable_Assets);

        AssetList.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1000, 420));

        Button4.setBackground(new java.awt.Color(31, 58, 147));

        Add_asset.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Add_asset.setForeground(new java.awt.Color(204, 204, 204));
        Add_asset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Add_Property_27px.png"))); // NOI18N
        Add_asset.setText("Add Asset");
        Add_asset.setContentAreaFilled(false);
        Add_asset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_asset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_assetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_assetMouseExited(evt);
            }
        });
        Add_asset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_assetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button4Layout = new javax.swing.GroupLayout(Button4);
        Button4.setLayout(Button4Layout);
        Button4Layout.setHorizontalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add_asset, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        Button4Layout.setVerticalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add_asset, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        AssetList.add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 150, 40));

        Find.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Find.setForeground(new java.awt.Color(255, 255, 255));
        Find.setToolTipText("Search");
        Find.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Find.setOpaque(false);
        Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FindKeyReleased(evt);
            }
        });
        AssetList.add(Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Search_28px.png"))); // NOI18N
        AssetList.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 30, 40));

        PanelBody.add(AssetList, "card2");

        Maintenance.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Maintenance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        Maintenance.setOpaque(false);
        Maintenance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Asset List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable4);

        jPanel2.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 27, 970, 240));

        Maintenance.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1010, 280));

        PanelBack.setBackground(new java.awt.Color(255, 255, 255));
        PanelBack.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        PanelBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asset ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        f2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, -1));

        f3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, -1));

        f4_owner.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f4_owner.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Owner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f4_owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, -1));

        f5_subcat.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f5_subcat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f5_subcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, -1));

        f6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Brand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 200, -1));

        f7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Service Life", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, -1));

        f8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        f8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Technician", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        PanelBack.add(f8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 200, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Service Date");
        PanelBack.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 90, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Description");
        PanelBack.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 70, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Department");
        PanelBack.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 80, 20));

        branches.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        branches.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose here", " ", "Main", "Bulacan", "MV" }));
        branches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBack.add(branches, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 140, 30));

        category.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose here:", " ", "Computer", "Furniture", "Stationary", "Electronics", "Others", " ", " " }));
        category.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBack.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 140, 30));

        department.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose here", " ", "Office of the President", "Office of the Vice President", "Faculty Department", "Admin Department", "Registrar", "Cashier", "I.T Department", " ", " " }));
        department.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBack.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 140, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Branches");
        PanelBack.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 14, 60, 20));

        description.setColumns(20);
        description.setRows(5);
        jScrollPane3.setViewportView(description);

        PanelBack.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 230, 50));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Category");
        PanelBack.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 80, 20));

        status.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose here", "Repair", "Dispose", " " }));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBack.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 140, 30));
        PanelBack.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 210, 30));

        PanelBTN1.setBackground(new java.awt.Color(34, 49, 63));
        PanelBTN1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        PanelBTN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Save.setForeground(new java.awt.Color(204, 204, 204));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Add_File_27px.png"))); // NOI18N
        Save.setText("Save");
        Save.setContentAreaFilled(false);
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        PanelBTN1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 2, 220, 30));

        PanelBack.add(PanelBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 250, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Status");
        PanelBack.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 80, 30));

        jPanel1.setBackground(new java.awt.Color(34, 49, 63));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Repair.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Repair.setForeground(new java.awt.Color(204, 204, 204));
        Repair.setText("Repair");
        Repair.setBorderPainted(false);
        Repair.setContentAreaFilled(false);
        Repair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Repair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairActionPerformed(evt);
            }
        });
        jPanel1.add(Repair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        PanelBack.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 120, 50));

        jPanel12.setBackground(new java.awt.Color(34, 49, 63));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dispose.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Dispose.setForeground(new java.awt.Color(204, 204, 204));
        Dispose.setText("Dispose");
        Dispose.setBorderPainted(false);
        Dispose.setContentAreaFilled(false);
        Dispose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dispose.setFocusPainted(false);
        Dispose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisposeActionPerformed(evt);
            }
        });
        jPanel12.add(Dispose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        PanelBack.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 120, 50));

        Maintenance.add(PanelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1000, 210));

        PanelBody.add(Maintenance, "card3");

        AssetValuation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Asset Valuation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        AssetValuation.setOpaque(false);
        AssetValuation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 275, 490, 210));

        txtsource.setEditable(false);
        txtsource.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtsource.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Source", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtsource.setOpaque(false);
        jPanel3.add(txtsource, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 170, 40));

        txtassetid.setEditable(false);
        txtassetid.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtassetid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asset ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtassetid.setOpaque(false);
        jPanel3.add(txtassetid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        txtpn.setEditable(false);
        txtpn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtpn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtpn.setOpaque(false);
        jPanel3.add(txtpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 150, 40));

        txtsn.setEditable(false);
        txtsn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtsn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtsn.setOpaque(false);
        jPanel3.add(txtsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 40));

        txtbranches.setEditable(false);
        txtbranches.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtbranches.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branches", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtbranches.setOpaque(false);
        jPanel3.add(txtbranches, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 40));

        txtdept.setEditable(false);
        txtdept.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtdept.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtdept.setOpaque(false);
        jPanel3.add(txtdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 40));

        txtowner.setEditable(false);
        txtowner.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtowner.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Owner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtowner.setOpaque(false);
        jPanel3.add(txtowner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 40));

        txtcategory.setEditable(false);
        txtcategory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtcategory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtcategory.setOpaque(false);
        jPanel3.add(txtcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 40));

        txtsubcat.setEditable(false);
        txtsubcat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtsubcat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtsubcat.setOpaque(false);
        jPanel3.add(txtsubcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 150, 40));

        txtcost.setEditable(false);
        txtcost.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtcost.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtcost.setOpaque(false);
        jPanel3.add(txtcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("AssetList");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 250, 120, 20));

        txtbrand.setEditable(false);
        txtbrand.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtbrand.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Brand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtbrand.setOpaque(false);
        jPanel3.add(txtbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 40));

        txtservice.setEditable(false);
        txtservice.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtservice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Service Life", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtservice.setOpaque(false);
        jPanel3.add(txtservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 40));

        txtservdate.setEditable(false);
        txtservdate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtservdate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Service Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        txtservdate.setOpaque(false);
        jPanel3.add(txtservdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Description");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 90, 20));

        txtdecrip.setEditable(false);
        txtdecrip.setColumns(20);
        txtdecrip.setRows(5);
        jScrollPane6.setViewportView(txtdecrip);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 170, 100));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("(Choose Depreciation Methods)");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 1, 460, 30));

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Straight-Line", "Double Declining Balance", "Units of Production Depreciation", " " }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 470, -1));

        Panelbody.setLayout(new java.awt.CardLayout());

        Pstraight.setBackground(new java.awt.Color(0, 0, 0));
        Pstraight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_useful.setBackground(new java.awt.Color(0, 0, 0));
        txt_useful.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_useful.setForeground(new java.awt.Color(255, 255, 255));
        txt_useful.setToolTipText("Useful Life");
        txt_useful.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Useful Life Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        txt_useful.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usefulKeyTyped(evt);
            }
        });
        Pstraight.add(txt_useful, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 50));

        txt_Cost.setBackground(new java.awt.Color(0, 0, 0));
        txt_Cost.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_Cost.setForeground(new java.awt.Color(255, 255, 255));
        txt_Cost.setToolTipText("Enter Your Cost");
        txt_Cost.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostKeyTyped(evt);
            }
        });
        Pstraight.add(txt_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        txt_salvage.setEditable(false);
        txt_salvage.setBackground(new java.awt.Color(0, 0, 0));
        txt_salvage.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_salvage.setForeground(new java.awt.Color(204, 204, 204));
        txt_salvage.setToolTipText("Enter Your Salvage Value");
        txt_salvage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salvage Value", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        txt_salvage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salvageKeyTyped(evt);
            }
        });
        Pstraight.add(txt_salvage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 50));

        txt_AD.setEditable(false);
        txt_AD.setBackground(new java.awt.Color(0, 0, 0));
        txt_AD.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txt_AD.setForeground(new java.awt.Color(0, 204, 0));
        txt_AD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accumulated Depreciation Per Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Pstraight.add(txt_AD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 250, 50));

        txt_Depvalue.setEditable(false);
        txt_Depvalue.setBackground(new java.awt.Color(0, 0, 0));
        txt_Depvalue.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txt_Depvalue.setForeground(new java.awt.Color(204, 204, 204));
        txt_Depvalue.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Depreciable Total Value", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Pstraight.add(txt_Depvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 50));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Compute");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 230, 30));

        Pstraight.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 250, 50));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        Pstraight.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 470, 170));

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Print");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 40));

        Pstraight.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 280, 40));

        jPanel10.setBackground(new java.awt.Color(0, 102, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(204, 204, 204));
        clear.setText("Clear");
        clear.setBorderPainted(false);
        clear.setContentAreaFilled(false);
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel10.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, 130, -1));

        Pstraight.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 40));

        Panelbody.add(Pstraight, "card2");

        Pdouble.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PdoubleLayout = new javax.swing.GroupLayout(Pdouble);
        Pdouble.setLayout(PdoubleLayout);
        PdoubleLayout.setHorizontalGroup(
            PdoubleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        PdoubleLayout.setVerticalGroup(
            PdoubleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Panelbody.add(Pdouble, "card3");

        Units.setBackground(new java.awt.Color(0, 0, 0));
        Units.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        r1.setBackground(new java.awt.Color(0, 0, 0));
        r1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(204, 204, 204));
        r1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Of Units", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Units.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 50));

        r2.setBackground(new java.awt.Color(0, 0, 0));
        r2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(204, 204, 204));
        r2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Life Number Units", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Units.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 50));

        r3.setBackground(new java.awt.Color(0, 0, 0));
        r3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(204, 204, 204));
        r3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Units.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 50));

        r4.setBackground(new java.awt.Color(0, 0, 0));
        r4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(204, 204, 204));
        r4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salvage Value", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Units.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 50));

        TD.setBackground(new java.awt.Color(0, 0, 0));
        TD.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TD.setForeground(new java.awt.Color(204, 204, 204));
        TD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Depriciation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Units.add(TD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 170, 50));

        total1.setEditable(false);
        total1.setBackground(new java.awt.Color(0, 0, 0));
        total1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        total1.setForeground(new java.awt.Color(204, 204, 204));
        total1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Units.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 170, 50));

        total2.setEditable(false);
        total2.setBackground(new java.awt.Color(0, 0, 0));
        total2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        total2.setForeground(new java.awt.Color(204, 204, 204));
        total2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        Units.add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, 50));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane8.setViewportView(jTextArea2);

        Units.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, 450, 170));

        jPanel8.setBackground(new java.awt.Color(0, 102, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Print");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 170, 40));

        Units.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 190, 40));

        jPanel9.setBackground(new java.awt.Color(0, 102, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Compute");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 250, 40));

        Units.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, -1));

        jPanel11.setBackground(new java.awt.Color(0, 102, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("Clear");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 9, 210, 20));

        Units.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 240, 40));

        Panelbody.add(Units, "card4");

        Sum.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout SumLayout = new javax.swing.GroupLayout(Sum);
        Sum.setLayout(SumLayout);
        SumLayout.setHorizontalGroup(
            SumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        SumLayout.setVerticalGroup(
            SumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Panelbody.add(Sum, "card5");

        jPanel4.add(Panelbody, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 400));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 490, 480));

        AssetValuation.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 1010, 500));

        PanelBody.add(AssetValuation, "card4");

        Receiveitem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Receiving Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        Receiveitem.setOpaque(false);
        Receiveitem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3_Requestform.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable3_Requestform.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3_Requestform.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3_Requestform.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable3_RequestformFocusGained(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3_Requestform);

        Receiveitem.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 82, 1010, 440));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Received Status Approval & Pending");
        Receiveitem.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 40));

        PanelBody.add(Receiveitem, "card5");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Receiving Item From Warehouse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jTable3);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 77, 999, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Delivered items");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 40));

        PanelBody.add(jPanel5, "card6");

        add(PanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 11, 1040, 540));
    }// </editor-fold>//GEN-END:initComponents
    public void setColor (JPanel pane) {
        pane.setBackground(new Color(58, 83, 155)); 
    }
    public void resetColor(JPanel []pane, JPanel[] indicators)
    {
        for (int i=0; i<pane.length; i++) {
           pane[i].setBackground(new Color(34,49,63));           
        }for (int i=0; i<indicators.length; i++) {
           indicators[i].setOpaque(false);
        }
    }   
    private void BTN1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN1MousePressed
        setColor(BTN1);
        PN1.setOpaque(true);
        resetColor(new JPanel[]{BTN2,BTN3,BTN4,BTN5},new JPanel[]{PN2,PN3,PN4,PN5});
    }//GEN-LAST:event_BTN1MousePressed

    private void BTN2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN2MousePressed
        setColor(BTN2);
        PN2.setOpaque(true);
        resetColor(new JPanel[]{BTN1,BTN3,BTN4,BTN5},new JPanel[]{PN1,PN3,PN4,PN5});
    }//GEN-LAST:event_BTN2MousePressed

    private void BTN3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN3MousePressed
        setColor(BTN3);
        PN3.setOpaque(true);
        resetColor(new JPanel[]{BTN1,BTN2,BTN4,BTN5},new JPanel[]{PN1,PN2,PN4,PN5});
    }//GEN-LAST:event_BTN3MousePressed

    private void BTN4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN4MousePressed
        setColor(BTN4);
        PN4.setOpaque(true);
        resetColor(new JPanel[]{BTN1,BTN2,BTN3,BTN5},new JPanel[]{PN1,PN2,PN3,PN5});
    }//GEN-LAST:event_BTN4MousePressed

    private void BTN5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN5MousePressed
        setColor(BTN5);
        PN5.setOpaque(true);
        resetColor(new JPanel[]{BTN1,BTN2,BTN3,BTN4},new JPanel[]{PN1,PN2,PN3,PN4});
    }//GEN-LAST:event_BTN5MousePressed

    private void BTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN1MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(AssetList);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN1MouseClicked

    private void BTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN2MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(Maintenance);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN2MouseClicked

    private void BTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN3MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(AssetValuation);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN3MouseClicked

    private void BTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN4MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(Receiveitem);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN4MouseClicked

    private void BTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN5MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(jPanel5);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN5MouseClicked
  public void setforeground(JLabel label){
        label.setForeground(Color.white);
    }
    public void resetForegound(JLabel label){
        label.setForeground(new Color(204,204,204));
    }
    private void BTN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN1MouseEntered
    setforeground(jLabel2_assetlist);
    jLabel2_assetlist.setFont(new java.awt.Font("Century Gothic Bold", 0, 18));
    }//GEN-LAST:event_BTN1MouseEntered

    private void BTN1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN1MouseExited
    resetForegound(jLabel2_assetlist);
    jLabel2_assetlist.setFont(new java.awt.Font("Century Gothic Bold", 0, 14));
    }//GEN-LAST:event_BTN1MouseExited

    private void BTN2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN2MouseEntered
    setforeground(jLabel3);
    jLabel3.setFont(new java.awt.Font("Century Gothic Bold", 0, 18));
    }//GEN-LAST:event_BTN2MouseEntered

    private void BTN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN2MouseExited
    resetForegound(jLabel3);
    jLabel3.setFont(new java.awt.Font("Century Gothic Bold", 0, 14));
    }//GEN-LAST:event_BTN2MouseExited

    private void BTN3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN3MouseEntered
    setforeground(jLabel4);
    jLabel4.setFont(new java.awt.Font("Century Gothic Bold", 0, 18));
    }//GEN-LAST:event_BTN3MouseEntered

    private void BTN3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN3MouseExited
    resetForegound(jLabel4);
    jLabel4.setFont(new java.awt.Font("Century Gothic Bold", 0, 14));
    }//GEN-LAST:event_BTN3MouseExited

    private void BTN4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN4MouseEntered
    setforeground(jLabel5);
    jLabel5.setFont(new java.awt.Font("Century Gothic Bold", 0, 18)); 
    }//GEN-LAST:event_BTN4MouseEntered

    private void BTN4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN4MouseExited
    resetForegound(jLabel5);
    jLabel5.setFont(new java.awt.Font("Century Gothic Bold", 0, 14));
    }//GEN-LAST:event_BTN4MouseExited

    private void BTN5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN5MouseEntered
    setforeground(jLabel6);
    jLabel6.setFont(new java.awt.Font("Century Gothic Bold", 0, 18)); 
    }//GEN-LAST:event_BTN5MouseEntered

    private void BTN5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN5MouseExited
    resetForegound(jLabel6);
    jLabel6.setFont(new java.awt.Font("Century Gothic Bold", 0, 14));
    }//GEN-LAST:event_BTN5MouseExited

    private void Add_assetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_assetActionPerformed
     Features.Asset_AddAsset aa = new Features.Asset_AddAsset();
     aa.setVisible(true);
    }//GEN-LAST:event_Add_assetActionPerformed

    private void ManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageActionPerformed
     Features.Asset_ManageAsset am = new Features.Asset_ManageAsset();
     am.setVisible(true);
    }//GEN-LAST:event_ManageActionPerformed

    private void FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindKeyReleased
            try{
            String sql = "SELECT * FROM Log1_Assetlist  where asset_id  LIKE '%"+Find.getText()+"%'";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable_Assets.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_FindKeyReleased

    private void Add_assetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_assetMouseEntered
    Add_asset.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
    Add_asset.setForeground(Color.white);
    }//GEN-LAST:event_Add_assetMouseEntered

    private void Add_assetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_assetMouseExited
    Add_asset.setFont(new java.awt.Font("Century Gothic", 1, 12));
    Add_asset.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_Add_assetMouseExited

    private void ManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageMouseEntered
    Manage.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
    Manage.setForeground(Color.white);
    }//GEN-LAST:event_ManageMouseEntered

    private void ManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageMouseExited
    Manage.setFont(new java.awt.Font("Century Gothic", 1, 12));
    Manage.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_ManageMouseExited

    private void RequestAssetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestAssetMouseEntered
    RequestAsset.setFont(new java.awt.Font("Century Gothic Bold", 1, 14));
    RequestAsset.setForeground(Color.white);
    }//GEN-LAST:event_RequestAssetMouseEntered

    private void RequestAssetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestAssetMouseExited
    RequestAsset.setFont(new java.awt.Font("Century Gothic", 1, 12));
    RequestAsset.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_RequestAssetMouseExited

    private void RequestAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestAssetActionPerformed
      Features.Asset_RequestForm rf = new Features.Asset_RequestForm();
      rf.setVisible(true);
    }//GEN-LAST:event_RequestAssetActionPerformed

    private void PrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseEntered
          Print.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
          Print.setForeground(Color.white);
    }//GEN-LAST:event_PrintMouseEntered

    private void PrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseExited
        Print.setFont(new java.awt.Font("Century Gothic", 1, 12));
        Print.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_PrintMouseExited
int ComboBox;
    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
   MessageFormat header = new MessageFormat("Report");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");
        try{
            jTable_Assets.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void jTable3_RequestformFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable3_RequestformFocusGained
        tblware() ;
    }//GEN-LAST:event_jTable3_RequestformFocusGained

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
   
  ComboBox = jComboBox2.getSelectedIndex();
        
        if(ComboBox == 0) {           
        //removing panel
        Panelbody.removeAll();
        Panelbody.repaint();
        Panelbody.revalidate();        
        //adding panel
        Panelbody.add(Pstraight);
        Panelbody.repaint();
        Panelbody.revalidate();       
        }
        if(ComboBox==1){
        //removing panel
        Panelbody.removeAll();
        Panelbody.repaint();
        Panelbody.revalidate();        
        //adding panel
        Panelbody.add(Pdouble);
        Panelbody.repaint();
        Panelbody.revalidate();    
        }
       if(ComboBox==2){
        //removing panel
        Panelbody.removeAll();
        Panelbody.repaint();
        Panelbody.revalidate();        
        //adding panel
        Panelbody.add(Units);
        Panelbody.repaint();
        Panelbody.revalidate();    
       }
//       if(ComboBox==3){
//       //removing panel
//        Panelbody.removeAll();
//        Panelbody.repaint();
//        Panelbody.revalidate();        
//        //adding panel
//        Panelbody.add(Sum);
//        Panelbody.repaint();
//        Panelbody.revalidate();    
//       }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           try {
            double cost;
            double useful;
            double salvage=0;
            double Deptotal;
            double total;
            double AD;
            
            cost=Double.parseDouble(txt_Cost.getText());
            useful=Double.parseDouble(txt_useful.getText());
            
            //formula
            Deptotal=cost/useful-(salvage);
            total=Deptotal-cost;
            AD=(-total)/useful;
            
            String a =String.valueOf(Deptotal);
            txt_salvage.setText(a);
            String b = String.format("%.2f", total);
            txt_Depvalue.setText(b);
            String c = String.format("%.2f", AD);
            txt_AD.setText(c);

               straightline() ;
        } catch (Exception e) {
        }
         
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            jTextArea3.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Asset.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostKeyTyped
                  if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_CostKeyTyped

    private void txt_salvageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salvageKeyTyped
             if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_salvageKeyTyped

    private void txt_usefulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usefulKeyTyped
                    if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txt_usefulKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            int row = jTable2.getSelectedRow();
            String Table_click=(jTable2.getModel().getValueAt(row, 0).toString());
            String sql = "select * from Log1_Assetlist where Asset_ID='"+Table_click+"' ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()) {
                  txtassetid.setText(rs.getString("Asset_ID")); 
                   txtpn.setText(rs.getString("PN"));
                    txtsn.setText(rs.getString("SN"));  
                     txtbranches.setText(rs.getString("Branches"));  
                     txtdept.setText(rs.getString("Department"));  
                      txtowner.setText(rs.getString("Owner"));  
                       txtcategory.setText(rs.getString("Category"));  
                        txtsubcat.setText(rs.getString("Sub_Category"));  
                         txtcost.setText(rs.getString("Cost"));  
                          txtbrand.setText(rs.getString("Brand"));  
                           txtservice.setText(rs.getString("Service_Life"));  
                            txtsource.setText(rs.getString("Source"));  
                             txtservdate.setText(rs.getString("Service_Date"));  
                             txtdecrip.setText(rs.getString("Description"));  
            }
            straightline();
            unitsproduction() ;
        }catch(Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try {
        double num_units;
        double life_num_unit;
        double depreciation_expense;
        double cost;
        double salvage_value;
        double total;
        double DP;
       //input numbers 
        num_units=Double.parseDouble(r1.getText());
        life_num_unit=Double.parseDouble(r2.getText());      
        cost=Double.parseDouble(r3.getText());
        salvage_value=Double.parseDouble(r4.getText());
       
       //formula compute 
       depreciation_expense=num_units/life_num_unit;
       total=cost-(-salvage_value);
       DP=depreciation_expense*total;
        
        //total
        String Depriciations = String.format("%.2f", depreciation_expense);
        total1.setText(Depriciations);
        String as = String.format("%.2f", total);
        total2.setText(as);
        String a = String.format("%.2f", DP);
        TD.setText(a);
        unitsproduction();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   try {
            jTextArea2.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Asset.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txt_Cost.setText("");
        txt_salvage.setText("");
        txt_useful.setText("");
        txt_Depvalue.setText("");
        txt_AD.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       r1.setText("");
       r2.setText("");
       r3.setText("");
       r4.setText("");
       total1.setText("");
       total2.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
           try{
            int row = jTable4.getSelectedRow();
            String Table_click=(jTable4.getModel().getValueAt(row, 0).toString());
            String sql = "select * from Log1_assetlist where asset_id='"+Table_click+"' ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()) {
                
                f1.setText(rs.getString("Asset_ID"));
                f2.setText(rs.getString("PN"));
                f3.setText(rs.getString("SN"));
                f4_owner.setText(rs.getString("Brand"));
                f5_subcat.setText(rs.getString("Owner"));
                f6.setText(rs.getString("brand"));
                f7.setText(rs.getString("service_life"));
                branches.setSelectedItem(rs.getString("Branches"));
                department.setSelectedItem(rs.getString("Department"));
                category.setSelectedItem(rs.getString("category"));
                
          }           
        }catch(Exception e) {          
            JOptionPane.showMessageDialog(null, e);
        }
       
    
    }//GEN-LAST:event_jTable4MouseClicked

    private void RepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairActionPerformed
     Features.Asset_RepairList rp = new Features.Asset_RepairList();
     rp.setVisible(true);
    }//GEN-LAST:event_RepairActionPerformed

    private void DisposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisposeActionPerformed
      Features.Asset_DisposedList d = new Features.Asset_DisposedList();
      d.setVisible(true);
    }//GEN-LAST:event_DisposeActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       
        if(f1.getText().isEmpty()
                ||f2.getText().isEmpty()
                ||f3.getText().isEmpty()
                ||f4_owner.getText().isEmpty()
                ||f5_subcat.getText().isEmpty()
                ||f6.getText().isEmpty()
                ||f7.getText().isEmpty()
                ||f8.getText().isEmpty()
                || branches.getSelectedItem()=="Choose here" || branches.getSelectedItem().equals("Choose here")
                ||department.getSelectedItem()=="Choose here" || department.getSelectedItem().equals("Choose here")
                ||category.getSelectedItem()=="Choose here" || category.getSelectedItem().equals("Choose here")
                ||status.getSelectedItem()=="Choose here" || status.getSelectedItem().equals("Choose here")
                ||description.getText().isEmpty()
                ||((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()){
            
                   JOptionPane.showMessageDialog(null,"This field cannot be empty!","ERROR!",JOptionPane.ERROR_MESSAGE);
        }else{
        
                
         int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Add Record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(x==0){  
        try {
            String sql = "INSERT INTO Log1_AssetRepair "
            + "(AssetID, PN, SN, Owner, Sub_Category, Brand, Service_Life, Technician, Branches, Department, Category, Status, Description, Service_Date)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
               String sql2 = "INSERT INTO Log1_AssetDispose "
            + "(AssetID, PN, SN, Owner, Sub_Category, Brand, Service_Life, Technician, Branches, Department, Category, Status, Description, Service_Date)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pst=conn.prepareStatement(sql);
            
            pst.setString(1,f1.getText());
            pst.setString(2,f2.getText());
            pst.setString(3,f3.getText());
            pst.setString(4,f4_owner.getText());
            pst.setString(5,f5_subcat.getText());
            pst.setString(6,f6.getText());
            pst.setString(7,f7.getText());
            pst.setString(8,f8.getText());
            pst.setString(9,branches.getSelectedItem().toString());
            pst.setString(10,department.getSelectedItem().toString());
            pst.setString(11,category.getSelectedItem().toString());
          
            pst.setString(13,description.getText());
            pst.setString(14, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());    
            
            if (status.getSelectedItem().toString().equals("Choose here")) {
            JOptionPane.showMessageDialog(null, "You must select a valid type to proceed!", "ERROR!", JOptionPane.ERROR_MESSAGE);    
            return;
            }else{
                  pst.setString(12,status.getSelectedItem().toString());
                  pst.executeUpdate();  
                  main_tble();
            }
            
            pst=conn.prepareStatement(sql2);            
            pst.setString(1,f1.getText());
            pst.setString(2,f2.getText());
            pst.setString(3,f3.getText());
            pst.setString(4,f4_owner.getText());
            pst.setString(5,f5_subcat.getText());
            pst.setString(6,f6.getText());
            pst.setString(7,f7.getText());
            pst.setString(8,f8.getText());
            pst.setString(9,branches.getSelectedItem().toString());
            pst.setString(10,department.getSelectedItem().toString());
            pst.setString(11,category.getSelectedItem().toString());
          
            pst.setString(13,description.getText());
            pst.setString(14, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());    
            
            if (status.getSelectedItem().toString().equals("Choose here")) {
            JOptionPane.showMessageDialog(null, "You must select a valid type to proceed!", "ERROR!", JOptionPane.ERROR_MESSAGE);    
            return;
            }else{
                  pst.setString(12,status.getSelectedItem().toString());
                  pst.executeUpdate();  
                  dis_tbl();
            }

           
            
            JOptionPane.showMessageDialog(null, "Add Successfull! ");   
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
        }
        }
    }//GEN-LAST:event_SaveActionPerformed
//==================================================================================================
public void straightline() {
    
    jTextArea3.setText("========================================================"+"\n"
    +"Straight-Line Depreciation Method"+" \n"
    +"Asset ID     \t\t\t"+txtassetid.getText()+"\n"
    +"Owner         \t\t\t"+txtowner.getText()+"\n"
    +"Cost              \t\t"+txt_Cost.getText()+"\n"
    +"Salvage Value       \t\t "+txt_salvage.getText()+"\n"
    +"Useful Life                   \t"+txt_useful.getText()+"\n"
    +"Depreciation Base       \t"+txt_Depvalue.getText()+"\n"
    +"Accumalated Depreciation:"+txt_AD.getText()+"\n"
    +"========================================================");
}        
//==================================================================================================   
public void unitsproduction() {
    
    jTextArea2.setText("====================================================="+"\n"
    +"Units Of Production Depreciation Method"+" \n"
    +"Asset ID     \t\t\t"+txtassetid.getText()+"\n"
    +"Owner         \t\t\t"+txtowner.getText()+"\n"
    +"Number of Units     \t\t "+r1.getText()+"\n"
    +"Life Number Units    \t\t"+r2.getText()+"\n"
    +"Total1      \t\t\t"+total1.getText()+"\n"
    +"Cost  \t\t\t\t"+r3.getText()+"\n"
    +"Salvage Value \t\t\t"+r4.getText()+"\n"
    +"Total2\t\t\t        "+total2.getText()+"\n"
    +"Total Depreciattion\t\t"+TD.getText()+"\n"
    +"======================================================");
}        
//==================================================================================================
  public void tblware()  {         
          try {
                String sql = "select count(ReceivedID) as ReceivedID from Log1_ware_Requestform";
                pst = conn.prepareStatement(sql);
                rs=pst.executeQuery();             
                if(rs.next()) {                    
                    String sum=rs.getString("ReceivedID");
                    lbl_notif.setText(sum);         
                 
                }
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, e);
          }
      }        
//==================================================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_asset;
    private javax.swing.JPanel AssetList;
    private javax.swing.JPanel AssetValuation;
    private javax.swing.JPanel BTN1;
    private javax.swing.JPanel BTN2;
    private javax.swing.JPanel BTN3;
    private javax.swing.JPanel BTN4;
    private javax.swing.JPanel BTN5;
    private javax.swing.JPanel Button1;
    private javax.swing.JPanel Button2;
    private javax.swing.JPanel Button3;
    private javax.swing.JPanel Button4;
    private javax.swing.JButton Dispose;
    private javax.swing.JTextField Find;
    private javax.swing.JPanel Maintenance;
    private javax.swing.JButton Manage;
    private javax.swing.JPanel PN1;
    private javax.swing.JPanel PN2;
    private javax.swing.JPanel PN3;
    private javax.swing.JPanel PN4;
    private javax.swing.JPanel PN5;
    private javax.swing.JPanel PanelBTN1;
    private javax.swing.JPanel PanelBack;
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel Panelbody;
    private javax.swing.JPanel Pdouble;
    private javax.swing.JButton Print;
    private javax.swing.JPanel Pstraight;
    private javax.swing.JPanel Receiveitem;
    private javax.swing.JButton Repair;
    private javax.swing.JButton RequestAsset;
    private javax.swing.JButton Save;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel Sum;
    private javax.swing.JTextField TD;
    private javax.swing.JPanel Units;
    private javax.swing.JComboBox<String> branches;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextArea description;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4_owner;
    private javax.swing.JTextField f5_subcat;
    private javax.swing.JTextField f6;
    private javax.swing.JTextField f7;
    private javax.swing.JTextField f8;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_assetlist;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    public static final javax.swing.JTable jTable2 = new javax.swing.JTable();
    public static final javax.swing.JTable jTable3 = new javax.swing.JTable();
    public static final javax.swing.JTable jTable3_Requestform = new javax.swing.JTable();
    public static final javax.swing.JTable jTable4 = new javax.swing.JTable();
    public static final javax.swing.JTable jTable_Assets = new javax.swing.JTable();
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    public static javax.swing.JLabel lbl_notif;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextField r4;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField total1;
    private javax.swing.JTextField total2;
    private javax.swing.JTextField txt_AD;
    private javax.swing.JTextField txt_Cost;
    private javax.swing.JTextField txt_Depvalue;
    private javax.swing.JTextField txt_salvage;
    private javax.swing.JTextField txt_useful;
    private javax.swing.JTextField txtassetid;
    private javax.swing.JTextField txtbranches;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtcost;
    private javax.swing.JTextArea txtdecrip;
    private javax.swing.JTextField txtdept;
    private javax.swing.JTextField txtowner;
    private javax.swing.JTextField txtpn;
    private javax.swing.JTextField txtservdate;
    private javax.swing.JTextField txtservice;
    private javax.swing.JTextField txtsn;
    private javax.swing.JTextField txtsource;
    private javax.swing.JTextField txtsubcat;
    // End of variables declaration//GEN-END:variables
}
