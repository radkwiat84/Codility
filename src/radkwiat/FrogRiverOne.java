package radkwiat;

import java.util.LinkedHashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {

		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int x = 5;

		System.out.println(solution(x, A));

	}

	public static int solution(int X, int[] A) {
		int result = 0;
		Set<Integer> possisionLeaves = new LinkedHashSet<>();
		for (Integer x : A) {
			if (x <= X) {
				possisionLeaves.add(x);
				if (possisionLeaves.size() == X) {
					break;
				}
			}
			result++;
		}
		if(possisionLeaves.size()!=X) return -1;
		return result;
	}
}
