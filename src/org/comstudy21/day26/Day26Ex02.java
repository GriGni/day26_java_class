package org.comstudy21.day26;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
								//1.5		//5
public class Day26Ex02 extends Frame implements WindowListener { // ��� ĳ������ ����
	//2.
	public Day26Ex02() { //��ü ���� �ܺο��� ����
//		window.setSize(640, 480);
//		window.setBackground(Color.CYAN);
//		window.setVisible(true);
		//3.
		super.setSize(640, 480); // this�� ���� ���������ϸ� super
		super.setBackground(Color.CYAN);
		super.setVisible(true);
		
		// �ݱ� ��ư�� �̺�Ʈ ����
		// �̺�Ʈ �������̽� ��� �ޱ� --> �߻�޼��� ����.
		//�������� ��ӹ��� ���� 
		//4.
		this.addWindowListener(this); //eventhandler(� ����� �Ͼ�� ��� ó���ض�)(��� --> ó��)
		
	}
	//�̺�Ʈ�����ʸ� ����� ���
	//1. �۾��ϰ� �ִ� Ŭ������ �̺�Ʈ�����ʸ� ��ӹ޾Ƽ� ó��
	//2. Inner Ŭ�����ȿ� ��ӹ��� ������Ŭ������ �޾Ƽ� �ȿ��� ����
	//3. �ܺο� Ŭ���� �����ϰ� ��ü ���� ����.
	// annonymous Ŭ���� �̿�.
	
	
	public static void main(String[] args) {
		Frame window = new Day26Ex02(); //1.	
	}


	public void windowOpened(WindowEvent e) {}//�Ƚᵵ ����, ��������


	public void windowClosing(WindowEvent e) {
		System.out.println("������ �ݱ� ��ư ����"); // ������ ���´�.
		dispose();
		System.exit(0);
	}


	public void windowClosed(WindowEvent e) {}


	public void windowIconified(WindowEvent e) {}


	public void windowDeiconified(WindowEvent e) {}


	public void windowActivated(WindowEvent e) {}


	public void windowDeactivated(WindowEvent e) {}
}
// �ʿ���� �޼ҵ� ó�� ���( ������ �ƴ�Ÿ)