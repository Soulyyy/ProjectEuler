package projecteuler.core.numericalMethods;

import java.util.ArrayList;
import java.util.List;

//TODO incomplete class
/**
 * Created by Hans Peeter Tulmin on 23.07.2015.
 */
public class PrimeGenerator<T extends Number,S extends Number> {

	public List<S> generateNthPrime(int length) {
		return generateNthPrime((Integer) length);
	}

	public List<S> generateNthPrime(short length) {
		return generateNthPrime((Short) length);
	}

	public List<S> generateNthPrime(long length) {
		return generateNthPrime((Long) length);
	}

	public List<S> generateNthPrime(T length) {
		return new ArrayList<>();
	}

	public void insertShit(int i) {
		generateNthPrime(i);
	}

	private List<S> weakSolution(T length) {
		return null;
	}
}
