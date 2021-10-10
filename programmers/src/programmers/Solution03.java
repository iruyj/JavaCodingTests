package programmers;

import java.lang.Math;
/*모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 
 * 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 
 * 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.*/
public class Solution03 {

	// time : 30min
	public int solution3(int[][] sizes) {
        int max=0, min=0;
        for (int i = 0; i < sizes.length; i++) {
        	// 가로와 세로중 긴 길이를 구한다
        	int long1 = sizes[i][0]>sizes[i][1]? sizes[i][0] : sizes[i][1];
        	int sort = sizes[i][0]<sizes[i][1]? sizes[i][0] : sizes[i][1];
        	// 긴길이와 짧은길이 각각 가장 큰 수를 구한
			if(long1>max) max=long1;
			if(sort>min) min=sort;
		}
        return max*min;
	}

	//다른사람 답 
	public int others3(int[][] sizes) {
		int length=0, height=0;
		for(int[] card : sizes) {
			length = Math.max(length, Math.max(card[0], card[1]));
			height = Math.max(height, Math.min(card[0], card[1]));
		}
		return length*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution03 s3 = new Solution03();
		int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(s3.solution3(arr));
		System.out.println(s3.others3(arr));
	}

}
