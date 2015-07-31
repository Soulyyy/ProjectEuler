package projecteuler.solutions.problem22;

import projecteuler.core.io.ReadFile;
import projecteuler.model.Input;

import java.util.List;

/**
 * Created by Hans Peeter Tulmin on 31.07.2015.
 */
public class Ex22I implements Input<List<String>, String[]> {

	public Ex22I(String location) {
		setInput(ReadFile.readToArrayList(location, ","));
	}

	private String[] strings;

	@Override
	public Ex22I setInput(List<String> input) {
		this.strings =  input.toArray(new String[input.size()]);
		return this;
	}

	@Override
	public String[] getInput() {
		return strings;
	}
}
