package org.comstudy21.day26_2;

import java.awt.Button;
import java.awt.FlowLayout;

//1
public class Day26Ex05 extends Myframe {
	//is a 관계이기 때문에 이 클래스는 Myframe 클래스이다.
	//2
	public Day26Ex05() {
		this("default window",100,200);
	}
	
	//4
	public Day26Ex05(String title, int w, int h) {
		//부모의 생성자 호출
		//5
		super(title, w, h);
		
		//레이아웃 설정
		initLayout();
		
		//Myframe에는 setvisible()설정이 없다.
		//모든 설정 후에 마지막에 호출.
		setVisible(true);
	}


	private void initLayout() {
		//FlowLayout으로 설정.
		this.setLayout(new FlowLayout()); //this 생략됨 저절로
		
		//플로우레이아웃에서 사용할 버튼 생성
		this.add(new Button("버튼 1"));
		this.add(new Button("버튼 2"));
		this.add(new Button("버튼 3"));
		this.add(new Button("버튼 4"));
		this.add(new Button("버튼 5"));
		this.add(new Button("버튼 6"));
	}


	public static void main(String[] args) {
		//객체 생성 하면 frame이 생성 된다.
		//3
		new Day26Ex05("레이아웃 메니져 연습", 400, 300);
	}
	
}
