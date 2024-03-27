package studio7;

public class Fraction {
	public int numerator; 
	public int denominator; 

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator; 

	} 
	
	public Fraction fractionAddition(Fraction other) {
		int newNumerator;
		int newDenominator;
		if (this.denominator == other.denominator) {
			newNumerator = this.numerator + other.numerator;
			return new Fraction (newNumerator, this.denominator);
		}

	}


}
