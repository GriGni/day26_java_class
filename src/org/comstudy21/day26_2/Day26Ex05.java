package org.comstudy21.day26_2;

import java.awt.Button;
import java.awt.FlowLayout;

//1
public class Day26Ex05 extends Myframe {
	//is a �����̱� ������ �� Ŭ������ Myframe Ŭ�����̴�.
	//2
	public Day26Ex05() {
		this("default window",100,200);
	}
	
	//4
	public Day26Ex05(String title, int w, int h) {
		//�θ��� ������ ȣ��
		//5
		super(title, w, h);
		
		//���̾ƿ� ����
		initLayout();
		
		//Myframe���� setvisible()������ ����.
		//��� ���� �Ŀ� �������� ȣ��.
		setVisible(true);
	}


	private void initLayout() {
		//FlowLayout���� ����.
		this.setLayout(new FlowLayout()); //this ������ ������
		
		//�÷ο췹�̾ƿ����� ����� ��ư ����
		this.add(new Button("��ư 1"));
		this.add(new Button("��ư 2"));
		this.add(new Button("��ư 3"));
		this.add(new Button("��ư 4"));
		this.add(new Button("��ư 5"));
		this.add(new Button("��ư 6"));
	}


	public static void main(String[] args) {
		//��ü ���� �ϸ� frame�� ���� �ȴ�.
		//3
		new Day26Ex05("���̾ƿ� �޴��� ����", 400, 300);
	}
	
}
