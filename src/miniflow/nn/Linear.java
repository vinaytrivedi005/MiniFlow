package miniflow.nn;

import java.util.List;

public class Linear extends Node {

	public Linear(List<Node> X, List<Node> W, List<Node> b) {
		super(X);
		List<Node> inputNodes = X;
		inputNodes.addAll(W);
		inputNodes.addAll(b);
		this.setInputNodes(inputNodes);
	}

}
