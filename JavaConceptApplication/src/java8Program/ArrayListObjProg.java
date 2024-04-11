package java8Program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ArrayListObjProg {

	public static void main(String[] args) {

		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 8));
		noteLst.add(new Notes(3, "note3", 44));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 44));
		noteLst.add(new Notes(6, "note4", 66));

		Map<Integer, String> notesRecords = noteLst.stream()
				.sorted(Comparator.comparing(Notes::getTagName))
				.collect(Collectors.toMap(Notes::getTagValue, Notes::getTagName, (oldValue, newValue) -> oldValue, TreeMap::new));
		// consider old value 44 for dupilcate key
		// it keeps order
		System.out.println("Notes : " + notesRecords);
		
	/*	
	Map<String,Integer> map =	noteLst.stream().sorted(Comparator.comparingLong(Notes::getTagValue))
			.collect(Collectors.toMap(Notes::getTagName, Notes::getTagValue , (k,v)-> v ,LinkedHashMap::new));
	 System.out.println(map);*/
	}

}
