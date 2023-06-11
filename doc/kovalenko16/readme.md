# 16. Модульне тестування
## Тема
Розробка модульних тестів з використанням JUnit 5.
## 1. Вимоги
* Розробити та додати модульні тести до програм попередніх лабораторних робіт. Забезпечити розділення на рівні початкового коду, тести розташовувати в директоріях з назвою test.

* Перевірити всі public-методи власного контейнера та його ітератора, які були створені при віконанні завдання лабораторної роботи "9. Параметризація в Java". Забезпечити покриття коду не менше 80%.

* Перевірити методи, що забезпечують валідацію даних в програмі рішення завдання лабораторної роботи "11. Регулярні вирази. Перевірка даних".

* Перевірити вирішення прикладної задачі лабораторної роботи "12. Регулярні вирази. Обробка тексту".

* Перевірити методи обробки контейнера лабораторної роботи "13. Паралельне виконання. Multithreading". Перевіряти тільки обробку даних, виключаючи multithreading (див. п.4).
### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
* Розробити прогрму
* Оформити роботу
### 1.3 Задача
Вище у вимогах
## 2. Опис програми
### 2.1 Засоби ООП
* JUnit 5
* Java code convention
* JDK:
* OOP
### 2.2 Ієрархія та структура класів
* Audioteka
* AudiotekaContainer
* PatternTest
* AudiotekaContainerTest
### 2.3 Важливі фрагменти програми:
* PatternTest
```c
public class PatternTest {

	private static final Pattern name_pattern = Pattern.compile("lalala");
	private static final Pattern genre_pattern = Pattern.compile("pop");
	private static final Pattern author_pattern = Pattern.compile("sadsvit");
	private static final Pattern year_pattern = Pattern.compile("2020");
	private static final Pattern text_pattern = Pattern.compile("frt");
	private static final Pattern rating_pattern = Pattern.compile("12");
	
	// Методи для перевірки даних
	public static boolean validate_name(String name) {
		Matcher matcher = name_pattern.matcher(name);
		return matcher.matches();
	}
	
	public static boolean validate_genre(String genre) {
		Matcher matcher = genre_pattern.matcher(genre);
		return matcher.matches();
	}
	
	public static boolean validate_author(String author) {
		Matcher matcher = author_pattern.matcher(author);
		return matcher.matches();
	}
	
	public static boolean validate_year(String year) {
		Matcher matcher = year_pattern.matcher(year);
		return matcher.matches();
	}
	
	public static boolean validate_text(String text) {
		Matcher matcher = text_pattern.matcher(text);
		return matcher.matches();
	}
	
	public static boolean validate_R(String rating) {
		Matcher matcher = rating_pattern.matcher(rating);
		return matcher.matches();
	}
	
	
	 public static void main(String args[]) {
	        try (Scanner scanner = new Scanner(System.in)) {
	        	
	        	Audioteka song1 = new Audioteka(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), 
	                		Integer.parseInt(scanner.nextLine()), scanner.nextLine());
	        	 
	 			boolean valid = validate_name(song1.getName()) && validate_genre(song1.getGenre()) &&
	 					validate_text(song1.getText()) &&
	 					validate_R(Integer.toString(song1.getR())) && 
	 					validate_year(Integer.toString(song1.getYear())) &&						
						validate_author(song1.getAuthors());
				
	 			System.out.println("Song: " + song1 + " is " + (valid ? "valid" : "invalid"));
	        }
	  }
	 
	 public static void Check_file() {
			try {
				File input_file = new File("author.txt");
				Scanner scanner = new Scanner(input_file);
				
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
	                String[] parts = line.split(",");
	                
	                Audioteka song = new Audioteka(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), 
	                		Integer.parseInt(parts[4]), parts[5]);
	                
	                
	    			boolean valid = validate_name(song.getName()) && validate_year(Integer.toString(song.getYear())) &&
	    					validate_R(Integer.toString(song.getR())) && validate_text(song.getText()) &&
	    					validate_genre(song.getGenre()) && validate_author(song.getAuthors());
	    			
	    			 System.out.println("Song: " + song + " is " + (valid ? "valid" : "invalid"));
				}
				scanner.close();
			}
			catch (FileNotFoundException e) {
	            System.out.println("File not found");
			}
		} 
	 
	    // test for validate_year
	 	@Test
	    public void test_validate_Year_validInput() {
	        boolean result = validate_year("2020");
	        assertTrue(result);
	    }
	    @Test
	    public void test_validate_Year_invalidInput() {
	        boolean result = validate_year("abc");
	        assertFalse(result);
	    }
	    
	    // test for validate_genre
	    @Test
	    public void test_validate_Genre_validInput() {
	        boolean result = validate_genre("pop");
	        assertTrue(result);
	    }

	    @Test
	    public void test_validate_Genre_invalidInput() {
	        boolean result = validate_year("123");
	        assertFalse(result);
	    }
	    
	    // test for validate_name
	    @Test
	    public void test_validate_Name_validInput() {
	        boolean result = validate_name("Lala");
	        assertTrue(result);
	    }

	    @Test
	    public void test_validate_Name_invalidInput() {
	        boolean result = validate_name("123");
	        assertFalse(result);
	    }
	    
	    // test for validate_rating
	    @Test
	    public void test_validate_R_validInput() {
	        boolean result = validate_R("12");
	        assertTrue(result);
	    }

	    @Test
	    public void test_validate_R_invalidInput() {
	        boolean result = validate_R("ABC");
	        assertFalse(result);
	    }
	    
	    // test for validate_author
	    @Test
	    public void test_validate_Author_validInput() {
	        boolean result = validate_author("Monatik");
	        assertTrue(result);
	    }

	    @Test
	    public void test_validate_Author_invalidInput() {
	        boolean result = validate_R("123");
	        assertFalse(result);
	    }
	    
	    // test for validate_text
	    @Test
	    public void test_validate_Text_validInput() {
	        boolean result = validate_text("Shalala");
	        assertTrue(result);
	    }

	    @Test
	    public void test_validate_Text_invalidInput() {
	        boolean result = validate_text("123");
	        assertFalse(result);
	    }
	    
	    @Test
	    public static void Test_Check_file() {
			try {
				File input_file = new File("song.txt");
				Scanner scanner = new Scanner(input_file);
				
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
	                String[] parts = line.split(",");
	                
	                Audioteka song = new Audioteka(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), 
	                		Integer.parseInt(parts[4]), parts[5]);
	                
	                
	    			boolean valid = validate_name(song.getName()) && validate_year(Integer.toString(song.getYear())) &&
	    					validate_R(Integer.toString(song.getR())) && validate_text(song.getText()) &&
	    					validate_genre(song.getGenre()) && validate_author(song.getAuthors());
	    			
	    			 System.out.println("Song: " + song + " is " + (valid ? "valid" : "invalid"));
	    			 assertTrue(valid);
				}
				scanner.close();
			}
			catch (FileNotFoundException e) {
	            System.out.println("File not found");
			}
		} 
}
```
* AudiotekaContainerTest

```c
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
		
```
## Варіанти використання
Демонстрація роботи тестів
## Висновки
На цій лабораторній роботі навчились працювати з тестами
