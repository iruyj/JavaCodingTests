package programmers;
// ������ �� 

public class Solution11 {
/*���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
 * ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
 * �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.
 */
	public boolean solution(int x) {
        int sum =0, devide = 10;
        int temp = x;
        // x�� ���ڸ������� �������� ���
        while(x > 0) {
        	sum +=  x % devide;	 // 10���� ���� ������ : �ǳ��ڸ����� ���Ѵ�
        	x /= devide;		 // x���� ������ ���ڸ����� �����ش�
        }
        return temp % sum == 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution11 s11 = new Solution11();
		System.out.println(s11.solution(11));
	}

}
