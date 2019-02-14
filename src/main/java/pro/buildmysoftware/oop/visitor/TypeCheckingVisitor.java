package pro.buildmysoftware.oop.visitor;

class TypeCheckingVisitor implements NodeVisitor {
	@Override
	public void visit(VariableNode node) {
		System.out.println("Checking type of a variable node");
		node.variableOperation();
	}

	@Override
	public void visit(AssignmentNode node) {
		System.out.println("Checking type of an assignment node");
		node.assignmentOperation();
	}
}
