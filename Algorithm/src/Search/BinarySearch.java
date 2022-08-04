package Search;
//이진 탐색
import java.util.Arrays;
import java.util.Scanner;

//#BJ1120 원하는 정수 찾기
/*--
 * 데이터 개수와 찾아야할 숫자의 개수가 주어지고, 존재하면 1 없으면 0 출력
 */
public class BinarySearch {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int N = sc.nextInt();	//탐색할 데이터의 수 
		int[] A = new int[N];
		//탐색할 데이터를 1차원 배열에 저장한다.
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A); //오름차순으로 정렬한다 (이진탐색을 사용하기 위해서) 
		
		int M =sc.nextInt();
		for (int i=0; i < M; i++) {
			boolean find = false;		//타겟값이 데이터셋에 있는 지 여부를 확인하기 위해
			int target = sc.nextInt();
			
			//이진 탐색 시작
			int start = 0;	//시작 인덱스
			int end = A.length-1; //끝 인덱스
			while(start <= end) {
				int midi = (start+end)/2;	//중간값은 인덱스값을 이용해서 구하면 된다.
				int midValue =A[midi];
				if(midValue > target) {	//중간값이 타겟값보다 클 때 (왼쪽으로)
					end = midi -1;
				} else if(midValue < target) {	//중간값이 타겟값보다 작을 때 (오른쪽으로)
					start = midi + 1;
				} else {		//중간값이 타겟값과 같을 때
					find = true;
					break;
				}				
			} //while
			
			if(find) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			
			
		}
		
		
		
		
	}
}
