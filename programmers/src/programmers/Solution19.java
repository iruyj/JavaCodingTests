package programmers;
//�ּҰ���� ���ϱ� : ��Ŭ���� ȣ���� (Euclidean algorithm)
//GCD(a, b) = GCD(b, r)
// r = a % b : r�� 0�� �Ǹ� b�� �ִ������̴�
/* A�� B�� �־����ٸ� A = ad, B= bd�̾����Ƿ�  
 * a��b��d�� �����Ϸ��� A �� B �� �ϸ� adbd�� d�� �� �� �� 
 * �� ������ A �� B �� d �� ���ָ� a��b��d �� �����ϸ鼭 �ּҰ����*/
public class Solution19 {
	public int[] solution(int n, int m) {
        int[] answer = {0,n*m};
        int r;	// ������
        if (n<m) {
			r=n;
			n=m;
			m=r;
		}
        while(true){
        	r = n % m;
        	if (r<=0) {
				break;
			}
        	n = m; m=r;
        }
        
        answer[0] = m;	//�ִ�����
        answer[1] /=m;	//�ּҰ����
        return answer;
    }
}
