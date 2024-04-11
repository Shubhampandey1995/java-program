package java8Program;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
	//	myList.stream().map(s -> s + "") // Convert integer to String
		//		.filter(s -> s.startsWith("1")).forEach(System.out::println);

		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
		
		myList.stream().map(st -> st+"").filter(st -> st.startsWith("1")).forEach(System.out::println);

	}

}
