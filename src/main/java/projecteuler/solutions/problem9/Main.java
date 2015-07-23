package projecteuler.solutions.problem9;

/**
 * Created by Hans Peeter Tulmin on 21.07.2015.
 */
public class Main {
	public static void main(String[] args) {
		int[] answer = BasicSolution.pythagoreanTriplet(1000);
		System.out.println(answer[0]+" "+answer[1]+" "+answer[2]);
		System.out.println(computeProduct(answer));
	}

	private static int computeProduct(int[] ints) {
		int resp = 1;
		for(int i : ints) {
			resp*=i;
		}
		return resp;
	}

}
