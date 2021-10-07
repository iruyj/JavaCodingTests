package programmers;
// 히샤드 수 

public class Solution11 {
/*양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 */
	public boolean solution(int x) {
        int sum =0, devide = 10;
        int temp = x;
        // x를 뒷자리수부터 가져오는 방법
        while(x > 0) {
        	sum +=  x % devide;	 // 10으로 나눈 나머지 : 맨끝자리수를 더한다
        	x /= devide;		 // x값은 가져온 끝자리수를 없애준다
        }
        return temp % sum == 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution11 s11 = new Solution11();
		System.out.println(s11.solution(11));
	}

}
