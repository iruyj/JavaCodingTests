package programmers;

import java.util.Iterator;
/*0���� 9������ ���� �� �Ϻΰ� ����ִ� �迭 numbers�� �Ű������� �־����ϴ�.
 *  numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� 
 *  return �ϵ��� solution �Լ��� �ϼ����ּ���.*/
public class Solution02 {

	public int solution1(int[] numbers) {
		int answer = 0; 
		for (int i = 0, j; i <10; i++) {
			for (j = 0; j < numbers.length && i!=numbers[j]; j++) {}
			if(j >= numbers.length) answer+=i;
		}
		return answer;
	}
	
	//�ٸ���� ��...�㹫
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
