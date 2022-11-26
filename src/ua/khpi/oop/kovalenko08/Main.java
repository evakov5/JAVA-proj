package ua.khpi.oop.kovalenko08;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		final Music song1 = new Music();
		
		ArrayList<String> Author1 = new ArrayList<String>();
        Author1.add("SadSvit");
        Author1.add("СТРУКТУРА ЩАСТЯ");
        
        song1.setGenre("trap metal");
        song1.setName("Силуети");
        song1.setR(16);
        song1.setText("Я поглянув тобі в очі. Силуети кажуть, що там спокій. Та згадав всі наші ночі. Силуети кажуть, що там спокій");
        song1.setAuthors(Author1);
        song1.setDate(2022);
        
        final Music song2 = new Music();
        ArrayList<String> Author2 = new ArrayList<String>();
        Author2.add("Motor`Rolla");
        
        song2.setGenre("pop-rock");
        song2.setName("Восьмий колір");
        song2.setR(14);
        song2.setText("Хочеш, я твоїм кольором буду? Восьмим кольором, восьмим чудом. Білим, я буду білим як сніг.");
        song2.setAuthors(Author2);
        song2.setDate(2005);
        
        List<Music> list = new ArrayList<>();
        list.add(song1);
        list.add(song2);
        
        FullMusic full = new FullMusic();
        full.setSongs(list);
        
        scanner = new Scanner(System.in);
         System.out.print("Entry path: ");
		String path = scanner.nextLine(); 
		
		 try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(path + ".xml")));
			x.writeObject(full);
			x.close();
			System.out.println("Done");
        } 	catch (FileNotFoundException e) 
				{		
			e.printStackTrace();
			System.out.println("Error");
		}
		
		
	}

}
