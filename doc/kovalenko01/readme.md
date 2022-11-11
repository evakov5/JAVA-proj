# 3. Утилітарні класи. Обробка масивів і рядків
## Тема
Розробка власних утилітарних класів.
Набуття навичок вирішення прикладних задач з використанням масивів і рядків.
## 1. Вимоги
* Розробити та продемонструвати консольну програму мовою Java в середовищі Eclipse для вирішення прикладної задачі за номером, що відповідає збільшеному на одиницю залишку від ділення на 15 зменшеного на одиницю номера студента в журналі групи.

* При вирішенні прикладних задач використовувати латинку.

* Застосувати функціональну (процедурну) декомпозицію - розробити власні утилітарні класи (особливий випадок допоміжного класу, див. Helper Class) та для обробки даних використовувати відповідні статичні методи.

* Забороняється використовувати засоби обробки регулярних виразів: класи пакету java.util.regex (Pattern, Matcher та ін.), а також відповідні методи класу String (matches, replace, replaceFirst, replaceAll, split).
### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 6 варіант
### 1.2 Загальне завдання
* Продемонструвати роботу відлагодника
* Скомпілювати проект у терміналі
* Оформити роботу
* При вирішенні прикладних задач використовувати латинку.
### 1.3 Задача
Ввести текст. З тексту видалити всі символи, крім пропусків, які не є буквами. Пропуски, що повторюються, замінити на одиночні. Між послідовностями літер, де знаходяться розділові знаки, залишити хоча б один пропуск ("a,b,c" -> "a, b, c"). Вивести початковий текст та результат.

## 2. Опис програми

* Структура программи:
  * Головний клас з точкою входа в програму знаходиться у пакеті: ua.khpi.oop.kovalenko03.Main
* Код програми та брейкпоінти, що будуть використовуватись відлагодником для перевірки роботи програми:
![image](https://user-images.githubusercontent.com/90566260/201300723-b85f4cb4-16d5-4fec-a7b7-3118abb8917b.png)
* Відлагодження програми та показ результатів виконання:
<img src="https://github.com/evakov5/JAVA-proj/blob/main/doc/kovalenko01/assets/second.png">
<img src="https://github.com/evakov5/JAVA-proj/blob/main/doc/kovalenko01/assets/first.png">
* Компіляція програми у терміналі:
<img src="https://github.com/evakov5/JAVA-proj/blob/main/doc/kovalenko01/assets/res.png">



### 2.1 Засоби ООП
* Java code convention
* JDK
* StringBuilder

### 2.2 Ієрархія та структура класів
Програма має лише один клас


### 2.3 Важливі фрагменти програми:
```c
public class Main {
	
	/** Number in student’s record-book */
	static int mainNumber = 0x0007; // 7 => 0007
	
	/** Number of phone*/
	static long phoneNumber = 380634567970L;
	
	/** The last two digits of phone number which are not equal zero*/ 
	static int lastNumbers = 0b1100001; // 97 => 1100001
	
	/** The last 4 digits of phone number which are not equal zero  */ 
	static int lastfourNumbers = 015215; // 6797 => 15215
	
	/** Increased by one value of the remainder from dividing by 26 the decreased by one student number in the group journal*/
	static int someCalc = ((7-1) % 26) + 1;
	
	/** a character of the English alphabet in upper case, the number of which corresponds to the previously found value*/
	static char Letter = 'B';
	
	/** 
	 * Counts odd numbers
	 * @return number of odd
	 * @param a set of numbers for counting number of odd
	 * */
	
	static int oddCount(long... num) {
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 != 0)
				count++;
		}
		return count;
	}
	
	/** 
	 * Counts even numbers
	 * @return number of even
	 * @param a set of numbers for counting number of even
	 * */
	
	static int evenCount(long... num) {
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0)
				count++;
		}
		return count;
	}
	
	/** 
	 * Count the number of units
	 * @return number of units
	 * @param a set of numbers for counting number of units
	 * */
	
	static int oneCount(long... num) {
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			while(num[i] != 0) {
				if(num[i] % 2 != 0)
					count++;
				num[i] /= 2;
			}
		}
		return count;
	}
	
```
## Варіанти використання
Вказані у завданні
## Висновки
Під час робили було отримано навички з базовими поняттями JAVA, його літералами тощо
 
