package org.OperrTechnologies.quiz;

//Actual Linked List of created Node in previous Class
public class LinkedList {

	// Header pointer of our LinkedList
	private Node head;

	// LinkedList Constructor
	public LinkedList() {
		System.out.println("Creating New LinkedList ...");
		// Initialising Head Node
		head = new Node();
	}

	// Method to add element in linked list
	public void appendElement(int item) {

		// Creating New Node to be added
		Node value = new Node();

		// Setting data to the Node created
		value.setData(item);

		// If there is no Node except Head or empty linked list
		if (head.next == null) {
			// adding or linking new Node to the Head
			head.next = value;
			return;
		}
		Node node = head;

		// Looping through the linked list until we found the last element
		while (node.next != null) {
			node = node.next;
		}
		// adding value at the last position (It can be added in any place as
		// per requirement)
		node.next = value;
	}

	// method to remove the element from the tail or last position
	public void removeElement() {

		// If there is no Node except Head or empty linked list
		if (head.next == null) {
			System.out.println("Can't Remove from empty linked list");
			return;
		}

		Node item = head;
		// Looping through the linked list until we found the last element
		while (item.next.next != null) {
			item = item.next;
		}
		// removing value from the last position (It can be removed from any
		// place as per requirement)
		item.next = null;
	}

	// method to remove all the element from the linked list whose value is less
	// then given target value
	public void removeAllElementsGreaterThenTarget(int targetValue) {

		// If there is no Node except Head or empty linked list
		if (head.next == null) {
			System.out.println("Can't Remove from empty linked list");
			return;
		}
		Node temp = head;

		// looping through the linked list until we found a last element and
		// stopping at second last position
		while (temp.next.next != null) {

			// check if element is greater then target value
			if (temp.next.data > targetValue) {
				// deleting the greater element
				Node n = temp.next.next;
				temp.next = n;
				// continue the loop after deletion
				continue;
			}
			// iteration for loop
			temp = temp.next;
		}

		// to check if last element is greater then target value which is not
		// handled by upper method
		if (temp.next.data > targetValue) {
			temp.next = null;
		}
	}

	// Testing of created LinkedList
	public static void main(String[] args) {

		// Linked list has been created
		LinkedList ll = new LinkedList();

		// Adding 11 elements in the created linked list
		ll.appendElement(5);
		ll.appendElement(15);
		ll.appendElement(25);
		ll.appendElement(35);
		ll.appendElement(45);
		ll.appendElement(55);
		ll.appendElement(65);
		ll.appendElement(75);
		ll.appendElement(85);
		ll.appendElement(95);
		ll.appendElement(105);
		System.out.println("LinkedList After adding Data: " + ll);

		// setting Target Value to delete element greater then this
		int maxNumber = 50;
		ll.removeAllElementsGreaterThenTarget(maxNumber);
		System.out.println("LinkedList After deleting Data greater then " + maxNumber + " are: " + ll);

		// deleting 2 elements on remaining Linked List
		ll.removeElement();
		ll.removeElement();
		System.out.println("LinkedList After deletion of Data: " + ll);
	}

	// Override toString method to print Node object
	@Override
	public String toString() {
		String retStr = " ";

		Node current = head.next;
		while (current != null) {
			retStr += current.getData() + ", ";
			current = current.getNext();
		}
		retStr = retStr.replaceAll(", $", "");
		return "[" + retStr + " ]";
	}
}

/*Output:
	
	Creating New LinkedList ...
	LinkedList After adding Data: [ 5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 105 ]
	LinkedList After deleting Data greater then 50 are: [ 5, 15, 25, 35, 45 ]
	LinkedList After deletion of Data: [ 5, 15, 25 ]
	
*/