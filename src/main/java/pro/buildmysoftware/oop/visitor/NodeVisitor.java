package pro.buildmysoftware.oop.visitor;

public interface NodeVisitor {
	void visit(VariableNode node);

	void visit(AssignmentNode node);
}
