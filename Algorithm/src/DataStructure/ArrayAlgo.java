package DataStructure;

import java.util.Scanner;

//#BJ11720 숫자의 합 구하기
public class ArrayAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.next();
		
		int[] arr = new int[input.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(input.substring(i, i+1));
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}
}
