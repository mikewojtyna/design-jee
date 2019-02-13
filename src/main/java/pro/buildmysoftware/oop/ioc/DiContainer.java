package pro.buildmysoftware.oop.ioc;

class DiContainer {

	public static <T> T create(Class<T> type) {
		// TODO: instantiate the dependency graph somehow
		// Most dependency injection containers use reflection to
		// create all dependencies manually. For example, that's how
		// Spring Framework does it.
		if (type.isAssignableFrom(DependencyA.class)) {
			return (T) new DummyDependencyA(createDependencyB());
		}
		return null;
	}

	private static DependencyB createDependencyB() {
		// TODO: should find the real dependency configured in the
		//  application
		return () -> {
		};
	}
}
