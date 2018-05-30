package radkwiat;

import java.util.ArrayList;
import java.util.List;

public class JohnInCasino {

	public static void main(String[] args) {
		int N = 8;
		int K = 0;
		System.out.println(solution(N, K));

		N = 18;
		K = 2;
		System.out.println(solution(N, K));

		N = 10;
		K = 10;
		System.out.println(solution(N, K));


	}

	public static int solution(int N, int K) {
		if (N > 1) {
			if (K == 0) {
				return N - 1;
			}
			List<Integer> betting = new ArrayList<>();
			int doneNumberOfAllIn = 0;
			betting.add(N);
			for (int i = 0; i < betting.size(); i++) {
				if (betting.get(betting.size() - 1) == 2) {
					return betting.size();
				}
				if (betting.get(i) % 2 != 0 || (betting.get(i) % 2 == 0 && K <= doneNumberOfAllIn)) {
					betting.add(betting.get(i) - 1);
				} else if (K > doneNumberOfAllIn) {
					betting.add(betting.get(i) / 2);
					doneNumberOfAllIn++;
				}
				
				System.out.println(betting);
			}
		}
		return 0;
	}
}
