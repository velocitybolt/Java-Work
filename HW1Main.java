/*
 * CSC 301 Sections 402, 411, 701, 710 Fall 2017
 * Homework assignment 1
 * 
 * The HW1Test class performs various test calls on the 4 methods
 * that you will write for this assignment in the HW1.java file.  
 * When your code is properly completed, the output of the code
 * below should be
 * 
0 features
balanced
3 1 0
true
false
1 
10 
100 
1000 
10000 

*/

package hw1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HW1Main {

	public static void main(String[] args) {

		// these are used for the instance methods in this assignment
		HW1<Integer> hw1Int = new HW1<Integer>();
		HW1<String>  hw1Str= new HW1<String>();
		
		// data items to be used in the test calls to your code
		Integer myPhone[] = {3, 1, 2, 3, 6, 2, 6, 1, 0, 6};
		String hw1Topic[] = { "review", "of", "java", "language", "features"};
		String csc301Topic[] = {"topics", "include", "balanced", "binary", "search", "trees"};
		List<Integer> phoneList = Arrays.asList(myPhone);
		List<String> hw1List = Arrays.asList(hw1Topic);
		LinkedList<String> topicList = new LinkedList<String>();
		for (String word : csc301Topic)
			topicList.add(word);

		// problem 1
		System.out.print(hw1Int.smallest(myPhone) + " ");
		System.out.println(hw1Str.smallest(hw1Topic));
		System.out.println(hw1Str.smallest(csc301Topic));

		// problem 2
		System.out.print(hw1Int.occurrences(6, phoneList));
		System.out.print(" " + hw1Str.occurrences("java", hw1List));
		System.out.println(" " + hw1Str.occurrences("programming", topicList));
		
		// problem 3
		Integer[] prefix = {3, 6, 2};
		System.out.println(hw1Int.subSequence(prefix, myPhone));
		String[] java = { "java ", "features "};
		System.out.println(hw1Str.subSequence(java, hw1Topic));


		// problem 4
		Iterable<Integer> p = HW1.powersOfN(10, 4);
		for (Integer i : p) {
			System.out.print(i + " ");
			System.out.println();
		}
	}
}
