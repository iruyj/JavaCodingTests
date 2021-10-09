package programmers;
// 평균 구하기
public class Solution13 {
	// 복습삼아 해본 ...
	public double arrSum(int[] arr) {
        double sum=0;
        for(int i=0; i<arr.length; i++) sum+=arr[i];
        return sum/arr.length;
    }
	public static void main(String[] args) {
		
	}
}
