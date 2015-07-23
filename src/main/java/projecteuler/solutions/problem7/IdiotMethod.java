package projecteuler.solutions.problem7;

/**
 * Created by Hans Peeter Tulmin on 21.07.2015.
 */
public class IdiotMethod {

	public static long findPrimes(int count) {
		int curCount = 0;
		long latestPrime = -1;
		for(long i = 2;curCount < count ;i++) {
			if(isPrime(i)) {
				curCount++;
				latestPrime = i;
			}

		}
		return latestPrime;
	}

	public static boolean isPrime(long input) {
		for(int i = 2;i<=Math.sqrt(input);i++) {
			if(input % i == 0) {
				return false;
			}
		}
		return true;
	}
}
