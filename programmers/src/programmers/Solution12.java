package programmers;

import java.util.*;

public class Solution12 {
	public int solution(int[] nums) {
		int answer = nums.length / 2;
		Arrays.sort(nums);
		// 중복제거하기
		int cnt = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1])
				cnt++;
		}
		// 길이랑 비교하기
		return (answer < cnt) ? answer : cnt;
	}
	
	// Set을 이용한 풀이방법
	public int solution2(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        return (nums.length / 2 > a.size()) ? a.size() : nums.length / 2;
    }
	
	public static void main(String[] args) {
		Solution12 s12 = new Solution12();
		System.out.println(s12.solution(new int[] { 3,1,2,3 }));
		System.out.println(s12.solution(new int[] { 3, 2,3, 3, 2, 2, 4 }));
		System.out.println(s12.solution(new int[] { 3,3,3,2,2,2}));
	}
}
