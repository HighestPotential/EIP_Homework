package n;

public class IllegalISBNException extends Exception {

	public IllegalISBNException() {
		super("Laenge stimmt nicht für eine gueltige ISBN!");
	}
	
	public IllegalISBNException(String message) {
		super(message);
	}
	
	
}
