package programmers;
/*
 * �� ���� left�� right�� �Ű������� �־����ϴ�. 
 * left���� right������ ��� ���� �߿���, 
 * ����� ������ ¦���� ���� ���ϰ�, 
 * ����� ������ Ȧ���� ���� �� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���
 * */
public class Solution21 {
	public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
        	int cnt= 1;
			for (int j = 1; j < i; j++) {
				cnt += i%j==0? 1:0;
			}
			answer = cnt%2==0? answer+i: answer-i;
		}
        return answer;
    }
	// �������� �̿��� Ǯ��
	 public int solution2(int left, int right) {
	        int answer = 0;

	        for (int i=left;i<=right;i++) {
	            //�������� ��� ����� ������ Ȧ��
	            if (i % Math.sqrt(i) == 0) {
	                answer -= i;
	            }
	            //�������� �ƴ� ��� ����� ������ ¦��
	            else {
	                answer += i;
	            }
	        }

	        return answer;
	    }
}
