package ua.khpi.oop.kovalenko16.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AudiotekaContainerTest {
	 private AudiotekaContainer container;

	    @BeforeEach
	    void setUp() {
	        container = new AudiotekaContainer();
	    }
	    
	    @Test
	    public void testAdd() {
	        Audioteka song = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
	        container.add(song);
	        assertEquals(1, container.size());
	        assertTrue(container.getAll().contains(song));
	    }
	    
	    @Test
	    public void testGet() {
	    	Audioteka song = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
	        container.add(song);
	        assertEquals(song, container.get(0));
	    }
	    
	    @Test
	    public void testRemove() {
	    	Audioteka song = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
	        container.add(song);
	        container.remove(song);
	        assertEquals(0, container.size());
	        assertFalse(container.getAll().contains(song));
	    }
	    
	    @Test
	    public void testSize() {
	    	Audioteka song = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
	        container.add(song);
	        assertEquals(1, container.size());
	    }

	    @Test
	    public void testIsEmpty() {
	        assertTrue(container.isEmpty());
	        Audioteka song = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
	        container.add(song);
	        assertFalse(container.isEmpty());
	    }

	    @Test
	    public void testClear() {
	    	Audioteka song = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
	        container.add(song);
	        container.clear();
	        assertEquals(0, container.size());
	        assertTrue(container.isEmpty());
	        assertFalse(container.getAll().contains(song));

	     }
}