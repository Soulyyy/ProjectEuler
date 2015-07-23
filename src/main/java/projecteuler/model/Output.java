package projecteuler.model;

/**
 * Created by Hans Peeter Tulmin on 22.07.2015.
 */
public interface Output<T> {

	public void printResult();

	public T returnOutput();

	public void setOutput(T input);
}
