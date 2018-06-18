package radkwiat.Other;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		int[] array = { 2 };
		Solution sol = new Solution();

		System.out.println(sol.solution(array));

	}

	public int solution(int[] A) {
		int result = 1;
		List<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < A.length; i++) {
			array.add(A[i]);
		}
		while (array.contains(result)) {
			result++;
		}
		return result;
	}

}