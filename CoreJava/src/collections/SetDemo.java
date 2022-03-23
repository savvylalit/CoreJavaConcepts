package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<Integer>();

		System.out.println(values.add(4));
		System.out.println(values.add(2));
		System.out.println(values.add(8));
		System.out.println(values.add(2)); // this value is not added, as set does not allow duplicates.
		
		System.out.println("Values in Hashset");
		for(int i : values)
			System.out.println(i);
		
		Set<Integer> valuesTreeSet = new TreeSet<Integer>();
		System.out.println(valuesTreeSet.add(4));
		System.out.println(valuesTreeSet.add(2));
		System.out.println(valuesTreeSet.add(8));
		System.out.println(valuesTreeSet.add(2)); // this value is not added, as set does not allow duplicates.
		
		System.out.println("Values in Treeset"); 
		// Data will be given in ascending order
		for(int i : valuesTreeSet)
			System.out.println(i);
	}

}
