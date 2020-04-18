package com.sbix.jnotify;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JDialog;
import javax.swing.Timer;

public class NotifyWindow extends JDialog implements ActionListener,
		MouseListener, ScreenDimension {

	private static final long serialVersionUID = 1L;
	private NotifyType panneau_principal = null;
	private Timer timerPrint = null;
	private Timer timerExit = null;

	// heigth and width of notifaction
	private int width = 360;
	private int height = 80;
	// default position of the notification
	private NPosition position = NPosition.CENTER;
	// default Type of the notification
	private Color type = panneau_principal.DEFAULT_NOTIFICATION;

	// display time of notification in milliseconds
	public static final int SHORT_DELAY = 1500;
	public static final int NORMAL_DELAY = 2500;
	public static final int LONG_DELAY = 4000;

	/**
	 * Constructor with 4 parameters Type of notification, message, delay,
	 * position
	 * 
	 * @param notification
	 *            is a color you can get it with NotifyType.DEFAULT_NOTIFICATION
	 *            for example
	 * @param message
	 *            String
	 * @param delay
	 *            is a display time of notification
	 * @param position
	 *            this is the position you want to display the notification
	 *            NPosition.CENTER for example
	 * */
	public NotifyWindow(Color notification, String message, int delay,
			NPosition position) {
		super();
		this.position = position;
		this.type = notification;
		init(this.type, message, delay, this.position);
	}

	// an other constructors with different parameters
	public NotifyWindow(Color notification, String message, int delay) {
		super();
		this.type = notification;
		init(this.type, message, delay, this.position);
	}

	public NotifyWindow(Color notification, String message) {
		super();
		this.type = notification;
		init(this.type, message, NORMAL_DELAY, this.position);
	}

	public NotifyWindow(String message) {
		super();
		init(this.type, message, NORMAL_DELAY, this.position);
	}

	public NotifyWindow(String message, NPosition position) {
		super();
		this.position = position;
		init(this.type, message, NORMAL_DELAY, this.position);
	}

	/**
	 * Method that takes as parameters the constructor parameters initializes
	 * the components of the notification
	 * */

	private void init(Color notiColor, String message, int delay,
			NPosition position) {
		panneau_principal = new NotifyType(notiColor, message);
		this.setSize(new Dimension(width, height));
		this.setUndecorated(true);
		this.setResizable(false);
		this.setOpacity((float) 0.9);
		this.setLocation(position.getPosition(this));
		this.setContentPane(panneau_principal);
		this.setVisible(true);
		this.addMouseListener(this);
		/*
		 * instantiation of timers and the launch of the first timer that
		 * displays the notification according to the time given in parameter
		 */
		this.timerPrint = new Timer(delay, this);
		this.timerExit = new Timer(300, this);
		this.timerPrint.setRepeats(false);
		this.timerPrint.start();
	}
	
	public NPosition getPosition() {
		return position;
	}

	public void setPosition(NPosition position) {
		this.position = position;
	}
	
	/**
	 * Méthod to clear the Insets
	 * @params position
	 * */
	public void clear(NPosition position) {
		if (position == NPosition.TOP_LEFT) {
			topLeftInsets.y = topLeftInsets.y - this.getHeight() - blocSpacing; 
		} else if (position == NPosition.TOP_RIGHT) {
			topRightInsets.y = topRightInsets.y - this.getHeight() - blocSpacing ;			
		}else if(position == NPosition.BOTTOM_LEFT){
			bottomLeftInsets.y = bottomLeftInsets.y -  this.getHeight() - blocSpacing;
		}else if(position == NPosition.BOTTOM_RIGHT){
			bottomRightInsets.y = bottomRightInsets.y - this.getHeight() - blocSpacing;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// launched timers exit
		if (e.getSource() == timerPrint) {
			timerExit.start();
		}

		if (e.getSource() == timerExit) {
			if (this.getOpacity() > 0.1) {
				this.setOpacity((float) ((float) this.getOpacity() - 0.1));
			} else {
				if (timerExit.isRunning()) {
					timerExit.stop();
				}
				this.clear(this.getPosition());
				this.dispose();
			}
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// check that the cursor is on the notification at the exit timer is
		// started
		if (timerExit.isRunning()) {
			timerExit.stop();
			timerPrint.restart();
			if (timerPrint.isRunning()) {
				this.setOpacity((float) 0.9);
			}
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public Point getPosition(JDialog window) {
		return this.getLocation();
	}

}
