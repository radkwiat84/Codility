package radkwiat.Lession003;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {

	public static void main(String[] args) {

		int[] A = { 3, 1, 2, 4, 3 };
		System.out.println("Długość tablicy A : " + A.length);
		System.out.println("\n Wynik = " + solution(A));
		

	}

	public static int solution(int[] A) {
		@SuppressWarnings("unused")
		int result;
		int sumP = 0;
		int sumL = 0;
		for (int i : A)
			sumP += i;
		System.out.println("suma element�w tablicy A = " + sumP);
		List<Integer> array = new ArrayList<>();
			for (int i = 0; i < A.length - 1; i++) {
				sumP -= A[i];
				sumL += A[i];
				array.add(result = Math.abs(sumL - sumP));
			}
		Collections.sort(array);
		return array.get(0);
	}
}