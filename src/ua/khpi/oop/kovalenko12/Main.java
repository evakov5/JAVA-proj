package ua.khpi.oop.kovalenko12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	private static final Pattern new_year_songs = Pattern.compile("Свято");
	private static final Pattern new_year_songs1 = Pattern.compile("Новий рік");
	
	public static boolean validate_name(String name) {
		Matcher matcher = new_year_songs.matcher(name);
		Matcher matcher1 = new_year_songs1.matcher(name);
		boolean res;
		if(matcher.matches()) {
			res = true;}
		else if(matcher1.matches()) {
			res = true;}
		else res = false;
		return res;
	}
	
	public static void main(String args[]) {

		Audioteka song1 = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
		Audioteka song2 = new Audioteka("Свято", "pop", "Крокуй із святом в Новий-Новий рік Час двері святу відчинити", 12, 2018, "MONATIK");
		
		List<Audioteka> list = new ArrayList<Audioteka>();
		
		list.add(song2);
        list.add(song1);

        for (Audioteka song: list) {
            if(validate_name(song.getName())) {
                System.out.println("Song: " + song.toString());
            }
        }
    }
}