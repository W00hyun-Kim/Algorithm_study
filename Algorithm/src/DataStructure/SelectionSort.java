package DataStructure;

import java.util.Scanner;

// #BJ1427 ������������ �ڸ��� �����ϱ�
public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int []arr = new int[input.length()];
		//�Է¹��� ���� �߶� �ϴ� �迭�� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(input.substring(i, i+1)); 
		}
		
		for (int i = 0; i < arr.length; i++) {
			int max = i;	//�� �տ� �ִ� ��
			for (int j = i+1; j < arr.length; j++) {	//���ư��鼭 �ִ밪 ���ϱ�
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			
			if(arr[i]<arr[max]) {	//�ִ밪�� �� �տ� �ֺ��� ũ�� �ڸ��� �ٲ��ش�.
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
