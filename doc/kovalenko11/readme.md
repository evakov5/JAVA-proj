# 11. Регулярні вирази. Перевірка даних
## Тема
Ознайомлення з принципами використання регулярних виразів для перевірки рядка на відповідність шаблону.
## 1. Вимоги
Продемонструвати ефективне (оптимальне) використання регулярних виразів для перевірки коректності (валідації) даних, що вводяться, 
перед записом в domain-об'єкти відповідно до призначення кожного поля для заповнення розробленого контейнера:

  * при зчитуванні даних з текстового файла в автоматичному режимі;
  * при введенні даних користувачем в діалоговому режимі.ревірку на наявність елементів.
  
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
Вивід у консоль
![image_2023-06-08_00-41-42](https://github.com/evakov5/JAVA-proj/assets/90566260/2f798bc6-15d7-43a8-828c-f2de74a5c6df)
![image_2023-06-08_00-42-46](https://github.com/evakov5/JAVA-proj/assets/90566260/921381a3-411c-473c-9dfc-f3658b79a55d)

### 2.1 Засоби ООП
  
* Java code convention
* JDK:
* OOP
### 2.2 Ієрархія та структура класів
* Main
* Audioteka
### 2.3 Важливі фрагменти програми:
* Main
```c
public class Main {
	
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
}
```
## Варіанти використання
Демонстрація роботи валідації та патернів
## Висновки
На цій лабораторній роботі навчились працювати з валідацією та патернами
