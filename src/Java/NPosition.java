package com.sbix.jnotify;

import java.awt.Point;

import javax.swing.JDialog;

public enum NPosition implements ScreenDimension {
	TOP_LEFT {
		public Point getPosition(JDialog window) {
			final int x = topLeftInsets.x;
			final int y = topLeftInsets.y;
			topLeftInsets.y += window.getHeight() + blocSpacing;  
			return new Point(x, y);
		}
	},
	TOP_RIGHT {
		public Point getPosition(JDialog window) {
			final int x = widthScreen - topRightInsets.x - window.getWidth();
			final int y = topRightInsets.y;
			topRightInsets.y += window.getHeight() + blocSpacing;
			return new Point(x, y);
		}
	},
	BOTTOM_LEFT{
		public Point getPosition(JDialog window) {
			final int x = bottomLeftInsets.x;
			final int y = heightScreen - bottomLeftInsets.y - window.getHeight();
			bottomLeftInsets.y +=  window.getHeight() + blocSpacing;
			return new Point(x, y);
		}
	},
	BOTTOM_RIGHT{
		public Point getPosition(JDialog window) {
			final int x = widthScreen - window.getWidth()-bottomRightInsets.x;
			final int y = heightScreen - bottomRightInsets.y - window.getHeight();
			bottomRightInsets.y +=  window.getHeight() + blocSpacing;
			return new Point(x, y);
		}
	},
	CENTER{
		public Point getPosition(JDialog window) {
			final int x = widthScreen/2 - window.getWidth()/2;
			final int y = heightScreen/2 - window.getHeight()/2;
			return new Point(x, y);
		}
	}

}
