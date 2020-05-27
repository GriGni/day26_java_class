package org.comstudy21.day26_2;

import java.awt.BorderLayout;
import java.awt.Button;


//1
public class Day26Ex07 extends Myframe {
	//is a 관계이기 때문에 이 클래스는 Myframe 클래스이다.
	//2
	public Day26Ex07() {
		this("default window",100,200);
	}
	
	//4
	public Day26Ex07(String title, int w, int h) {
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
//		this.setLayout(new GridLayout(3, 2)); //this 생략됨 저절로
		//프레임의 디폴트 배치 관리자는 BorderLayout();
		
//		//플로우레이아웃에서 사용할 버튼 생성
//		this.add(new Button("버튼 1"),"North");
//		this.add(new Button("버튼 2"),"South");
//		this.add(new Button("버튼 3"),"Center");
//		this.add(new Button("버튼 4"),"East");
//		this.add(new Button("버튼 5"),"West");
		this.add(new Button("버튼 1"), BorderLayout.NORTH);
		this.add(new Button("버튼 2"), BorderLayout.SOUTH);
		this.add(new Button("버튼 3"), BorderLayout.CENTER);
		this.add(new Button("버튼 4"), BorderLayout.EAST);
		this.add(new Button("버튼 5"), BorderLayout.WEST);
	}


	public static void main(String[] args) {
		//객체 생성 하면 frame이 생성 된다.
		//3
		new Day26Ex07("레이아웃 메니져 연습", 400, 300);
	}
	
}
