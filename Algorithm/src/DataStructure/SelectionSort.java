package DataStructure;

import java.util.Scanner;

// #BJ1427 내림차순으로 자릿수 정렬하기
public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int []arr = new int[input.length()];
		//입력받은 것을 잘라서 일단 배열에 넣음
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(input.substring(i, i+1)); 
		}
		
		for (int i = 0; i < arr.length; i++) {
			int max = i;	//맨 앞에 있는 애
			for (int j = i+1; j < arr.length; j++) {	//돌아가면서 최대값 구하기
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			
			if(arr[i]<arr[max]) {	//최대값이 맨 앞에 애보다 크면 자리를 바꿔준다.
				int temp = arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
}
