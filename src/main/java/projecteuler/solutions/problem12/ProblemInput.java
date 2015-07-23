package projecteuler.solutions.problem12;

import projecteuler.model.Input;

/**
 * Created by Hans Peeter Tulmin on 23.07.2015.
 */
public class ProblemInput implements Input<Integer, Integer> {

	Integer intValue;

	@Override
	public ProblemInput setInput(Integer input) {
		this.intValue = input;
		return this;
	}

	@Override
	public Integer getInput() {
		return intValue;
	}
}
