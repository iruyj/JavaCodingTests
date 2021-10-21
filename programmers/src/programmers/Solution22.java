package programmers;

/*
 * �ڿ��� n�� �Ű������� �־����ϴ�. 
 * n�� x�� ���� �������� 1�� �ǵ��� �ϴ� ���� ���� �ڿ��� x�� return �ϵ��� 
 * solution �Լ��� �ϼ����ּ���. ���� �׻� �������� ����� �� �ֽ��ϴ�.
 * */
public class Solution22 {
	public int solution(int n) {
		for (int i = 1; i < n; i++) {
			if (n % i == 1)
				return i;
		}
		return n - 1;
	}

	// while���� �̿��� Ǯ�̹��
	public int useWhile(int n) {
		int answer = 1;

		while (n % answer != 1) {
			answer++;
		}
		return answer;
	}
}
