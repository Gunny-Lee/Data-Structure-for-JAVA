package array;

import java.util.ArrayList;
import java.util.LinkedList;

public class ideone {

	public static void main(String[] args) {
		// 배열은 value와 index로 구성, 둘을 합치면 element
		// 배열 선언시에는 value의 갯수를 정하며 선언, 이 갯수를 length라고 함
		int[] numbers1 = new int[4];
		
		String[] strings = new String[4];
		
		numbers1[0]=10;
		numbers1[1]=20;
		numbers1[2]=30;
		// value의 갯수는 4개인데, 값은 3개만 있음 -> int배열은 0, String배열은 null값이 디폴트로 들어감
		
		// 배열을 한방에 선언 가능
		int[] numbers2 = {10, 20, 30, 40};
		int[] numbers3 = new int[] {10, 20, 30, 40};
		
		// 값 출력
		System.out.println("System.out.println(numbers1[0]);");
		System.out.println(numbers1[0]);
 
		System.out.println("System.out.println(numbers1[3]);");
		System.out.println(numbers1[3]);
		
		// 배열의 크기(value의 갯수)
		System.out.println("System.out.println(numbers1.length);");
		System.out.println(numbers1.length);
		
		// 배열의 반복 -> value값 출력
		int i = 0;
		while(numbers1.length>i) { // 배열의 크기가 i보다 크지 않을 때까지 -> 배열의 크기만큼 반복
			System.out.println(numbers1[i]);
			i++;
		} // 그러나 이 코드는 비교적 불안정
		
		for(i=0; numbers1.length>i; i++) { // 좀 더 깔끔
			System.out.println(numbers1[i]);
		}
		
		// 배열의 한계는, 배열의 크기변경이 안되고 엘리먼트의 갯수를 알수 없음
		// 역으로 배열의 장점이기도 함
		
		
		// List의 개념 -> 배열은 length와 index가 고정된 느낌이라면, List는 데이터 사이의 순서를 통해 가변적으로 연결되는 개념
		// 리스트는 배열에 비해 자유로운 엘리먼트 추가/제거가 가능(value 갯수가 유동적으로 변화)
		
		ArrayList numbers = new ArrayList();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.remove(3);
		System.out.println(numbers); // 중간에 4번째 원소를 제거하면 배열은 null이 남지만, 리스트는 아예 제거됨
		
		LinkedList numberss = new LinkedList();
		numberss.add(10);
		numberss.add(20);
		numberss.add(30);
		numberss.add(40);
		numberss.add(50);
		numberss.remove(3);
		System.out.println(numberss); // LinkedList의 경우, ArrayList에 비해 추가/삭제가 빠른 대신 인덱스 조회가 느림
		
	}
}
// 생활코딩 내용 정리