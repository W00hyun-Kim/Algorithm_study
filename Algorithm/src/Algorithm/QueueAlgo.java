package Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//#2164 ī�����
public class QueueAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //ī���� ���
		Queue<Integer> myQueue = new LinkedList<>();
		
		//�ϴ� ť�� ī�带 1���� �־��ش�.
		for (int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		
		//ī�尡 ���� ���� ������ ����
		while(myQueue.size() > 1) {
			myQueue.poll();		//�� ���� ī�带 ������.
			myQueue.add(myQueue.poll());	//�ι�° ���� ������ �װ� �ٽ� �ִ´�.
		}
		
		System.out.println(myQueue.poll());//���������� ���� �ָ� �̾Ƽ� ���
		
		
	}
}
