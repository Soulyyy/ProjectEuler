package projecteuler.solutions.problem14;

import projecteuler.model.Output;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Exercise14POutput implements Output<Integer> {


	private Integer integer;

	public Exercise14POutput(Integer integer) {
		setOutput(integer);
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
