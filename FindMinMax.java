package week1.day2;

import java.util.Arrays;

public class FindMinMax {
  
	public static void main(String[] args) {
		
		// Goal: to understand the array, sort
		
		int[] numbers = {20, 50, -2, -7, 90, 345, -40};
		Arrays.sort(numbers);
		
		int length = numbers.length;
		
		System.out.println("Minimum value: "+numbers[0]);
		System.out.println("Maximum value: "+numbers[length-1]);
			
	}
}
