package java8Program;

import java.util.ArrayList;
import java.util.List;

public class findnextinsequence {

	private static int arr1[] = { 20, 23, 24, 25, 28, 30, 31, 32, 45 };

	private static int findnextinseq(int start) {
		int next = -1;

		for (int i = 0; i < arr1.length; i++) {
			if ((start - arr1[i]) == -1) {
				next = arr1[i];
			}
		}

		return next;
	}

	public static void main(String[] args) {

		for (int i = 0; i < arr1.length; i++) {

			List<Integer> sequence = new ArrayList<Integer>();
			int nextsequence = arr1[i];
			do {
				sequence.add(nextsequence);
				nextsequence = findnextinseq(nextsequence);
			} while (nextsequence != -1);

			System.out.print(sequence);
		}
	}
}
