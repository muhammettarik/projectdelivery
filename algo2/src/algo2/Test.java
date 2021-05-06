package algo2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		//Main Structure
		FailTree ft = new FailTree(3); //3 is fail condition count.
		GradeTree gt = new GradeTree(5,10,15); //5 is condition count. 
											   //10 is penalty of one condition. 
											   //15 is optional penalty.
		StudentLinkedList slt = new StudentLinkedList();
		GroupLinkedList glt = new GroupLinkedList();
		
		//Adding Students
		Student s1 = new Student(1728932,"Tarık","Can","Male",slt);
		Student s2 = new Student(1803791,"İlkay","Sarı","Male",slt);
		Student s3 = new Student(1121212,"Jonathan","Joestar","Male",slt);
		Student s4 = new Student(9999999,"Megatron","Decepticon","Robot",slt);

		ArrayList<Student> g1 = createGroup(s1,s2,s3,s4); //Creating a Group
		glt.insert(g1); //Inserting first group to LinkedList
		project p1 = new project(5,400,true,true,true,true); //Creating project
		sendProject(g1,glt,p1); //Sending project
		
		ft.failPass(g1,p1,g1.size() == 4,p1.isCitations(),p1.getLine_count() < 500);//Check for failure criteria.
		gt.gradeProject(g1, p1, 
				p1.isDelivered_on_time(), 
				p1.getPage_count() > 3,
				p1.getLine_count() > 250, 
				p1.isFlowchart_present(),
				p1.isAlgorithms_provided()); //Grading
		
		//slt.outputList();
		//glt.outputList();
		
		Student s5 = new Student(2342342,"Udyr","Winterclaw","Male",slt);
		Student s6 = new Student(7777777,"Dio","Brando","Male",slt);
		Student s7 = new Student(2424242,"Garen","Crownguard","Male",slt);
		Student s8 = new Student(9999999,"Optimus","Prime","Robot",slt);
		
		ArrayList<Student> g2 = createGroup(s5,s6,s7,s8);
		glt.insert(g2);
		project p2 = new project(3,190,false,true,true,false);
		sendProject(g2,glt,p2);
		
		ft.failPass(g2,p2,g2.size() == 4,p2.isCitations(),p2.getLine_count() < 500);
		gt.gradeProject(g1, p2, 
				p2.isDelivered_on_time(), 
				p2.getPage_count() > 3,
				p2.getLine_count() > 250, 
				p2.isFlowchart_present(),
				p2.isAlgorithms_provided());
		
		//slt.outputList();
		//glt.outputList();
		
		//System.out.println(p2);
		//System.out.println(slt.outputStudent(s2));
		

	}
	public static ArrayList<Student> createGroup(Student... a) {
		int count = 0;
		
		for (Student x : a) {
			count++;
			x.setHasGroup(true);
	    }
		
		ArrayList<Student> g = new ArrayList<Student>(count);
		
		for (Student x : a) {
			g.add(x);
	    }
		
		return g;
	}
	public static void sendProject(ArrayList<Student> g, GroupLinkedList l, project p) {
		l.findGroup(g).setProject(p);
	}
}
