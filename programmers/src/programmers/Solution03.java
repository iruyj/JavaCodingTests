package programmers;

import java.lang.Math;
/*��� ������ ���� ���̿� ���� ���̸� ��Ÿ���� 2���� �迭 sizes�� �Ű������� �־����ϴ�. 
 * ��� ������ ������ �� �ִ� ���� ���� ������ ���� ��, 
 * ������ ũ�⸦ return �ϵ��� solution �Լ��� �ϼ����ּ���.*/
public class Solution03 {

	// time : 30min
	public int solution3(int[][] sizes) {
        int max=0, min=0;
        for (int i = 0; i < sizes.length; i++) {
        	// ���ο� ������ �� ���̸� ���Ѵ�
        	int long1 = sizes[i][0]>sizes[i][1]? sizes[i][0] : sizes[i][1];
        	int sort = sizes[i][0]<sizes[i][1]? sizes[i][0] : sizes[i][1];
        	// ����̿� ª������ ���� ���� ū ���� ����
			if(long1>max) max=long1;
			if(sort>min) min=sort;
		}
        return max*min;
	}

	//�ٸ���� �� 
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
