package programmers;

public class Solution06 {
/*���� ���� ���̱ⱸ�� �αⰡ �ſ� ���� ���� ������ �ʽ��ϴ�. 
 * �� ���̱ⱸ�� ���� �̿��� price�� �ε�, ���̱ⱸ�� N �� ° �̿��Ѵٸ� ���� 
 * �̿���� N�踦 �ޱ�� �Ͽ����ϴ�. ��, ó�� �̿�ᰡ 100�̾��ٸ� 2��°���� 
 * 200, 3��°���� 300���� ����� �λ�˴ϴ�.
���̱ⱸ�� count�� Ÿ�� �Ǹ� ���� �ڽ��� ������ �ִ� �ݾ׿��� �󸶰� ���ڶ������ 
return �ϵ��� solution �Լ��� �ϼ��ϼ���.
��, �ݾ��� �������� ������ 0�� return �ϼ���.*/
	public long solution(int price, int money, int count) {
		long answer=0;
		for (int i = 1; i <= count; i++) {
			answer+= (i*price);
		}
        return answer>money ? answer-money: 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
