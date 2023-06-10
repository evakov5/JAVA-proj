package ua.khpi.oop.kovalenko10;


public class Audioteka {
	
	private String name;
	private String genre;
	private String text;
	private String author;
	
	private int rating;
	private int date;
	
	public Audioteka(String name, String genre, String text, int rating, int date, String author) {
		this.name = name;
		this.genre = genre;
		this.text = text;
		this.rating = rating;
		this.date = date;
		this.author = author;		
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
  
	public String getAuthors() {
        return author;
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
    
    public void setAuthors(final String value) {
    	this.author = value;
    }
    
    public String getSong() {
    	return "Name:"+ name + "\nGenre: " + genre + "\nRating" + rating + "\nDate: " + date + "\nAuthors: "+ author + "\nText:" + text;
    }
}
