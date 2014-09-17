
public class SinglyLinkedList {

	private Node head; // ref to first link on list
	
	public SinglyLinkedList() { // constructor
		head = null;
	}
	
	public boolean isEmpty() {
		return(head == null);
	}
	
	public void insertAtHead(int a, double b) {
		Node newNode = new Node(a,b);
		newNode.next = head;
		head = newNode;
	}
	
	public void deleteAtHead() {
		head = head.next;
	}
	
	public void showList() {
		System.out.println("Show LinkedList form head to tail:");
		Node current = head;
		while(current != null) {
			current.showNode();
			current = current.next;
		}
		System.out.print(" ");
		System.out.println();
		System.out.println("***********************************");
	}
	
	public Node findNode( int key) {
		Node current = head;
		while(current.iData != key) {
			if(current.next == null) 
				return null;
			else {
				current = current.next;
			}
		}
		return current;
	}
	
	public Node deleteSpecificly(int key) {
		Node current = head;
		Node previous = head;
		while(current.iData != key) {
			if(current.next == null)
				return null;
			else
				previous = current;
				current = current.next;
		}
		if(current==head) {
			head = head.next;
		}
		else {
			previous.next = current.next;
		}
		return current;
	}
	
	public void addLast2ToHead() {

		Node current = head;
		Node previous = head;
		Node oneMorePre = head;
		while(current.next != null) {
			oneMorePre.next = previous;
			previous.next = current;
			current = current.next;
		}
		current.next = head;
		head = previous;
		oneMorePre.next = null;
		}
	public void reverse() {
		Node current = head;
		Node previous = head;
		while(current.next == null) {
			current.next = previous;
			previous.next = null;
		}
		head = current;
	}
	
		
	}	
