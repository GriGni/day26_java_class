package org.comstudy21.day26_2;

import java.awt.*;

public class Day26Ex09 extends Myframe {
	//3
	Label centerLabel = new Label("press the button located at the bottom.");
	Button[] btnArr = new Button[3];
	
	//5
	Panel centerPanel = new Panel(new GridBagLayout());
	Panel bottomPanel = new Panel(new GridLayout(1, 3));
	
	public Day26Ex09() {
		//4
		btnArr[0] = new Button("OK");
		btnArr[1] = new Button("CANCEL");
		btnArr[2] = new Button("EXIT");
		
		//6
		centerPanel.add(centerLabel);
		bottomPanel.add(btnArr[0]);
		bottomPanel.add(btnArr[1]);
		bottomPanel.add(btnArr[2]);
		
		add(centerPanel);
		add(BorderLayout.SOUTH, bottomPanel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day26Ex09();
	}
}
