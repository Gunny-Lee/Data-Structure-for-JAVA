package list.linkedlist.implementation;

public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;
	private Node tail;
	private int size = 0;
	private class Node{
		// 데이터가 저장될 필드
		private Object data;
		// 다음 노드를 가리키는 필드
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		// 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) { // input 생성자값은 메인에서 입력받아옴
		// 노드 생성
		Node newNode = new Node(input); // 노드 객체화, input 생성자받아옴
		// 내부적으로 data=30, next=null
		newNode.next = head; // 새로운 노드를 헤드로 지정하는 방식으로 노드 추가
		head = newNode; // 헤드에는 새로운 노드값
		size++; // 사이즈 1증가로 다음 노드 이동, 그러나 만약 다음 노드가 없는 상황 처리 필요
		if(head.next == null) { // 노드의 다음 노드가 존재하지 않는다면
			tail = head; // 마지막 노드는 헤드와 같다
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input); // 노드를 생성합니다
		if(size == 0) { // 리스트에 노드가 없다면
			addFirst(input); // 첫번째노드 추가 - 노드가 없으니 앞으로 들어가든 뒤로 들어가든 상관없으니 걍 추가
		} else { // size가 0이 아니다 즉 노드가 이미 있다
			tail.next = newNode; // 기존에 마지막 노드이던 tail 뒤에 노드 하나 추가
			tail = newNode; // 그 추가된 노드가 새로운 테일이 되어야 하니 임명해주자
			size++; // 노드 하나 추가했으니 사이즈 업그레이드(엘리먼트 개수 증가)
		}
		
	}
	
	// 엘리먼트 알아내는 내부 메소드
//	public Node node(int index) { // 내부적으로 쓸거라 퍼블릭이 바람직하지는 않은데, 테스트를 위해 걍 지정
	Node node(int index) {
		Node x = head; // 검색을 할 때는, 늘 첫 번째 노드(node(0))에서 출발함. 이를 위해 첫번째 노드를 x값에 저장
		
//		x = x.next; // 두 번째 노드(node(1))를 검색할 때
//		x = x.next; // 또 그 다음 노드(node(2)) --> 이런 식으로 반복하는 것 -> 반복문 작성
		
		for(int i=0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	public void add(int k, Object input) {
		if(k == 0) { // 추가하는 위치가 0이면 첫번째 노드니까 addFirst()
			addFirst(input);
		} else { // 추가하려는 위치 index의 앞에 있는 노드 index값을 알아야 추가할 위치를 추적 가능
			Node temp1 = node(k-1); // 앞에 있는 그 노드의 값 저장
			Node temp2 = temp1.next; // 원래 k번째이던 노드의 값도 저장
			Node newNode = new Node(input); // 이제 추가하려는 노드를 생성함
			temp1.next = newNode; // 앞에있는 노드 뒤에 추가하려는 노드를 연결
			newNode.next = temp2; // 추가한 노드 뒤에는 원래 k번째이던 노드를 연결
			size++; // 노드 하나 추가했으니 사이즈 값 증가
			if(newNode.next == null) { // 만약 추가한 노드가 마지막 자리에 추가되었다면?
				tail = newNode; // tail로 지정해준다
			}
		}
	}
	
	// 출력
	public String toString() { // numbers 리스트의 레퍼런스가 아닌 노드값을 출력하는 방법
		if(head == null) { // head가 없다 즉 노드가 아예 없다면? 빈칸 리턴
			return "[]";
		}
		
		// 각 노드의 data값 탐색 시작
		Node temp = head; // head에서 시작
		String str = "[";
		
		// head 다음에도 뭔가 값이 있을때(노드가 둘 이상일 때) 실행되는 while문.
		while(temp.next != null) { // 다음 노드가 없을 때까지 반복문 실행
			str += temp.data + ", "; // 스트링으로 계속 뒤에 노드를 추가
			temp = temp.next; // 노드는 계속 다음노드로 넘겨가며 반복문 수행
		} // 마지막 노드에서는 next가 null이 나오면서 while문을 깨고 나오면서 마지막 노드는 제외(", "가 안 찍힘)
		str += temp.data; // 마지막 노드는 수동으로 출력결과에 포함 -> [a, b, c, d <<< 요런 형태
		
		return str + "]"; // 괄호 닫고 출력
	}
}
