package none;

public class Node {
	private Node next;
	private int val;
	
	Node(){
		this.val = 0;
		this.next=null;
	}
	
	Node(int val){
		this.val=val;
		this.next=null;
	}
	
	Node(int val, Node next){
		this.val=val;
		this.next=next;
	}
	
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	

}
