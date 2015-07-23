package projecteuler.model;

/**
 * Created by Hans Peeter Tulmin on 22.07.2015.
 */
public interface Exercise<S extends Input,T extends Output> {

	public T process(S input);
}
