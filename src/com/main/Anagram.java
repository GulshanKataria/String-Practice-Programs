package com.main;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "abcd";

		String s2 = "dcba";

		// Approach 1 : sort both the strings and check whether they are equal

		char[] arr1 = s1.toCharArray();

		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);

		Arrays.sort(arr2);

		// Arrays.equals(arr1,arr2) : this can be used

		String result1 = new String(arr1);

		String result2 = new String(arr2);

		if (result1.equals(result2)) {
			System.out.println("both are anagrams");

		} else {
			System.out.println("Not a anagram");
		}

	}

}
