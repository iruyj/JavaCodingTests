package programmers;

import java.util.*;

public class Solution05 {
/*배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로
 *  이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 
 *  하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 
 * 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. */
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
