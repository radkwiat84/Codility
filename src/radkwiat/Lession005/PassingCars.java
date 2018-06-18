package radkwiat.Lession005;

import java.util.ArrayList;
import java.util.List;

public class PassingCars {

	public static void main(String[] args) {

		int[] A = { 0, 1, 0, 1, 1 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		int numberOfPasses = 0;

		if (numberOfPasses > 1000000000)
			return -1;

		List<Integer> listOf0 = new ArrayList<>();
		List<Integer> listOf1 = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				listOf0.add(i);
			} else {
				listOf1.add(i);
			}
		}
		int lenghtOfZero = listOf0.size();
		int lengthOfOne = listOf1.size();

		for (int i = 0; i < lenghtOfZero; i++) {
			for (int j = 0; j < lengthOfOne; j++) {
				if (listOf0.get(i) < listOf1.get(j)) {
					numberOfPasses += (lengthOfOne - j);
					break;
				}
			}
		}
		return numberOfPasses;
	}
}
