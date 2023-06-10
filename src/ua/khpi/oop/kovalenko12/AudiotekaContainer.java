package ua.khpi.oop.kovalenko12;

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
}