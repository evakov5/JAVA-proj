# 1. Структура програми мовою Java. Типи даних, літерали, операції і оператори
## Тема
Ознайомлення з JDK платформи Java SE та середовищем розробки Eclipse IDE.
## 1. Вимоги
* Вирішити три прикладні задачі на мові Java в середовищі Eclipse.
* Продемонструвати покрокове виконання програми та результати роботи в режимі налагодження, не використовуючи виведення до консолі.
* Виконати компіляцію і запуск програми в командному рядку за допомогою відповідних утиліт JDK.
### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
* Продемонструвати роботу відлагодника
* Скомпілювати проект у терміналі
* Оформити роботу
### 1.3 Задача
* Обрати тип змінних та встановити за допомогою констант та літералів початкові значення:

  * число, що відповідає номеру залікової книжки (через брак використовувати п'ятизначне випадкове число) за допомогою шістнадцяткового літералу;
  * число, що відповідає номеру мобільного телефона (починаючи з 380...) за допомогою десяткового літералу;
  * число, яке складається з останніх двох ненульових цифр номера мобільного телефону за допомогою двійкового літералу;
  * число, яке складається з останніх чотирьох ненульових цифр номера мобільного телефону за допомогою вісімкового літералу;
 визначити збільшене на одиницю значення залишку від ділення на 26 зменшеного на одиницю номера студента в журналі групи;
  * символ англійського алфавіту в верхньому регістрі, номер якого відповідає знайденому раніше значенню ('A' - 1, 'B' - 2, ... , 'Z' - 26).

* Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.

* Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.

## 2. Опис програми

* Особливості рішення не має;
* Структура программи:
  * Головний клас з точкою входа в програму знаходиться у пакеті: ua.khpi.oop.kovalenko.Main
* Код програми та брейкпоінти, що будуть використовуватись відлагодником для перевірки роботи програми:
![smth](doc/kovalenko01/assets/second.png)
* Відлагодження програми та показ результатів виконання:
* Компіляція програми у терміналі:

### 2.1 Засоби ООП
* Java code convention
* JDK

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
Пыд час робили було отримано навички з базовими поняттями JAVA, його літералами тощо
 
