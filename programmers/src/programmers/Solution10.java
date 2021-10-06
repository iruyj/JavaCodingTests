package programmers;

//시저암호
public class Solution10 {
	public String solution(String s, int n) {
		String answer = "";
		//charAt : 문자열에서 한글자씩 뽑아온다
		for (int i = 0; i <s.length(); i++) {
			char word = s.charAt(i);
			if(word==' ' ) {
				answer+=" ";
				continue;
			}
			if(Character.isUpperCase(word)) { //대문자인지
				word = (char) (word+n>'Z'? 'A'+( word+n-'Z'-1): word+n);
			}else {	//소문자인지
				word = (char) (word+n>'z'? 'a'+( word+n-'z'-1): word+n);
			}
			
			answer+=word+"";
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10 s10 = new Solution10();
		System.out.println(s10.solution("bC",25));
	}

}
