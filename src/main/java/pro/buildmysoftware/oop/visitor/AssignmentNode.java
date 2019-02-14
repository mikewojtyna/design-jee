package pro.buildmysoftware.oop.visitor;

class AssignmentNode implements Node {
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

	void assignmentOperation() {
		System.out.println("Running assignment operation");
	}
}
