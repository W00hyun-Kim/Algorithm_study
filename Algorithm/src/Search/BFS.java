package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//#BJ1260 DFS�� BFS ���α׷�
/*-- 
 * �׷����� DFS�� Ž���� ����� BFS�� Ž���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class BFS {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		//��� ����
		int M = sc.nextInt();		//���� ����
		int start = sc.nextInt();	//������
		A = new ArrayList[N+1];		//�׷��� ������ ��� ���� �迭
		for (int i = 1; i <= N; i++) {			//����� ���� ��ŭ �迭 �ʱ�ȭ
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {	//������ �������� for�� ������
			int S = sc.nextInt();		//�Է¹޴� ù��° ���
			int E = sc.nextInt();		//�Է¹޴� �� ���
			A[S].add(E);				//������̴ϱ� S�� E�� ����Ǿ������ϱ�.
			A[E].add(S);			
		}
		
		//��ȣ�� ���� �ͺ��� ����
		for (int i = 1; i <= N; i++) {	//1���� ������ ��带 ������������ ����
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N+1];	//�湮 �迭 �ʱ�ȭ�ϱ�
		DFS(start);
		System.out.println();
		visited = new boolean[N+1];	//�湮 �迭 �ʱ�ȭ�ϱ�
		BFS(start);
		System.out.println();
	}
	
	//DFS - ����Լ��� ���� 
	public static void DFS(int node) { 
		System.out.print(node + " ");	//ó���� ���� ��� ���
		visited[node] = true;			//�湮��� �����
		for(int i : A[node]) {	//�ش� ����� ��� ��ҵ��� �ݺ����� ������.
			if(!visited[i]) {	//�湮�ѰŸ� �������� �ȹ湮�ѰŸ� �ش� ����� ��Ҹ� �ٽúθ���.
				DFS(i);
			}
		}	
	}
	
	
	//BFS - Queue�� ����
	private static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);	//���� ��� �����ϱ�
		visited[node] = true;
		
		
		while(!queue.isEmpty()) {	//ť�� �ƹ��͵� ���� ������ ����
			int now_node = queue.poll();	//���� ��� �̾Ƽ� ����ϱ�
			System.out.print(now_node + " ");
			for (int i : A[now_node]) { //���� ����� ���� ��ҵ� Ȯ��
				if(!visited[i]) {		//���� �湮�� ���� ���ٸ�
					visited[i] = true;		//�湮�ߴٰ� �ϰ�
					queue.add(i);			//ù�湮�̸� add���ֱ�					
				}
			}			
		}		
	}
}
