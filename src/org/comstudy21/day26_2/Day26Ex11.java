package org.comstudy21.day26_2;

import java.awt.*;

public class Day26Ex11 extends Myframe {
	
	Label label = new Label("Please press the button located at the left");
	Button [] btn = new Button[6];
	
	Panel centerPanel = new Panel(new GridBagLayout());
	Panel leftPanel = new Panel(new GridLayout(3,1)); // 3개로 토막
//	Panel panel1 = new Panel(new GridLayout(1,2));
	Panel panel1 = new Panel(new GridLayout(1,2, 10, 10)); // 간격만들기 뒤에 2개.
	Panel panel2 = new Panel(new GridLayout(1,2));
//	Panel mergePanel = new Panel(new GridLayout(1,2)); // 이렇게 하면 안에 또 나뉜다.
	
	public Day26Ex11() {
		btn[0] = new Button("1");
		btn[1] = new Button("2");
		btn[2] = new Button("3");
		btn[3] = new Button("4");
		btn[4] = new Button("5");
		
		centerPanel.add(label);
		panel1.add(btn[0]); // 작게 만들어서
		panel1.add(btn[1]);
		leftPanel.add(panel1); // 큰 곳에넣어라
		panel2.add(btn[2]);
		panel2.add(btn[3]);
		leftPanel.add(panel2);
		leftPanel.add(btn[4]);
		
		this.add(centerPanel);
		this.add(BorderLayout.WEST,leftPanel);
		
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day26Ex11();
	}
}
