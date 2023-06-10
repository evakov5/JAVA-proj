package ua.khpi.oop.kovalenko10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AudiotekaContainer implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Audioteka> songs;
	
	public AudiotekaContainer() {
		songs = new ArrayList<>();
	}
	
	public void add(Audioteka song) {
		songs.add(song);
	}
	
	public void remove(Audioteka song) {
        songs.remove(song);
    }
	
	public Audioteka get(int index) {
		return songs.get(index);
	}
	
	public int size() {
		return songs.size();
	}
	
	public boolean isEmpty() {
		return songs.isEmpty();
	}
	
	public void clear() {
		songs.clear();
	}
	
	public List<Audioteka> getAll() {
        return new ArrayList<>(songs);
    }
	
	// sort by name of song
	public <T extends Comparable<T>> void sortBySongName(List<Audioteka> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getName().compareTo(v2.getName());
            return ascending ? result : -result;
        });
    }
	
	// sort by rating
    public <T extends Comparable<T>> void sortByRating(List<Audioteka> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = Boolean.compare(v1.getR() > v2.getR(), false);
            return ascending ? result : -result;
        }); }
    
	// sort by authors
	public <T extends Comparable<T>> void sortByAuthor(List<Audioteka> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getAuthors().compareTo(v2.getAuthors());
            return ascending ? result : -result;
        });
    }
	
}