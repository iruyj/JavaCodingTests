package programmers;
/*
 * ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
 * ��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
 * ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���
 */
public class Solution18 {
	// substring�� �̿��� Ǯ��
	public String solution(String phone_number) {
        String answer = "";
        int i;
        for (i = 0; i < phone_number.length()-4; i++) 
			answer+= "*";
        answer+= phone_number.substring(i);
        return answer;
    }
}
