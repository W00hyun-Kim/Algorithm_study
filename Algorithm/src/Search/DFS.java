package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//#BJ11724 연결 요소의 개수 구하기
public class DFS {
	//n: 노드개수, m: 에지개수, A: 그래프 데이터 저장 인접 리스트, visited: 방문여부 확인 배열
	
	static ArrayList<Integer>[] A;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	// 양 끝점 값 받는 라인
		int n = Integer.parseInt(st.nextToken());	//노드 개수
		int m = Integer.parseInt(st.nextToken());	//에지 개수
		A = new ArrayList[n+1]; //노드개수 + 1 
		visited = new boolean[n+1];
		
		//인접리스트 초기화하기
		for (int i = 1; i < n+1; i++) {
			A[i] = new ArrayList<Integer>(); //노드 개수만큼 arrayList를 만들어준다.
		}
		
		for (int i = 0; i < m; i++) {	//에지의 개수만큼 반복문돌리기
			st = new StringTokenizer(br.readLine());	//양 끝점 
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			A[start].add(end);
			A[end].add(start);			
		}
		
		int cnt= 0;		//방문하지 않은 노드가 없을 때까지 반복한다. 총 몇 바퀴 돌았는 지 확인
		for (int i = 1; i < n+1; i++) {
			if(!visited[i]) {
				cnt ++;
				DFS(i);
			}
		}		
		System.out.println(cnt);		
	}
	
	//재귀함수로 탐색 구현
	static void DFS(int v) {
		if(visited[v]) {	//방문 배열 확인 후 방문했으면 return
			return;
		}
		visited[v] = true;	//방문 안했으면 현재 노드 방문한걸로 표시
		for (int i : A[v]) {	//그래프 인접 리스트 반복문 돌리기
			if(visited[i] == false) {	//방문 안했으면 재귀함수 다시 돌리기
				DFS(i);
			}
		}
	}
}
