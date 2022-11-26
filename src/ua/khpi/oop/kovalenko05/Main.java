package ua.khpi.oop.kovalenko05;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

    
public class Main {

	public static void main(String[] args) {
			
		StringContainer container = new StringContainer();
		container.add(new String("Let`s"));
		container.add(new String("explore"));
		container.add(new String("eemm"));
		container.add(new String("solutions"));
		
		System.out.println(container);
		System.out.println(container.size());
		System.out.println(container.get(0));
		System.out.println(container.set(2, "a few"));
		System.out.println(container);
		System.out.println(container.contains("a few"));
		
		StringArrayIterator itr = new StringArrayIterator(container);
		while(itr.hasNext())
            System.out.println(itr.next()); 
	}
}
