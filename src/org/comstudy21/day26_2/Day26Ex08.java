package org.comstudy21.day26_2;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
						//1
public class Day26Ex08 extends Myframe {
	// �ʵ�� ������Ʈ�� �����ؾ� ��� ������� ���� ����.
	//4.
	Label label = new Label("GridBagLayout");
	
		//2 ������ ����
	public Day26Ex08() {
		//GridBagLayout �ǽ� - ȭ���� �� ��� ��ġ�ȴ�.
		//5.
		setLayout(new GridBagLayout());
		
		add(label);
		add(new Button("OK"));
		add(new Button("Hello"));
		//3. ������
		setVisible(true);
	}
		
	public static void main(String[] args) {
		//2. ��ü����
		new Day26Ex08();
	}
}
