package projecteuler.solutions.problem14;

import projecteuler.model.Input;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Exercise14Input implements Input<Integer, Integer> {

	Integer integer;

	@Override
	public Exercise14Input setInput(Integer input) {
		this.integer = input;
		return this;
	}

	@Override
	public Integer getInput() {
		return integer;
	}
}
