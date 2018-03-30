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

/*public class DrobTest {

	  public void main(String[] args) {
	   DrobDefinition dr = new DrobDefinition();
	   dr.setDrob(2, 4);
	   System.out.println("Вывести дробь:" + dr.getNumerator() + "/" + dr.getDenominator()); */