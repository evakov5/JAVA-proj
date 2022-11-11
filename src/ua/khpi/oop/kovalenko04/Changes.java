package ua.khpi.oop.kovalenko04;

public class Changes {
	
	/** 
	 * Сhanges the original test to the required one
	 * @return required text
	 * @param string of text
	 * */
	
	static String change (String s) {
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
}
