package org.comstudy21.day26;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// ex03 안보고 연습하기. 
public class Day26Ex04 extends Frame{
	
	public Day26Ex04() {
		init();
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});
	}
	
	private void init() {		
		this.setSize(1000, 1000);
		this.setBackground(Color.darkGray);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Day26Ex04();
	}
}

