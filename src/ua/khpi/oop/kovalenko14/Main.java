package ua.khpi.oop.kovalenko14;

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