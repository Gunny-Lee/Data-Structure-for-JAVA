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
//		System.out.println(numbers.node(0)); // ������Ʈ ��尪 Ȯ�� // ����Ʈ�� ù��° ������Ʈ = 10 ����
//		numbers.add(1, 15); // ������Ʈ�� 2��° �ڸ��� 15�� �ְ� ��� ��ĭ�� �б� 
//		numbers.addFirst(5);
//		numbers.add(1, 15);
		System.out.println(numbers); // ���� ����Ʈ�� ���۷����� ��µǴµ�, ����Ʈ�� �����͸� ����ϴ� �ڵ� ���� ������
		System.out.println(numbers.removeFirst()); // ù��° ��� �����ϰ� �� �����ߴ��� ���
		System.out.println(numbers); // ���� ��� ���
	}

}
