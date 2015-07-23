package projecteuler.solutions.problem9;

/**
 * Created by Hans Peeter Tulmin on 21.07.2015.
 */
public class BasicSolution {

	public static int[] pythagoreanTriplet(int limit) {
		for (int i = 0; i < 1000; i++) {
			int b = computeForA(i, limit);
			int c = limit - i - b;
			if (confirmTriplet(i, b, c)) {
				//System.out.println(i + " " + b + " " + c);
				//System.out.println(i*b*c);
				return new int[]{i, b, c};
			}
		}
		return new int[3];

	}

	public static boolean confirmTriplet(int a, int b, int c) {
		if(a==b || a == c || b == c) return false;
		return (a * a + b * b == c * c);
	}

	public static int computeForA(int a, int limit) {
		double tmp = (limit * (a - limit / 2.0) / (a - limit));
		return (int) tmp;
	}
}
