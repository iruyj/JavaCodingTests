package programmers;

public class Solution07 {
	/*
	 * 학생들의 점수가 담긴 정수형 2차원 배열 scores가 매개변수로 주어집니다. 이때, 학생들의 학점을 구하여 하나의 문자열로 만들어서
	 * return 하도록 solution 함수를 완성해주세요.
	 */
	public String getScore(int score) { // 점수 반환
		String s = "";
		switch (score / 10) {
		case 9:
		case 10:
			s = "A";
			break;
		case 8:
			s = "B";
			break;
		case 7:
			s = "C";
			break;
		case 5:
		case 6:
			s = "D";
			break;
		default:
			s = "F";
			break;
		}
		return s;
	}

	public int[] setMin(int length) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 101;
		}
		return arr;
	}

	public String solution(int[][] scores) {
		String answer = "";
		int length = scores.length;
		int[] sums = new int[length]; // 합을 넣을 배열
		int[] min = setMin(length); // 각각 최저점
		int[] max = new int[length]; // 각각 최고점
		// for문 돌려서 각각 j번의 합구하기
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				if (j == i) {
					sums[j] += 0;
					continue;
				}
				min[j] = min[j] > scores[i][j] ? scores[i][j] : min[j];
				max[j] = max[j] < scores[i][j] ? scores[i][j] : max[j];
				sums[j] += scores[i][j];
			}
		}
		// 현재자기점수가 최저인지 최고인지 판별하기
		// System.out.println(max[0] +"/"+min[0]);
		for (int i = 0; i < length; i++) {
			if (max[i] >= scores[i][i] && min[i] <= scores[i][i]) {
				sums[i] += scores[i][i];
				answer += getScore(sums[i] / length); // 평균낸거 기준점수 문자열 변환
			} else {
				answer += getScore(sums[i] / (length - 1));
			}
		}
		return answer;
	}
	//다른사람 답
	public String otherSolution(int[][] scores) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<scores.length; i++) {
            int max = 0;
            int min = 101;
            int sum = 0;
            int divide = scores.length;
            for(int j=0; j<scores.length; j++) {
                int score = scores[j][i];
                if(i != j) {
                    if(score < min) {
                        min = score;
                    }
                    if(score > max) {
                        max = score;
                    }
                }
                sum += score;
            }
            if(scores[i][i] < min || scores[i][i] > max) {
                sum -= scores[i][i];
                divide--;
            }
            double score = (double) sum / divide;
            builder.append(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 50 ? "D" : "F" );
        }
        return builder.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution07 s7 = new Solution07();
		int[][] arr = new int[][] { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
		String a = s7.solution(arr);
		System.out.println(a);
	}

}
