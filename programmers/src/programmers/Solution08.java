package programmers;

public class Solution08 {
/*1-1. �Էµ� ���� ¦����� 2�� �����ϴ�. 
1-2. �Էµ� ���� Ȧ����� 3�� ���ϰ� 1�� ���մϴ�.
2. ����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��մϴ�.
����*/
	public int solution(long num) {
        int answer = 0;
        while(answer<=500 && num!=1){
        	num = num%2==0 ? num/2 : num*3+1;
        	answer++;
        }
        System.out.println(num);
        return answer==501 ? -1 : answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution08 s8 = new Solution08();
		s8.solution(626331);
	}

}
