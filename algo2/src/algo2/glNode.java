package algo2;

import java.util.ArrayList;

public class glNode {

	//Properties
	private ArrayList<Student> group;
	private project proje;
	private glNode next;
	private glNode prev;
	
	//Getters and Setters
	public void setNext(glNode newNext) {
		next = newNext;
	}
	public glNode getNext() {
		return next;
	}
	public ArrayList<Student> getGroup() {
		return group;
	}
	public void setGroup(ArrayList<Student> group) {
		this.group = group;
	}
	public void setPrev(glNode newPrev) {
		prev = newPrev;
	}
	public glNode getPrev() {
		return prev;
	}
	public project getProject() {
		return proje;
	}
	public void setProject(project proje) {
		this.proje = proje;
	}
	
	//Constructors
	public glNode() {
		prev = null;
		next = null;
		proje = null;
		group = new ArrayList<Student>(4);
	}
	public glNode(ArrayList<Student> g) {
		prev = null;
		next = null;
		proje = null;
		group = g;
	}
	public glNode(ArrayList<Student> g, glNode n) {
		prev = null;
		proje = null;
		group = g;
		next = n;
	}
	public glNode(ArrayList<Student> g, glNode n, glNode pr) {
		prev = pr;
		next = n;
		proje = null;
		group = g;
	}	
}