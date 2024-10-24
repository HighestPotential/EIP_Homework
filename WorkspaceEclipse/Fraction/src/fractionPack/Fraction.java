package fractionPack;

public class Fraction {
	
	public int getNominator() {
		return nominator;
	}

	public void setNominator(int nominator) {
		this.nominator = nominator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	private int nominator;
	private int denominator;
	
	public Fraction(int nominator, int denominator) {
		this.nominator=nominator;
		if(denominator==0)
			denominator=1;
		this.denominator=denominator;
	}
	public Fraction(int nominator) {
		this.nominator=nominator;
		this.denominator=1;
	}
	
	public void multiply(Fraction factor) {
		this.nominator *= factor.getNominator();
		this.denominator *= factor.getDenominator();
		
		factor.setNominator(this.nominator);
		factor.setDenominator(this.denominator);
		
	}
	
	public void add(Fraction summand) {
		this.nominator = this.nominator * summand.getDenominator() + this.denominator * summand.getNominator();
		this.denominator *= summand.getDenominator();
		
		summand.setNominator(this.nominator);
		summand.setDenominator(this.denominator);
		
	}
	
	public String toString() {
		return this.nominator + "/" + this.denominator;
	}
	
	public double asDouble() {
		return (double) this.nominator/this.denominator;
	}
	
	
	
	
	
	

}
