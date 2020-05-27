package org.comstudy21.day26_3;

import java.awt.*;

public class Layout_Calculator extends MyFrame {
	
	// 버튼은 28개.
	
	Label textLabel = new Label("Text Field");
	
	Panel topPanel = new Panel(new GridBagLayout());
	Panel leftPanel = new Panel(new GridLayout(6,1));
	Panel leftDivPanel = new Panel(new GridLayout(5,2));
	Panel middlePanel = new Panel(new GridLayout(6,2));
	Panel rightPanel = new Panel(new GridLayout(5,1));
	Panel rightDivPanel = new Panel(new GridLayout(4,1));
	
	Button[] btn = {
			new Button("MC"),new Button("MR"),new Button("MS"),new Button("M+"),new Button("M-"),
			new Button("<--"),new Button("CE"),new Button("C"),new Button("±"),new Button("√"),
			new Button("7"),new Button("8"),new Button("9"),new Button("/"),new Button("%"),
			new Button("4"),new Button("5"),new Button("6"),new Button("*"),new Button("1/X"),
			new Button("1"),new Button("2"),new Button("3"),new Button("-"),new Button("="),
			new Button("0"),new Button("."),new Button("+")
			};
	
	public Layout_Calculator() {
		
		topPanel.add(textLabel);		
		leftDivPanel.add(btn[0]);
		leftDivPanel.add(btn[1]);
		leftDivPanel.add(btn[5]);
		leftDivPanel.add(btn[6]);
		leftDivPanel.add(btn[10]);
		leftDivPanel.add(btn[11]);
		leftDivPanel.add(btn[15]);
		leftDivPanel.add(btn[16]);
		leftPanel.add(leftDivPanel);
		leftPanel.add(btn[25]);
		middlePanel.add(btn[2]);
		middlePanel.add(btn[3]);
		middlePanel.add(btn[7]);
		middlePanel.add(btn[8]);
		middlePanel.add(btn[12]);
		middlePanel.add(btn[13]);
		middlePanel.add(btn[17]);
		middlePanel.add(btn[18]);
		middlePanel.add(btn[22]);
		middlePanel.add(btn[23]);
		rightDivPanel.add(btn[4]);
		rightDivPanel.add(btn[9]);
		rightDivPanel.add(btn[14]);
		rightDivPanel.add(btn[19]);
		rightPanel.add(rightDivPanel);
		rightPanel.add(btn[24]);
		
//		this.add(BorderLayout.NORTH, topPanel);
		this.add(BorderLayout.CENTER, middlePanel);
		this.add(BorderLayout.WEST, leftPanel);
		this.add(BorderLayout.EAST, rightPanel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Layout_Calculator();
	}
}
