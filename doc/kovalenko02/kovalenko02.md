# 2. Алгоритмічна декомпозиція. Прості алгоритми обробки даних
## Тема
Розробка простих консольних програм для платформи Java SE.
## 1. Вимоги
* Розробити та продемонструвати програму мовою Java в середовищі Eclipse для вирішення прикладної задачі за номером, що відповідає збільшеному на одиницю залишку від ділення на 10 зменшеного на одиницю номера студента в журналі групи.

* Для визначення вхідних даних використовувати генератор псевдовипадкових чисел (java.util.Random) та забезпечити циклічне (принаймні десять ітерацій) знаходження результату рішення прикладної задачі.

* Забезпечити виведення до консолі відповідних значень вхідних даних та результатів обчислень у вигляді таблиці.

* Застосувати функціональну (процедурну) декомпозицію і забезпечити рішення прикладної задачі за допомогою відповідних методів.

* Забороняється використання даних типу String та масивів при знаходженні рішення прикладної задачі.
### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
* Продемонструвати роботу відлагодника
* Скомпілювати проект у терміналі
* Оформити роботу
* Застосувати функціональну (процедурну) декомпозицію і забезпечити рішення прикладної задачі за допомогою відповідних методів.
* Забезпечити виведення до консолі відповідних значень вхідних даних та результатів обчислень у вигляді таблиці.
### 1.3 Задача

Перевірити чи дорівнює сума перших трьох цифр сумі останніх трьох цифр в десятковому запису 6-значного цілого числа.

## 2. Опис програми

* Вивід результату має вигляд таблиці;
* Структура программи:
  * Головний клас з точкою входа в програму знаходиться у пакеті: ua.khpi.oop.kovalenko02.Main
* Код програми та брейкпоінти, що будуть використовуватись відлагодником для перевірки роботи програми:
![image](https://user-images.githubusercontent.com/90566260/201295754-3fc20b4b-cd54-4002-8d21-9ce0b467b4fa.png)
* Відлагодження програми та показ результатів виконання:
![image](https://user-images.githubusercontent.com/90566260/201296760-93773952-b187-4a31-a546-b27ac78e0480.png)
![image](https://user-images.githubusercontent.com/90566260/201296916-7615ff4f-e92f-4c9a-b346-0cbbcbceaf94.png)
* Компіляція програми у терміналі:
<img src="(https://github.com/evakov5/JAVA-proj/blob/main/doc/kovalenko02/assets/resss.jpg)">



### 2.1 Засоби ООП
* Java code convention
* JDK:
* java.util.Random

### 2.2 Ієрархія та структура класів
Програма має лише один клас з 3 методами


### 2.3 Важливі фрагменти програми:
```c
public class Main {
	
	/** An instance of a class Random in the range of six-digit numbers */
	static int genRan() {
		Random random = new Random();
		return random.nextInt((999999-100000)+1)+100000;
	}
	/** 
	 * Counts the sum of the first three digits
	 * @return sum
	 * @param 6-digit number for counting sum
	 * */
	
	static int sumFirst (int num) {
		int sum = 0;
		num = num/1000;
		for(int i = 0; i < 3; i++) {
			sum = sum + num % 10;
			num /= 10;
		}
		return sum;
	}
	
	/** 
	 * Counts the sum of the last three digits
	 * @return sum
	 * @param 6-digit number for counting sum
	 * */
	
	static int sumLast (int num) {
		int sum1 = 0;
		for(int i = 0; i < 3 ; i++) {
			sum1 = sum1 + num % 10;
			num /= 10;
		}
		return sum1;
	}
	
	/** 
	 * Checks if 2 numbers are equal
	 * @return result of checking
	 * @param 2 numbers for checking
	 * */
	
	static boolean compar(int num1, int num2) {
		boolean res = false;
		if (num1 == num2)
			res = true;
		return res;
	}
	
	/**
     * Output variables to the console.
	 * @param i cycle number one unit added to house
	 * @param number for checking
	 * @param result of checking 
    */
	
	static void print(int i, int num, boolean res) {		
    	System.out.println( "\n___________________________________________________\n");
        System.out.println("|#" + (i+1) +"| | Число: " + num + "| | Результат перевірки: " + res + "|");
    }
	
```
## Варіанти використання
Вказані у завданні
## Висновки
Під час робили було отримано навички з java.util.Random, декомпозицією
