package radkwiat.Lession005;

import java.util.Arrays;

public class GenomicRangeQuery {

	public static void main(String[] args) {

		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };

		String S = "CAGCCTA";

		GenomicRangeQuery gem = new GenomicRangeQuery();

		System.out.println(Arrays.toString(gem.solution(S, P, Q)));

	}

	public int[] solution(String S, int[] P, int[] Q) {
		int lengthOfP = P.length;
		int[] result = new int[lengthOfP];
		StringBuilder strBuilder = new StringBuilder(S);
		for (int i = 0; i < lengthOfP; i++) {

			String[] strTemp = (strBuilder.substring(P[i], Q[i]) + S.charAt(Q[i])).split("");
			Arrays.sort(strTemp);			
			
			switch(strTemp[0]) {
			case "A":
				result[i] = 1;
				break;
			case "C":
				result[i] = 2;
				break;
			case "G":
				result[i] = 3;
				break;
			case "T":
				result[i] = 4;
				break;
			}
		}
		return result;
	}
}
