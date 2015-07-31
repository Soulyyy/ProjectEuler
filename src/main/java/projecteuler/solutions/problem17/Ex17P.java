package projecteuler.solutions.problem17;

import projecteuler.model.Exercise;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Ex17P implements Exercise<Ex17I, Ex17O> {
	@Override
	public Ex17O process(Ex17I input) {

		//TODO GENERAL SOLUTION?
		int limit = input.getInput();
		int firstTenCount = 36;
		int firstTwentyCount = 70;
		int twentyToHundred = 10*46+8*firstTenCount;
		int oneToHundred = firstTenCount+firstTwentyCount+twentyToHundred;
		System.out.println(oneToHundred);
		int oneToThousand = 10*oneToHundred+7*9+9*99*10+11+firstTenCount*100;
		return new Ex17O(oneToThousand);
	}

}
