package programmers;
// ������ �Ǻ�
/*������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
 * n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, 
 * n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���. 
 * */
public class Solution20 {
	// ������ �Ҽ��� ������ ���ϱ� > �������� Ȯ���ϱ� 
	public long solution(long n) {
		long sqrtNum = (long)Math.sqrt(n);
        if (n/sqrtNum==sqrtNum && n%sqrtNum==0) {
			return (long) Math.pow(sqrtNum+1, 2);
        }
        return -1;
    }
	public static void main(String[] args) {
		Solution20 s20 = new Solution20();
		System.out.println(s20.solution(1));
	}
}
