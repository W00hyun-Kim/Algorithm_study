package DataStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAlgo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(1);//가장 앞에 데이터 추가
		list.addLast(2);//가장 뒤에 데이터 추가
		list.add(3);//데이터 추가
		list.add(1, 10);//index 1에 데이터 10 추가
		
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		list2.removeFirst(); //가장 앞의 데이터 제거
		list2.removeLast(); //가장 뒤의 데이터 제거
		list2.remove(); //생략시 0번째 index제거
		list2.remove(1); //index 1 제거
		list2.clear(); //모든 값 제거
		
		//사이즈
		System.out.println(list.size()); //list 크기 : 3

		//값 출력
		System.out.println(list.get(0));//0번째 index 출력
		
		for(Integer i : list) { //for문을 통한 전체출력
		    System.out.println(i);
		}

		Iterator<Integer> iter = list.iterator(); //Iterator 선언 
		while(iter.hasNext()){//다음값이 있는지 체크
		    System.out.println(iter.next()); //값 출력
		}
		
		//검색
		System.out.println(list.contains(1)); //list에 1이 있는지 검색 : true
		System.out.println(list.indexOf(1)); //1이 있는 index반환 없으면 -1
		
		
	}
	
	
}