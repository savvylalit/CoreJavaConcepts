package basic;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(11, 10, 22, 35, 60, 88, 11);

		// Multiply each value by 2 and then add them
		// Without stream, variable results' value is mutated multiple times. 
		// This way of iterating is external iterating. Here we say WHAT and HOW to achieve
		int results = 0; 
		for(int i : values)
			results += i*2;
		System.out.println("Result without stream, via external iteration : "+results);
		
		// Multiply each value by 2 and then add them
		// Stream API allows internal iterating. Here we only need to specify WHAT. This way of programming is functional programming.
		System.out.println(values.stream()
								.map(i -> i*2)
								.reduce(0, (e,c) -> e+c));
		
		
		// Find first element divisible by 5. Filter is Lazy Loading and FindFirst is Terminating function
		System.out.println(values.stream()
								.filter(i -> i%5==0)
								.findFirst()
								.orElse(0));
		
		// Combining map, filter reduce. Multiple all values by 2. Select values who are divisible by 10. Add the remaining
		System.out.println(values.stream()
				.map(i -> i * 2)
				.filter(j -> j % 10 == 0)
				.reduce(0, (a, b) -> a + b));
	}

}
