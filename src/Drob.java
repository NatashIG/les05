package by.epam.tr.drob;

import java.util.Random;

import by.epam.tr.les05.DrobMN;

public class Drob {
	
	 public static void main(String[] args) {
		 int k = 5;
		 Random rand = new Random(); 
		 DrobMN[] array = new DrobMN[k];
		 for(int i = 0; i < k; i++) {
			 DrobMN dr = new DrobMN(rand.nextInt(10), rand.nextInt(10));
			 array[i]=dr;
			 System.out.print(dr.print() + ", "); 
			 ;
		 }  
		   
		
	 }
	
}












/*Fraction {

	private Fraction[] array;

	private int freeCell = 0;

	public Fraction(int size) {
		array = new Fraction[size];
	}

	public boolean oldFraction(Fraction newFraction) {
		if (freeCell >= array.length) {
			return false;
		}

		if (array[freeCell] == newFraction) {

			freeCell++;
			return true;
		}
	}

	public void print() {

		for (Fraction fr : array);
		System.out.println(fr.getNumerator + "/" + fr.getDenomenator);
	}

	public static void main(String[] args) {
	}
}*/
