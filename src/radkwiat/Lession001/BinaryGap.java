package radkwiat.Lession001;

import java.util.StringTokenizer;

public class BinaryGap {

	public static void main(String[] args) {

		BinaryGap binGap = new BinaryGap();

		int N = 328;
		String s = Integer.toBinaryString(N);
		System.out.println("binarna = " + s);
		System.out.println("wynik = " + binGap.solution2(N));

	}

	public int solution2(int N) {
		int result = 0;
		StringBuffer binStr = new StringBuffer(Integer.toBinaryString(N));
		int start = binStr.indexOf("1") + 1;
		int end2 = binStr.lastIndexOf("1");
		
		String binStrReady = binStr.substring(start, end2);
		
		StringTokenizer strTok = new StringTokenizer(binStrReady, "1");
		while (strTok.hasMoreTokens()) {
			String strResult = strTok.nextToken();
			int occurs0 = strResult.length();
			if (occurs0 > result) {
				result = occurs0;
			}
		}
		return result;
	}
}