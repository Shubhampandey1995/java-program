package java8Program;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

	// Given a String, find the first non-repeated character in it using Stream
	// functions?

	public static void main(String args[]) {
		
		String input = "Java articles are Awesome";

		Character nonRepetedCharresult = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();

		System.out.println(nonRepetedCharresult);
		
		Character firstRepetedCharresult = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();

		System.out.println(firstRepetedCharresult);
		
		
		input.chars().mapToObj(st -> Character.toLowerCase(Character.valueOf((char) st)))
		   .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		                .entrySet().stream().filter(entry -> entry.getValue() > 1l)
		                .forEach( entry -> {

		            System.out.println("key = "+entry.getKey() +"--------"+entry.getValue());
		        });	

		/*
		 * input.chars().mapToObj(st -> Character.toLowerCase(Character.valueOf((char)
		 * st))) .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
		 * Collectors.counting())) .entrySet().stream().filter(entry -> entry.getValue()
		 * > 1l) .forEach( entry -> {
		 * 
		 * System.out.println("key = "+entry.getKey() +"--------"+entry.getValue()); });
		 * }
		 */

	}
}
