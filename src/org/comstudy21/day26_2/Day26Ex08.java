package org.comstudy21.day26_2;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
						//1
public class Day26Ex08 extends Myframe {
	// 필드로 콤포넌트를 선언해야 모든 멤버에서 접근 가능.
	//4.
	Label label = new Label("GridBagLayout");
	
		//2 생성자 생성
	public Day26Ex08() {
		//GridBagLayout 실습 - 화면의 정 가운데 배치된다.
		//5.
		setLayout(new GridBagLayout());
		
		add(label);
		add(new Button("OK"));
		add(new Button("Hello"));
		//3. 비져블
		setVisible(true);
	}
		
	public static void main(String[] args) {
		//2. 객체생성
		new Day26Ex08();
	}
}
