# 10. Обробка параметризованих контейнерів
## Тема
Розширення функціональності параметризованих класів.
## 1. Вимоги
* Розробити параметризовані методи (Generic Methods) для обробки колекцій об'єктів згідно прикладної задачі.

* Продемонструвати розроблену функціональність (створення, управління та обробку власних контейнерів) в діалоговому та автоматичному режимах.

  ** Автоматичний режим виконання програми задається параметром командного рядка -auto. Наприклад, java ClassName -auto.

  ** В автоматичному режимі діалог з користувачем відсутній, необхідні данні генеруються, або зчитуються з файлу.

* Забороняється використання алгоритмів з Java Collections Framework.

### 1.1 Розробник
* Коваленко Єва Олексіївна
* КН-921в
* 7 варіант
### 1.2 Загальне завдання
Аудіотека. Сортування за назвою композиції, за виконавцем, за середнім значенням рейтингу.
### 1.3 Задача
Вище у вимогах
## 2. Опис програми
* Вивід у консоль
відсутній
### 2.1 Засоби ООП
* Java code convention
* JDK:
* OOP
### 2.2 Ієрархія та структура класів
* Main
* Audioteka
* AudiotekaContainer
### 2.3 Важливі фрагменти програми:
```c
// sort by name of song
	public <T extends Comparable<T>> void sortBySongName(List<Audioteka> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getName().compareTo(v2.getName());
            return ascending ? result : -result;
        });
    }
	
	// sort by rating
    public <T extends Comparable<T>> void sortByRating(List<Audioteka> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = Boolean.compare(v1.getR() > v2.getR(), false);
            return ascending ? result : -result;
        }); }
    
	// sort by authors
	public <T extends Comparable<T>> void sortByAuthor(List<Audioteka> list, boolean ascending) {
        list.sort((v1, v2) -> {
            int result = v1.getAuthors().compareTo(v2.getAuthors());
            return ascending ? result : -result;
        });
```

## Варіанти використання
Демонстрація роботи параметризованих контейнерів
## Висновки
На цій лабораторній роботі навчились працювати з параметризованими контейнерами

