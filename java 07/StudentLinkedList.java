import java.util.Iterator;

import java.util.LinkedList;


public class StudentLinkedList {
	
	private Student head;
	
	public StudentLinkedList (){
		head = null;
	}
	public void insertToEndOfList (Student s){
		Student cursor = head; //need temp Student object reference to ensure head is NOT
		                       //moving!!
		
		if (head == null){
			head = s;
			return;
		}
		while (cursor.getNext() != null)
			cursor = cursor.getNext();
		
		cursor.setNext(s);
	}
	public void insertToFrontOfList (Student s){
		if (head == null)
			head = s;
		else{
			s.setNext(head);
			head = s;
		}
	}
//	inserting the Student objects 
	public void insertInOrder (Student s){	
//		checking if head is null and asigning the first Student object to head
if(head==null) {
	head =s;
}
//checking if the value of ID is greater or lesser than the head ID to know where to insert
else if(head.getNext()==null) {
	
	if(head.getId()>s.getId()) {
		insertToFrontOfList (s);
}
	else if(head.getId()<s.getId()) {
		insertToEndOfList (s);
		
	}else if(head.getId()==s.getId()) {
		System.out.println("Value already exixt");
		return;
	}
}else {MuiltipleStudent1(s);}}

public void MuiltipleStudent1(Student s){
//	to  insert one ore more student objetcs to the linkList
	Student cursor = head;
Student cursor1 = head.getNext();
while(cursor!=null&&cursor1!=null) {
	if (cursor.getId()==s.getId()||cursor1.getId()==s.getId()) {
		System.out.println("value already exist2");
		return;
	}
//	checking if the student object ID falls within the previous and next value
	else if (s.getId()>cursor.getId()&&s.getId()<cursor1.getId()) {
		s.setNext(cursor1);	
		cursor.setNext(s);
		return;
	}else if(s.getId()>cursor1.getId()&&s.getId()>cursor.getId()){
		cursor1=cursor1.getNext();
		}}
//if all conditions are not met , you insert to the end of the node
insertToEndOfList(s);	}

	public void printLinkedList (){
		
		Student cursor = head;
		
		while (cursor != null){
			System.out.println (cursor.toString());
			cursor = cursor.getNext();
		}
	}
//	checking through the Linklist to fidn where the ID is in one of the Nodes
	public Student Search(int ID) {
		Student cursor=head;
		while (cursor!=null) {
			if(cursor.getId()==ID) {
				return cursor;
			}
			cursor=cursor.getNext();	
		}
			return null;	
	}
//	To remove the last student element from the Linklist
	public void removeEndElement () {
		Student cursor=head;
		Student prev=null;
		while(cursor.getNext()!=null) {
			prev=cursor;
			cursor=cursor.getNext();
			}prev.setNext(null);
		
	}
//	To remove the first student element from the Linklist
	public void removeFirstElement () {
		Student temp = head;
		head = head.getNext();
		temp.setNext(null);
		
	}
//	To remove the  student element from the Linklist with an particular ID 
	public void removeElement (int ID) {
		Student temp = head, prev = null; 
		if (temp != null && temp.getId() == ID) 
		{ 
			head = temp.getNext(); 
			return; 
		} 
		while (temp != null && temp.getId() != ID) 
		{ 
			prev = temp; 
			temp = temp.getNext(); 
		}	 
		if (temp == null) return; 
		prev.setNext(temp.getNext()); 

		}
	
	public static void main (String [] args){
		
		StudentLinkedList myHead = new StudentLinkedList ();
		
		
		
		myHead.insertInOrder(new Student ("Sam", 1));
		myHead.insertInOrder(new Student ("Joe", 5));
		myHead.insertInOrder(new Student ("Sarah", 3));
		

	myHead.Search(3);
	myHead.removeEndElement () ;
	myHead.removeFirstElement();
	myHead.removeElement (3);
	myHead.printLinkedList();

		
	}

}
