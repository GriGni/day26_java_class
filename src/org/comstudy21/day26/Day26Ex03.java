package org.comstudy21.day26;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
						//������ 1.
public class Day26Ex03 extends Frame {

	public Day26Ex03() {//3
		init();//4
		//windowadapter �͸�Ŭ���� Ȱ��. ������ ���ÿ� ��ü ����
		//5
		addWindowListener(new WindowAdapter() {
			
			// �̰��� Ŭ������ ����� �޼ҵ������� �׷��� {} �ȿ� �޼ҵ� �������̵带 �Ѵ�.
						//6
						// �޼ҵ� �������̵�(������) �Ѵ�.
						//������ �ƴ�Ÿ�� ������ �����ʸ� ������ Ŭ������.
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	//4-1
	private void init() {
		//4-2
		setSize(400, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		//2
		new Day26Ex03(); // �������� ���� �ʿ���� ��� - ������ ���� ���.
	}
}
