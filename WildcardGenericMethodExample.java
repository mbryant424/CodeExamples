package CodeExamples;

import java.io.PrintStream;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Vector;

public class WildcardGenericMethodExample {

	// wildcard
	public static void print1(PrintStream out, Collection<?> c) {
		for (Object e : c) {
			out.println(e);
		}
	}

	// generic method
	public static <E> void print2(PrintStream out, Collection<E> c) {
		for (E e : c) {
			out.println(e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		print1(System.out, v1);
		print2(System.out, v1);
		System.out.println();

		Collection<String> v2 = new TreeSet<String>();
		v2.add("a");
		print1(System.out, v2);
		print2(System.out, v2);
		System.out.println();

		// Collection<?> == Collection<Object> ?
		Collection<Integer> c0 = new Vector<Integer>();
		Collection<?> c1 = c0;
		// Collection<Object> c2 = c0;
		// c2.add(new Object()); // inserting an Object into a Vector<Integer>

	}

}

