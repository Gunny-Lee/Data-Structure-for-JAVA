package array;

public class ideone {

	public static void main(String[] args) {
		// �迭�� value�� index�� ����, ���� ��ġ�� element
		// �迭 ����ÿ��� value�� ������ ���ϸ� ����, �� ������ length��� ��
		int[] numbers1 = new int[4];
		
		String[] strings = new String[4];
		
		numbers1[0]=10;
		numbers1[1]=20;
		numbers1[2]=30;
		// value�� ������ 4���ε�, ���� 3���� ���� -> int�迭�� 0, String�迭�� null���� ����Ʈ�� ��
		
		// �迭�� �ѹ濡 ���� ����
		int[] numbers2 = {10, 20, 30, 40};
		int[] numbers3 = new int[] {10, 20, 30, 40};
		
		// �� ���
		System.out.println("System.out.println(numbers1[0]);");
		System.out.println(numbers1[0]);
 
		System.out.println("System.out.println(numbers1[3]);");
		System.out.println(numbers1[3]);
		
		// �迭�� ũ��(value�� ����)
		System.out.println("System.out.println(numbers1.length);");
		System.out.println(numbers1.length);
		
		// �迭�� �ݺ� -> value�� ���
		int i = 0;
		while(numbers1.length>i) { // �迭�� ũ�Ⱑ i���� ũ�� ���� ������ -> �迭�� ũ�⸸ŭ �ݺ�
			System.out.println(numbers1[i]);
			i++;
		} // �׷��� �� �ڵ�� ���� �Ҿ���
		
		for(i=0; numbers1.length>i; i++) { // �� �� ���
			System.out.println(numbers1[i]);
		}
		
		// �迭�� �Ѱ��, �迭�� ũ�⺯���� �ȵǰ� ������Ʈ�� ������ �˼� ����
		// ������ �迭�� �����̱⵵ ��
		
		// ��Ȱ�ڵ� ���� ����
	}
}
