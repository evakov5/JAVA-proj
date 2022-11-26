package ua.khpi.oop.kovalenko07;
import java.util.List;
import java.io.Serializable;

public class Music implements Serializable{
	
	private String name = null;
	private String genre = null;
	private String text = null;
	
	private int rating;
	private int date;
	private List Authors;
	
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
	    

	    public String song() {
	    	return "Name:"+ name + "\nGenre: " + genre + "\nRating" + rating + "\nDate: " + date + "\nAuthors: "+ Authors + "\nText:" + text;
	    }
}
