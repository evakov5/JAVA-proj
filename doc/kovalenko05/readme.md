# 5. Розробка власних контейнерів. Ітератори
## Тема
* Набуття навичок розробки власних контейнерів.
* Використання ітераторів.
## 1. Вимоги
Розробити клас-контейнер, що ітерується для збереження початкових даних завдання л.р. №3 у вигляді масиву рядків з можливістю додавання, видалення і зміни елементів.

В контейнері реалізувати та продемонструвати наступні методи:

* String toString() повертає вміст контейнера у вигляді рядка;
* void add(String string) додає вказаний елемент до кінця контейнеру;
* void clear() видаляє всі елементи з контейнеру;
* boolean remove(String string) видаляє перший випадок вказаного елемента з контейнера;
* Object[] toArray() повертає масив, що містить всі елементи у контейнері;
* int size() повертає кількість елементів у контейнері;
* boolean contains(String string) повертає true, якщо контейнер містить вказаний елемент;
* boolean containsAll(Container container) повертає true, якщо контейнер містить всі елементи з зазначеного у параметрах;
* public Iterator<String> iterator() повертає ітератор відповідно до Interface Iterable.

В класі ітератора відповідно до Interface Iterator реалізувати методи:

* public boolean hasNext();
* public String next();
* public void remove().

Продемонструвати роботу ітератора за допомогою циклів while и for each.

Забороняється використання контейнерів (колекцій) і алгоритмів з Java Collections Framework.


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
* Виклики в класі Main
  
```c 
public class Main {

	public static void main(String[] args) {
			
		StringContainer container = new StringContainer();
		container.add(new String("Let`s"));
		container.add(new String("explore"));
		container.add(new String("eemm"));
		container.add(new String("solutions"));
		
		System.out.println(container);
		System.out.println(container.size());
		System.out.println(container.get(0));
		System.out.println(container.set(2, "a few"));
		System.out.println(container);
		System.out.println(container.contains("a few"));
		
		StringArrayIterator itr = new StringArrayIterator(container);
		while(itr.hasNext())
            System.out.println(itr.next()); 
	}
}
```
  
* Вивід результату програми у термінал:
  
```c 
[Let`s, explore, eemm, solutions]
4
Let`s
eemm
[Let`s, explore, a few, solutions]
true
Let`s
explore
a few
solutions

```

### 2.1 Засоби ООП
  
* Java code convention
* JDK:
* Ітератор

### 2.2 Ієрархія та структура класів
* Main

### 2.3 Важливі фрагменти програми:
Класс контейнеру та ітератора

```c
public class Main {
	
class StringContainer {
	private String[] array = new String[0];
	
	/** 
	 * Adds to container new element 
	 * @param text string
	 * */
	
	public void add(String element) {
		String[] old = array;
		array = new String[old.length + 1];
		for(int i = 0; i < old.length; ++i)
			array[i] = old[i];
		array[old.length] = element;
	}
	
	public String toString() {
		return Arrays.toString(array);
	}
	
	/** 
	 * Defines size of container
	 * @return size of array
	 * */
	
	public int size() {  
		return array.length;
	}
	
	/** 
	 * Clears container from elements 
	 * */
	
	public void clear() { 
		array = new String[0];
	}
	
	/** 
	 * Gets element of container using index
	 * @return element of array
	 * @param int index 
	 * */
	
	public String get(int index) { 
		return array[index];
	}
	
	/** 
	 * Set determined element of container with new text
	 * @return old element
	 * @param int index, text String
	 * */
	
	public String set(int index, String element) {
		String old = array[index];
		array[index] = element;
		return old;
	}	
	
	public Object[] toArray() {
		String[] arr = new String[array.length]; 
		for (int i = 0; i < array.length; ++i) {
			arr[i] = array[i];
		}
		return arr;		
	}
	
	
	public boolean contains(String string) {
		boolean res = false;
		for(int i = 0; i < array.length; i++) {
			if (array[i] == string) {
				res = true;
			} 	
		}
		return res;
	}
		
	public Iterator<String> iterator() {
		return new StringArrayIterator(null);
		}
		    	
}
	
	class StringArrayIterator implements Iterator<String>{
	
	StringContainer list;
    int index = 0;
	
    public StringArrayIterator(StringContainer list) {
        this.list = list;
    }
    
    public boolean hasNext() {
        return index < list.size();  
   }
    
    @Override
    public String next() {
        if (hasNext())
            return list.get(index++);
        throw new NoSuchElementException();
    }
}
	
```
## Варіанти використання
Демонстрація роботи ітератора
## Висновки
На цій лабораторній роботі навчились працювати з контейнерами та ітераторами
 
