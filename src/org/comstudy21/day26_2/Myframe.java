package org.comstudy21.day26_2;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
						//1.
public class Myframe extends Frame {
	// 중복된 기능이 없게 만드는 것이 좋다.
	//2.
	public Myframe() {
		this(500,500);// 3. 
		
	}//4 
	public Myframe(int width, int height) {
//		setTitle("My Frame");
		//5
		this("MyFrame", width, height);
//		setSize(width, height);
//		setVisible(true);// 맨 마지막에 위치시킨다.
	}//6
	public Myframe(String string, int width, int height) {
		this.setTitle("My Frame");
		this.setSize(width, height);
		//7 //8(마우스 오른쪽 클릭)
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});
	}
	public static void main(String[] args) {
		// 단위테스트(TDD - 테스트 주도 개발)
		Myframe window = new Myframe("MyFrame test", 500, 500);
		window.setVisible(true);
		
		
	}
}
