package DataStructure;
import java.util.Scanner;
import java.util.Stack;

//숫자의 합 구하기
public class StackAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num = 1;
		boolean result = true;
		
		for (int i = 0; i < A.length; i++) {
			int su = A[i];					//현재 수열의 수
			if(su >= num) {					//현재 수열 값 --> 오름차순 자연수 : 같아질 때까지 push()
				while(su >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} 
			
			else {							//현재 수열 값 < 오름차순 자연수 : pop()으로 꺼내기
				int n = stack.pop();
				//스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
				if(n > su) {
					System.out.println("No");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}	
		}
		if(result) {
			System.out.println(bf.toString());
		}
	}
}
