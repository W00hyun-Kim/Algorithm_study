package DataStructure;
import java.util.Iterator;
import java.util.Scanner;

//#2750 �� �����ϱ� 
public class Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		
		//�� ���� ���� ������ ���ΰ�?
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		//swap�ϴٺ��� N-1���� ���Եȴ�.
		for (int i = 0; i < N-1; i++) {
			//�� �������� swap�� Ƚ���� (N-1)--��
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
