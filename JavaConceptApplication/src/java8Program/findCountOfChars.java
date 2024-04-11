package java8Program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findCountOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "string data to count each character";
		
		Map<String, Long> map = Arrays.stream(s.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors
                .groupingBy(str -> str, 
                  LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(map);
		
	Map<String,Long> test =	Arrays.stream(s.split("")).map(String::toLowerCase).
			collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	String st = "aabbccdd";
	
	String str = Arrays.stream(st.split("")).distinct().collect(Collectors.joining(""));
		
		System.out.println(test);
		
		}
	
	
	
		
		

}
