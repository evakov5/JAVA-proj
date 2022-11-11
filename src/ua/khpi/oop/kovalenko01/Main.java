 package ua.khpi.oop.kovalenko01;

/** 
 * Завдання: Обрати тип змінних та встановити за допомогою констант та літералів початкові значення. 
 * Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.
 * Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.
 * 
 * @author Kovalenko Yeva KN-921v
 * 
 * @version 1.0
 */

public class Main {
	
	/** Number in student’s record-book */
	static int mainNumber = 0x0007; // 7 => 0007
	
	/** Number of phone*/
	static long phoneNumber = 380634567970L;
	
	/** The last two digits of phone number which are not equal zero*/ 
	static int lastNumbers = 0b1100001; // 97 => 1100001
	
	/** The last 4 digits of phone number which are not equal zero  */ 
	static int lastfourNumbers = 015215; // 6797 => 15215
	
	/** Increased by one value of the remainder from dividing by 26 the decreased by one student number in the group journal*/
	static int someCalc = ((7-1) % 26) + 1;
	
	/** a character of the English alphabet in upper case, the number of which corresponds to the previously found value*/
	static char Letter = 'B';
	
	/** 
	 * Counts odd numbers
	 * @return number of odd
	 * @param a set of numbers for counting number of odd
	 * */
	
	static int oddCount(long... num) {
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 != 0)
				count++;
		}
		return count;
	}
	
	/** 
	 * Counts even numbers
	 * @return number of even
	 * @param a set of numbers for counting number of even
	 * */
	
	static int evenCount(long... num) {
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0)
				count++;
		}
		return count;
	}
	
	/** 
	 * Count the number of units
	 * @return number of units
	 * @param a set of numbers for counting number of units
	 * */
	
	static int oneCount(long... num) {
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			while(num[i] != 0) {
				if(num[i] % 2 != 0)
					count++;
				num[i] /= 2;
			}
		}
		return count;
	}
	
	/** Entry point */ 
	public static void main(String[] args) {
			System.out.println("Непарні: " + oddCount(mainNumber, phoneNumber, lastNumbers, lastfourNumbers,someCalc, Letter));
			System.out.println("Парні: " + evenCount(mainNumber, phoneNumber, lastNumbers, lastfourNumbers,someCalc, Letter));
			System.out.println("Одиниці: " + oneCount(mainNumber, phoneNumber, lastNumbers, lastfourNumbers,someCalc, Letter));
	}

}
