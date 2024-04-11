package java8Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String args[]) {

		// How to find duplicate elements in a given integers list in java using Stream
		// functions?

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		Set<Integer> set = new HashSet();

		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		System.out.println(set);
		
		//myList.stream().filter(t -> set.add(t)).forEach(System.out::println);

		
	Map<Integer, Long> name = 	myList.stream().filter(st -> Collections.frequency(myList, st) > 1 ).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(name);

	
	}
}
