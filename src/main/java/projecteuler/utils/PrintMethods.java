package projecteuler.utils;

import java.util.List;

/**
 * Created by Hans Peeter Tulmin on 21.07.2015.
 */
public class PrintMethods {

	public static void printList(List<?> list) {
		System.out.println(listToString(list));
	}

	public static String listToString(List<?> list) {
		String resp = "";
		for(Object o : list) {
			resp+=o.toString()+" ";
		}
		resp = resp.trim();
		return resp;
	}
}
