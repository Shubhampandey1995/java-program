package java8Program;

import java.util.Arrays;

public class String2ArrayProgram {

	public static void main(String[] args) {
		String[][] arr = { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		Arrays.stream(arr).flatMap(Arrays::stream).filter(s -> !s.equals("a")).forEach(System.out::println);
		
		
		Arrays.stream(arr).flatMap(Arrays::stream).filter(s-> !s.equals("a")).forEach(System.out::println);;

	}

}
