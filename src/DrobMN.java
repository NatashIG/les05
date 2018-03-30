package by.epam.tr.les05;

public class DrobMN {

	private int numerator;
	private int denominator;

	public DrobMN(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void setDrob(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public String print() {
		return this.numerator + "/" + this.denominator;
	}
}
