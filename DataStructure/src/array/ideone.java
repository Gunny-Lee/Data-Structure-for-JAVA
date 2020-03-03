package array;

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
		
		// 생활코딩 내용 정리
	}
}
