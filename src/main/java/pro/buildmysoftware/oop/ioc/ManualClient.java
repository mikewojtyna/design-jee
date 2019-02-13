package pro.buildmysoftware.oop.ioc;

class ManualClient {
	public static void main(String[] args) {
		DependencyB dependencyB = new DummyDependencyB();
		DependencyA dependencyA = new DummyDependencyA(dependencyB);
		DependencyAConsumer dependencyConsumer =
			new DependencyAConsumer(dependencyA);
		dependencyConsumer.useDependencyDirectly();
	}
}
