package projecteuler.solutions.problem22;

import projecteuler.core.defaultimpl.DefaultOutput;
import projecteuler.model.Exercise;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Hans Peeter Tulmin on 31.07.2015.
 */
public class Ex22Processor implements Exercise<Ex22I, DefaultOutput<Long>> {
	@Override
	public DefaultOutput<Long> process(Ex22I input) {
		String[] strings = input.getInput();
		Arrays.sort(strings);
		//System.out.println(strings.length);

		//System.out.println(IntStream.range(1,5).reduce((d,e)->d*e).getAsInt());

		long l = IntStream.range(0, strings.length).mapToLong(i -> (i+1)*(strings[i].chars().mapToLong(j -> j-64).sum())).reduce(0,(a,b) -> a+b);
		//System.out.println(l);
		return new DefaultOutput<>(l);
	}
}
