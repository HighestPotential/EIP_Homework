package none;
import java.util.Scanner;

public class NumberGuesser {

	public NumberGuesser() {
		
	}
	
	public static void guess(int maxNumber) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("I am going to guess a number from 0 to "+ maxNumber);
		int lowerBound=0;
		int upperBound=maxNumber;
		int middle;
		String answer;
		while(lowerBound < upperBound ) {
			middle=(upperBound+lowerBound)/2;
			System.out.println("Ist die gedachte Zahl groesser als " + middle + "?");
			answer = scanner.next();
			scanner.nextLine();
			
			if(answer.equalsIgnoreCase("ja")) {
				lowerBound=middle+1;
			}else {
				upperBound=middle;
			}
		}
		
		System.out.println("Die gedachte Zahl ist: "+ lowerBound);
		
		
		scanner.close();
	}
}
