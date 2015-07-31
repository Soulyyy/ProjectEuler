package projecteuler.solutions.problem16;

import projecteuler.model.Input;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Ex16I implements Input<int[], int[]> {

	int[] powerNumber = new int[2];

	@Override
	public Ex16I setInput(int[] input) {

		this.powerNumber = input;
		return this;
	}

	@Override
	public int[] getInput() {
		return powerNumber;
	}
}
