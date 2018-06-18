package radkwiat.Lession015;

import java.util.Arrays;

public class CountTriangles {

	public static void main(String[] args) {

		CountTriangles test = new CountTriangles();
		int[] A = { 10, 2, 5, 1, 8, 12 };


		System.out.println(test.solution(A));

	}

	public int solution(int[] A) {
		int result = 0;
		int lengthOfA = A.length;

		if (lengthOfA >= 3) {
			Arrays.sort(A);
			int P = -1;
			int Q = -1;
			int R = -1;

			for (int i = 0; i < lengthOfA - 2; i++) {
				for (int j = i + 1; j < lengthOfA; j++) {
					for (int k = j + 1; k < lengthOfA; k++) {
						P = A[i];
						Q = A[j];
						R = A[k];
						if (isPositiveTriplet(P, Q, R) == true) {
							result++;
						}
					}
				}
			}
		}
		return result;
	}

	public static boolean isPositiveTriplet(int P, int Q, int R) {

		if (P + Q > R && Q + R > P && R + P > Q) {
			return true;
		}
		return false;
	}
}