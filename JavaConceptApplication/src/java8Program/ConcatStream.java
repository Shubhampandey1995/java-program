package java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatStream {
	
	public static void main(String[] args) {
		 
	        List<String> list1 = Arrays.asList("Java", "8");
	        List<String> list2 = Arrays.asList("explained", "through", "programs");
	 
	        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
	         
	        // Concatenated the list1 and list2 by converting them into Stream
	 
	        concatStream.forEach(str-> System.out.print(str + " "));
	         
	        // Printed the Concatenated Stream
	        
	        
	       List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
	        String result = letters
	          .stream()
	          .reduce("", (partialString, element) -> partialString + element);
	       // assertThat(result).isEqualTo("abcde");
	        
	     String st =   letters.stream().reduce("", String::concat);
   
	       System.out.println(st);
	       
	       String s = "radar";
	       
	       String str = s.toLowerCase();
	       	       
	      boolean val = IntStream.range(0, s.length()/2).noneMatch(i -> s.charAt(i) != s.charAt(s.length()-i-1));
	      
	      System.out.println("pelindrome number==="+val);
	         
	    }
}
