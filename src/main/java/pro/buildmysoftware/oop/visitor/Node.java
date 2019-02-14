package pro.buildmysoftware.oop.visitor;

interface Node extends Visitable<NodeVisitor> {
	void typeCheck();

	void generateCode();

	void prettyPrint();
}
