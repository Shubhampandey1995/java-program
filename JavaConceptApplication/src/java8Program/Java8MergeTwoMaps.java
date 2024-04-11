package java8Program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MergeTwoMaps {

	public static void main(String[] args) {
		// Map-1

		HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();

		subjectToStudentCountMap1.put("Maths", 45);
		subjectToStudentCountMap1.put("Physics", 57);
		subjectToStudentCountMap1.put("Chemistry", 52);
		subjectToStudentCountMap1.put("History", 41);

		// Map-2

		HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();

		subjectToStudentCountMap2.put("Economics", 49);
		subjectToStudentCountMap2.put("Maths", 42);
		subjectToStudentCountMap2.put("Biology", 41);
		subjectToStudentCountMap2.put("History", 55);

		// Merging Map-1 and Map-2 into Map-3
		// If any two keys are found same, their values are added

		HashMap<String, Integer> subjectToStudentCountMap3 = new HashMap<>(subjectToStudentCountMap1);

		// System.out.println("Map 3 : "+subjectToStudentCountMap3);

		subjectToStudentCountMap2
				.forEach((key, value) -> subjectToStudentCountMap3.merge(key, value, (v1, v2) -> v1 + v2));

		HashMap<String, Integer> map4 = Stream
				.concat(subjectToStudentCountMap1.entrySet().stream(), subjectToStudentCountMap2.entrySet().stream())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1 > v2 ? v1 : v2, HashMap::new));

		HashMap<String, Integer> subjectToStudentCountMap5 = Stream
				.of(subjectToStudentCountMap1, subjectToStudentCountMap2).flatMap(map -> map.entrySet().stream())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, Integer::sum, HashMap::new));


		System.out.println("Map 1 : " + subjectToStudentCountMap1);

		System.out.println("Map 2 : " + subjectToStudentCountMap2);

		System.out.println("Map 3 : " + subjectToStudentCountMap3);

		System.out.println("Map 4 : " + map4);
		
		System.out.println("Map 5 : " + subjectToStudentCountMap5);

	}
}
