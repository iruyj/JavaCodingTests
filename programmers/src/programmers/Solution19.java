package programmers;

import java.util.Arrays;

//�ּҰ���� ���ϱ� : ��Ŭ���� ȣ���� (Euclidean algorithm)
//GCD(a, b) = GCD(b, r)
// r = a % b : r�� 0�� �Ǹ� b�� �ִ������̴�
/* A�� B�� �־����ٸ� A = ad, B= bd�̾����Ƿ�  
 * a��b��d�� �����Ϸ��� A �� B �� �ϸ� adbd�� d�� �� �� �� 
 * �� ������ A �� B �� d �� ���ָ� a��b��d �� �����ϸ鼭 �ּҰ����*/
public class Solution19 {
	public int[] solution(int n, int m) {
		int[] answer = { 0, n * m };
		int r; // ������
		if (n < m) {
			r = n;
			n = m;
			m = r;
		}
		while (true) {
			r = n % m;
			if (r <= 0) {
				break;
			}
			n = m;
			m = r;
		}

		answer[0] = m; // �ִ�����
		answer[1] /= m; // �ּҰ����
		return answer;
	}

	// �ٸ���� Ǯ�̹�� : ��Ŭ����ȣ����/����Լ��̿�
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Solution19 c = new Solution19();
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}
}
