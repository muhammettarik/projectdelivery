package algo2;

public class ftNode {
	
	//Properties
	private boolean condition;
	ftNode leftChild, rightChild;
	
	//Constructors
	public ftNode(boolean x, ftNode a, ftNode b) {
		condition = x; 
		leftChild = a;
		rightChild = b;
	}
	public ftNode(boolean x) {
		condition = x; 
		leftChild = null;
		rightChild = null;
	}
	
	//Getters and Setters
	public ftNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(ftNode leftChild) {
		this.leftChild = leftChild;
	}
	public ftNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(ftNode rightChild) {
		this.rightChild = rightChild;
	}
	public boolean isCondition() {
		return condition;
	}
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
}
