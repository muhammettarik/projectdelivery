package algo2;

import java.util.ArrayList;

public class FailTree {
	
	//Properties
	protected ftNode root;
	private int condition_count = 2;
	
	//Getters and Setters
	public int getCondition_count() {
		return condition_count;
	}
	public void setCondition_count(int condition_count) {
		this.condition_count = condition_count;
	}
	
	//Constructors
	public FailTree() {
		root = new ftNode(true);
		fillTree();
	}
	public FailTree(int c) {
		root = new ftNode(true);
		condition_count = c;
		fillTree();
	}
	
	//Methods
	public void fillTree() {
			ftNode current = root;
			int cc = condition_count;
		
		while(cc != 0) { //Fail tree does not need recursive solution.
			current.setLeftChild(new ftNode(false));
			current.setRightChild(new ftNode(true));
			cc--;
			//System.out.println(current.isCondition());
			//System.out.println(current.getLeftChild().isCondition());
			current = current.getRightChild();
		}
		//System.out.println(current.isCondition());
	}
	public void failPass(ArrayList<Student> g, project p, boolean... x) {
		ftNode current = root;
		ftNode current2 = root;
		int count = 0;
		
		for (boolean c : x) {
			current2 = current2.getRightChild();
			count++; //If given boolean argument count does not equal to condition count then no calculations.
	    }
		
		for (boolean c : x) {
			if(c) {
				current = current.getRightChild();
			}
			else {
				current = current.getLeftChild();
				break;
			}
	    }
		
		//System.out.println("Count: " + count);
		if(count == getCondition_count()) {
			if(current.isCondition()) {
				p.setHasPassed(true);
				System.out.println("Pass.");
			}
			else {
				System.out.println("Fail.");
			}
		}
		else {
			System.out.println("Condition count and given condition argument count does not match.");
		}
	}
}
