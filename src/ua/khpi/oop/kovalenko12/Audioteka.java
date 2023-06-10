package ua.khpi.oop.kovalenko12;

public class Audioteka {
	
	private String name;
	private String genre;
	private String text;
	private String author;
	
	private int rating;
	private int year;
	
	public Audioteka(String name, String genre, String text, int rating, int year, String author) {
		this.name = name;
		this.genre = genre;
		this.text = text;
		this.rating = rating;
		this.year = year;
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
  
	public int getYear() {
    	return year;
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
  
    public void setYear(final int value) {
    	this.year = value;
    }
    
    public void setR(final int value) {
    	this.rating = value;
    }
    
    public void setAuthors(final String value) {
    	this.author = value;
    }
    
    public String getSong() {
    	return "Name:"+ name + "\nGenre: " + genre + "\nRating" + rating + "\nDate: " + year + "\nAuthors: "+ author + "\nText:" + text;
    }
    
    @Override
    public String toString() {
        return "Audioteka{" +
                "name='" + name + '\'' +
                ", genre=" + genre +  '\'' +
                ", text=" + text +  '\'' +
                ", rating=" + rating +  '\'' +
                ", year=" + year +  '\'' +
                ", author=" + author + 
                '}';
    }
}