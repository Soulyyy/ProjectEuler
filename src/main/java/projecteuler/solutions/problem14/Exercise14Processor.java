package projecteuler.solutions.problem14;

import projecteuler.model.Exercise;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Exercise14Processor implements Exercise<Exercise14Input, Exercise14POutput> {
	private int max = 0;
	private int maxSize = 0;

	@Override
	public Exercise14POutput process(Exercise14Input input) {
		Integer cap = input.getInput();

		for (int i = 1; i < cap; i++) {
			checkMax(computeCollatzLength(i), i);
			//System.out.println(i);
		}

		System.out.println(maxSize);
		return new Exercise14POutput(max);
	}


	public int computeCollatzLength(long input) {
		int count = 1;
		while (input != 1) {
			if (input % 2 == 0) {
				input /= 2;
			} else {
				input = (3 * input + 1);
			}
			count++;
/*			if (count % 100 == 0) {
				System.out.println("Current input is: "+input);
				System.out.println("Count is: " + count);
			}*/
		}
		return count;
	}

	public void checkMax(int input, int i) {

		if (input > maxSize) {
			max = i;
			maxSize = input;
		}
	}
}
