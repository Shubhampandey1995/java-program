package java8Program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfObjectValueSorting {

	 public static void main(String[] args) {

		    List<Notes> noteLst = new ArrayList<>();
		    noteLst.add(new Notes(10, "note1", 11));
		    noteLst.add(new Notes(2, "note2", 22));
		    noteLst.add(new Notes(8, "note3", 33));
		    noteLst.add(new Notes(47, "note4", 494));
		    noteLst.add(new Notes(58, "note5", 585));
		    noteLst.add(new Notes(67, "note4", 66));

		   // noteLst.forEach(System.out::println);
		    
		    System.out.println("==============================================");
		    
		 List<Notes> lst =  noteLst.stream().sorted(Comparator.comparing(Notes::getId).thenComparing(Notes::getTagValue))
		   .collect(Collectors.toList());
		 
		 noteLst.stream().sorted(Comparator.comparing(Notes::getTagValue)).collect(Collectors.toList()).forEach(System.out::println);
		 
		// lst.forEach(System.out::println);
		    
		    
		    

		    }
}
