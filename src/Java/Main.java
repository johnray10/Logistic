package com.sbix.jnotify;


public class Main {

	
	public static void main(String[] args) {
		String str = "Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression. Le Lorem Ipsum est le faux texte "
				+ "standard de l'imprimerie depuis les années 1500, quand un ";
		
		new NotifyWindow(NotifyType.DEFAULT_NOTIFICATION, str,
				NotifyWindow.NORMAL_DELAY, NPosition.TOP_RIGHT);

		new NotifyWindow(NotifyType.SUCCESS_NOTIFICATION, str,
				NotifyWindow.NORMAL_DELAY, NPosition.TOP_RIGHT);
	}
}
