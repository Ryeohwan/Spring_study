package com.ssafy.cafe;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyservletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("MyservletRequestListener requestDestroyed ȣ���");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("MyservletRequestListener requestInitialized ȣ���");
	}

}
