package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//#BJ11004 K번째 수 구하기
public class QuickSort {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());	//첫번 째 줄 받기
		int N = Integer.parseInt(st.nextToken()); //숫자의 개수
		int K = Integer.parseInt(st.nextToken()); //K번째 수
		
		st = new StringTokenizer(in.readLine());	//다음 줄 받아서 자르기
		int[] arr = new int[N];						//숫자의 개수만큼 배열 크기 설정하기
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	//토큰 단위로 잘라서 배열에 넣기
		}
		
		quickSort(arr,0,N-1,K-1); //인덱스가 0부터 시작이니까 -1씩
		System.out.println(arr[K-1]);	//k번째 수 출력하기		
		
	}
	
	//k의 위치에 따라 pivot 위치 지정 다르게 하기
	public static void quickSort(int[] arr, int start, int end, int k) {
		if(start < end) { 
			int pivot = partition(arr,start,end);	//피벗의 index값임
			if(pivot == k) {
				return;
			} else if(k < pivot) {
				quickSort(arr, start, pivot-1, k);
			} else {
				quickSort(arr, pivot+1, end, k);
			}			
		}
	}
	
	
	//중간값 구해서 중간에 pivot 끼워넣는 함수
	public static int partition(int[] arr, int start, int end) {
		int med = (start + end)/2;
		swap(arr, start, med);
		int pivot = arr[start];		//피벗을 맨 앞으로 배치
		int i = start; int j = end;
		while(i<j) {		//start랑 end가 올바른 위치에 있을 때
			while(pivot < arr[j]) { //end가 pivot보다 클 때
				j --;
			}
			
			while(pivot > arr[i]) { //start가 pivot보다 작을 때
				i ++;
			}
			//start랑 end가 가운데서 만나게되면 (while끝나면)
			swap(arr,i,j);	//start랑 end 자리를 바꾼다.
		}
		//start와 pivot을 바꿔준다.
		arr[start] = arr[i];
		arr[i] = pivot;
		
		return i;	//pivot의 인덱스값을 반환한다.		
	}
	
	
	//swap 함수
	public static void swap (int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
