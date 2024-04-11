package java8Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.sound.midi.ControllerEventListener;

public class SortValues {

	public static void main(String args[]) {

		// Given a list of integers, sort all the values present in it using Stream
		// functions?

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
		List<Integer> l = Arrays.asList(10,5,2,4,6,7,8);
		
	//	l.stream().sorted().forEach(System.out::println);
		
		// l.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		 l.stream().sorted().forEach(System.out::println);


	//	myList.stream().sorted().forEach(System.out::println);

		// Given a list of integers, sort all the values present in it in descending
		// order using Stream functions?

	//	myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}
}
