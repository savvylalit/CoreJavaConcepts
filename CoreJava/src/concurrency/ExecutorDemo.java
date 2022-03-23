package concurrency;

// Program to demonstrate basic Executor Framework/ThreadPool

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " ...Job Started by " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "Job Completed by " + Thread.currentThread().getName());
	}

}

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob[] jobs= {new PrintJob("Savvy_1"),
						new PrintJob("Savvy_2"),
						new PrintJob("Savvy_3"),
						new PrintJob("Savvy_4"),
						new PrintJob("Savvy_5"),
						new PrintJob("Savvy_6"),
					};
		ExecutorService service = Executors.newFixedThreadPool(3); // Here three threads responsible to execute 6 jobs

		for(PrintJob job : jobs) {
			service.execute(job);
		}
		service.shutdown();
	}

}
