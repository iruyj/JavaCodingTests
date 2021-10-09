package programmers;

import java.util.Arrays;

// ��� ���ϱ�
// ������ �������� ��
public class Solution13 {
	// ������� �غ� ...
	public double arrSum(int[] arr) {
        double sum=0;
        for(int i=0; i<arr.length; i++) sum+=arr[i];
        return sum/arr.length;
    }
	
	// ������ �������� ���� �����ϱ�
	public int[] arrDivisor(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]%divisor==0)
        		answer[cnt++] = arr[i];
		}
        if(answer[0]==0) return new int[] {-1};
        
        int[] result = new int[cnt];
        for (int i = 0; i < cnt; i++) 
			result[i] = answer[i];
        Arrays.sort(result);
        return result;
    }
	// ������ �������� �� - Stream�� �̿��� Ǯ��
	 public int[] solution(int[] arr, int divisor) {
         int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
         if(answer.length == 0) answer = new int[] {-1};
         java.util.Arrays.sort(answer);
         return answer;
 }
	public static void main(String[] args) {
		
	}
}
