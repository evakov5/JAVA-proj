# 13. Паралельне виконання. Multithreading
## Тема
Ознайомлення з моделлю потоків Java. Організація паралельного виконання декількох частин програми.
## 1. Вимоги
* Використовуючи програми рішень попередніх задач, продемонструвати можливість паралельної обробки елементів контейнера: створити не менше трьох додаткових потоків, на яких викликати відповідні методи обробки контейнера.

* Забезпечити можливість встановлення користувачем максимального часу виконання (таймаута) при закінченні якого обробка повинна припинятися незалежно від того знайдений кінцевий результат чи ні.

* Для паралельної обробки використовувати алгоритми, що не змінюють початкову колекцію.

* Кількість елементів контейнера повинна бути досить велика, складність алгоритмів обробки колекції повинна бути зіставна, а час виконання приблизно однаковий, наприклад:

  * пошук мінімуму або максимуму;
  * обчислення середнього значення або суми;
  * підрахунок елементів, що задовольняють деякій умові;
  * відбір за заданим критерієм;
  * власний варіант, що відповідає обраній прикладної області.
### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
* Розробити прогрму
* Оформити роботу
### 1.3 Задача
Обчислення середнього значення або суми
## 2. Опис програми
* Вивід у консоль
![image_2023-06-11_02-23-16](https://github.com/evakov5/JAVA-proj/assets/90566260/4d58c66f-0a5f-4008-b9f0-207e9be54bc9)

### 2.1 Засоби ООП
* Java code convention
* JDK:
* OOP
### 2.2 Ієрархія та структура класів
* Main
* Сalculator
* AudiotekaContainer
### 2.3 Важливі фрагменти програми:
* Main

```c
public class Main {

	public static void main(String args[]) {
		
		int timeout = 5000; // максимальний час виконання

		try (Scanner scanner = new Scanner(System.in)) { // можливість заповнення користувачем
			timeout = Integer.parseInt(scanner.nextLine());
		} 
		
		int numThreads = 3; // кількість потоків 
		
		List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        
        System.out.println(numbers);
        
        List<Thread> threads = new ArrayList<>();
        List<Calculator> calculators = new ArrayList<>();
        int chSize = numbers.size() / numThreads;
        for (int i = 0; i < numThreads; i++) {
 
            	int start = i * chSize;
            	int end = (i == numThreads - 1) ? numbers.size() : (i + 1) * chSize;
            
            	List<Integer> chunk = numbers.subList(start, end);
            	Calculator calculator = new Calculator(chunk);
            	Thread thread = new Thread(calculator);
            	
            	threads.add(thread);
            	calculators.add(calculator);
            	thread.start();
        }

        // очікування на завершення відведеного часу
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            
        }

        // зупинка потоків
        for (Thread thread : threads) {
            thread.interrupt();
        }

        int count = 0;
        double sum = 0;
        for (Calculator calculator : calculators) {
            count += calculator.getCnt();
            sum += calculator.getSum();
        }
        double average = sum / count;

        System.out.println("Average: " + average);
	}
}
		
```
## Варіанти використання
Для розрахунків
## Висновки
На цій лабораторній роботі навчились розробці програм з моделлю потоків Java.
