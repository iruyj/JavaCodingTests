package programmers;

public class Solution16 {
/*  10진법  124 나라	 10진법	124 나라
		1	1	6	14
		2	2	7	21
		3	4	8	22
		4	11	9	24
		5	12	10	41*/
	/*1 % 3 = 1 (124 나라 : 1)
	  2 % 3 = 2 (124 나라 : 2)
	  3 % 3 = 0 (124 나라 : 4)*/
	public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] num124 = {"4","1","2"};
        while(n>0) {
        	int num = n%3;
        	n /=3;
        	if(num==0) n--;  
        	/*1,2,4 숫자 체계에서 3씩 나누면 한 칸씩 당겨집니다. 
        	 * 다만 문제가 생기죠. 이에 대해 설명 하면, 1, 2, 4를 1, 2, 3이라고
        	 *  칩시다. 133일경우 한 칸씩 당기면 13.3이 되는데 
        	 *  이때 0.1은 10진수로 1/3이됩니다. 그래서 13.3의 0.3이 1이되어서 
        	 *  몫에 영향을 주게 됩니다. 그래서 나누기전에 -1을 해주면 소수점 값이 0.3일때 몫에 영향을 줄일 이 없게 됩니다. 
        	 *  그리고 111을 당길경우 1을빼면 33이되고 이를 3으로 나누어서 당겨주면 
        	 *  3.3이되는데 0.3은 1이되므로 3 + 1해서 11이되어서 정상적으로 당겨지게 됩니다. 당기면서 3모듈러연산하면 1의자
        	 * 리수 알 수있으니 계속 당기면서 1의자리 추출해준겁니다 .*/
     
        	answer.insert(0,num124[num]);
        }
        return answer.toString();
    }
	// while문 안쓰고 풀이
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
