package none;

public class Pair <T, G>  {

	private T first;
	private G second;
	
	public Pair (T first, G second) {
		this.first=first;
		this.second=second;
	}
	
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		if(second!=null)
		this.first = first;
	}

	public G getSecond() {
		return second;
	}

	public void setSecond(G second) {
		if(second!=null)
		this.second = second;
	}

}
