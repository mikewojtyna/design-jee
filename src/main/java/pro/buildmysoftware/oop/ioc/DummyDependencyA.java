package pro.buildmysoftware.oop.ioc;

class DummyDependencyA implements DependencyA {

	private DependencyB someOtherDependency;

	public DummyDependencyA(DependencyB someOtherDependency) {
		this.someOtherDependency = someOtherDependency;
	}

	@Override
	public void someMethod() {
		System.out.println("Invoking dependency B from dependency A");
		someOtherDependency.something();
	}
}
