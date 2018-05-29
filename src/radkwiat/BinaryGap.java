package radkwiat;

public class BinaryGap {

	public static void main(String[] args) {

		BinaryGap binGap = new BinaryGap();

		int N = 328;
		String s = Integer.toBinaryString(N);
		System.out.println("binarna = " + s);
		System.out.println("wynik = " + binGap.solution(N));

	}

	public int solution2(int N) {
		int result = 0;
		String str = Integer.toBinaryString(N);
		char[] array = str.toCharArray();
		


		return result;
	}

	public int solution(int N) {

		int result = 0;
		int longestReasult = 1;
		String str = Integer.toBinaryString(N);
		char[] array = str.toCharArray();

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == '0' && array[i + 1] == '0') {
				longestReasult++;
				if (longestReasult > result) {
					result = longestReasult;
				}
			}
			if (array[i] != '0') {
				longestReasult = 1;
			}
		}
		return result;
	}
}