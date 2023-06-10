package ua.khpi.oop.kovalenko13;

import java.util.List;

public class Calculator implements Runnable{
	
	  private final List<Integer> numbers;
	  private int cnt;
	  private double sum;
	  
	  public Calculator(List<Integer> numbers) {
	        this.numbers = numbers;
	    }
	  
	  public int getCnt() {
	        return cnt;
	  }

	    public double getSum() {
	        return sum;
	  }
	    
	   @Override
	    public void run() {
	        for (Integer number : numbers) {
	            if (Thread.interrupted()) {
	                return; 
	            }
	            cnt++;
	            sum += number;
	        }
	    }  
}