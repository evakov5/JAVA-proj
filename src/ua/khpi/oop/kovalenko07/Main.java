package ua.khpi.oop.kovalenko07;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		final Music songs = new Music();
		
		ArrayList<String> Authors = new ArrayList<String>();
        Authors.add("SadSvit");
        
        songs.setGenre("trap metal");
        songs.setName("Силуети");
        songs.setR(16);
        songs.setText("Я поглянув тобі в очі. Силуети кажуть, що там спокій. Та згадав всі наші ночі. Силуети кажуть, що там спокій");
        songs.setAuthors(Authors);
        songs.setDate(2022);
        
        System.out.print(songs.getName() 
        		+ "\n" 
        		+ songs.getR() + "+ рейтинг"
        		+ "\n"
        		+ songs.getGenre() 
        		+ "\n"
        		+ songs.getDate() + " год"
        		+ "\n" 
        		+ songs.getAuthors()
        		+ "\n" 
        		+ songs.getText()
        		);
        		
	}

}
