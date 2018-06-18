package radkwiat.Lession005;

public class CountDiv {

	public static void main(String[] args) {

		int A = 6;
		int B = 11;
		int K = 2;

		System.out.println(solution(A, B, K));

	}

	public static int solution(int A, int B, int K) {
		int result = 0;

		for (int i = A; i <= B; i++) {
			if (i % K == 0)
				result++;
		}
		return result;
	}

}
