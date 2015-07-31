package projecteuler.solutions.problem21;

import projecteuler.core.defaultimpl.DefaultInput;

/**
 * Created by Hans Peeter Tulmin on 31.07.2015.
 */
public class Ex21M {

	public static void main(String[] args) {
		new Ex21Processor().process(new DefaultInput<Integer>().setInput(10000)).printResult();
	}
}
