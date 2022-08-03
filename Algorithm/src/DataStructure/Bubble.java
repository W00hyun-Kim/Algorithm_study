package DataStructure;
import java.util.Iterator;
import java.util.Scanner;

//#2750 수 정렬하기 
public class Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		
		//몇 개의 수를 정렬할 것인가?
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		//swap하다보면 N-1까지 돌게된다.
		for (int i = 0; i < N-1; i++) {
			//각 루프에서 swap의 횟수는 (N-1)--임
			for (int j = 0; j < N-1-i; j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}
	}
}
