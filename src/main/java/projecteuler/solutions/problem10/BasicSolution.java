package projecteuler.solutions.problem10;

import projecteuler.utils.PrimeMethods;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Hans Peeter Tulmin on 21.07.2015.
 */

public class BasicSolution {

	protected static List<Integer> primesBelowThreshold(int threshold) {
		List<Integer> resp = new ArrayList<>();
		for(int i = 2;i<threshold;i++) {
			if(PrimeMethods.isPrime(i)) {
				resp.add(i);
			}
		}
		return resp;
	}
}
