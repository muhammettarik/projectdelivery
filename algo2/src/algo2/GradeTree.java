package algo2;

import java.util.ArrayList;

public class GradeTree {
	
	//Properties
	private gtNode root;
	private int condition_count = 5;
	private int penalty = 10;
	
	//Getters and Setters
	public int getCondition_count() {
		return condition_count;
	}

	public void setCondition_count(int condition_count) {
		this.condition_count = condition_count;
	}
	
	//Constructors
	public GradeTree() {
		root = new gtNode(100);
		fillGrades(condition_count, penalty, root);
	}
	public GradeTree(int c, int p) {
		if((c > 0 && p > 0) && c*p < 101) {
			root = new gtNode(100);
			condition_count = c;
			penalty = p;
			fillGrades(condition_count, penalty, root);
		}
		else {
			root = new gtNode(100);
			fillGrades(condition_count, penalty, root);
		}
	}
	public GradeTree(int c, int p, int p1) {
		if((c > 0 && p > 0) && c*p < 101-p1) {
			//p1 is a custom grading penalty variable that will be applied only once. 
			gtNode r = new gtNode(100);
			gtNode l = new gtNode(100-p1);
			root = new gtNode(100,l,r);
			c = condition_count;
			penalty = p;
			
			//System.out.println(root.getGrade());
			//System.out.println(l.getGrade());
			//System.out.println(r.getGrade());
			c--;
			fillGrades(c, penalty, l); 
			fillGrades(c, penalty, r);
		}
		else {
			root = new gtNode(100);
			fillGrades(condition_count, penalty, root);
		}
	}
	
	//Methods
	public void fillGrades(int c, int p, gtNode next) {
		
		if(c == 0) {
			//Nothing
		}
		else {
			gtNode l = new gtNode(next.getGrade()-p);
			gtNode r = new gtNode(next.getGrade());
			next.setLeftChild(l);
			next.setRightChild(r);
			//System.out.println(l.getGrade());
			//System.out.println(r.getGrade());
			fillGrades(c-1,p,l);//Recursion fills tree and condition count will be equal height of the tree.
			fillGrades(c-1,p,r);
		}
	}
	public void gradeProject(ArrayList<Student> g, project p, boolean... x) {
		gtNode current = root;
		
		try {
			for (boolean c : x) {
				if(c) {
					current = current.getRightChild();
				}
				else {
					current = current.getLeftChild();
				}
		    }
			System.out.println("Grade of your project: " + current.getGrade());
			p.setGrade(current.getGrade());
		} catch (NullPointerException e) {
			System.out.println("Condition count and given condition argument count does not match.");
		}
	}
}
