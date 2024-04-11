package java8Program;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByKeysProgram {

	public static void main(String[] args) {
		
		Map<String, Integer> studentMap = new HashMap<String, Integer>();

		studentMap.put("Jyous", 87);
		studentMap.put("Klusener", 82);
		studentMap.put("Xiangh", 91);
		studentMap.put("Lisa", 89);
		studentMap.put("Narayan", 95);
		studentMap.put("Arunkumar", 86);

		Map<String, Integer> sortedStudentMap = studentMap.entrySet().stream().sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));

		Map<String, Integer> sortedStudentMap1 = studentMap.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByKey()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
		
		Map<String, Integer> sortedStudentMap2 = studentMap.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));

		
		studentMap.entrySet().stream().forEach( ent -> System.out.println( ent.getKey()+"----"+ent.getValue() ));
		System.out.println("Before Sorting : ");

		System.out.println(studentMap);

		System.out.println("After Sorting : ");

		System.out.println(sortedStudentMap);
		
		System.out.println(sortedStudentMap1);
		
		System.out.println("comparingByValue = "+sortedStudentMap2);
		
	}
}
