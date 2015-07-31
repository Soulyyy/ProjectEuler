package projecteuler.core.defaultimpl;

import projecteuler.model.Output;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class DefaultOutput<T> implements Output<T> {

	T output;

	public DefaultOutput(T output) {
		setOutput(output);
	}

	@Override
	public void printResult() {
		System.out.println(returnOutput());
	}

	@Override
	public T returnOutput() {
		return output;
	}

	@Override
	public void setOutput(T input) {
		this.output = input;
	}
}
