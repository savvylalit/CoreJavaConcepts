package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Custom sort with respect to last digit of a number.
class ComparatorImpl implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%10 > o2%10)
			return 1;
		return -1;
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(238);
		values.add(821);
		values.add(542);
		values.add(777);
		values.add(623);
		
		
		//Comparator<Integer> com = new ComparatorImpl(); // You can pass this to sort function.
		
		// Done using lambda function.
		Collections.sort(values, 
			(Integer o1, Integer o2) -> {
			if(o1%10 > o2%10)
				return 1;	// Return 1 when you want to swap value of o1 & o2.
			return -1;
			}
		);
		
		for(int i:values)
			System.out.println(i);

	}

}


