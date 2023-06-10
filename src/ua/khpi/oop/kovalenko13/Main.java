package ua.khpi.oop.kovalenko13;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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