package java8Program;

import java.util.Optional;

public class OptionalExample {

	 public static void main(String[] args) {  
	        
		 String[] str = new String[10]; 
		 
		 str[2] = "check value for string";
	        
	        Optional<String> checkNull = Optional.ofNullable(str[5]);
	        
	     //   checkNull.ifPresent(System.out::println);
	     //   System.out.println(checkNull.get());
	     //   System.out.println("Filtered value: "+checkNull.filter((s)->s.equals("Abc")));  
	       System.out.println("checkNull "+checkNull);	
	       
	     
	        
	    }  
}
