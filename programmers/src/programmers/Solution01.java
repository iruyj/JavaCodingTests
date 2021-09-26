package programmers;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++) {
        	answer+=(a[i]* b[i]);
        }
  
        return answer;
    }
}

public class Solution01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s1 = new Solution();
		int answer =s1.solution(new int[] {1, 2,3,4},new int[] {-3,-1,0,2});
		System.out.println(answer);
	}

}
