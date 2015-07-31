package projecteuler.solutions.problem21;

import projecteuler.core.defaultimpl.DefaultInput;
import projecteuler.core.defaultimpl.DefaultOutput;
import projecteuler.model.Exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hans Peeter Tulmin on 31.07.2015.
 */
public class Ex21Processor implements Exercise<DefaultInput<Integer>, DefaultOutput<Integer>> {
	@Override
	public DefaultOutput<Integer> process(DefaultInput<Integer> input) {
		//System.out.println(verifyAmicableNumber(220));
		int resp = 0;

		for(int i=1;i<input.getInput();i++) {
			if(verifyAmicableNumber(i)) {
				System.out.println(i);
				resp+=i;
			}
		}

		return new DefaultOutput<>(resp);
	}

	public boolean verifyAmicableNumber(int input) {
		//System.out.println("Input is: "+input);
		int firstSum = computeDivisors(input).stream().mapToInt(Integer::intValue).sum();
		int secondSum = computeDivisors(firstSum).stream().mapToInt(Integer::intValue).sum();
		/*System.out.println("First number is: "+firstSum);
		System.out.println("Second number is: "+secondSum);*/
		return input == secondSum && input != firstSum;

	}


	public List<Integer> computeDivisors(int input) {
		List<Integer> divisors = new ArrayList<>();
		for (int i = 1; i <= (input+1) /2; i++) {
			if (input % i == 0) {
				//divisors.add(i);
				//System.out.println(i);
			}
		}
		return divisors;
	}
}
