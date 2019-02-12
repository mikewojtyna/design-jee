package pro.buildmysoftware.oop;

public class HighCohesion {
	private String prop0;
	private String prop1;
	private String prop2;

	void doSomeBusinessOperation() {
		// TODO: the class is still cohesive - we don't need to
		//  always include ALL properties of a class - it's simpyl
		//  unrealistic!
		String result =
			doSomethingAnotherWith(doSomethingWith(prop0)) + prop2;
		System.out.println(result);
	}

	void doSomeBusinessOperation1() {
		String result = prop0 + prop1 + prop2;
		saveResultInFile(result);
	}

	void doSomeBusinessOperation2() {
		// TODO: the class is still cohesive - we don't need to
		//  always include ALL properties of a class - it's simpyl
		//  unrealistic!
		String result = prop0 + prop1;
		saveResultInFile(result);
	}

	private void saveResultInFile(String result) {
		// TODO: save result to file
	}

	private String doSomethingAnotherWith(String property) {
		// TODO: do something with property
		return "aa" + property;
	}

	private String doSomethingWith(String property) {
		// TODO: do something with property
		return "bb" + property;
	}
}
