package programmers;

public class Solution07 {
	/*
	 * �л����� ������ ��� ������ 2���� �迭 scores�� �Ű������� �־����ϴ�. �̶�, �л����� ������ ���Ͽ� �ϳ��� ���ڿ��� ����
	 * return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 */
	public String getScore(int score) { // ���� ��ȯ
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
		int[] sums = new int[length]; // ���� ���� �迭
		int[] min = setMin(length); // ���� ������
		int[] max = new int[length]; // ���� �ְ���
		// for�� ������ ���� j���� �ձ��ϱ�
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
		// �����ڱ������� �������� �ְ����� �Ǻ��ϱ�
		// System.out.println(max[0] +"/"+min[0]);
		for (int i = 0; i < length; i++) {
			if (max[i] >= scores[i][i] && min[i] <= scores[i][i]) {
				sums[i] += scores[i][i];
				answer += getScore(sums[i] / length); // ��ճ��� �������� ���ڿ� ��ȯ
			} else {
				answer += getScore(sums[i] / (length - 1));
			}
		}
		return answer;
	}
	//�ٸ���� ��
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
