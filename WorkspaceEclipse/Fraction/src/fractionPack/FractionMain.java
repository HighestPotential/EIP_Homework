package fractionPack;

public class FractionMain {

	public static void main(String[] args) {

        try {
            // Test case 1: Fraction initialization with numerator and denominator
            Fraction f1 = new Fraction(3, 4);
            assert f1.getNominator() == 3 : "Test case 1 failed";
            assert f1.getDenominator() == 4 : "Test case 1 failed";

            // Test case 2: Fraction initialization with integer
            Fraction f2 = new Fraction(5);
            assert f2.getNominator() == 5 : "Test case 2 failed";
            assert f2.getDenominator() == 1 : "Test case 2 failed";

            // Test case 3: Denominator = 0 should set denominator to 1
            Fraction f3 = new Fraction(7, 0);
            assert f3.getNominator() == 7 : "Test case 3 failed";
            assert f3.getDenominator() == 1 : "Test case 3 failed";

            // Test case 4: Multiply fractions
            Fraction f4 = new Fraction(2, 3);
            Fraction f5 = new Fraction(3, 5);
            f4.multiply(f5);
            assert f4.getNominator() == 6 : "Test case 4 failed";
            assert f4.getDenominator() == 15 : "Test case 4 failed";

            // Test case 5: Add fractions
            Fraction f6 = new Fraction(1, 2);
            Fraction f7 = new Fraction(1, 3);
            f6.add(f7);  // 1/2 + 1/3 = 5/6
            assert f6.getNominator() == 5 : "Test case 5 failed";
            assert f6.getDenominator() == 6 : "Test case 5 failed";

            // Test case 6: toString method
            Fraction f8 = new Fraction(3, 6);
            assert f8.toString().equals("3/6") : "Test case 6 failed";

            // Test case 7: asDouble method
            Fraction f9 = new Fraction(1, 4);
            assert f9.asDouble() == 0.25 : "Test case 7 failed";

            // If all assertions passed, print this message
            System.out.println("All test cases passed!");

        } catch (AssertionError e) {
            // If an assertion fails, the error message is printed
            System.err.println(e.getMessage());
        }

        
	}

}
