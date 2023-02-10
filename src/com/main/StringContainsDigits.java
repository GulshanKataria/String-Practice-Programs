package com.main;

public class StringContainsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// check whether string only contains digits

		String s1 = "12335";

		char temp;

		boolean flag = true;

		// Approach 1 using traversing the entire sting and checking

		for (int i = 0; i < s1.length(); i++) {

			temp = s1.charAt(i);

			if (temp < '0' || temp > '9') {
				flag = false;

			}

		}
		if (flag) {
			System.out.println("All are digits");
		} else {
			System.out.println("Contains a character");
		}

		// Second approach would be to use Character.isDigit()

	}

}
