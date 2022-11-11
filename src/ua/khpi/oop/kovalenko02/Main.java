package ua.khpi.oop.kovalenko02;
import java.util.Random;

/** 
 * Завдання: Перевірити чи дорівнює сума перших трьох цифр сумі останніх трьох цифр в десятковому запису 6-значного цілого числа
 * 
 * @author Kovalenko Yeva KN-921v
 * 
 * @version 1.0
 */

public class Main {
	
	/** An instance of a class Random in the range of six-digit numbers */
	static int genRan() {
		Random random = new Random();
		return random.nextInt((999999-100000)+1)+100000;
	}

	/** 
	 * Counts the sum of the first three digits
	 * @return sum
	 * @param 6-digit number for counting sum
	 * */
	
	static int sumFirst (int num) {
		int sum = 0;
		num = num/1000;
		for(int i = 0; i < 3; i++) {
			sum = sum + num % 10;
			num /= 10;
		}
		return sum;
	}
	
	/** 
	 * Counts the sum of the last three digits
	 * @return sum
	 * @param 6-digit number for counting sum
	 * */
	
	static int sumLast (int num) {
		int sum1 = 0;
		for(int i = 0; i < 3 ; i++) {
			sum1 = sum1 + num % 10;
			num /= 10;
		}
		return sum1;
	}
	
	/** 
	 * Checks if 2 numbers are equal
	 * @return result of checking
	 * @param 2 numbers for checking
	 * */
	
	static boolean compar(int num1, int num2) {
		boolean res = false;
		if (num1 == num2)
			res = true;
		return res;
	}
	
	/**
     * Output variables to the console.
	 * @param i cycle number one unit added to house
	 * @param number for checking
	 * @param result of checking 
    */
	
	static void print(int i, int num, boolean res) {		
    	System.out.println( "\n___________________________________________________\n");
        System.out.println("|#" + (i+1) +"| | Число: " + num + "| | Результат перевірки: " + res + "|");
    }

    /**
     * Program Entry Point
     *
     * @param args command line parameters
     */
	
	public static void main(String[] args) {

		 for(int i = 0; i < 10; i++) {
		 int x = genRan();
		 boolean r = compar(sumFirst(x), sumLast(x));
		 print(i,x,r);	 
		 }
   	}

}
