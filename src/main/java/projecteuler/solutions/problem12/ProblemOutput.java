package projecteuler.solutions.problem12;

import projecteuler.model.Output;

/**
 * Created by Hans Peeter Tulmin on 23.07.2015.
 */
public class ProblemOutput implements Output<Long>{

	Long intValue;

	@Override
	public void printResult() {
		System.out.println(returnOutput());
	}

	@Override
	public Long returnOutput() {
		return intValue;
	}

	@Override
	public void setOutput(Long input) {
		this.intValue = input;
	}

	public ProblemOutput returnObject(Long input) {
		this.intValue = input;
		return this;
	}
}
