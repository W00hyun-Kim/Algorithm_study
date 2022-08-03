package DataStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAlgo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(1);//���� �տ� ������ �߰�
		list.addLast(2);//���� �ڿ� ������ �߰�
		list.add(3);//������ �߰�
		list.add(1, 10);//index 1�� ������ 10 �߰�
		
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		list2.removeFirst(); //���� ���� ������ ����
		list2.removeLast(); //���� ���� ������ ����
		list2.remove(); //������ 0��° index����
		list2.remove(1); //index 1 ����
		list2.clear(); //��� �� ����
		
		//������
		System.out.println(list.size()); //list ũ�� : 3

		//�� ���
		System.out.println(list.get(0));//0��° index ���
		
		for(Integer i : list) { //for���� ���� ��ü���
		    System.out.println(i);
		}

		Iterator<Integer> iter = list.iterator(); //Iterator ���� 
		while(iter.hasNext()){//�������� �ִ��� üũ
		    System.out.println(iter.next()); //�� ���
		}
		
		//�˻�
		System.out.println(list.contains(1)); //list�� 1�� �ִ��� �˻� : true
		System.out.println(list.indexOf(1)); //1�� �ִ� index��ȯ ������ -1
		
		
	}
	
	
}