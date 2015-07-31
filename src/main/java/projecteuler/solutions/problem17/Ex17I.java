package projecteuler.solutions.problem17;

import projecteuler.model.Input;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Ex17I implements Input<Integer, Integer> {

	Integer integer = 0;

	@Override
	public Ex17I setInput(Integer input) {
		this.integer = input;
		return this;
	}

	@Override
	public Integer getInput() {
		return integer;
	}
}
