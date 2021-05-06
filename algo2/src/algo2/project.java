package algo2;

public class project {
	
	//Properties
	private int page_count;
	private int line_count;
	private boolean citations;
	private boolean delivered_on_time;
	private boolean flowchart_present;
	private boolean algorithms_provided;
	
	private int grade = -1;
	private boolean hasPassed;	
	
	//Getters and Setters
	public int getPage_count() {
		return page_count;
	}
	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}
	public int getLine_count() {
		return line_count;
	}
	public void setLine_count(int line_count) {
		this.line_count = line_count;
	}
	public boolean isCitations() {
		return citations;
	}
	public void setCitations(boolean citations) {
		this.citations = citations;
	}
	public boolean isDelivered_on_time() {
		return delivered_on_time;
	}
	public void setDelivered_on_time(boolean delivered_on_time) {
		this.delivered_on_time = delivered_on_time;
	}
	public boolean isFlowchart_present() {
		return flowchart_present;
	}
	public void setFlowchart_present(boolean flowchart_present) {
		this.flowchart_present = flowchart_present;
	}
	public boolean isAlgorithms_provided() {
		return algorithms_provided;
	}
	public void setAlgorithms_provided(boolean algorithms_provided) {
		this.algorithms_provided = algorithms_provided;
	}
	public boolean isHasPassed() {
		return hasPassed;
	}
	public void setHasPassed(boolean hasPassed) {
		this.hasPassed = hasPassed;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	//Constructors
	public project() {
		page_count = 0;
		line_count = 0;
		citations = false;
		delivered_on_time = false;
		flowchart_present = false;
		algorithms_provided = false;
	}
	public project(int p, int l, boolean c, boolean d, boolean f, boolean a) {
		page_count = p;
		line_count = l;
		citations = c;
		delivered_on_time = d;
		flowchart_present = f;
		algorithms_provided = a;
	}
	
	//Methods
	public String toString() {
		String citation = "";
		String delivery = "";
		String flowchart = "";
		String algorithms = "";
		String passed = "";
		String gr = "";

		
		if(citations) citation = "No plagiarism.";
		else citation = "Plagiarism found.";
		
		if(delivered_on_time) delivery = "Delivered on time.";
		else delivery = "Delivery time passed the deadline.";
		
		if(flowchart_present) flowchart = "Flowcharts present.";
		else flowchart = "No flowcharts.";
		
		if(algorithms_provided) algorithms = "Algorithms provided.";
		else algorithms = "Algorithms not provided.";
		
		if(hasPassed) passed = "This project has passed.";
		else passed = "This project has failed.";
		
		if(getGrade() == -1) gr = "This project has not been graded yet.";
		else gr = "Grade: " + getGrade();
		
		String msg = "Page Count: " + page_count
				+ "\nLine Count: " + line_count
				+ "\n" + citation
				+ "\n" + delivery
				+ "\n" + flowchart
				+ "\n" + algorithms 
				+ "\n" + passed 
				+ "\n" + gr + "\n";
		
		return msg;
	}
	

}
