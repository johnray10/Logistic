package com.sbix.jnotify;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class NotifyType extends JPanel  {

	private static final long serialVersionUID = 1L;
	
	private JLabel label_msg = new JLabel();
    private GridLayout layout = new GridLayout(1,1);
    private Font police = new Font("Arial",Font.CENTER_BASELINE,13);
    
    
    //static variables to identify the type of notification 
    public static final Color DEFAULT_NOTIFICATION = new Color(0x7f8c8d);
    public static final Color SUCCESS_NOTIFICATION = new Color(0x2ecc71);
    public static final Color ERROR_NOTIFICATION = new Color(0xc0392b);
    public static final Color WARNING_NOTIFICATION = new Color(0xf39c12);
    
    
    public NotifyType(Color notficationType,String message){
    	this.setLayout(layout);
    	this.setBorder(new EmptyBorder(3,3,3,3));
    	this.label_msg.setFont(police);
    	this.label_msg.setText("<html>"+message+"</html>");    	
    	this.label_msg.setForeground(new Color(255,255,255));
    	this.add(label_msg);
    	this.setBackground(notficationType);
    	    	
    }
    
    /**
     * Method to verify the existence of the task bar
     * @return screenInsets
     */
    
    public static Insets getScreenInsets(){
    	Point p = new Point();
		GraphicsConfiguration graphicsConfiguration = null;
		for (GraphicsDevice gd : GraphicsEnvironment
				.getLocalGraphicsEnvironment().getScreenDevices()) {
			if (gd.getDefaultConfiguration().getBounds().contains(p)) {
				graphicsConfiguration = gd.getDefaultConfiguration();
				break;
			}
		}
		Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(
				graphicsConfiguration);
		return screenInsets;
    }


    


    
    
}
