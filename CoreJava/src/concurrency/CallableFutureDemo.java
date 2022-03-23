package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable{
	int number;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Object call() throws Exception {
		int sum = 0;
		System.out.println(Thread.currentThread().getName() + " ... is responsible to find sum of first " + number + " numbers");
		for(int i = number; i>0; i--) {
			sum = sum + i;
		}
		return sum;
	}
}

public class CallableFutureDemo {

	public static void main(String[] args) throws Exception{
		MyCallable[] jobs = {new MyCallable(10),
							new MyCallable(20),
							new MyCallable(30),
							new MyCallable(40),
							new MyCallable(50),
							new MyCallable(60)}; 
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyCallable job : jobs) {
			Future fut = service.submit(job);
			System.out.println(fut.get());
		}
		service.shutdown();
	}

}
