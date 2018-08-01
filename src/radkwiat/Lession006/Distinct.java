package radkwiat.Lession006;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	
	public static void main(String[] args) {
		
		int[] A = {2, 1, 1, 2, 3, 1};
		Distinct dist = new Distinct();
		
		System.out.println(dist.solution(A));
		
		
	}
	
	public int solution(int[] A) {
		int result = 0;
		if (A.length != 0){
			Set<Integer> setOfAElements = new HashSet<>();
			for(Integer a : A)
				setOfAElements.add(a);
			result = setOfAElements.size();
		}
		return result;
	}

}
