package java8Program;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main (String args[]) {
		
		BiConsumer<String, String> biConsumer = (a,b) -> { 
		   	   System.out.println("x: "+ a +", b: "+b);
		   	};
		        
		   	biConsumer.accept("Java8", "Implementation");
		   		
		   	BiConsumer<Integer, Integer> add = (a,b) -> {
		           System.out.println("Addition is: "+(a+b));
		   	};
		   	
		   	add.accept(10, 11);
		   		
		   	BiConsumer<Integer, Integer> subtract = (a,b) -> {
		   	   System.out.println("Subtraction is: "+(a-b));
		   	};
		   	add.andThen(subtract).accept(2,1);		
		   }
	}

