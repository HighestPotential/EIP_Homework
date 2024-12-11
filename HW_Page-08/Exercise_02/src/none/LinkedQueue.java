package none;

public class LinkedQueue implements Queue {
	int currSize=0;
	private Node head;
	private Node tail;
	
	LinkedQueue(){
		currSize=Queue.EMPTY_VALUE;
		
		Node newNode =new Node();
		
		head= newNode;
		tail=newNode;
		
	}
	
	LinkedQueue(int val){
		currSize=1;
		Node newNode =new Node(val);
		
		head= newNode;
		tail=newNode;
	}

	public int size() {
		return this.currSize;
	}
	
	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}


	@Override
	public void append(int value) {
		Node nextNode=new Node(value);
		Node temp=tail;
		temp.setNext(nextNode);
		this.currSize++;
		tail=nextNode;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.currSize==Queue.EMPTY_VALUE;
	}

	@Override
	public void remove() {
		if(!isEmpty()) {
			
			if (this.currSize == 1) {
                head = null;
                tail = null;
            } else {
                head = head.getNext();
            }
			
			currSize--;
		}
		

	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return (isEmpty())? -1: head.getVal();
	}
	

	@Override
	public int[] toArray() {
		int[] array= new int[this.currSize];
		
		Node temp=head;
		int i=0;
		
		while(temp!=null) {
			array[i++]=temp.getVal();
			temp=temp.getNext();
			
		}
			
		return array;
	}

}
