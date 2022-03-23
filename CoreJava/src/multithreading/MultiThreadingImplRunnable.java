package multithreading;

class HiRun implements Runnable{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class HelloRun implements Runnable{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreadingImplRunnable {

	public static void main(String[] args) {
		Runnable hi = new HiRun();
		Runnable hello = new HelloRun();
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		
		t1.start();
		try {Thread.sleep(5);} catch (InterruptedException e) {}
		t2.start();
		
	}
}
