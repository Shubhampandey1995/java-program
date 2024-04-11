package java8Program;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main (String args[]) {
		
		Consumer<String> c = (input) -> System.out.print(input);
		 c.accept("hello");
		 
	// take one argument and does not return value 	 
	}
}
