package concurrency;

// demonstrating lock() method

import java.util.concurrent.locks.ReentrantLock;

class Display{
	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();
		for(int i=1; i<=10; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();
	}
}

class MyThread extends Thread{
	
	Display d;
	String name;
	
	MyThread(Display d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvraj");
		MyThread t3 = new MyThread(d, "Kohli");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
