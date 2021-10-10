package programmers;
// 제일 작은 수 제거하기
public class Solution15 {
	public int[] solution(int[] arr) {
		if (arr.length-1 <= 0) 
			return new int[] {-1};
        int[] answer = new int[arr.length-1];
        int min= arr[0];
        for (int i = 1; i < arr.length; i++) {
			min = min>arr[i]?arr[i]:min;
		}
        for (int i = 0,j=0; i < arr.length; i++) {
			if(arr[i] == min) continue;
			answer[j++] = arr[i];
		}
        return answer;
    }
}
