package java8Program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringWordCountProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
	        Map<String,Long> namesCount = names
	                                .stream()
	                                .collect(
	                                 Collectors.groupingBy(
	                                   Function.identity()
	                                 , Collectors.counting()
	                                 ));
	        
	        System.out.println(namesCount);
	        
	       
	        
			 List<Integer> num1 = Arrays.asList(1, 2, 3);
			 List<Integer> num2 = Arrays.asList(3, 4, 5);

	        num1.stream().filter(num2::contains).forEach(System.out::println);
	        
	        
	      List<String> list =   Stream.of("one", "two", "three", "four")
	        .filter(e -> e.length() > 3)
	        .peek(e -> System.out.println("Filtered value: " + e))
	        .map(String::toUpperCase)
	        .peek(e -> System.out.println("Mapped value: " + e))
	        .collect(Collectors.toList());
	      
	      System.out.println(list);
	      
	      
	      String str1 = "I am doing interview at ePAM I work for EPAM bla bla Bla" ;
	      
	   //   "[^a-zA-Z0-9]+"
	      
	     /* List<String> wordsList = Arrays.asList(str1.split("[^a-zA-Z0-9]+"));
	      Map<String, Long> wordFrequency = wordsList.stream() //.map(word -> word.toLowerCase())
	              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/
	      
	      List<String> wordsList1 = Arrays.asList(str1.split(""));
	      
	      Map<String, Long> wordFrequency1 = wordsList1.stream().filter(st -> !st.equals(" "))
	              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	  	
	  	System.out.println(wordFrequency1);
	      
	      
	     
	      
	      
}
}
