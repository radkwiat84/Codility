package radkwiat.Lession003;

public class FrogJmp {

	public static void main(String[] args) {

		FrogJmp test = new FrogJmp();
		int X = 15;
		int Y = 56468105;
		int D = 3;

		System.out.println("Wynik solution =  " + test.solution(X, Y, D));
		System.out.println("Wynik solution2 = " + test.solution2(X, Y, D));

	}

	public int solution2(int X, int Y, int D) {
		int result = 0;

		if (Y > X) {
			result = (Y - X) / D;
			if ((X + (result * D)) < Y) {
				result++;
			}
		}

		return result;
	}

	public int solution(int X, int Y, int D) {
		int result = 0;
		int sum = X;

		while (!(sum >= Y)) {
			sum += D;
			result++;
		}
		return result;
	}

}