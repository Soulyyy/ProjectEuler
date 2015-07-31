package projecteuler.solutions.problem13;


import projecteuler.model.Output;

import java.math.BigInteger;

/**
 * Created by Hans Peeter Tulmin on 26.07.2015.
 */
public class Exercise13Output implements Output<BigInteger> {

	public Exercise13Output(BigInteger integer) {
		setOutput(integer);
	}

	BigInteger output;
	@Override
	public void printResult() {
		System.out.println(returnOutput());
	}

	@Override
	public BigInteger returnOutput() {
		return this.output;
	}

	@Override
	public void setOutput(BigInteger input) {
		this.output = input;
	}


}
