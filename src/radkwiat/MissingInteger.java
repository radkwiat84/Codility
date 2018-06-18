package radkwiat;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		int[] B = { -1 };

		System.out.println(solution(B));

	}

	public static int solution(int[] A) {
		Set<Integer> array = new HashSet<>();

		for (int x : A) {
			if (x > 0)
				array.add(x);
		}
		if (array.isEmpty())
			return 1;
	
		Integer[] readyArray = array.toArray(new Integer[array.size()]);
		
		if (readyArray[0] != 1)
			return 1;
		else if (readyArray.length == 1 && readyArray[0] == 1)
			return 2;

		for (int i = 0; i < readyArray.length - 1; i++) {
			if (readyArray[i] + 1 != readyArray[i + 1]) {
				return readyArray[i] + 1;
			}
		}
		return readyArray[readyArray.length - 1] + 1;
	}
}
