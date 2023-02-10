package com.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String s1 = "geeksforgeeks";

		// Approach 1 : using iterating every element and checking

		char[] arr = s1.toCharArray();
		char element;

		for (int i = 0; i < arr.length; i++) {
			int countOfRepeatedElements = 1;
			element = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == element) {
					countOfRepeatedElements++;
					arr[j] = '0';

				}

			}
			if (countOfRepeatedElements > 1 && arr[i] != '0') {
				System.out.println("Repeated element is " + arr[i]);

			}

		}

		System.out.println("-------------");

		// Approach 2 : Using Hash Map

		String s2 = "abcaabb";

		char[] arr1 = s2.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);

			} else {
				map.put(arr1[i], 1);
			}

		}

		Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			System.out.println("key is :" + entry.getKey());
			System.out.println("value is : " + entry.getValue());

		}

	}

}
