package com.sbix.jnotify;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JDialog;

public interface ScreenDimension {

	// screen size
	public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public int heightScreen = screenSize.height;
	public int widthScreen = screenSize.width;

	/*
	 * this variable contains the number of pixels between two notification are
	 * displayed simultaneously
	 */
	public int blocSpacing = 4;

	public Insets screenInsets = NotifyType.getScreenInsets();

	public Point topRightInsets = new Point(screenInsets.right,
			screenInsets.top);
	public Point topLeftInsets = new Point(screenInsets.left, screenInsets.top);
	public Point bottomRightInsets = new Point(screenInsets.right,
			screenInsets.bottom);
	public Point bottomLeftInsets = new Point(screenInsets.left,
			screenInsets.bottom);

	public Point getPosition(JDialog window);

}
