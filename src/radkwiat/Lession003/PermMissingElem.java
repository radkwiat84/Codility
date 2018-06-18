package radkwiat.Lession003;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5 };

		PermMissingElem test = new PermMissingElem();
		System.out.println(test.solution(A));

	}

	public int solution(int[] A) {
		int length = A.length;
		if(length == 0) return 1;
		if(length == 1 && A[0] != 1) return 1;
		Arrays.sort(A);
		for (int i = 0; i < length - 1; i++) {
			if (A[0] != 1) {
				return 1;
			} else if (A[i] + 1 != A[i + 1]) {
				return A[i] + 1;
			}
		}
		return A[length - 1] + 1;
	}
}