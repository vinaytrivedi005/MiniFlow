package miniflow.nn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
	private List<Node> inputNodes;
	private List<Node> outputNodes;
	private double value;
	private Map<Node, Double> gradients;
	
	public Node(List<Node> inputNodes) {
		super();
		this.inputNodes = inputNodes;
		this.outputNodes = new ArrayList<Node>();
		this.gradients = new HashMap<Node, Double>();
		
		for(Node n : inputNodes){
			n.addOutputNode(this);
		}
	}
	
	public void forward(){
		throw new UnsupportedOperationException("This method is not supported for class Node.");
	}
	
	public void backward(){
		throw new UnsupportedOperationException("This method is not supported for class Node.");
	}

	public void addOutputNode(Node node) {
		outputNodes.add(node);
	}
	
	public Double getGradient(Node node){
		return gradients.get(node);
	}
	
	public void putGradient(Node node, Double gradient){
		gradients.put(node, gradient);
	}

	public List<Node> getInputNodes() {
		return inputNodes;
	}

	public void setInputNodes(List<Node> inputNodes) {
		this.inputNodes = inputNodes;
		
		for(Node n : inputNodes){
			n.addOutputNode(this);
		}
	}

	public List<Node> getOutputNodes() {
		return outputNodes;
	}

	public void setOutputNodes(List<Node> outputNodes) {
		this.outputNodes = outputNodes;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Map<Node, Double> getGradients() {
		return gradients;
	}

	public void setGradients(Map<Node, Double> gradients) {
		this.gradients = gradients;
	}
}
