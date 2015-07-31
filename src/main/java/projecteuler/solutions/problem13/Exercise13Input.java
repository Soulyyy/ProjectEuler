package projecteuler.solutions.problem13;


import projecteuler.model.Input;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hans Peeter Tulmin on 26.07.2015.
 */
public class Exercise13Input implements Input<String, List<BigInteger>> {

	List<BigInteger> integerList;

	@Override
	public Exercise13Input setInput(String input) {
		integerList = new ArrayList<>();
		for(String s : input.split("\n")) {
			integerList.add(new BigInteger(s));
		}
		return this;
	}

	@Override
	public List<BigInteger> getInput() {
		return integerList;
	}
}
