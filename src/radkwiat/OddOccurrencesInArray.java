package radkwiat;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {

		OddOccurrencesInArray test = new OddOccurrencesInArray();
		int[] A = { 2, 2, 3, 3, 4 };
		System.out.println(test.solution(A));
	}

	public int solution(int[] A) {
		if (A.length != 1) {
			Arrays.sort(A);
			for (int i = 0; i < A.length; i++) {
				if (i == A.length-1) {
					return A[A.length-1];
				}
				if (A[i] == A[i + 1]) {
					i++;
				} else {
					return A[i];
				}
			}
		}
		return A[0];
	}
}