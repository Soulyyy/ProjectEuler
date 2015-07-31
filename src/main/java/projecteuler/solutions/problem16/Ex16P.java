package projecteuler.solutions.problem16;

import projecteuler.model.Exercise;

import java.math.BigInteger;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Ex16P implements Exercise<Ex16I, Ex16O> {
	@Override
	public Ex16O process(Ex16I input) {

		int[] power = input.getInput();
		int resp = 0;
		BigInteger bigInteger = new BigInteger(String.valueOf(power[0])).pow(power[1]);
		for(char c : bigInteger.toString().toCharArray()) {
			resp+= Character.getNumericValue(c);
		}
		return new Ex16O(resp);
	}
}
