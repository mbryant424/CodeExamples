package CodeExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(100); // a fixed size thread pool
		for (int i = 0; i < 100; i++) {
			final String message = i + "th task is working!";
			Runnable task = new Runnable() { // define a task that waits for 1 second and then prints a message.

				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
//					synchronized(System.out) { // include this synchronized block to allow only one thread to run the following part
						for (int i = 0; i < message.length(); i++)
							System.out.print(message.charAt(i));
						System.out.println();
//					}
				}
			};
			executor.submit(task); // submit each task
		}
		executor.shutdown(); // execute the submitted tasks
		executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // wait until all tasks are completed
	}

}
