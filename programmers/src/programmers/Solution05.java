package programmers;

import java.util.*;

public class Solution05 {
/*�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������
 *  �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� 
 *  �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ 
 * ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. */
	public int[] solution(int []arr) {
		 int[] answer = new int[arr.length]; 
		answer[0]=arr[0];
		int cnt=1;
        for (int i = 1; i < arr.length; i++) {
			if(arr[i-1]!=arr[i]) {
				answer[cnt++]=arr[i];
			}
		}
        int[] intanswer = new int[cnt]; 
        for (int i = 0; i < intanswer.length; i++) {
			intanswer[i] = answer[i];
		}
        return intanswer;
    }
	public static void main(String[] args) {
		Solution05 s5 = new Solution05();
		int[] result= s5.solution(new int[] {1,1,3,3,0,1,1});
		for(int r : result) {
			  System.out.println(r);
	    }
		
		// TODO Auto-generated method stub
		
	}

}
