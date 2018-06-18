package radkwiat;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {

		int N = 5;
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };

		System.out.println(Arrays.toString(solution(N, A)));
	}

	public static int[] solution(int N, int[] A) {
		int maxValueOfCouner = 0;
		int valueOfActuallyFieldOfArray = 0;

		int[] result = new int[N];
		Arrays.fill(result, 0);

		for (int x : A) {
			if (isIncrease(x, N)) {
				result[x - 1]++;
				valueOfActuallyFieldOfArray = result[x - 1];
				maxValueOfCouner = setMaxValueOfCouner(maxValueOfCouner, valueOfActuallyFieldOfArray);
			} else {
				Arrays.fill(result, maxValueOfCouner);
			}

		}

		return result;
	}

	public static boolean isIncrease(int x, int N) {
		if (1 <= x && x <= N)
			return true;
		return false;
	}

	public static int setMaxValueOfCouner(int maxValue, int actualValue) {
		if (maxValue < actualValue) {
			maxValue = actualValue;
			return maxValue;
		}
		return maxValue;
	}
}
