package none;

public interface Queue {
	
	final int EMPTY_VALUE = 0;

	void append (int value) ;

	boolean isEmpty () ;

	void remove () ;

	int peek () ;

	int [] toArray ();

}
