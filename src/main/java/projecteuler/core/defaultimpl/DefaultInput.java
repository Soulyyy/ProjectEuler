package projecteuler.core.defaultimpl;

import projecteuler.model.Input;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
public class DefaultInput<T> implements Input<T, T> {

	T input;

	@Override
	public DefaultInput<T> setInput(T input) {
		this.input = input;
		return this;
	}

	@Override
	public T getInput() {
		return input;
	}
}
