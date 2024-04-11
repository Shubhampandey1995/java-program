package java8Program;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateBiPredicate {
	public static void main (String args[]) {
		
	   	Predicate<Integer> predict = (a) -> (a%2 == 0);
	   	
		   System.out.println(predict.test(2));
		   
	   BiPredicate<Integer, Integer> bi = (a,b) -> ( a % b == 0);
	   
	  System.out.println(bi.test(10,3));
	   
	      BiPredicate<Integer, Integer> biPredicate1 = (n1, n2) -> (n1 % n2 == 0);
	      BiPredicate<Integer, Integer> biPredicate2 = (n1, n2) -> (n1 * n2 > 100);
	      System.out.println(biPredicate1.and(biPredicate2).test(10, 5)); // false
	      
	      BiPredicate<String, String> biPredicate3 = (s1, s2) -> s1.startsWith(s2);
	      BiPredicate<String, String> biPredicate4 = (s1, s2) -> s1.endsWith(s2);
	      System.out.println(biPredicate3.and(biPredicate4).test("Java", "J")); 
	        // false
	      System.out.println(biPredicate3.and(biPredicate4).test("CODEC", "C")); 
	        // true

		   
	   }
}
