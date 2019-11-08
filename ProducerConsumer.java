package CodeExamples;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
	
	static class Producer implements Runnable {

		Queue<Double> queue;
		
		Producer(Queue<Double> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(queue) {
					queue.add(Math.random());
					queue.notify();
				}
			}
		}
		
	}
	
	static class Consumer implements Runnable {
		
		Queue<Double> queue;
		Consumer(Queue<Double> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while(true) {
				synchronized(queue) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Double d = queue.poll();
					System.out.println(d);
				}
			}
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Double> queue = new LinkedList<Double>();
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}

}