package projecteuler.core.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Hans Peeter Tulmin on 28.07.2015.
 */
//TODO more robust
public class ReadFile {


	public static List<String> readToArrayList(String location) {
		//String basePath =
		try (Stream<String> stream = Files.lines(Paths.get(location))) {
			return stream.collect(Collectors.toList());
		} catch (IOException e) {
			return null;
		}
	}

	public static List<String> readToArrayList(String location, String splitMarker) {
		//String basePath =
		try (Stream<String> stream = Files.lines(Paths.get(location))) {
			//System.out.println(stream.findFirst().get());
			//System.out.println(stream.toString());
			return Arrays.asList(stream.findFirst().get().replace("\"", "").split(splitMarker));
			//return stream.collect(Collectors.toList());
		} catch (IOException e) {
			return null;
		}
	}
}
