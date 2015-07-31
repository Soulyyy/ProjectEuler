package projecteuler.solutions.problem20;

import projecteuler.core.defaultimpl.DefaultInput;
import projecteuler.core.defaultimpl.DefaultOutput;
import projecteuler.model.Exercise;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hans Peeter Tulmin on 30.07.2015.
 */
public class Ex20Processor implements Exercise<DefaultInput<Integer>, DefaultOutput<Integer>> {
	@Override
	public DefaultOutput<Integer> process(DefaultInput<Integer> input) {
		//int resp = 0;
		int factorial = input.getInput();

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 2; i <= factorial; i++) {
			for (Map.Entry<Integer, Integer> j : primeFactorization(i).entrySet()) {
				if (map.get(j.getKey()) == null) {
					map.put(j.getKey(), j.getValue());
				} else {
					map.put(j.getKey(), map.get(j.getKey()) + j.getValue());
				}
			}
		}

		//TODO complete factorization solution
		BigInteger value = new BigInteger("1");
		for(int i = 2;i<=100;i++) {
			value = value.multiply(new BigInteger(i+""));
		}
		System.out.println(value.toString());
		int resp = (value.toString()).chars().map(Character::getNumericValue).sum();

		return new DefaultOutput<>(resp);
	}

	private Map<Integer, Integer> primeFactorization(long input) {
		//System.out.println("Number is = "+input);
		Map<Integer, Integer> resp = new HashMap<>();

		for (int i = 2; i <= input; i++) {
			int curCount = 0;
			while (input % i == 0) {
				curCount++;
				input /= i;

			}
			if (curCount > 0) {
				resp.put(i, curCount);
			}
		}

		return resp;
	}
}
