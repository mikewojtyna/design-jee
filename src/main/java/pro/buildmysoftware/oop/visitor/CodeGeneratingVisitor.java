package pro.buildmysoftware.oop.visitor;

class CodeGeneratingVisitor implements NodeVisitor {
	@Override
	public void visit(VariableNode node) {
		System.out.println("Generating code of a variable node");
		node.variableOperation();
	}

	@Override
	public void visit(AssignmentNode node) {
		System.out.println("Generating code of an assignment node");
		node.assignmentOperation();
	}
}
