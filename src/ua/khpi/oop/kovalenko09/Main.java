package ua.khpi.oop.kovalenko09;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		AudiotekaContainer container = new AudiotekaContainer();
		ArrayList<String> Author1 = new ArrayList<String>();
        Author1.add("SadSvit");
        Author1.add("Motor`Rolla");
		
		Audioteka song1 = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, Author1);
		container.add(song1);
		
		Audioteka song2 = new Audioteka("Восьмий колір", "pop-rock", "Хочеш, я твоїм кольором буду?", 14, 2005, Author1);
		container.add(song2);
		
		//get by index
	    Audioteka song = container.get(0);
	    System.out.println(song.getName());
	    
	    //get all	    
	    List<Audioteka> songs = container.getAll();
	    for (Audioteka A : songs) {
	        System.out.println(A.getName());
	    }
	    
	    //remove
	    container.remove(song);
	    
	    //check if empty
	    System.out.println(container.isEmpty());
	    
	    //clear container
	    container.clear();
	    System.out.println(container.isEmpty());
	}
}