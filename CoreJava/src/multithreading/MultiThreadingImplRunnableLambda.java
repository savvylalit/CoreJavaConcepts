package multithreading;


public class MultiThreadingImplRunnableLambda {

	public static void main(String[] args) throws InterruptedException {
	
		Thread t1 = new Thread(() -> 
		{
			for(int i = 0; i<5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});
		
		Thread t2 = new Thread(() ->
		{
			for(int i = 0; i<5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		});
		
		t1.start();
		try {Thread.sleep(5);} catch (InterruptedException e) {}
		t2.start();
		
		System.out.println(t1.isAlive()); // t1 is still alive
		
		t1.join(); // Wait till t1 completes
		t2.join(); // Wait till t2 completes
		
		System.out.println(t1.isAlive()); // t1 will be false, it is terminated now
		
		System.out.println("Bye...");// This is main thread's sysout
		
	}
}
