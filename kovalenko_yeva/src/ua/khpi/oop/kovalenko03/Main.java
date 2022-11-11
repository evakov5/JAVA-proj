package ua.khpi.oop.kovalenko03;

/** 
 * Ввести текст. З тексту видалити всі символи, крім пропусків, які не є буквами.
 * Пропуски, що повторюються, замінити на одиночні. Між послідовностями літер, де знаходяться розділові знаки,
 * залишити хоча б один пропуск ("a,b,c" -> "a, b, c").
 * Вивести початковий текст та результат.
 * 
 * @author Kovalenko Yeva KN-921v
 * 
 * @version 1.0
 */

public class Main {
	
	/** 
	 * Сhanges the original test to the required one
	 * @return required text
	 * @param string of text
	 * */
	
	static String changes (String s) {
		String temp = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int asc = (int)c;
			if((asc>=65 && asc<=90) || (asc>=97 && asc<=122) || (asc == 32)) {	
				if(asc == 32) {
					if(s.charAt(i) != s.charAt(i+1))
						temp += c;					
					}
				else
					temp += c;
			}
			if((asc == 44) || (asc == 46))
				temp += " "; 				
		}
		return temp;
	}

	/**
	 * Program Entry Point
	 *
	 * @param args command line parameters
	 */
	
	public static void main(String[] args) {
		String text = "Let's    expl@ore,a few  solut)ions.";
		String res = changes(text);
		System.out.println("Початковий текст: " + text);
		System.out.println("Результат: " +res);
	}

}
