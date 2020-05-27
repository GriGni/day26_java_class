package org.comstudy21.day26_2;

import java.awt.*;

public class Day26Ex10 extends Myframe {
	// 생성자를 만들고
	Label label = new Label("pleae press the button located at the bottom");
	Button[] btn = new Button[4];
	
	Panel centerPanel = new Panel(new GridBagLayout());
	Panel bottomPanel = new Panel(new GridLayout(1, 3));
	Panel sideBottomPanel = new Panel(new GridLayout(2, 1));
	
	public Day26Ex10() {
		//배열 생성자를 만들고
		btn[0] = new Button("PLAY");
		btn[1] = new Button("STOP");
		btn[2] = new Button("NEXT");
		btn[3] = new Button("PREV");
		
		// 가운데 패널에 add(값)을 넣어주고 
		centerPanel.add(label);
		bottomPanel.add(btn[0]);
		bottomPanel.add(btn[1]);
		bottomPanel.add(sideBottomPanel);
		sideBottomPanel.add(btn[2]);
		sideBottomPanel.add(btn[3]);
		// 여기서 화면에 넣어준다.
		this.add(centerPanel);
		this.add(BorderLayout.SOUTH, bottomPanel);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new Day26Ex10();

	}
}
