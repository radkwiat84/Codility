package radkwiat;

public class BinaryGap2 {
	public static void main(String[] args) {

		BinaryGap2 binGap = new BinaryGap2();
		int N = 328;
		@SuppressWarnings("unused")
		String s;
		System.out.println(binGap.solution(N));
		System.out.println( s = Integer.toBinaryString(N));
		

	}

	public int solution(int N) {
		int binaryGap = 0;
	    boolean found_one = false;
	    for (int j = 0; N > 0; N /= 2) {
	        if (N % 2 == 0) {
	            j++;
	        } else {
	            if (j > binaryGap && found_one == true){
	                binaryGap = j;
	            }
	            found_one = true;
	            j = 0;
	        }
	    }
	    return binaryGap;
	}
}