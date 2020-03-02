package list.linkedlist.implementation;

public class LinkedList {
	// ù��° ��带 ����Ű�� �ʵ�
	private Node head;
	private Node tail;
	private int size = 0;
	private class Node{
		// �����Ͱ� ����� �ʵ�
		private Object data;
		// ���� ��带 ����Ű�� �ʵ�
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		// ����� ������ ���� ����ؼ� Ȯ���غ� �� �ִ� ���
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) { // input �����ڰ��� ���ο��� �Է¹޾ƿ�
		// ��� ����
		Node newNode = new Node(input); // ��� ��üȭ, input �����ڹ޾ƿ�
		// ���������� data=30, next=null
		newNode.next = head; // ���ο� ��带 ���� �����ϴ� ������� ��� �߰�
		head = newNode; // ��忡�� ���ο� ��尪
		size++; // ������ 1������ ���� ��� �̵�, �׷��� ���� ���� ��尡 ���� ��Ȳ ó�� �ʿ�
		if(head.next == null) { // ����� ���� ��尡 �������� �ʴ´ٸ�
			tail = head; // ������ ���� ���� ����
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input); // ��带 �����մϴ�
		if(size == 0) { // ����Ʈ�� ��尡 ���ٸ�
			addFirst(input); // ù��°��� �߰� - ��尡 ������ ������ ���� �ڷ� ���� ��������� �� �߰�
		} else { // size�� 0�� �ƴϴ� �� ��尡 �̹� �ִ�
			tail.next = newNode; // ������ ������ ����̴� tail �ڿ� ��� �ϳ� �߰�
			tail = newNode; // �� �߰��� ��尡 ���ο� ������ �Ǿ�� �ϴ� �Ӹ�������
			size++; // ��� �ϳ� �߰������� ������ ���׷��̵�(������Ʈ ���� ����)
		}
		
	}
	
	// ������Ʈ �˾Ƴ��� ���� �޼ҵ�
//	public Node node(int index) { // ���������� ���Ŷ� �ۺ��� �ٶ��������� ������, �׽�Ʈ�� ���� �� ����
	Node node(int index) {
		Node x = head; // �˻��� �� ����, �� ù ��° ���(node(0))���� �����. �̸� ���� ù��° ��带 x���� ����
		
//		x = x.next; // �� ��° ���(node(1))�� �˻��� ��
//		x = x.next; // �� �� ���� ���(node(2)) --> �̷� ������ �ݺ��ϴ� �� -> �ݺ��� �ۼ�
		
		for(int i=0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	public void add(int k, Object input) {
		if(k == 0) { // �߰��ϴ� ��ġ�� 0�̸� ù��° ���ϱ� addFirst()
			addFirst(input);
		} else { // �߰��Ϸ��� ��ġ index�� �տ� �ִ� ��� index���� �˾ƾ� �߰��� ��ġ�� ���� ����
			Node temp1 = node(k-1); // �տ� �ִ� �� ����� �� ����
			Node temp2 = temp1.next; // ���� k��°�̴� ����� ���� ����
			Node newNode = new Node(input); // ���� �߰��Ϸ��� ��带 ������
			temp1.next = newNode; // �տ��ִ� ��� �ڿ� �߰��Ϸ��� ��带 ����
			newNode.next = temp2; // �߰��� ��� �ڿ��� ���� k��°�̴� ��带 ����
			size++; // ��� �ϳ� �߰������� ������ �� ����
			if(newNode.next == null) { // ���� �߰��� ��尡 ������ �ڸ��� �߰��Ǿ��ٸ�?
				tail = newNode; // tail�� �������ش�
			}
		}
	}
	
	// ���
	public String toString() { // numbers ����Ʈ�� ���۷����� �ƴ� ��尪�� ����ϴ� ���
		if(head == null) { // head�� ���� �� ��尡 �ƿ� ���ٸ�? ��ĭ ����
			return "[]";
		}
		
		// �� ����� data�� Ž�� ����
		Node temp = head; // head���� ����
		String str = "[";
		
		// head �������� ���� ���� ������(��尡 �� �̻��� ��) ����Ǵ� while��.
		while(temp.next != null) { // ���� ��尡 ���� ������ �ݺ��� ����
			str += temp.data + ", "; // ��Ʈ������ ��� �ڿ� ��带 �߰�
			temp = temp.next; // ���� ��� �������� �Ѱܰ��� �ݺ��� ����
		} // ������ ��忡���� next�� null�� �����鼭 while���� ���� �����鼭 ������ ���� ����(", "�� �� ����)
		str += temp.data; // ������ ���� �������� ��°���� ���� -> [a, b, c, d <<< �䷱ ����
		
		return str + "]"; // ��ȣ �ݰ� ���
	}
}
