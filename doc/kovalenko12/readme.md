# 12. Регулярні вирази. Обробка тексту
## Тема
Ознайомлення з принципами використання регулярних виразів для обробки тексту.
## 1. Вимоги
* Використовуючи програми рішень попередніх задач, продемонструвати ефективне (оптимальне) використання регулярних виразів при вирішенні прикладної задачі.

* Передбачити можливість незначної зміни умов пошуку.

* Продемонструвати розроблену функціональність в діалоговому та автоматичному режимах.
### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
* Розробити прогрму
* Оформити роботу
### 1.3 Задача
Аудіотека. Знайти аудіозаписи, що стиснуті з мінімальними втратами або без втрат аудіоданих (визначається форматом), в назві або тексті яких згадується святкування Нового Року.
## 2. Опис програми
* Вивід у консоль
![image_2023-06-10_18-36-28](https://github.com/evakov5/JAVA-proj/assets/90566260/b33bf9e6-eb64-438c-baf2-7a738f41db34)
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
public class Main {
	
	private static final Pattern new_year_songs = Pattern.compile("Свято");
	private static final Pattern new_year_songs1 = Pattern.compile("Новий рік");
	
	public static boolean validate_name(String name) {
		Matcher matcher = new_year_songs.matcher(name);
		Matcher matcher1 = new_year_songs1.matcher(name);
		boolean res;
		if(matcher.matches()) {
			res = true;}
		else if(matcher1.matches()) {
			res = true;}
		else res = false;
		return res;
	}
	
	public static void main(String args[]) {

		Audioteka song1 = new Audioteka("Силуети", "trap metal", "Силуети кажуть, що там спокій.", 16, 2022, "Sadsvit");
		Audioteka song2 = new Audioteka("Свято", "pop", "Крокуй із святом в Новий-Новий рік Час двері святу відчинити", 12, 2018, "MONATIK");
		
		List<Audioteka> list = new ArrayList<Audioteka>();
		
		list.add(song2);
        list.add(song1);

        for (Audioteka song: list) {
            if(validate_name(song.getName())) {
                System.out.println("Song: " + song.toString());
            }
        }
    }
}
		
```
## Варіанти використання
Для аудіотек
## Висновки
На цій лабораторній роботі набули навичи у розробці параметризованих контейнерів.
