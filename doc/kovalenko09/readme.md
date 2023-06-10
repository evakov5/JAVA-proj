# 9. Параметризація в Java.
## Тема
Вивчення принципів параметризації в Java. Розробка параметризованих класів та методів.
## 1. Вимоги
* Створити власний клас-контейнер, що параметризується (Generic Type), на основі зв'язних списків для реалізації колекції domain-об’єктів лабораторної роботи №7.

* Для розроблених класів-контейнерів забезпечити можливість використання їх об'єктів у циклі foreach в якості джерела даних.

* Забезпечити можливість збереження та відновлення колекції об'єктів: 1) за допомогою стандартної серіалізації; 2) не використовуючи протокол серіалізації.

* Продемонструвати розроблену функціональність: створення контейнера, додавання елементів, видалення елементів, очищення контейнера, перетворення у масив, перетворення у рядок, перевірку на наявність елементів.

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
* Вивід у консоль
```c
Силуети
Силуети
Восьмий колір
false
true
```
![image](https://github.com/evakov5/JAVA-proj/assets/90566260/6785740d-5884-43f4-8696-b3521bddbc5a)

### 2.1 Засоби ООП
  
* Java code convention
* JDK:
* OOP
### 2.2 Ієрархія та структура класів
* Main
* Audioteka
* AudiotekaContainer
### 2.3 Важливі фрагменти програми:
* Контейнер
```c
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
```
* Main

```c
public class Main{
	public static void main(String[] args) {
		AudiotekaContainer container = new AudiotekaContainer();
		ArrayList<String> Author1 = new ArrayList<String>();
        Author1.add("SadSvit");
        Author1.add("Motor`Rolla");
		
		Audioteka song1 = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, Author1);
		container.add(song1);
		
		Audioteka song2 = new Audioteka("Восьмий колір", "pop-rock", "Хочеш, я твоїм кольором буду?", 14, 2005, Author1);
		container.add(song2);
		
		//get by index
	    Audioteka song = container.get(0);
	    System.out.println(song.getName());
	    
	    //get all	    
	    List<Audioteka> songs = container.getAll();
	    for (Audioteka A : songs) {
	        System.out.println(A.getName());
	    }
	    
	    //remove
	    container.remove(song);
	    
	    //check if empty
	    System.out.println(container.isEmpty());
	    
	    //clear container
	    container.clear();
	    System.out.println(container.isEmpty());
	}
}
		
```
## Варіанти використання
Демонстрація роботи параметризації
## Висновки
На цій лабораторній роботі навчились працювати з параметризацією
