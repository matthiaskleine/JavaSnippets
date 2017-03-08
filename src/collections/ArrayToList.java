package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.primitives.Ints;

/************************************************************
 * Convert arrays into Lists.
 * @author Matthias Kleine
 ************************************************************/
public class ArrayToList {
	
	// Version 1
	// Do it for arrays of some object type.
	public static List<Integer> mymethod1(Integer[] array) {
		return Arrays.asList(array);
	}

	// Version 1.1
	// Initialize the collection by a literally given array.
	// Boxing works here because of the varargs signature of asList(Integer... a).
	// This is actually not an array to collection conversion.
	public static List<Integer> mymethod1_1() {
		return Arrays.asList(1, 2, 3, 4);
	}

	// Version 2
	// Do it for arrays of primitive types.
	// Arrays.asList won't work here, because it does not deal with boxing.
	public static List<Integer> mymethod2(int[] array) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i : array) 
			result.add(i);
		return result;
	}

	// Version 3
	// Do it for arrays of primitive types by using Google Guava:
	public static List<Integer> mymethod3(int[] array) {
		return Ints.asList(array);
	}
		
}