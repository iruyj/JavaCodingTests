package programmers;

import java.util.Arrays;

//최소공약수 구하기 : 유클리드 호제법 (Euclidean algorithm)
//GCD(a, b) = GCD(b, r)
// r = a % b : r이 0이 되면 b가 최대공약수이다
/* A와 B로 주어진다면 A = ad, B= bd이었으므로  
 * a×b×d를 만족하려면 A × B 만 하면 adbd로 d가 한 번 더 
 * 들어가 있으니 A × B ÷ d 를 해주면 a×b×d 를 만족하면서 최소공배수*/
public class Solution19 {
	public int[] solution(int n, int m) {
		int[] answer = { 0, n * m };
		int r; // 나머지
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

		answer[0] = m; // 최대공약수
		answer[1] /= m; // 최소공배수
		return answer;
	}

	// 다른사람 풀이방법 : 유클리드호제법/재귀함수이용
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

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Solution19 c = new Solution19();
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}
}
