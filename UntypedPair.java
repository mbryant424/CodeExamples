package CodeExamples;

public class UntypedPair {

	/**
	 * The first element.
	 */
	protected Object first;

	/**
	 * The second element.
	 */
	protected Object second;

	/**
	 * Constructs a Pair.
	 * 
	 * @param first
	 *            the first element.
	 * @param second
	 *            the second element.
	 */
	public UntypedPair(Object first, Object second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Returns the first element.
	 * 
	 * @return the first element.
	 */
	public Object first() {
		return first;
	}

	/**
	 * Returns the second element.
	 * 
	 * @return the second element.
	 */
	public Object second() {
		return second;
	}

	/**
	 * Returns a String representation of this UntypedPair.
	 */
	public String toString() {
		return "[" + first + ", " + second + "]";
	}

	public static void main(String[] args) {
		UntypedPair pair = new UntypedPair(1, "a");
		System.out.println(pair);
		System.out.println(((Integer) pair.first()).intValue()); // good
		System.out.println(((Integer) pair.second()).intValue()); // not good
	}

}

