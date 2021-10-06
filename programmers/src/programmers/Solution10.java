package programmers;

//������ȣ
public class Solution10 {
	public String solution(String s, int n) {
		String answer = "";
		//charAt : ���ڿ����� �ѱ��ھ� �̾ƿ´�
		// Character.isUpeerCase(char����) -- �빮�ڸ� return true
		// Character.isLowerCase(char����) -- �ҹ��ڸ� return true
		for (int i = 0; i <s.length(); i++) {
			char word = s.charAt(i);
			if(word==' ' ) {
				answer+=" ";
				continue;
			}
			if(Character.isUpperCase(word)) { //�빮������
				word = (char) (word+n>'Z'? 'A'+( word+n-'Z'-1): word+n);
			}else {	//�ҹ�������
				word = (char) (word+n>'z'? 'a'+( word+n-'z'-1): word+n);
			}
			
			answer+=word+"";
		}
		System.out.println(answer);
		return answer;
	}
	//otherCase ���ٽ��� �̿��� Ǯ�̹��
	public String otherSolution(String s, int _n) {
        return s.chars().map(c -> {
            int n = _n % 26;
            if (c >= 'a' && c <= 'z') {
                return 'a' + (c - 'a' + n) % 26;
            } else if (c >= 'A' && c <= 'Z') {
                return 'A' + (c - 'A' + n) % 26;
            } else {
                return c;
            }
        }).mapToObj(c -> String.valueOf((char)c))
        .reduce((a, b) -> a + b).orElse("");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10 s10 = new Solution10();
		System.out.println(s10.solution("bC",25));
	}

}
