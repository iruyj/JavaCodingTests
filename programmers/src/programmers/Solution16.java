package programmers;

public class Solution16 {
/*  10����  124 ����	 10����	124 ����
		1	1	6	14
		2	2	7	21
		3	4	8	22
		4	11	9	24
		5	12	10	41*/
	/*1 % 3 = 1 (124 ���� : 1)
	  2 % 3 = 2 (124 ���� : 2)
	  3 % 3 = 0 (124 ���� : 4)*/
	public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] num124 = {"4","1","2"};
        while(n>0) {
        	int num = n%3;
        	n /=3;
        	if(num==0) n--;  
        	/*1,2,4 ���� ü�迡�� 3�� ������ �� ĭ�� ������ϴ�. 
        	 * �ٸ� ������ ������. �̿� ���� ���� �ϸ�, 1, 2, 4�� 1, 2, 3�̶��
        	 *  Ĩ�ô�. 133�ϰ�� �� ĭ�� ���� 13.3�� �Ǵµ� 
        	 *  �̶� 0.1�� 10������ 1/3�̵˴ϴ�. �׷��� 13.3�� 0.3�� 1�̵Ǿ 
        	 *  �� ������ �ְ� �˴ϴ�. �׷��� ���������� -1�� ���ָ� �Ҽ��� ���� 0.3�϶� �� ������ ���� �� ���� �˴ϴ�. 
        	 *  �׸��� 111�� ����� 1������ 33�̵ǰ� �̸� 3���� ����� ����ָ� 
        	 *  3.3�̵Ǵµ� 0.3�� 1�̵ǹǷ� 3 + 1�ؼ� 11�̵Ǿ ���������� ������� �˴ϴ�. ���鼭 3��ⷯ�����ϸ� 1����
        	 * ���� �� �������� ��� ���鼭 1���ڸ� �������ذ̴ϴ� .*/
     
        	answer.insert(0,num124[num]);
        }
        return answer.toString();
    }
	// while�� �Ⱦ��� Ǯ��
	 public String change124(int n) {
	        String answer = "";

	        if (n > 0) {
	            int rest = n % 3;
	            answer = ((rest == 0) ? "4" : (rest == 1) ? "1" : "2") + answer;
	            answer = change124((n-1) / 3) + answer;
	        }

	        return answer;
	    } 
	
	public static void main(String[] args) {
		Solution16 s16 = new Solution16();
		System.out.println(s16.solution(15));
		System.out.println(s16.solution(14));
	}
}
