package projecteuler.solutions.problem10;

import projecteuler.utils.PrintMethods;

import java.util.List;

/**
 * Created by Hans Peeter Tulmin on 21.07.2015.
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> values = BasicSolution.primesBelowThreshold(2000000);
		PrintMethods.printList(values);
		System.out.println(sumPrimes(values));

	}

	private static long sumPrimes(List<Integer> primes) {
		long sum = 0;
		for (int i : primes) {
			sum += i;
		}
		return sum;
	}

}
