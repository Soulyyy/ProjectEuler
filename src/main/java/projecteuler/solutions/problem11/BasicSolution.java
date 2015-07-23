package projecteuler.solutions.problem11;

import projecteuler.model.Exercise;

/**
 * Created by Hans Peeter Tulmin on 22.07.2015.
 */
public class BasicSolution implements Exercise<ProblemInput, ProblemOutput> {

	public int max = -1;


	//TODO Replace cases with coordinate pairs along with the number being searched

	@Override
	public ProblemOutput process(ProblemInput input) {


		int[] data = input.getInput();
		int stepSize = input.getStepSize();
		int count = input.getCount();
		int[][] combinations = {{1, 0}, {0, 1}, {1, 1}, {1, -1}};
		for (int i = 0; i < data.length; i++) {
			for (int[] j : combinations) {
				if (validateMove(i, stepSize, j, count)) {
					updateMax(makeMove(i, stepSize, data, j, count));
				}
			}
		}

		ProblemOutput problemOutput = new ProblemOutput();
		problemOutput.setOutput(max);
		return problemOutput;
	}

	public boolean validateMove(int curPos, int stepSize, int[] coords, int step) {
		int curI = curPos % stepSize;
		int curJ = curPos / stepSize;
		return (curJ + coords[0] * step <= stepSize) && (curI + coords[1] * step <= stepSize) && (curJ + coords[0] * step > 0) && (curI + coords[1] * step > 0);
	}

	public int makeMove(int curPos, int stepSize, int[] ints, int[] coords, int step) {
		int curI = curPos % stepSize;
		int curJ = curPos / stepSize;
		int resp = 1;
		for (int i = 0; i < step; i++) {
			resp *= ints[(curJ + i * coords[0]) * stepSize + curI + i * coords[1]];
		}
		return resp;

	}

	public void updateMax(int candidate) {
		if (this.max < candidate) {
			this.max = candidate;
		}
	}
}
