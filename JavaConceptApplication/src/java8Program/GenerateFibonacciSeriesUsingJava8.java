package java8Program;

import java.util.stream.Stream;

public class GenerateFibonacciSeriesUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]}) // 1. Iterate fibonacci number
	        .limit(7) // 2. limit to 10 Integer numbers
	        .map(n -> n[0]) // get 0th index from Arrays of size-2
	        .forEach(fibNum -> System.out.print(fibNum + " ")); // 3. print to console

		 
	}

}
