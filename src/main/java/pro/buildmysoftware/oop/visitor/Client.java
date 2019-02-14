package pro.buildmysoftware.oop.visitor;

import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Node> nodes = createNodes();
		TypeCheckingVisitor typeCheckingVisitor =
			new TypeCheckingVisitor();
		CodeGeneratingVisitor codeGeneratingVisitor =
			new CodeGeneratingVisitor();

		for (Node node : nodes) {
			node.accept(typeCheckingVisitor);
			node.accept(codeGeneratingVisitor);
		}
	}

	private static List<Node> createNodes() {
		return Arrays.asList(new AssignmentNode(), new VariableNode());
	}
}
