package programmers;
/*���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, 
 * solution�� �ϼ��ϼ���. ������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.*/
public class Solution17 {
	public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
			answer += i%2==0? "��":"��";
		}
        return answer;
    }
	public static void main(String[] args) {
		Solution17 wm = new Solution17();
        System.out.println("n�� 3�� ���: " + wm.solution(3));
        System.out.println("n�� 4�� ���: " + wm.solution(4));
	}
}
