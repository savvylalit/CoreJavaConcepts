package basic;

public class DynamicProgramming {

	public static void main(String[] args) throws Exception {
		int fib = 10;
		long[] memo = new long[fib+1];
		System.out.println("fibonacci_factorial nth num is : " + fibonacci_recursive(fib));
		System.out.println("fibonacci_memoize nth num is : " + fibonacci_memoize(fib, memo));
		System.out.println("fibonacci_bottom_up nth num is : " + fibonacci_bottom_up(fib));
				
	}
	
	/*This is factorial with simple recursive function calls.
	 * Time complexity of recursive function is O(2^n). As the number of input grows, the function degrades.
	 * Below function will run perpetual for num > 45 */
	static long fibonacci_recursive(int num) {
		long result=1l;
		if(num == 1 || num == 2)
			return 1;
		else {
			result = fibonacci_recursive(num - 1) + fibonacci_recursive(num - 2);
		}
		return result;
	}
	
	/* To improve performance, we use a Dynamic Programming technique called Memoization.
	 * In memoization, we store the intermediate results and return the same when required again. Thus, we do not re-compute them 
	 * Time complexity of this approach is O(n)*/
	static long fibonacci_memoize(int num, long[] memo) {
		
		long result=1l;
		if(memo[num] != 0)
			return memo[num];
		if(num == 1 || num == 2)
			return 1;
		else {
			result = fibonacci_memoize(num - 1, memo) + fibonacci_memoize(num - 2, memo);
		}
		memo[num] = result;
		return result;
	}
	
	/* To improve performance, we use a Dynamic Programming technique called Bottom-Up.
	 * In Bottom-Up, we explicitly build the array from left to right, instead of building it recursively.
	 * Time complexity of this approach is O(n) */
	static long fibonacci_bottom_up(int num) {
		long[] bottom_up = new long[num+1];
		bottom_up[1] = 1;
		bottom_up[2] = 1;
		for(int i = 3; i <= num; i++) {
			bottom_up[i] = bottom_up[i-1] + bottom_up[i-2];
		}
		return bottom_up[num];
	}

}
