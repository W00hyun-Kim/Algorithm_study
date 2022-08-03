package Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//#2164 카드게임
public class QueueAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //카드의 장수
		Queue<Integer> myQueue = new LinkedList<>();
		
		//일단 큐에 카드를 1부터 넣어준다.
		for (int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		
		//카드가 한장 남을 때까지 실행
		while(myQueue.size() > 1) {
			myQueue.poll();		//맨 윗장 카드를 버린다.
			myQueue.add(myQueue.poll());	//두번째 장을 버리고 그걸 다시 넣는다.
		}
		
		System.out.println(myQueue.poll());//마지막으로 남은 애를 뽑아서 출력
		
		
	}
}
