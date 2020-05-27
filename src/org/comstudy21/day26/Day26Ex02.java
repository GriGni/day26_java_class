package org.comstudy21.day26;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
								//1.5		//5
public class Day26Ex02 extends Frame implements WindowListener { // 상속 캐스팅을 위해
	//2.
	public Day26Ex02() { //객체 생성 외부에서 접근
//		window.setSize(640, 480);
//		window.setBackground(Color.CYAN);
//		window.setVisible(true);
		//3.
		super.setSize(640, 480); // this로 가능 엄밀히말하면 super
		super.setBackground(Color.CYAN);
		super.setVisible(true);
		
		// 닫기 버튼에 이벤트 설정
		// 이벤트 인터페이스 상속 받기 --> 추상메서드 구현.
		//프레임을 상속받은 것이 
		//4.
		this.addWindowListener(this); //eventhandler(어떤 사건이 일어나면 어떻게 처리해라)(사건 --> 처리)
		
	}
	//이벤트리스너를 만드는 방법
	//1. 작업하고 있는 클래스슬 이벤트리스너를 상속받아서 처리
	//2. Inner 클래스안에 상속받은 윈도우클래스를 받아서 안에서 선언
	//3. 외부에 클래스 선언하고 객체 만들어서 선언.
	// annonymous 클래스 이용.
	
	
	public static void main(String[] args) {
		Frame window = new Day26Ex02(); //1.	
	}


	public void windowOpened(WindowEvent e) {}//안써도 구현, 열리고나서


	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 닫기 버튼 누름"); // 닫으면 나온다.
		dispose();
		System.exit(0);
	}


	public void windowClosed(WindowEvent e) {}


	public void windowIconified(WindowEvent e) {}


	public void windowDeiconified(WindowEvent e) {}


	public void windowActivated(WindowEvent e) {}


	public void windowDeactivated(WindowEvent e) {}
}
// 필요없는 메소드 처리 방법( 윈도우 아답타)