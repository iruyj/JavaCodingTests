package programmers;
// 제곱근 판별
/*임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
 * n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요. 
 * */
public class Solution20 {
	// 제곱근 소수점 버리고 구하기 > 제곱인지 확인하기 
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
