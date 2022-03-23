package concurrency;
// demonstrating trylock() method

import java.util.concurrent.locks.ReentrantLock;


class MyThread1 extends Thread{
	
	static ReentrantLock l = new ReentrantLock(); // declared as static to obtain class level lock, for demo.
	String name;
	

	public MyThread1(String name2) {
		super(name2);
	}

	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " ...got lock and performing safe operations");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {}
			l.unlock();
		}else {
			System.out.println(Thread.currentThread().getName() + " ...unable to get lock and hence performing alternative operations");
		}
	}
}

public class ReentrantLockDemo2 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("First Thread");
		MyThread1 t2 = new MyThread1("Second Thread");

		t1.start();
		t2.start();
	}

}
