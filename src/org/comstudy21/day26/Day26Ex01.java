package org.comstudy21.day26;

import java.awt.Color;
import java.awt.Frame;

public class Day26Ex01 {
	public static void main(String[] args) {
		//프레임(윈도우창) 생성하기
		
		Frame window = new Frame(); //객체 생성
		window.setSize(640, 480);
		window.setBackground(Color.CYAN);
		window.setVisible(true);
		
		// 프레임 종료 이벤트 처리.(닫기 기능에 붙여준다)
		
		
	}

}
