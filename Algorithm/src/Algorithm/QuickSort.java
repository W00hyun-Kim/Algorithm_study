package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//#BJ11004 K��° �� ���ϱ�
public class QuickSort {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());	//ù�� ° �� �ޱ�
		int N = Integer.parseInt(st.nextToken()); //������ ����
		int K = Integer.parseInt(st.nextToken()); //K��° ��
		
		st = new StringTokenizer(in.readLine());	//���� �� �޾Ƽ� �ڸ���
		int[] arr = new int[N];						//������ ������ŭ �迭 ũ�� �����ϱ�
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	//��ū ������ �߶� �迭�� �ֱ�
		}
		
		quickSort(arr,0,N-1,K-1); //�ε����� 0���� �����̴ϱ� -1��
		System.out.println(arr[K-1]);	//k��° �� ����ϱ�		
		
	}
	
	//k�� ��ġ�� ���� pivot ��ġ ���� �ٸ��� �ϱ�
	public static void quickSort(int[] arr, int start, int end, int k) {
		if(start < end) { 
			int pivot = partition(arr,start,end);	//�ǹ��� index����
			if(pivot == k) {
				return;
			} else if(k < pivot) {
				quickSort(arr, start, pivot-1, k);
			} else {
				quickSort(arr, pivot+1, end, k);
			}			
		}
	}
	
	
	//�߰��� ���ؼ� �߰��� pivot �����ִ� �Լ�
	public static int partition(int[] arr, int start, int end) {
		int med = (start + end)/2;
		swap(arr, start, med);
		int pivot = arr[start];		//�ǹ��� �� ������ ��ġ
		int i = start; int j = end;
		while(i<j) {		//start�� end�� �ùٸ� ��ġ�� ���� ��
			while(pivot < arr[j]) { //end�� pivot���� Ŭ ��
				j --;
			}
			
			while(pivot > arr[i]) { //start�� pivot���� ���� ��
				i ++;
			}
			//start�� end�� ����� �����ԵǸ� (while������)
			swap(arr,i,j);	//start�� end �ڸ��� �ٲ۴�.
		}
		//start�� pivot�� �ٲ��ش�.
		arr[start] = arr[i];
		arr[i] = pivot;
		
		return i;	//pivot�� �ε������� ��ȯ�Ѵ�.		
	}
	
	
	//swap �Լ�
	public static void swap (int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
