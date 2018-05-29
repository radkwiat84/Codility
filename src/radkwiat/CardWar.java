package radkwiat;

public class CardWar {
	private final static char[] Pool = { 'T', 'J', 'Q', 'K', 'A' };

	public static void main(String[] args) {

		String A = "T4A6";
		String B = "5TQ7";
		System.out.println(solution(A, B));
	}

	public static int solution(String A, String B) {
		int result = 0;
		int numberA = 0;
		int numberB = 0;
		if (A.length() != 0 && B.length() == A.length()) {
			char[] arrayA = A.toCharArray();
			char[] arrayB = B.toCharArray();
			for (int i = 0; i < arrayB.length; i++) {
				if (arrayA[i] == arrayB[i]) {
					continue;
				}
				boolean isInPoolA = isInPool(arrayA[i], Pool);
				boolean isInPoolB = isInPool(arrayB[i], Pool);

				if (isInPoolA == true) {
					numberA = makingInteger(arrayA[i], Pool);
				}
				if (isInPoolB == true) {
					numberB = makingInteger(arrayB[i], Pool);
				}
				if (isInPoolA == false) {
					numberA = makingInteger(arrayA[i]);
				}
				if (isInPoolB == false) {
					numberB = makingInteger(arrayB[i]);
				}
				if (numberA > numberB) {
					result++;
				}
			}
		}
		return result;
	}

	public static boolean isInPool(char a, char[] pool) {
		for (int i = 0; i < pool.length; i++) {
			if (a == pool[i]) {
				return true;
			}
		}
		return false;
	}

	public static int makingInteger(char a, char[] pool) {
		int x = 0;
		for (int i = 0; i < pool.length; i++) {
			if (a == pool[i]) {
				x = i;
				break;
			}
		}
		return 10 + x;
	}

	public static int makingInteger(char a) {
		String temp = Character.toString(a);
		return Integer.parseInt(temp);
	}
}