package projecteuler.solutions.problem16;

import projecteuler.model.Output;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Ex16O implements Output<Integer> {

	public Ex16O(Integer integer) {
		setOutput(integer);
	}

	Integer output = 0;

	@Override
	public void printResult() {
		System.out.println(output);
	}

	@Override
	public Integer returnOutput() {
		return output;
	}

	@Override
	public void setOutput(Integer input) {
		this.output = input;
	}
}
