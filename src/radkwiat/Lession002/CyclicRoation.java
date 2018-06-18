package radkwiat.Lession002;

import java.util.Arrays;

public class CyclicRoation {

	public static void main(String[] args) {

		CyclicRoation rotArr = new CyclicRoation();

		int[] A = { 3, 8, 9, 7, 6 };
		int K = 3;

		System.out.println(Arrays.toString(rotArr.solution(A, K)));
	}

	public int[] solution(int[] A, int K) {
		int[] resultArray = A.clone();

		for (int i = K; i > 0; i--) {
			resultArray[0] = A[A.length - 1];
			for (int j = 0; j < A.length - 1; j++) {
				resultArray[j + 1] = A[j];
			}
			A = resultArray.clone();
		}

		return resultArray;
	}

}