# 15. Колекції в Java
## Тема
Ознайомлення з бібліотекою колекцій Java SE.
Використання колекцій для розміщення об'єктів розроблених класів.
## 1. Вимоги
* Розробити консольну програму для реалізації завдання обробки даних згідно прикладної області.

* Для розміщення та обробки даних використовувати контейнери (колекції) і алгоритми з Java Collections Framework.

* Забезпечити обробку колекції об'єктів: додавання, видалення, пошук, сортування згідно розділу Прикладні задачі л.р. №10.

* Передбачити можливість довготривалого зберігання даних: 1) за допомогою стандартної серіалізації; 2) не використовуючи протокол серіалізації.

* Продемонструвати розроблену функціональність в діалоговому та автоматичному режимах за результатом обробки параметрів командного рядка.
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
* Java code convention
* JDK:
* OOP
### 2.2 Ієрархія та структура класів
* Main
* Audioteka
* AudiotekaContainer
### 2.3 Важливі фрагменти програми:
* Main

```c
public class Main{
	public static void main(String[] args) {
		//контейнер та колекція пісень
		AudiotekaContainer container = new AudiotekaContainer();
		List<Audioteka> songs = new ArrayList<>();
		
		System.out.println("Введіть назву, жанр, текст, рейтинг, рік видання, виконавця.\n");
		try (Scanner scanner = new Scanner(System.in)) {
        	songs.add(new Audioteka(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), 
                		Integer.parseInt(scanner.nextLine()), scanner.nextLine()));
        	}
		
		songs.add(new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit"));
		songs.add(new Audioteka("Восьмий колір", "pop-rock", "Хочеш, я твоїм кольором буду?", 14, 2005, "Moto"));
		songs.add(new Audioteka("Лалала", "pop-rock", "Хочеш, я твоїм кольором буду?", 14, 2005, "Moto"));
		container.add(songs.get(0));
		container.add(songs.get(1));
		container.add(songs.get(2));
		
		container.remove(songs.get(1));
		songs.remove(songs.get(1));	
		for (Audioteka A : songs) {
	        System.out.println(A.getName());
	    }
	}
}
		
```
## Варіанти використання
Для аудіотеки
## Висновки
На цій лабораторній роботі навчились працювати з колекціями
