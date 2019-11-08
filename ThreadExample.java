package CodeExamples;

import java.io.PrintStream;

public class ThreadExample implements Runnable {

	PrintStream out;
	
	ThreadExample(PrintStream out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized(out) { // mutual exclusion
				System.out.print(this);
				System.out.println(" - step " + i);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    	new Thread(new ThreadExample(System.out)).start();
		new Thread(new ThreadExample(System.out)).start();
     	System.out.println("Done");
	}

}
