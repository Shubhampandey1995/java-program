package java8Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicateArray {

	public static void main(String args[]) {

		// Given an integer array nums, return true if any value appears at least twice
		// in the array, and return false if every element is distinct.

		int[] nums = { 1, 2, 3, 5 ,2 };
		boolean res = false;

		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			res = false;
		} else {
			res = true;
		}

		System.out.println("contain dulicate value = " + res);
	}

}
