package ua.khpi.oop.kovalenko06;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Changes implements Serializable {
	
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
	
	class StringContainer {
		private String[] array = new String[0];
		
		/** 
		 * Adds to container new element 
		 * @param text string
		 * */
		
		public void add(String element) {
			String[] old = array;
			array = new String[old.length + 1];
			for(int i = 0; i < old.length; ++i)
				array[i] = old[i];
			array[old.length] = element;
		}
		
		public String toString() {
			return Arrays.toString(array);
		}
		
		/** 
		 * Defines size of container
		 * @return size of array
		 * */
		
		public int size() {  
			return array.length;
		}
		
		/** 
		 * Clears container from elements 
		 * */
		
		public void clear() { 
			array = new String[0];
		}
		
		/** 
		 * Gets element of container using index
		 * @return element of array
		 * @param int index 
		 * */
		
		public String get(int index) { 
			return array[index];
		}
		
		/** 
		 * Set determined element of container with new text
		 * @return old element
		 * @param int index, text String
		 * */
		
		public String set(int index, String element) {
			String old = array[index];
			array[index] = element;
			return old;
		}	
		
		public Object[] toArray() {
			String[] arr = new String[array.length]; 
			for (int i = 0; i < array.length; ++i) {
				arr[i] = array[i];
			}
			return arr;		
		}
		
		
		public boolean contains(String string) {
			boolean res = false;
			for(int i = 0; i < array.length; i++) {
				if (array[i] == string) {
					res = true;
				} 	
			}
			return res;
		}
			
		public Iterator<String> iterator() {
			return new StringArrayIterator(null);
			}
			    	
	}
		
		class StringArrayIterator implements Iterator<String>{
		
		StringContainer list;
	    int index = 0;
		
	    public StringArrayIterator(StringContainer list) {
	        this.list = list;
	    }
	    
	    public boolean hasNext() {
	        return index < list.size();  
	   }
	    
	    @Override
	    public String next() {
	        if (hasNext())
	            return list.get(index++);
	        throw new NoSuchElementException();
	    }
	}
	
}
