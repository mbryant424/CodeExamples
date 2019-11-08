package CodeExamples;

public class VariableScopeExample {

	int i = 3; // (d)

	class A {
		int i = 2; // (c)
	}

	class B extends A {
		int i = 1; // (b)

		public void test(int i /* (a) */) {
			System.out.println(i); // accessing (a)
			System.out.println(this.i); // accessing (b)
			System.out.println(super.i); // accessing (c)
			System.out.println(VariableScopeExample.this.i); // accessing (d)
		}
	}

	public VariableScopeExample() {
		B sub = new B();
		sub.test(0);
	}

	public static void main(String[] args) {
		new VariableScopeExample();
	}
}

