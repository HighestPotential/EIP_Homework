package n;

public class Book {
	private String title;
	private String ISBN;
	
	public Book(String title, String ISBN) throws IllegalISBNException,
	IllegalISBN13Exception, IllegalISBN10Exception {
		
		if(title==null || ISBN==null) throw 
		new IllegalArgumentException("Value is null!");
		
		if(ISBN.length()==10) {
			
			for(int i=0; i<ISBN.length()-1; ++i) {
				if(!Character.isDigit(ISBN.charAt(i))) {
					throw new IllegalISBN10Exception("ISBN enthaelt ein ungueltiges Zeichen (keine Zahl)!"); 
					
				}
			}
			
			if(!(ISBN.charAt(9)=='X' || ISBN.charAt(9)=='x')) {
				throw new IllegalISBN10Exception("ISBN enthaelt ein ungueltiges Zeichen (kein X oder x)!");
			}
			
		}else if(ISBN.length()==13) {
			
			String firstThreeLetters="978";
			
			//if(!ISBN.startsWith(firstThreeLetters))
			if(!ISBN.substring(0,3).equals(firstThreeLetters))
				throw new IllegalISBN13Exception("ISBN der Laenge 13 faengt nicht mit 978 an!");
			
			
			for(int i=3; i<ISBN.length(); ++i) {
				if(!Character.isDigit(ISBN.charAt(i))) {
					throw new IllegalISBN13Exception("ISBN enthaelt ein ungueltiges Zeichen (keine Zahl)!"); 
				}
			}
			
		}else {
			System.out.print(ISBN.length());
			throw new IllegalISBNException();
		}
		
		this.ISBN=ISBN;
		this.title=title;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	

}
