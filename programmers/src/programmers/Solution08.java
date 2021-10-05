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
	//����� Ǯ�� �����
	 public int collatz(int num) {
	    long n = (long)num;
	    for(int i =0; i<500; i++){      
	      if(n==1) return i;
	      n = (n%2==0) ? n/2 : n*3+1;            
	    }
	    return -1;
	  }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution08 s8 = new Solution08();
		s8.solution(626331);
	}

}
