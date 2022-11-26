# 7. Об'єктно-орієнтована декомпозиція
## Тема
Використання об'єктно-орієнтованого підходу для розробки об'єкта предметної (прикладної) галузі.
## 1. Вимоги
* Використовуючи об'єктно-орієнтований аналіз, реалізувати класи для представлення сутностей відповідно прикладної задачі - domain-об'єктів.

* Забезпечити та продемонструвати коректне введення та відображення кирилиці.

* Продемонструвати можливість управління масивом domain-об'єктів.

### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
* Розробити прогрму
* Оформити роботу
### 1.3 Задача
12 Варіант. Аудіотека
Композиція: назва; жанр; виконавець; текст (якщо є); дата створення; тривалість; формат даних; рейтинг (набір характеристик вигляду "властивість, значення").
## 2. Опис програми
* Виклики в класі Main
  
```c 
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
```
  
* Вивід результату програми у термінал:
  
```c 
Силуети
16+ рейтинг
trap metal
2022 год
[SadSvit]
Я поглянув тобі в очі. Силуети кажуть, що там спокій. Та згадав всі наші ночі. Силуети кажуть, що там спокій
```
### 2.1 Засоби ООП 
* Java code convention
* JDK:
### 2.2 Ієрархія та структура класів
* Main
* Music
### 2.3 Важливі фрагменти програми:
* Клас Music
```c
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
	
```
## Варіанти використання
Демонстрація роботи ООП
## Висновки
На цій лабораторній роботі навчились працювати з ооп
