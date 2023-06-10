package ua.khpi.oop.kovalenko09;
import java.util.List;

public class Audioteka {
	
	private String name;
	private String genre;
	private String text;
	
	private int rating;
	private int date;
	private List<String> Authors;
	
	public Audioteka(String name, String genre, String text, int rating, int date, List<String> Authors) {
		this.name = name;
		this.genre = genre;
		this.text = text;
		this.rating = rating;
		this.date = date;
		this.Authors = Authors;
		
	}
	
	// get
	
	public String getName() {
        return name;
    }
  
	public String getText() {
        return text;
    }
  
	public String getGenre() {
        return genre;	
    }
  
	public List getAuthors() {
        return Authors;
    }
  
	public int getDate() {
    	return date;
    }
  
	public int getR() {
    	return rating;
    }
  
	//set
	
	public void setText(final String value) {
        this.text = value;
    }
  
	public void setName(final String value) {
        this.name = value;
    }
  
	public void setGenre(final String value) {
        this.genre = value;
    }
  
    public void setDate(final int value) {
    	this.date = value;
    }
    
    public void setR(final int value) {
    	this.rating = value;
    }
    
    public void setAuthors(final List list) {
    	this.Authors = list;
    }
    
    public String getSong() {
    	return "Name:"+ name + "\nGenre: " + genre + "\nRating" + rating + "\nDate: " + date + "\nAuthors: "+ Authors + "\nText:" + text;
    }
}
