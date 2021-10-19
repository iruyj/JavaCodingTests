package programmers;
/*
 * 두 정수 left와 right가 매개변수로 주어집니다. 
 * left부터 right까지의 모든 수들 중에서, 
 * 약수의 개수가 짝수인 수는 더하고, 
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요
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
	// 제곱수를 이용한 풀이
	 public int solution2(int left, int right) {
	        int answer = 0;

	        for (int i=left;i<=right;i++) {
	            //제곱수인 경우 약수의 개수가 홀수
	            if (i % Math.sqrt(i) == 0) {
	                answer -= i;
	            }
	            //제곱수가 아닌 경우 약수의 개수가 짝수
	            else {
	                answer += i;
	            }
	        }

	        return answer;
	    }
}
