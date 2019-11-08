package CodeExamples;

public class TypedPair<F, S> {

	/**
	 * The first element.
	 */
	protected F first;

	/**
	 * The second element.
	 */
	protected S second;

	/**
	 * Constructs a Pair.
	 * 
	 * @param first
	 *            the first element.
	 * @param second
	 *            the second element.
	 */
	public TypedPair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Returns the first element.
	 * 
	 * @return the first element.
	 */
	public F first() {
		return first;
	}

	/**
	 * Returns the second element.
	 * 
	 * @return the second element.
	 */
	public S second() {
		return second;
	}

	/**
	 * Returns a String representation of this TypedPair.
	 */
	public String toString() {
		return "[" + first + ", " + second + "]";
	}

	public static void main(String[] args) {
		TypedPair<Integer, String> pair = new TypedPair<Integer, String>(1, "a");
		System.out.println(pair);
		Integer first = pair.first();
		System.out.println(first);
	}

}

