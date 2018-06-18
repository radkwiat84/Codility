package radkwiat.Other;

import java.util.ArrayList;
import java.util.List;

public class PrefixAndSufix {

	public static void main(String[] args) {


		String S = "abbabba";
		System.out.println(solution(S));

	}

	public static int solution(String S) {
		String pref = "";
		String suf = "";
		String sufRev = "";
		List<String> prefList = new ArrayList<>();
		List<String> sufList = new ArrayList<>();
		List<String> resultArray = new ArrayList<>();
		if (!"".equals(S) ) {

			StringBuilder strBuildPref = new StringBuilder(pref);
			StringBuilder strBuildSuf = new StringBuilder(suf);
			StringBuilder strRevBuilder;

			for (int i = 0; i < S.length() - 1; i++) {
				prefList.add((strBuildPref.append(S.charAt(i)).toString()));
			}

			for (int j = S.length() - 1; j > 0; j--) {
				sufRev = strBuildSuf.append(S.charAt(j)).toString();
				strRevBuilder = new StringBuilder(sufRev);
				sufList.add(strRevBuilder.reverse().toString());
			}

			for (String str : prefList) {
				if (sufList.contains(str)) {
					resultArray.add(str);
				}
			}

			if (resultArray.size() > 0) {
				return resultArray.get(resultArray.size() - 1).length();
			}
		}
		return 0;
	}
}