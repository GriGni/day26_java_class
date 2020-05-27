package org.comstudy21.day26_3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	
	public MyFrame() {
		this("title", 300, 500);
	}
	
	public MyFrame(String title, int i, int j) {
		setTitle("Calculater");
		setSize(300,500);
		setBackground(Color.LIGHT_GRAY);
		
		//예외처리
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				super.windowClosing(e);
			}
			
		});
	}

	public static void main(String[] args) {
		
		MyFrame myF = new MyFrame("Calculator",300,500);
		myF.setVisible(true);
	
	}
}
