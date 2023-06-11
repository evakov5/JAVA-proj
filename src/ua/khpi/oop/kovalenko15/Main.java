package ua.khpi.oop.kovalenko15;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//контейнер та колекція пісень
		AudiotekaContainer container = new AudiotekaContainer();
		List<Audioteka> songs = new ArrayList<>();
		
		System.out.println("Введіть назву, жанр, текст, рейтинг, рік видання, виконавця.\n");
		try (Scanner scanner = new Scanner(System.in)) {
        	songs.add(new Audioteka(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), 
                		Integer.parseInt(scanner.nextLine()), scanner.nextLine()));
        	}
		
		songs.add(new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit"));
		songs.add(new Audioteka("Восьмий колір", "pop-rock", "Хочеш, я твоїм кольором буду?", 14, 2005, "Moto"));
		songs.add(new Audioteka("Лалала", "pop-rock", "Хочеш, я твоїм кольором буду?", 14, 2005, "Moto"));
		container.add(songs.get(0));
		container.add(songs.get(1));
		container.add(songs.get(2));
		
		container.remove(songs.get(1));
		songs.remove(songs.get(1));	
		for (Audioteka A : songs) {
	        System.out.println(A.getName());
	    }
	}
}