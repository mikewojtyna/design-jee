package pro.buildmysoftware.oop.visitor;

class VariableNode implements Node {
	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void typeCheck() {

	}

	@Override
	public void generateCode() {

	}

	@Override
	public void prettyPrint() {

	}

	void variableOperation() {
		System.out.println("Running variable operation");
	}
}
