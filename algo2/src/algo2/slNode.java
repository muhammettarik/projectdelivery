package algo2;

public class slNode {

	//Properties
	private Student student;
	private slNode next;
	private slNode prev;
	
	//Getters and Setters
	public void setNext(slNode newNext) {
		next = newNext;
	}
	public slNode getNext() {
		return next;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setPrev(slNode newPrev) {
		prev = newPrev;
	}
	public slNode getPrev() {
		return prev;
	}
	
	//Constructors
	public slNode(Student g) {
		student = g;
	}
	public slNode(Student g, slNode n) {
		student = g;
		next = n;
	}
	public slNode(Student g, slNode n, slNode pr) {
		prev = pr;
		next = n;
		student = g;
	}
}