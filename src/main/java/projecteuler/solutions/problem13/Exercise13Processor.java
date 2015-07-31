package projecteuler.solutions.problem13;


import projecteuler.model.Exercise;

import java.util.List;
import java.math.*;

/**
 * Created by Hans Peeter Tulmin on 26.07.2015.
 */
//TODO optimize, bad solution
public class Exercise13Processor implements Exercise<Exercise13Input,Exercise13Output> {
	@Override
	public Exercise13Output process(Exercise13Input input) {
		BigInteger resp = new BigInteger("0");
		List<BigInteger> integers = input.getInput();
		System.out.println(integers.size());
		for(BigInteger i : integers) {
			resp = resp.add(i);
		}
		System.out.println(resp.toString());
		resp = new BigInteger(resp.toString().substring(0,10));
		return new Exercise13Output(resp);
	}
}

