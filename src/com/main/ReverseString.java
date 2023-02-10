package com.main;

import java.util.Stack;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "Test1";

		// Approach 1 : Traverse in Backward Direction O(n) approach
		String result = "";
		int n = s1.length();

		for (int i = n - 1; i >= 0; i--) {
			result += s1.charAt(i);
		}

		System.out.println(result);

		// Approach 2 : Convert into StringBuffer and use reverse()

		StringBuffer strbuffer = new StringBuffer(s1);

		strbuffer.reverse();

		System.out.println("Reversed string using string buffer is : " + strbuffer);

		// Approach 3 : Using Stack

		String s2 = "new";

		Stack<Character> stack = new Stack<Character>();

		char[] arr = s2.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}

		int k = 0;

		while (!stack.isEmpty()) {

			arr[k] = stack.pop();
			k++;
		}

		System.out.println("Reversed string using stack is :" + String.copyValueOf(arr));

		// Approach 4 : Reverse a string inPlace

		String temp = "abcd";

		char[] arr1 = temp.toCharArray();

		int i = 0;
		int j = temp.length() - 1;

		char tempVar;

		while (i <= j) {
			tempVar = arr1[j];
			arr1[j] = arr1[i];
			arr1[i] = tempVar;

		}

		System.out.println("reversed string using in place is : " + String.copyValueOf(arr1));

	}

}
