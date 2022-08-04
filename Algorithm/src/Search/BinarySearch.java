package Search;
//���� Ž��
import java.util.Arrays;
import java.util.Scanner;

//#BJ1120 ���ϴ� ���� ã��
/*--
 * ������ ������ ã�ƾ��� ������ ������ �־�����, �����ϸ� 1 ������ 0 ���
 */
public class BinarySearch {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int N = sc.nextInt();	//Ž���� �������� �� 
		int[] A = new int[N];
		//Ž���� �����͸� 1���� �迭�� �����Ѵ�.
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A); //������������ �����Ѵ� (����Ž���� ����ϱ� ���ؼ�) 
		
		int M =sc.nextInt();
		for (int i=0; i < M; i++) {
			boolean find = false;		//Ÿ�ٰ��� �����ͼ¿� �ִ� �� ���θ� Ȯ���ϱ� ����
			int target = sc.nextInt();
			
			//���� Ž�� ����
			int start = 0;	//���� �ε���
			int end = A.length-1; //�� �ε���
			while(start <= end) {
				int midi = (start+end)/2;	//�߰����� �ε������� �̿��ؼ� ���ϸ� �ȴ�.
				int midValue =A[midi];
				if(midValue > target) {	//�߰����� Ÿ�ٰ����� Ŭ �� (��������)
					end = midi -1;
				} else if(midValue < target) {	//�߰����� Ÿ�ٰ����� ���� �� (����������)
					start = midi + 1;
				} else {		//�߰����� Ÿ�ٰ��� ���� ��
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
