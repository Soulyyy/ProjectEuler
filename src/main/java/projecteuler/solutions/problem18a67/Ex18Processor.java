package projecteuler.solutions.problem18a67;

import projecteuler.core.defaultimpl.DefaultOutput;
import projecteuler.model.Exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Hans Peeter Tulmin on 29.07.2015.
 */
//TODO Finish map
public class Ex18Processor implements Exercise<Ex18I, DefaultOutput> {
	@Override
	public DefaultOutput process(Ex18I input) {
		int resp = 0;

		Comparator<Integer> cmp = (x, y) -> (x < y) ? -1 : ((x > y) ? 1 : 0);

		List<Integer[]> integers = input.getInput();

/*		for (Integer i : integers.get(0)) {
			System.out.println(i);
		}*/

		Collections.reverse(integers);

		//System.out.println(integers.size());

		for(int i = 1;i<integers.size();i++) {
			for(int j = 0;j<integers.get(i).length;j++) {
				//System.out.println("prev: "+integers.get(i)[j]);
				integers.get(i)[j] += Math.max(integers.get(i-1)[j],integers.get(i-1)[j+1]);
				//System.out.println("now: "+integers.get(i)[j]);
			}
		}

		resp = integers.get(integers.size()-1)[0];
		//System.out.println(integers.get(integers.size()-1)[0]);

/*		List<Integer[]> integers = input.getInput();
		Collections.reverse(integers);
		Iterator<Integer[]> iterator = integers.iterator();
		integers.stream().map(i -> Arrays.stream(integers.iterator().next()).map()Arrays.stream(i).map()integers.iterator().next()).forEach(System.out::println);
		integers.stream().map((Integer[] i) -> integers.iterator().next()).map((Integer[] j) -> Arrays.stream(j).map((Integer l) -> l += Math.max(i, 2))).forEach(System.out::println);

		IntStream.range(0, integers.size() - 1).mapToObj((int i) -> Arrays.stream(integers.get(i)).iterator()).map((Iterator<Integer> j) -> Arrays.stream(integers.get(i + 1)).iterator()).map((j -> j.next())

				IntStream.range(0, integers.size() - 1).mapToObj((int i) -> Arrays.stream(integers.get(i + 1)).map((Integer j) -> integers.get(i)).max()).forEach(System.out::println);*/
		return new DefaultOutput<>(resp);
	}

}
