package org.OperrTechnologies.quiz;

//Creating Node of Linked List
public class Node {
	
	//Actual Data of a Node
	int data;
	
	//Pointer for Next Linked Node
	Node next;

	//Constructor of Node
	public Node() {
	}

	
	//Getter and setter of Instance Variable for manipulation of Data
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
