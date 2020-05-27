package org.comstudy21.day26_2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

//1
public class Day26Ex06 extends Myframe {
	//is a �����̱� ������ �� Ŭ������ Myframe Ŭ�����̴�.
	//2
	public Day26Ex06() {
		this("default window",100,200);
	}
	
	//4
	public Day26Ex06(String title, int w, int h) {
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
		this.setLayout(new GridLayout(3, 2)); //this ������ ������
		
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
		new Day26Ex06("���̾ƿ� �޴��� ����", 400, 300);
	}
	
}
