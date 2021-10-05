package programmers;

public class Solution08 {
/*1-1. 입력된 수가 짝수라면 2로 나눕니다. 
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
예를*/
	public int solution(long num) {
        int answer = 0;
        while(answer<=500 && num!=1){
        	num = num%2==0 ? num/2 : num*3+1;
        	answer++;
        }
        System.out.println(num);
        return answer==501 ? -1 : answer;
    }
	//깔끔한 풀이 참고용
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
