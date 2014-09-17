
public class Node {

	int iData;
	double dData;
	Node next;
	
	public Node(int a, double b) { // constructor
		iData = a;
		dData = b;
	}
	
	public void showNode() {
		System.out.print("{"+iData+","+dData+"}");
	}
}
