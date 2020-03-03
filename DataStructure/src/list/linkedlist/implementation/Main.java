package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList numbers = new LinkedList();
//		numbers.addFirst(30);
//		numbers.addFirst(20);
//		numbers.addFirst(10);
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
//		System.out.println(numbers.node(0)); // 엘리먼트 노드값 확인 // 리스트의 첫번째 엘리먼트 = 10 리턴
//		numbers.add(1, 15); // 엘리먼트의 2번째 자리에 15를 넣고 노드 한칸씩 밀기 
//		numbers.addFirst(5);
//		numbers.add(1, 15);
		System.out.println(numbers); // 원래 리스트의 레퍼런스가 출력되는데, 리스트의 데이터를 출력하는 코딩 별도 수행함
		System.out.println(numbers.removeFirst()); // 첫번째 노드 삭제하고 뭘 삭제했는지 출력
		System.out.println(numbers); // 삭제 결과 출력
	}

}
