package projecteuler.solutions.problem7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hans Peeter Tulmin on 19.07.2015.
 */
public class SieveOfAtkin {

	private long prime;

	public SieveOfAtkin() {
		this(1L);
	}

	public SieveOfAtkin(long prime) {
		this.prime = prime;
	}

	public long computeNthPrime() {
		long resp = 1;

		return resp;
	}

	public List<Long> computeNPrimes() {
		return new ArrayList<Long>();
	}

	private boolean computeFirst(long x, long y) {
		//Long modulo int is an int
		int n  = (int)(((4* x * x) + (y * y)) % 12);
		return (n == 1 ||n == 5);
	}

	private boolean computeSecond(long x, long y) {
		int n = (int)(((3 * x * x) + (y * y)) % 12);
		return n == 7;
	}

	private boolean computeThird(long x, long y) {
		if( x < y) {
			return false;
		}
		int n = (int)(((3 * x * x) - (y * y)) % 12);
		return n == 11;
	}
	//TODO DO  I need to compute for each number
	private boolean computePerfectSquare(long n) {
		for(int i = 5; i<Math.sqrt(n);i++) {

		}
		return false;
	}

	//TODO Use Concurrent HashMaps?
	//TODO Implement IsPrime()

	//TODO How to split process?
	//TODO how to remove elements divisible by perfect squares
	//TODO how to perserve ordering in concurrent implementation?

}
