package programmers;

public class Solution04 {
/*���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ�
 *  Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
*/
	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution04 s4 = new Solution04();
		s4.solution(3);
	}
}
