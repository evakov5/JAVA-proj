package ua.khpi.oop.kovalenko06;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class S_interface {
	Scanner scanner = new Scanner(System.in);
	private static String text;
	private static String textres;
	
	
	private boolean Options(String values) {
        boolean result = false;
        switch (values) {
            case "1":
            	Changes ch2 = new Changes();           
            	try (FileOutputStream fs = new FileOutputStream("out.dat");
            	    	ObjectOutputStream oos = new ObjectOutputStream(fs)){
            			oos.writeObject(ch2);
        	    		System.out.println("Done...");
            	    } catch (IOException ex) {
            	    	ex.printStackTrace(System.out);
            	    }
            	break;
            case "2": 
				System.out.println("Введіть текст для редагування: ");
				text = scanner.nextLine();
				break;
			case "3":
				System.out.println(text);
				break;
			case "4":
				textres = Changes.change(text);
			case "5":
				System.out.println("Результат редагування: " + textres);
				break;
			case "6":
                System.exit(0);
                break;           
			 default:
	                System.out.println("Ви ввели некоректне значення.");
        }
        return result;
    }
		
	/** 
	 * Starts program with several offers to user
	 * 
	 * */
	
	public void begin() {
		System.out.println("Виберіть одну з команд:");
		System.out.println("1: Cериалізація");
		System.out.println("2: Ввести дані");
		System.out.println("3: Переглянути дані");
		System.out.println("4: Виконати завдання");
    	System.out.println("5: Відобразити результат");
    	System.out.println("6: Вийти з програми");
		String choice = scanner.nextLine();
		if(Options(choice)) {
			System.out.println("Запрос виконан.");
			}
		else
			begin();
				
		}
	}
	

	