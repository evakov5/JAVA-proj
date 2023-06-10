package ua.khpi.oop.kovalenko10;

import java.util.List;

public class Main{
	public static void main(String[] args) {
		AudiotekaContainer container = new AudiotekaContainer();
		
		Audioteka song1 = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
		container.add(song1);
		
		Audioteka song2 = new Audioteka("Восьмий колір", "pop-rock", "Хочеш, я твоїм кольором буду?", 14, 2005, "Moto");
		container.add(song2);
		
	    //get all	    
	    List<Audioteka> songs = container.getAll();
	    for (Audioteka A : songs) {
	        System.out.println(A.getName());
	    }
	}
}