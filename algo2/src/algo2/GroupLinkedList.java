package algo2;

import java.util.ArrayList;

public class GroupLinkedList {

	//Nodes
	private glNode first;
	private glNode last;
	
	//Constructors
	public GroupLinkedList() {
		first = null;
		last = null;
	}
	
	//Insertion and Deletion
	public void insert(ArrayList<Student> g) {
		if(isEmpty()) {
			first = last = new glNode(g, first);
		}
		else {
			glNode a = new glNode(g);
			a.setPrev(last);
			a.setNext(null);
			last.setNext(a);
			last = last.getNext();
		}
	}
	public void delete(ArrayList<Student> g) {
		if(isEmpty()) {
			System.out.println("List is empty.");
		}
		else {
			if(first == last) first = last = null;
			else {
				glNode current = first;
				
				while(current != null) {
					if(current.getGroup() == g) {
						if(current == first) {
							first = first.getNext();
							first.setPrev(null);
						}
						else if(current == last) {
							last = last.getPrev();
							last.setNext(null);
						}
						else {
							current.getPrev().setNext(current.getNext());
							current.getNext().setPrev(current.getPrev());
							current.setNext(null);
							current.setPrev(null);
						}
					}
				}
			}
		}
	}

	//Methods
	public boolean isEmpty() {
		return(first == null);
	}
	public int size() {
		int count = 0;
		glNode current = first;
		
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	public String output(ArrayList<Student> g) {
		glNode current = first;
		String msg = "Group was not found";
		
		while(current != null) {
			if(current.getGroup() == g) {
				msg = "current.getGroup()";
				break;
			}
			current = current.getNext();
		}
		return msg;
	}
	public void outputList() {
		glNode current = first;
		
		while(current != null) {
			System.out.println("This group has " + current.getGroup().size() + " members.");
			if(current.getProject() == null) System.out.println("This group has not sent their project.\n");
			else System.out.println(current.getProject());
			
			current = current.getNext();
		}
	}
	public glNode findGroup(ArrayList<Student> g) {
		glNode current = first;
		
		while(current != null) {
			if(current.getGroup() == g) break;
			current = current.getNext();
		}
		return current;
	}
}
