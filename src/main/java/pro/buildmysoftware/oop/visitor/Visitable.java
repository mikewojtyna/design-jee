package pro.buildmysoftware.oop.visitor;

interface Visitable<T> {
	void accept(T visitor);
}
