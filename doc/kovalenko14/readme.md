# 14. Multithreading. Ефективність використання
## Тема
Вимірювання часу паралельних та послідовних обчислень.
Демонстрація ефективності паралельної обробки.
## 1. Вимоги
* Забезпечити вимірювання часу паралельної обробки елементів контейнера за допомогою розроблених раніше методів.

* Додати до алгоритмів штучну затримку виконання для кожної ітерації циклів поелементної обробки контейнерів, щоб загальний час обробки був декілька секунд.

* Реалізувати послідовну обробку контейнера за допомогою методів, що використовувались для паралельної обробки та забезпечити вимірювання часу їх роботи.

* Порівняти час паралельної і послідовної обробки та зробити висновки про ефективність розпаралелювання:

  * результати вимірювання часу звести в таблицю;
  * обчислити та продемонструвати у скільки разів паралельне виконання швидше послідовного.
### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
Порівняти час паралельної і послідовної обробки та зробити висновки про ефективність розпаралелювання.
### 1.3 Задача
Вище у вимогах
## 2. Опис програми
### 2.1 Засоби ООП
* Java code convention
* JDK:
* OOP
### 2.2 Ієрархія та структура класів
* Main
### 2.3 Важливі фрагменти програми:
* Main

```c
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	
		List<Integer> container = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            container.add(random.nextInt(100));
        }
        
        // Parallel
        long startTime_P = System.currentTimeMillis();
        container.parallelStream().forEach(element -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long endTime_P = System.currentTimeMillis();
        long Time_P = endTime_P - startTime_P;
        System.out.println("Parallel Time: " + Time_P + " ms");
        
        //Sequential
        long startTime_S = System.currentTimeMillis();
        for (Integer element : container) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime_S = System.currentTimeMillis();
        long Time_S = endTime_S - startTime_S;
        System.out.println("Sequential Time: " + Time_S + " ms");
        
        
        if ((Time_S) == 0) {
            System.out.println("Sequential processing took less than 1ms, so parallelization efficiency cannot be calculated.");
        } else {
            double efficiency = (double) (Time_P) / (double) (Time_S);
            System.out.println("Efficiency of parallelization: " + efficiency + " times faster than sequential processing.");
        }

    }
}
		
```
## Варіанти використання
## Висновки
Ми набули навичи у розробці програм з моделлю потоків Java.
