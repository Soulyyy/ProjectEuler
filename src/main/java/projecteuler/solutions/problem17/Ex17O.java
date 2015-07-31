package projecteuler.solutions.problem17;

import projecteuler.model.Output;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Ex17O implements Output<Integer> {

	Integer integer;

	public Ex17O(Integer integer) {
		this.integer=integer;
	}

	@Override
	public void printResult() {
		System.out.println(returnOutput());
	}

	@Override
	public Integer returnOutput() {
		return integer;
	}

	@Override
	public void setOutput(Integer input) {
		this.integer = input;
	}
}
