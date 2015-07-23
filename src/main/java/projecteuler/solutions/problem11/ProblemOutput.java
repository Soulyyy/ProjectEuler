package projecteuler.solutions.problem11;

import projecteuler.model.Output;

/**
 * Created by Hans Peeter Tulmin on 22.07.2015.
 */
public class ProblemOutput implements Output<Integer> {

	Integer value;

	@Override
	public void printResult() {
		System.out.println(this.returnOutput());
	}

	@Override
	public Integer returnOutput() {
		return value;
	}

	@Override
	public void setOutput(Integer input) {
		value = input;
	}

}
