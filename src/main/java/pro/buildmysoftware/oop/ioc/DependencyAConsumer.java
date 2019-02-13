package pro.buildmysoftware.oop.ioc;

class DependencyAConsumer {
	// use abstract factory
	private DependencyFactory factory;
	// use dependency injection directly
	private DependencyA dependency;

	DependencyAConsumer(DependencyA dependency) {
		this.dependency = dependency;
	}

	DependencyAConsumer(DependencyFactory factory) {
		this.factory = factory;
	}

	// It's also possible to change the implementation during the
	// object's lifecycle using setter methods. However, generally
	// speaking it's a preferred way to achieve right decoupling between
	// components.
	void setDependency(DependencyA dependency) {
		this.dependency = dependency;
	}

	void useDependencyFromFactory() {
		// if we want to have a different strategy each time
		DependencyA dependency = factory.create();
		dependency.someMethod();
	}

	void useDependencyDirectly() {
		dependency.someMethod();
	}
}
