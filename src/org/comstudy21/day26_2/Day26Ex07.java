package org.comstudy21.day26_2;

import java.awt.BorderLayout;
import java.awt.Button;


//1
public class Day26Ex07 extends Myframe {
	//is a �����̱� ������ �� Ŭ������ Myframe Ŭ�����̴�.
	//2
	public Day26Ex07() {
		this("default window",100,200);
	}
	
	//4
	public Day26Ex07(String title, int w, int h) {
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
//		this.setLayout(new GridLayout(3, 2)); //this ������ ������
		//�������� ����Ʈ ��ġ �����ڴ� BorderLayout();
		
//		//�÷ο췹�̾ƿ����� ����� ��ư ����
//		this.add(new Button("��ư 1"),"North");
//		this.add(new Button("��ư 2"),"South");
//		this.add(new Button("��ư 3"),"Center");
//		this.add(new Button("��ư 4"),"East");
//		this.add(new Button("��ư 5"),"West");
		this.add(new Button("��ư 1"), BorderLayout.NORTH);
		this.add(new Button("��ư 2"), BorderLayout.SOUTH);
		this.add(new Button("��ư 3"), BorderLayout.CENTER);
		this.add(new Button("��ư 4"), BorderLayout.EAST);
		this.add(new Button("��ư 5"), BorderLayout.WEST);
	}


	public static void main(String[] args) {
		//��ü ���� �ϸ� frame�� ���� �ȴ�.
		//3
		new Day26Ex07("���̾ƿ� �޴��� ����", 400, 300);
	}
	
}
