package none;

public class RingListImpl implements RingList {
	
	private static class Element{
		int Value;
		Element next;
	}
	
	private Element current;
	public int size;
	
	public RingListImpl() {
		current=new Element();
		size=0;
	}

	@Override
	public void add(int value) {
		// TODO Auto-generated method stub
		if (this.size==0) {
			this.current.Value=value;
			this.current.next=current;
			size++;
			return;
		} 
		Element tempHead= new Element();
		Element newElement= new Element();
		
		tempHead=current;
		
		newElement.Value=value;
		int copiedSize=this.size-1;
		
		while(copiedSize!=0) {
			tempHead=tempHead.next;
			copiedSize--;
		}
		tempHead.next=newElement;
		newElement.next=this.current;
		
		size++;
	}

	@Override
	public int getCurrentValue() {		
		return current.Value;
	}
	

	@Override
	public void rotate() {
		if(this.size <= 1)  return;
		
		int copiedSize=this.size-1;
		
		while(copiedSize!=0) {
			current=current.next;
			copiedSize--;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void removeCurrent() {
		// TODO Auto-generated method stub
		if(this.size==1) {
			size--;
			current.Value=-100;
			current.next=current;
			return;
		}
		
		this.current=current.next;
		Element tempHead= new Element();
		
		tempHead=current;
		
		while(tempHead.next.next!=current) {
			tempHead=tempHead.next;
		}
		
		tempHead.next=current;
		
		size--;

	}

	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		
		int copiedSize=this.size-1;
		Element tempHead= new Element();
		tempHead=current;
		
		if(tempHead.Value==value)
			return true;
		
		while(copiedSize!=0) {
			tempHead=tempHead.next;
			
			if(tempHead.Value==value)
				return true;
			
			copiedSize--;
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		
		if(this.size==0) return "[]";
		
		if(this.size==1) return "["+current.Value+"]";
		
		String output= new String();
		output+="["+current.Value+ ", ";
		
		Element tempHead= new Element();
		tempHead=current;
		
		int copiedSize=this.size-1;
		
		while(copiedSize > 1 ) {
			tempHead=tempHead.next; 
			
			output+=tempHead.Value+ ", ";
			copiedSize--;
		}
		
		tempHead=tempHead.next;
		
		output+=tempHead.Value+"]";
		return output;
	}

}
