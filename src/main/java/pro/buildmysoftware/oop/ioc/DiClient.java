package pro.buildmysoftware.oop.ioc;

public class DiClient {
	public static void main(String[] args) {
		DependencyA dependencyA =
			DiContainer.create(DependencyA.class);
		dependencyA.someMethod();
	}
}
