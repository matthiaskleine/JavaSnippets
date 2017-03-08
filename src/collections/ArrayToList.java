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
	public List<Integer> mymethod1(Integer[] array) {
		return Arrays.asList(array);
	}

	// Version 2
	// Do it for arrays of primitive types.
	// Arrays.asList won't work here, because it does not deal with boxing.
	public List<Integer> mymethod2(int[] array) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i : array) 
			result.add(i);
		return result;
	}

	// Version 3
	// Do it for arrays of primitive types by using Google Guava:
	public List<Integer> mymethod3(int[] array) {
		return Ints.asList(array);
	}
		
}