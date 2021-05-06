package algo2;

public class Student {
	
	//Properties
	private int number;
	private String name;
	private String surname;
	private boolean hasGroup;
	private String gender;
	
	//Getters and Setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean isHasGroup() {
		return hasGroup;
	}
	public void setHasGroup(boolean hasGroup) {
		this.hasGroup = hasGroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Constructor
	public Student(StudentLinkedList s) {
		this.hasGroup = false;
		this.number = 0;
		this.name = "";
		this.surname = "";
		gender = "Not verified.";
		s.insert(this);
	}
	public Student(int n,String nm, String sn, String g, StudentLinkedList s) {
		this.hasGroup = false;
		this.number = n;
		this.name = nm;
		this.surname = sn;
		
		if(g.equals("Male") || g.equals("Female")) {
			this.gender = g;
		}
		else {
			this.gender = "Not verified.";
		}
		s.insert(this);
	}
	
	//toString method
	public String toString() {
		String group = "";
		
		if(hasGroup) {
			group = "This student has a group";
		}
		else {
			group = "This student has no group";
		}
		
		String msg = "Name: " + name 
				+ "\nSurname: " + surname
				+ "\nNumber: " + number 
				+ "\nGender: " + gender
				+ "\nGroup Info: " + group + "\n";
		
		return msg;
	}
}
