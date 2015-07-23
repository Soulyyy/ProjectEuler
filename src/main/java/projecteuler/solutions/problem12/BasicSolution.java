package projecteuler.solutions.problem12;

import projecteuler.model.Exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hans Peeter Tulmin on 23.07.2015.
 */
public class BasicSolution implements Exercise<ProblemInput, ProblemOutput> {
	@Override
	public ProblemOutput process(ProblemInput input) {
		while (divisorCount(primeFactorization(aggregatedValues)) <= input.getInput()) {
			long i =generateNextNaturalNumber();
			//System.out.println("Next prime is :="+i);
			curValue = i;
			aggregatedValues += i;
		}
		return new ProblemOutput().returnObject(aggregatedValues);
	}

	//TODO refactor this to core as generics
	private long curValue = 1;
	private long aggregatedValues = 1;

	private long generateNextNaturalNumber() {
		return curValue+1;
	}

	public long generateNextPrime() {
		//Increment, else we would hit current
		//Prime gap(at least one prime [k,2k] where k is a prime
		for (long i = curValue + 1; i <= curValue * 2; i++) {
			if (validatePrime(i)) {
				return i;
			}
		}
		System.out.println("BROKEN");
		return 0;
	}

	private boolean validatePrime(long potentialPrime) {
		for (int i = 2; i < Math.sqrt(potentialPrime); i++) {
			if (potentialPrime % i == 0) {
				return false;
			}
		}
		return true;
	}

	//TODO CoPrime factorization
	private Map<Long, Long> primeFactorization(long input) {
		//System.out.println("Number is = "+input);
		Map<Long, Long> resp = new HashMap<>();

		for (long i = 2; i <= input; i++) {
			long curCount = 0;
			while (input % i == 0) {
				curCount++;
				input /= i;

			}
			if (curCount > 0) {
				resp.put(i, curCount);
			}
		}

		return resp;
	}

	private long divisorCount(Map<Long, Long> input) {
		long resp = 1;
		for (long i : input.values()) {
			resp *= (i + 1);
		}
		System.out.println(input+": "+resp);
		return resp;
	}

}
