package projecteuler.model;

/**
 * Created by Hans Peeter Tulmin on 22.07.2015.
 */
public interface Input<T,S> {

	Input<T,S> setInput(T input);

	//void setInput(T input);

	S getInput();
}
