package algo2;

public class gtNode {
	
	//Properties
	private int grade;
	gtNode leftChild, rightChild;
	
	//Constructors
	public gtNode(int x, gtNode a, gtNode b) {
		grade = x;
		leftChild = a;
		rightChild = b;
	}
	public gtNode(int x) {
		grade = x;
		leftChild = null;
		rightChild = null;
	}

	//Getters and Setters
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public gtNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(gtNode leftChild) {
		this.leftChild = leftChild;
	}
	public gtNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(gtNode rightChild) {
		this.rightChild = rightChild;
	}

}
