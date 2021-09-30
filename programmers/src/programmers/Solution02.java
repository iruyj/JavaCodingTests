package programmers;

import java.util.Iterator;
/*0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다.
 *  numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 
 *  return 하도록 solution 함수를 완성해주세요.*/
public class Solution02 {

	public int solution1(int[] numbers) {
		int answer = 0; 
		for (int i = 0, j; i <10; i++) {
			for (j = 0; j < numbers.length && i!=numbers[j]; j++) {}
			if(j >= numbers.length) answer+=i;
		}
		return answer;
	}
	
	//다른사람 답...허무
	public int otheranswer(int[] numbers) {
		int answer = 45; 
		for (int i : numbers) {
			answer-=i;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution02 s2 = new Solution02();
		int result= s2.solution1(new int[] {1,2,3,4,6,7,8,0});
		int result1= s2.otheranswer(new int[] {5,8,4,0,6,7,9});
		System.out.println(result);
		System.out.println(result1);
	}

}
