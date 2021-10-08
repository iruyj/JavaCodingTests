package programmers;

import java.util.*;

public class Solution12 {
	public int solution(int[] nums) {
		int answer = nums.length / 2;
		Arrays.sort(nums);
		// �ߺ������ϱ�
		int cnt = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1])
				cnt++;
		}
		// ���̶� ���ϱ�
		return (answer < cnt) ? answer : cnt;
	}

	public static void main(String[] args) {
		Solution12 s12 = new Solution12();
		System.out.println(s12.solution(new int[] { 3,1,2,3 }));
		System.out.println(s12.solution(new int[] { 3, 2,3, 3, 2, 2, 4 }));
		System.out.println(s12.solution(new int[] { 3,3,3,2,2,2}));
	}
}
