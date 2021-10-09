package programmers;

import java.util.Arrays;

// 평균 구하기
// 나누어 떨어지는 수
public class Solution13 {
	// 복습삼아 해본 ...
	public double arrSum(int[] arr) {
        double sum=0;
        for(int i=0; i<arr.length; i++) sum+=arr[i];
        return sum/arr.length;
    }
	
	// 나누어 떨어지는 수만 리턴하기
	public int[] arrDivisor(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]%divisor==0)
        		answer[cnt++] = arr[i];
		}
        if(answer[0]==0) return new int[] {-1};
        
        int[] result = new int[cnt];
        for (int i = 0; i < cnt; i++) 
			result[i] = answer[i];
        Arrays.sort(result);
        return result;
    }
	// 나누어 떨어지는 수 - Stream을 이용한 풀이
	 public int[] solution(int[] arr, int divisor) {
         int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
         if(answer.length == 0) answer = new int[] {-1};
         java.util.Arrays.sort(answer);
         return answer;
 }
	public static void main(String[] args) {
		
	}
}
