package org.comstudy21.day26;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
						//순서도 1.
public class Day26Ex03 extends Frame {

	public Day26Ex03() {//3
		init();//4
		//windowadapter 익명클래스 활용. 구현과 동시에 객체 생성
		//5
		addWindowListener(new WindowAdapter() {
			
			// 이것은 클래스다 생긴건 메소드이지만 그래서 {} 안에 메소드 오버라이드를 한다.
						//6
						// 메소드 오버라이드(재정의) 한다.
						//윈도우 아답타는 윈도우 리스너를 구현한 클래스다.
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	//4-1
	private void init() {
		//4-2
		setSize(400, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		//2
		new Day26Ex03(); // 참조변수 만들 필요없을 경우 - 참조를 안할 경우.
	}
}
