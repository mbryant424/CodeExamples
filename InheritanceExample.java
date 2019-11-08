package CodeExamples;

class A {

	int i = 1;
	int j = 1;

	A() {
		i = -1;
	}

	public String toString() {
		return "" + i;
	}

}

class B extends A {

	// variable hiding example
	int j = 2;

	public B() {/* super() is implicitly called. */
	}

	public String toString() {
		return "" + j;
	}

	// overloading example
	public String toString(int j) {
		return "" + j;
	}

}

public class InheritanceExample {

	public static void main(String[] args) {
		B b = new B();

		// inheritance and constructor chaining example
		// constructor chaining: at least one constructor for each (super) class is called (subclass to superclass).
		System.out.println(b.i);

		// variable hiding example
		System.out.println(b.j);

		// overriding example
		System.out.println(new A());
		System.out.println(new B());

		// overloading example
		System.out.println(new B().toString(4));
	}

}

