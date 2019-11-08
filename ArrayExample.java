package CodeExamples;

import java.util.Arrays;

/**
 * An ArrayExample program.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * 
 */
public class ArrayExample {

	/**
	 * The main method of the ArrayExample class.
	 * 
	 * @param args
	 *            the program arguments.
	 */
	public static void main(String[] args) {

		// array initialization
		int a[] = { 0, 1, 2, 3, 4 };

		System.out.println("length: " + a.length);

		System.out.println("0-th element: " + a[0]);

		try {
			System.out.println("100-th element: " + a[100]);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// print out the content of the array.
		System.out.println(Arrays.toString(a));
		System.out.println(a); // reference info will be displayed; not the content
		System.out.println(a.toString()); // reference info will be displayed; not the content

		// set the elements of the array.
		Arrays.fill(a, 0);

		// set the value of the i-th element.
		for (int i = 0; i < a.length; i++) {
			a[i] = 4 - i;
		}

		// print out the content of the array.
		System.out.println(Arrays.toString(a));

		// sort the array
		Arrays.sort(a);

		// show the result after sorting.
		System.out.println(Arrays.toString(a));

	}

}

