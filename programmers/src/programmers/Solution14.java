package programmers;
// �ڸ��� ���ϱ�
public class Solution14 {
	/*�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
	������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.*/
	public int solution(int n) {
        int answer = 0;
        while(n>0) {
        	answer += n%10;
        	n = n/10;
        }

        return answer;
    }
}
