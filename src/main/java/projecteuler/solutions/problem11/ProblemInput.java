package projecteuler.solutions.problem11;

import projecteuler.model.Input;

import java.util.Arrays;

/**
 * Created by Hans Peeter Tulmin on 22.07.2015.
 */
public class ProblemInput implements Input<String, int[]> {

	int[] resp;
	int count;

	@Override
	public ProblemInput setInput(String input) {
		resp = Arrays.stream(input.split("\n| ")).mapToInt(Integer::parseInt).toArray();
		return this;
	}

	@Override
	public int[] getInput() {
		return resp;
	}

	public int getStepSize() {
		try {
			return (int) Math.sqrt(resp.length);
		} catch (Exception e) {
			return 0;
		}
	}

	public ProblemInput setCount(int count) {
		this.count = count;
		return this;
	}

	public int getCount() {
		return count;
	}
}
