package concurrency;
// This program demonstrates the usage of ThreadLocal. Requirement is to store a customer_id per thread.
// We use 1 ThreadLocal Object and it maintains customer_id for every customer.
class CustomerThread extends Thread{
	static Integer custId = 0;
	private static ThreadLocal tl = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
	CustomerThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " executing with customer_id : "+tl.get());
	}
}

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer Thread-1");
		CustomerThread c2 = new CustomerThread("Customer Thread-2");
		CustomerThread c3 = new CustomerThread("Customer Thread-3");
		CustomerThread c4 = new CustomerThread("Customer Thread-4");

		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
