package projecteuler.solutions.problem7;

/**
 * Created by Hans Peeter Tulmin on 19.07.2015.
 */
public class Main {

	public static void main(String[] args) {
/*		try {
			SieveOfAtkin sieveOfAtkin = new SieveOfAtkin(Integer.parseInt(args[0]));
			long resp = sieveOfAtkin.computeNthPrime();
			System.out.println("The answer is: " + resp);
			System.exit(0);
		} catch (NumberFormatException e) {
			System.out.println("The entered parameter is not a number.");
			System.exit(1);
		}*/

		System.out.println(IdiotMethod.findPrimes(10001));
	}
}
