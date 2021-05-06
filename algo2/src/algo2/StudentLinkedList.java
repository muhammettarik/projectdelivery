package algo2;

public class StudentLinkedList {

	//Nodes
		private slNode first;
		private slNode last;
		
		//Constructors
		public StudentLinkedList() {
			first = null;
			last = null;
		}
		
		//Insertion and Deletion
		public void insert(Student g) {
			if(isEmpty()) {
				first = last = new slNode(g, first);
			}
			else {
				slNode a = new slNode(g);
				a.setPrev(last);
				a.setNext(null);
				last.setNext(a);
				last = last.getNext();
			}
		}
		public void delete(Student g) {
			if(isEmpty()) {
				System.out.println("List is empty.");
			}
			else {
				if(first == last) first = last = null;
				else {
					slNode current = first;
					
					while(current != null) {
						if(current.getStudent() == g) {
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
			slNode current = first;
			
			while(current != null) {
				count++;
				current = current.getNext();
			}
			return count;
		}
		public String outputStudent(Student g) {
			slNode current = first;
			String msg = "Student was not found";
			
			while(current != null) {
				if(current.getStudent() == g) {
					msg = g.toString();
					break;
				}
				current = current.getNext();
			}
			return msg;
		}
		public void outputList() {
			slNode current = first;
			
			while(current != null) {
				System.out.println(current.getStudent());
				current = current.getNext();
			}
		}
}
