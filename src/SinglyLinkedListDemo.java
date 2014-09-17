
public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		SinglyLinkedList newList = new SinglyLinkedList();
		newList.insertAtHead(1,1.1);
		newList.insertAtHead(2,2.2);
		newList.insertAtHead(3,3.3);
		newList.insertAtHead(4,4.4);
		newList.insertAtHead(6,6.6);
		newList.showList();

		/*Node n1 = newList.findNode(2);
		if(n1!=null)
			System.out.println("found node with iData "+n1.iData);	
		else
			System.out.println("Can not find anything");
		
		Node n2 = newList.deleteSpecificly(2);
		if(n2!=null)
			System.out.println("Node with iData "+n2.iData+" has been deleted");	
		else
			System.out.println("Can not find anything");
		newList.showList();
		
		newList.addLast2ToHead();
		newList.showList();*/
		
		newList.reverse();
		newList.showList();
		
	}

}
