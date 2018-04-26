package miniflow.nn;

import java.util.List;

public class Input extends Node {

	public Input(List<Node> inputNodes) {
		super(inputNodes);
	}
	
	public void forward(){
		throw new UnsupportedOperationException("This method is not supported for class Node.");
	}
	
	public void backward(){
		double gradient = 0.0;
		
		for(Node n : this.getOutputNodes()){
			gradient += n.getGradient(this);
		}
		
		this.putGradient(this, gradient);
	}
}
