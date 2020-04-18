/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Jayjomjohn
 */
public class Warehouse extends javax.swing.JPanel {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public Warehouse() {
        initComponents();
        conn=ServerConnection.ConnecrDb();
        
       jTable_stocklistinfo.setShowGrid(true);
       jTable_stocklistinfo.setGridColor(Color.DARK_GRAY);
       jTable_stocklistinfo.setSelectionBackground(Color.lightGray);
       
       JTableHeader th = jTable_stocklistinfo.getTableHeader();
       th.setForeground(Color.BLACK);
       th.setFont(new Font("Century Gothic", Font.BOLD, 14));
       
       waretable();
       purchaseOrder();
       Stock();
       Bargraph();
       tblDeliver() ;
       AssetRequest() ;
       Requestmaterials();
        PMmaterials();
         ReleasedAssets() ;
    }
//==================================ShowDataTable====================================================   
 public void waretable() {
        DefaultTableModel model = (DefaultTableModel) jTable_stocklistinfo.getModel(); 
        try{
            String sql ="select * from Log1_ware_addstock";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable_stocklistinfo.setModel(DbUtils.resultSetToTableModel(rs));
             }
       catch(SQLException e) {
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
   public void purchaseOrder() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel(); 
        try{
            String sql ="SELECT * FROM Log1_procure_purchaseorder";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable4.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
  }   
//==================================================================================================
    public void tblDeliver() {
            DefaultTableModel model = (DefaultTableModel) tableDeliverdetail.getModel(); 
        try{
            String sql ="SELECT * FROM Log1_procure_Deliverdetail ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tableDeliverdetail.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }        
//==================================================================================================
   public void AssetRequest() {
            DefaultTableModel model = (DefaultTableModel) Warehouse.tableRequest.getModel(); 
        try{
            String sql ="SELECT * FROM Log1_Assetrequest";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            Warehouse.tableRequest.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
             }catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
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
 public final void PMmaterials() {
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
  public final void ReleasedAssets() {
        try{
            String sql = "SELECT * FROM Log1_Requestmaterials";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
          Module.Warehouse.jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        SidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTN1 = new javax.swing.JPanel();
        PN1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BTN2 = new javax.swing.JPanel();
        PN2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BTN3 = new javax.swing.JPanel();
        PN3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BTN4 = new javax.swing.JPanel();
        PN4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BTN5 = new javax.swing.JPanel();
        PN5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        Stock = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_stocklistinfo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        addstock = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PrintReport = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        manage1 = new javax.swing.JButton();
        find = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Request_item = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton2_PrintReport = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ReceivingNew = new javax.swing.JPanel();
        jPanelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        tbl1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabel8 = new javax.swing.JLabel();
        tbl2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        tbl3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableRequest = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Deployment = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton5_request = new javax.swing.JButton();
        jPanelSlider2 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        ReleasedPM = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ReleasedAsset = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        GeneralRep = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        StockReport = new javax.swing.JButton();
        PanelChart = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Cost = new javax.swing.JLabel();

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Refresh_27px_1.png"))); // NOI18N
        jMenuItem1.setText("Refresh");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Refresh_27px_1.png"))); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Printer_27px_1.png"))); // NOI18N
        jMenuItem2.setText("Printer");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setMaximumSize(new java.awt.Dimension(1330, 580));
        setMinimumSize(new java.awt.Dimension(1330, 580));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1330, 580));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        SidePanel.setMaximumSize(new java.awt.Dimension(250, 510));
        SidePanel.setMinimumSize(new java.awt.Dimension(250, 510));
        SidePanel.setOpaque(false);
        SidePanel.setPreferredSize(new java.awt.Dimension(250, 510));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_User_100px.png"))); // NOI18N
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 13, 130, -1));

        BTN1.setBackground(new java.awt.Color(0, 102, 153));
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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Stocks_30px.png"))); // NOI18N
        jLabel2.setText("Stock List");

        javax.swing.GroupLayout BTN1Layout = new javax.swing.GroupLayout(BTN1);
        BTN1.setLayout(BTN1Layout);
        BTN1Layout.setHorizontalGroup(
            BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN1Layout.createSequentialGroup()
                .addComponent(PN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 211, Short.MAX_VALUE))
            .addGroup(BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTN1Layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        BTN1Layout.setVerticalGroup(
            BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BTN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BTN1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Pull_Request_30px.png"))); // NOI18N
        jLabel3.setText("Request New Item");

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
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addContainerGap()))
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
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_New_Product_30px.png"))); // NOI18N
        jLabel4.setText("Received Request");

        javax.swing.GroupLayout BTN3Layout = new javax.swing.GroupLayout(BTN3);
        BTN3.setLayout(BTN3Layout);
        BTN3Layout.setHorizontalGroup(
            BTN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN3Layout.createSequentialGroup()
                .addComponent(PN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(BTN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTN3Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Deployment_27px.png"))); // NOI18N
        jLabel5.setText("Released item");

        javax.swing.GroupLayout BTN4Layout = new javax.swing.GroupLayout(BTN4);
        BTN4.setLayout(BTN4Layout);
        BTN4Layout.setHorizontalGroup(
            BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN4Layout.createSequentialGroup()
                .addComponent(PN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(BTN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTN4Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Analyze_30px.png"))); // NOI18N
        jLabel6.setText("Analysis Report");

        javax.swing.GroupLayout BTN5Layout = new javax.swing.GroupLayout(BTN5);
        BTN5.setLayout(BTN5Layout);
        BTN5Layout.setHorizontalGroup(
            BTN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTN5Layout.createSequentialGroup()
                .addComponent(PN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(BTN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTN5Layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        PanelBody.setMaximumSize(new java.awt.Dimension(1040, 540));
        PanelBody.setMinimumSize(new java.awt.Dimension(1040, 540));
        PanelBody.setOpaque(false);
        PanelBody.setLayout(new java.awt.CardLayout());

        Stock.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Stock List Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        Stock.setOpaque(false);
        Stock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_stocklistinfo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable_stocklistinfo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_stocklistinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable_stocklistinfo);

        Stock.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 95, 1008, 380));

        jPanel2.setBackground(new java.awt.Color(31, 58, 147));

        addstock.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addstock.setForeground(new java.awt.Color(204, 204, 204));
        addstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Stocks_30px.png"))); // NOI18N
        addstock.setText("Add Stock");
        addstock.setContentAreaFilled(false);
        addstock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addstockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addstockMouseExited(evt);
            }
        });
        addstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(addstock)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addstock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Stock.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 160, 50));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        PrintReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PrintReport.setForeground(new java.awt.Color(204, 204, 204));
        PrintReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Printer_27px.png"))); // NOI18N
        PrintReport.setText("Print Report");
        PrintReport.setContentAreaFilled(false);
        PrintReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintReportMouseExited(evt);
            }
        });
        PrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrintReport)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrintReport, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Stock.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 160, 40));

        jPanel7.setBackground(new java.awt.Color(31, 58, 147));

        manage1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        manage1.setForeground(new java.awt.Color(204, 204, 204));
        manage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Trolley_27px.png"))); // NOI18N
        manage1.setText("Manage");
        manage1.setContentAreaFilled(false);
        manage1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manage1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manage1MouseExited(evt);
            }
        });
        manage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manage1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manage1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Stock.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 150, 50));

        find.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        find.setForeground(new java.awt.Color(255, 255, 255));
        find.setToolTipText("Search");
        find.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        find.setOpaque(false);
        find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                findKeyReleased(evt);
            }
        });
        Stock.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Search_28px.png"))); // NOI18N
        Stock.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 40, 50));

        PanelBody.add(Stock, "card2");

        Request_item.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Request Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        Request_item.setOpaque(false);
        Request_item.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(58, 83, 155));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Form_27px.png"))); // NOI18N
        jButton1.setText("Request Form");
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 40));

        Request_item.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 190, 60));

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
        jScrollPane2.setViewportView(jTable4);

        Request_item.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1000, 410));

        jPanel4.setBackground(new java.awt.Color(58, 83, 155));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2_PrintReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2_PrintReport.setForeground(new java.awt.Color(204, 204, 204));
        jButton2_PrintReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Printer_27px.png"))); // NOI18N
        jButton2_PrintReport.setText("Print Report");
        jButton2_PrintReport.setContentAreaFilled(false);
        jButton2_PrintReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_PrintReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2_PrintReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2_PrintReportMouseExited(evt);
            }
        });
        jButton2_PrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_PrintReportActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2_PrintReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 170, 40));

        Request_item.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 190, 60));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setToolTipText("Find");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jTextField1.setOpaque(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        Request_item.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Search_28px.png"))); // NOI18N
        Request_item.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 60, 50));

        PanelBody.add(Request_item, "card3");

        ReceivingNew.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Received New Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        ReceivingNew.setOpaque(false);
        ReceivingNew.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSlider1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanelSlider1.setOpaque(false);

        tbl1.setOpaque(false);
        tbl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDeliverdetail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tableDeliverdetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDeliverdetail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(tableDeliverdetail);

        tbl1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 46, 960, 360));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Table For Procurement Deliver Detail");
        tbl1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 30));

        jPanelSlider1.add(tbl1, "card2");

        tbl2.setOpaque(false);
        tbl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3_Materials.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable3_Materials.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable3_Materials);

        tbl2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 970, 300));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Request Material For PM");
        tbl2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 30));

        jPanel5.setBackground(new java.awt.Color(34, 49, 63));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Send To PM");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 230, 30));

        tbl2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 250, 50));

        jPanelSlider1.add(tbl2, "card3");

        tbl3.setOpaque(false);
        tbl3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRequest.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tableRequest.setModel(new javax.swing.table.DefaultTableModel(
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
        tableRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane6.setViewportView(tableRequest);

        tbl3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 970, 300));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Request For Asset");
        tbl3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 30));

        jPanel12.setBackground(new java.awt.Color(0, 102, 153));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("Send to Asset");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 11, 180, 30));

        tbl3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 200, 50));

        jPanelSlider1.add(tbl3, "card4");

        ReceivingNew.add(jPanelSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1000, 430));

        jPanel8.setBackground(new java.awt.Color(0, 102, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Received from Asset");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 250, 30));

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Procurement Delivered ");
        jButton3.setActionCommand("Received from Procurement");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 250, 30));

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Received from PM");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 250, 30));

        ReceivingNew.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1000, 50));

        PanelBody.add(ReceivingNew, "card4");

        Deployment.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Viewing of Deployment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        Deployment.setOpaque(false);
        Deployment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(34, 49, 63));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5_request.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5_request.setForeground(new java.awt.Color(204, 204, 204));
        jButton5_request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Form_27px.png"))); // NOI18N
        jButton5_request.setText("Request Form Warehouse");
        jButton5_request.setContentAreaFilled(false);
        jButton5_request.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5_requestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5_requestMouseExited(evt);
            }
        });
        jButton5_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_requestActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5_request, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 40));

        Deployment.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 360, 60));

        jPanelSlider2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanelSlider2.setOpaque(false);

        ReleasedPM.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Released PM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        ReleasedPM.setOpaque(false);
        ReleasedPM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane7.setViewportView(jTable2);

        ReleasedPM.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 970, 360));

        jPanelSlider2.add(ReleasedPM, "card2");

        ReleasedAsset.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "Released Asset", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        ReleasedAsset.setOpaque(false);
        ReleasedAsset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
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
        jScrollPane3.setViewportView(jTable1);

        ReleasedAsset.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 970, 360));

        jPanelSlider2.add(ReleasedAsset, "card3");

        Deployment.add(jPanelSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1000, 410));

        jPanel11.setBackground(new java.awt.Color(34, 49, 63));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_View_Details_35px.png"))); // NOI18N
        jButton6.setText("Released To Asset");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 260, 40));

        Deployment.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 280, 60));

        jPanel13.setBackground(new java.awt.Color(34, 49, 63));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_News_35px.png"))); // NOI18N
        jButton8.setText("Released To PM");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 260, 40));

        Deployment.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 60));

        PanelBody.add(Deployment, "card5");

        GeneralRep.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)), "General Analysis Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        GeneralRep.setName(""); // NOI18N
        GeneralRep.setOpaque(false);
        GeneralRep.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 73, 94), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StockReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        StockReport.setForeground(new java.awt.Color(204, 204, 204));
        StockReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Module/icons/icons8_Statistics_27px.png"))); // NOI18N
        StockReport.setText("Update Report");
        StockReport.setContentAreaFilled(false);
        StockReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StockReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StockReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StockReportMouseExited(evt);
            }
        });
        StockReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockReportActionPerformed(evt);
            }
        });
        jPanel6.add(StockReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 190, 40));

        GeneralRep.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 210, 60));

        PanelChart.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        PanelChart.setOpaque(false);
        PanelChart.setLayout(new java.awt.BorderLayout());
        GeneralRep.add(PanelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1000, 410));
        GeneralRep.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1000, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Cost");
        GeneralRep.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        jLabel_Cost.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel_Cost.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_Cost.setText("----");
        GeneralRep.add(jLabel_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, 50));

        PanelBody.add(GeneralRep, "card6");

        add(PanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 1040, 540));
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
    PanelBody.add(Stock);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN1MouseClicked

    private void BTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN3MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(ReceivingNew);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN3MouseClicked

    private void BTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN4MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(Deployment);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN4MouseClicked

    private void BTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN5MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(GeneralRep);
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
    setforeground(jLabel2);
    jLabel2.setFont(new java.awt.Font("Century Gothic Bold", 0, 18));
    }//GEN-LAST:event_BTN1MouseEntered

    private void BTN1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN1MouseExited
    resetForegound(jLabel2);
    jLabel2.setFont(new java.awt.Font("Century Gothic Bold", 0, 14));
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

    private void BTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN2MouseClicked
    PanelBody.removeAll();
    PanelBody.repaint();
    PanelBody.revalidate();
    PanelBody.add(Request_item);
    PanelBody.repaint();
    PanelBody.revalidate();
    }//GEN-LAST:event_BTN2MouseClicked

    private void addstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstockActionPerformed
      Features.Ware_Add_Stock as = new Features.Ware_Add_Stock();
      as.setVisible(true);
    }//GEN-LAST:event_addstockActionPerformed

    private void addstockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstockMouseEntered
      addstock.setFont(new java.awt.Font("Century Gothic Bold", 1, 16)); // NOI18N
      addstock.setForeground(Color.white);
    }//GEN-LAST:event_addstockMouseEntered

    private void addstockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstockMouseExited
      addstock.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      addstock.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_addstockMouseExited

    private void PrintReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintReportMouseEntered
      PrintReport.setFont(new java.awt.Font("Century Gothic Bold", 1, 16)); // NOI18N
      PrintReport.setForeground(Color.white);
    }//GEN-LAST:event_PrintReportMouseEntered

    private void PrintReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintReportMouseExited
      PrintReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      PrintReport.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_PrintReportMouseExited

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if(evt.isPopupTrigger())
      {
          jPopupMenu1.show(this,evt.getX(),evt.getY());     
      }
    }//GEN-LAST:event_formMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        try{
            String sql ="select * from Log1_ware_addstock";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable_stocklistinfo.setModel(DbUtils.resultSetToTableModel(rs));
             }
       catch(SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        MessageFormat header = new MessageFormat("Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{           
            jTable_stocklistinfo.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);          
        }catch(java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }               
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void manage1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage1MouseEntered
      manage1.setFont(new java.awt.Font("Century Gothic Bold", 1, 16));
      manage1.setForeground(Color.white);
    }//GEN-LAST:event_manage1MouseEntered

    private void manage1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage1MouseExited
      manage1.setFont(new java.awt.Font("Century Gothic Bold", 1, 14));
      manage1.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_manage1MouseExited

    private void manage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage1ActionPerformed
    Features.Ware_Manage_Stock wm = new Features.Ware_Manage_Stock();
    wm.setVisible(true);
    }//GEN-LAST:event_manage1ActionPerformed

    private void findKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findKeyReleased
          try{
            String sql = "select * from Log1_ware_addstock where Stock_id LIKE '%"+find.getText()+"%'";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable_stocklistinfo.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_findKeyReleased

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
      jButton1.setFont(new java.awt.Font("Century Gothic Bold", 1, 16)); // NOI18N
      jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Features.Ware_RequestForm w = new Features.Ware_RequestForm();
        w.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2_PrintReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_PrintReportMouseEntered
      jButton2_PrintReport.setFont(new java.awt.Font("Century Gothic Bold", 1, 18)); // NOI18N
      jButton2_PrintReport.setForeground(Color.white);
    }//GEN-LAST:event_jButton2_PrintReportMouseEntered

    private void jButton2_PrintReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_PrintReportMouseExited
         jButton2_PrintReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
         jButton2_PrintReport.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jButton2_PrintReportMouseExited

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
           try{
            String sql = "SELECT * FROM Log1_procure_purchaseorder WHERE RequestID LIKE '%"+jTextField1.getText()+"%'";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable4.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton2_PrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_PrintReportActionPerformed
        MessageFormat header = new MessageFormat("Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{
            
            jTable4.print(JTable.PrintMode.NORMAL, header, footer );
            
        }catch(java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }  
    }//GEN-LAST:event_jButton2_PrintReportActionPerformed

    private void StockReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockReportActionPerformed
       Bargraph();
   
    }//GEN-LAST:event_StockReportActionPerformed
    
    private void StockReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockReportMouseEntered
        StockReport.setFont(new java.awt.Font("Century Gothic Bold", 1, 18)); // NOI18N
        StockReport.setForeground(Color.white);
    }//GEN-LAST:event_StockReportMouseEntered

    private void StockReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockReportMouseExited
        StockReport.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        StockReport.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_StockReportMouseExited

    private void PrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintReportActionPerformed
      MessageFormat header = new MessageFormat("Report");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");
        try{
            jTable_stocklistinfo.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }

    }//GEN-LAST:event_PrintReportActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jPanelSlider1.nextPanel(30, tbl1, jPanelSlider1.left);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jPanelSlider1.nextPanel(30, tbl2, jPanelSlider1.left);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jPanelSlider1.nextPanel(30, tbl3, jPanelSlider1.left);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_requestActionPerformed
     Features.Ware_RequestformAsset r = new Features.Ware_RequestformAsset();
     r.setVisible(true);
    }//GEN-LAST:event_jButton5_requestActionPerformed

    private void jButton5_requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5_requestMouseEntered
           jButton5_request.setFont(new java.awt.Font("Century Gothic Bold", 1, 18));
           jButton5_request.setForeground(Color.white);
    }//GEN-LAST:event_jButton5_requestMouseEntered

    private void jButton5_requestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5_requestMouseExited
            jButton5_request.setFont(new java.awt.Font("Century Gothic Bold", 1, 14));
            jButton5_request.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jButton5_requestMouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     Features.Ware_SendRequestFormAsset q = new Features.Ware_SendRequestFormAsset();
     q.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      Features.Ware_SendPM pm = new Features.Ware_SendPM();
      pm.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jPanelSlider2.nextPanel(30, ReleasedPM, jPanelSlider2.right);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jPanelSlider2.nextPanel(30, ReleasedAsset, jPanelSlider2.left);
    }//GEN-LAST:event_jButton6ActionPerformed
