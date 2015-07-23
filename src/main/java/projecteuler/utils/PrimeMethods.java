package projecteuler.utils;

/**
 * Created by Hans Peeter Tulmin on 21.07.2015.
 */
public class PrimeMethods {

	public static boolean isPrime(int integer) {
		for(int i = 2;i<=Math.sqrt(integer);i++) {
			if(integer % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(long longValue) {
		for(long i = 2;i<=Math.sqrt(longValue);i++) {
			if(longValue % i == 0) {
				return false;
			}
		}
		return true;
	}
}
