package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//#BJ11724 ���� ����� ���� ���ϱ�
public class DFS {
	//n: ��尳��, m: ��������, A: �׷��� ������ ���� ���� ����Ʈ, visited: �湮���� Ȯ�� �迭
	
	static ArrayList<Integer>[] A;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	// �� ���� �� �޴� ����
		int n = Integer.parseInt(st.nextToken());	//��� ����
		int m = Integer.parseInt(st.nextToken());	//���� ����
		A = new ArrayList[n+1]; //��尳�� + 1 
		visited = new boolean[n+1];
		
		//��������Ʈ �ʱ�ȭ�ϱ�
		for (int i = 1; i < n+1; i++) {
			A[i] = new ArrayList<Integer>(); //��� ������ŭ arrayList�� ������ش�.
		}
		
		for (int i = 0; i < m; i++) {	//������ ������ŭ �ݺ���������
			st = new StringTokenizer(br.readLine());	//�� ���� 
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			A[start].add(end);
			A[end].add(start);			
		}
		
		int cnt= 0;		//�湮���� ���� ��尡 ���� ������ �ݺ��Ѵ�. �� �� ���� ���Ҵ� �� Ȯ��
		for (int i = 1; i < n+1; i++) {
			if(!visited[i]) {
				cnt ++;
				DFS(i);
			}
		}		
		System.out.println(cnt);		
	}
	
	//����Լ��� Ž�� ����
	static void DFS(int v) {
		if(visited[v]) {	//�湮 �迭 Ȯ�� �� �湮������ return
			return;
		}
		visited[v] = true;	//�湮 �������� ���� ��� �湮�Ѱɷ� ǥ��
		for (int i : A[v]) {	//�׷��� ���� ����Ʈ �ݺ��� ������
			if(visited[i] == false) {	//�湮 �������� ����Լ� �ٽ� ������
				DFS(i);
			}
		}
	}
}
