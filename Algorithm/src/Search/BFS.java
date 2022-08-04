package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//#BJ1260 DFS와 BFS 프로그램
/*-- 
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 */
public class BFS {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		//노드 개수
		int M = sc.nextInt();		//에지 개수
		int start = sc.nextInt();	//시작점
		A = new ArrayList[N+1];		//그래프 정보를 담기 위한 배열
		for (int i = 1; i <= N; i++) {			//노드의 개수 만큼 배열 초기화
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {	//에지의 개수까지 for문 돌리기
			int S = sc.nextInt();		//입력받는 첫번째 노드
			int E = sc.nextInt();		//입력받는 끝 노드
			A[S].add(E);				//양방향이니까 S가 E랑 연결되어있으니까.
			A[E].add(S);			
		}
		
		//번호가 작은 것부터 정렬
		for (int i = 1; i <= N; i++) {	//1부터 끝까지 노드를 오름차순으로 정리
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N+1];	//방문 배열 초기화하기
		DFS(start);
		System.out.println();
		visited = new boolean[N+1];	//방문 배열 초기화하기
		BFS(start);
		System.out.println();
	}
	
	//DFS - 재귀함수로 구현 
	public static void DFS(int node) { 
		System.out.print(node + " ");	//처음에 넣은 요소 출력
		visited[node] = true;			//방문기록 남기기
		for(int i : A[node]) {	//해당 노드의 모든 요소들을 반복으로 돌린다.
			if(!visited[i]) {	//방문한거면 지나가고 안방문한거면 해당 요소의 요소를 다시부른다.
				DFS(i);
			}
		}	
	}
	
	
	//BFS - Queue로 구현
	private static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);	//시작 노드 삽입하기
		visited[node] = true;
		
		
		while(!queue.isEmpty()) {	//큐에 아무것도 없을 때까지 실행
			int now_node = queue.poll();	//현재 노드 뽑아서 출력하기
			System.out.print(now_node + " ");
			for (int i : A[now_node]) { //현재 노드의 연결 요소들 확인
				if(!visited[i]) {		//만약 방문한 적이 없다면
					visited[i] = true;		//방문했다고 하고
					queue.add(i);			//첫방문이면 add해주기					
				}
			}			
		}		
	}
}
