package projecteuler.solutions.problem18a67;

import projecteuler.core.io.ReadFile;
import projecteuler.model.Input;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class Ex18I implements Input<List<String>, List<Integer[]>> {

	public Ex18I(String location) {
		setInput(ReadFile.readToArrayList(location));
	}

	List<Integer[]> ints;

	@Override
	public Input<List<String>, List<Integer[]>> setInput(List<String> input) {
		ints = input.stream().map(s -> (Arrays.stream(s.split(" ")).map(Integer::parseInt).
				collect(Collectors.toList()).toArray(new Integer[s.split(" ").length]))).
				collect(Collectors.<Integer[]>toList());
		return this;
	}

	@Override
	public List<Integer[]> getInput() {
		return ints;
	}
}
