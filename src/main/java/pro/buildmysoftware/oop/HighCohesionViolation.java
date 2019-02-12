package pro.buildmysoftware.oop;

public class HighCohesionViolation {
	private String prop0;
	private String prop1;
	private String prop2;

	void method0() {
		doSomethingWith(prop0);
	}

	void method1() {
		doSomethingWith(prop1);
	}

	void method2() {
		doSomethingWith(prop2);
	}

	private void doSomethingWith(String property) {
		// TODO: do something with this property
	}
}