//==================================================================================================
public void Bargraph() {  
    try{

            String query ="SELECT Stock_ID, Stock FROM Log1_ware_addstock";
            JDBCCategoryDataset barChartData = new JDBCCategoryDataset(conn=ServerConnection.ConnecrDb(), query);
            
JFreeChart barChart = ChartFactory.createBarChart3D("Stock Report", " " ," Number of Stocks", barChartData, PlotOrientation.VERTICAL, true,true,true);
          CategoryPlot barchrt = barChart.getCategoryPlot();
          barchrt.setRangeGridlinePaint(Color.BLACK);
          barChart.getTitle().setPaint(Color.DARK_GRAY);
            ChartPanel barpanel = new ChartPanel(barChart);
            PanelChart.removeAll();
            PanelChart.add(barpanel,BorderLayout.CENTER);
            PanelChart.validate();
            PanelChart.updateUI();
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);      
        }
}        
//==================================================================================================  
    
 
//==================================================================================================    
  private void Stock()  {         
          try {
                String sql = "select sum(Cost) as Cost from Log1_ware_addstock";
                pst = conn.prepareStatement(sql);
                rs=pst.executeQuery();             
                if(rs.next()) {                    
                    String sum=rs.getString("Cost");
                    jLabel_Cost.setText(sum);                
                }
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, e);
          }
      }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTN1;
    private javax.swing.JPanel BTN2;
    private javax.swing.JPanel BTN3;
    private javax.swing.JPanel BTN4;
    private javax.swing.JPanel BTN5;
    private javax.swing.JPanel Deployment;
    private javax.swing.JPanel GeneralRep;
    private javax.swing.JPanel PN1;
    private javax.swing.JPanel PN2;
    private javax.swing.JPanel PN3;
    private javax.swing.JPanel PN4;
    private javax.swing.JPanel PN5;
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelChart;
    private javax.swing.JButton PrintReport;
    private javax.swing.JPanel ReceivingNew;
    private javax.swing.JPanel ReleasedAsset;
    private javax.swing.JPanel ReleasedPM;
    private javax.swing.JPanel Request_item;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel Stock;
    private javax.swing.JButton StockReport;
    private javax.swing.JButton addstock;
    private javax.swing.JTextField find;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2_PrintReport;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton5_request;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Cost;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider1;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator2;
    public static final javax.swing.JTable jTable1 = new javax.swing.JTable();
    public static final javax.swing.JTable jTable2 = new javax.swing.JTable();
    public static final javax.swing.JTable jTable3_Materials = new javax.swing.JTable();
    public static javax.swing.JTable jTable4;
    public static javax.swing.JTable jTable_stocklistinfo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton manage1;
    public static final javax.swing.JTable tableDeliverdetail = new javax.swing.JTable();
    public static javax.swing.JTable tableRequest;
    private javax.swing.JPanel tbl1;
    private javax.swing.JPanel tbl2;
    private javax.swing.JPanel tbl3;
    // End of variables declaration//GEN-END:variables
}
