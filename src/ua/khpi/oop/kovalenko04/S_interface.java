package ua.khpi.oop.kovalenko04;
import java.util.Scanner;

/** 
 * Create a simple interface for required goal
 * 
 * */

public class S_interface {
	Scanner scanner = new Scanner(System.in);
	private static String text;
	private static String textres;
	Changes ch2 = new Changes();
	
	/** 
	 * Method to output useful information about program
	 * 
	 * */
	
	public void help() {
    	System.out.println("Author: Kovalenko Yeva KN-921v\n");
    	System.out.println("1: Введення даних");
    	System.out.println("2: Перегляд даних");
    	System.out.println("3: Виконання завдання");
    	System.out.println("4: Відображення результату");
    	System.out.println("5: Вихід з програми");
    	System.out.println("Завдання: Використовуючи програму рішення завдання лабораторної роботи №3, "
    			+ "відповідно до прикладної задачі забезпечити обробку "
    			+ "команд користувача у вигляді текстового меню.");
    	System.out.println("-h чи -help: відображаеється інформація про програму, її призначення та команди");
    	System.out.println("-d чи -debug: в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми");
    	}
	
	public void deb() {
		Changes.change(text);
	}
	
	/** 
	 * Uses input of user as a command
	 * 
	 * */
	
	private boolean Options(String opt) {
		boolean res = false;
		switch(opt) {
			case "-h":
			case "-help":
				help();
				break;
			case "-d":
			case "-debug":
				deb();
				break;
			case "1": 
				System.out.println("Введіть текст для редагування: ");
				text = scanner.nextLine();
				break;
			case "2":
				System.out.println(text);
				break;
			case "3":
				textres = Changes.change(text);
				break;
			case "4":
				System.out.println("Результат редагування: " + textres);
				break;
			case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Ви ввели некоректне значення.");
		}
		
		return res;
	}
	
	/** 
	 * Starts program with several offers to user
	 * 
	 * */
	
	public void begin() {
		System.out.println("Виберіть одну з команд:");
		System.out.println("1: Ввести дані");
		System.out.println("2: Переглянути дані");
		System.out.println("3: Виконати завдання");
    	System.out.println("4: Відобразити результат");
    	System.out.println("5: Вийти з програми");
    	System.out.println("-h чи -help: відобразити інформацію о програмі");
    	System.out.println("-d чи -debug: в процесі роботи");
		String choice = scanner.nextLine();
		if(Options(choice)) {
			System.out.println("Запрос виконан.");
			}
		else
			begin();
				
		}
	}
	
