package multithreading;

class Counter{
	int count;
	// Remove keyword synchronized and check the output to see the effect of synchronized.
	// here both Threads, t1 and t2 are using the same resource "increment()" method. 
	// If not synchronized, they interfere each others output resulting into erroneous results
	public synchronized void increment(){
		count++;
	}
}

public class SynchronizationDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();

		Thread t1 = new Thread(() -> 
		{
			for(int i=0; i<1000; i++) {
				c.increment();
				System.out.println("Thread 1... " + c.count);
			}
		});
		
		Thread t2 = new Thread(() -> 
		{
			for(int i=0; i<1000; i++) {
				c.increment();
				System.out.println("Thread 2... " + c.count);
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(c.count);
	}
	
}
