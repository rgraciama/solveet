package com.solveet.kata.tdd.java;

public class FizzBuzz {

	public static String getAnswerFor(int num) {
		if (isMultipleOfFive(num) && isMultipleOfThree(num)) {
			return "FizzBuzz";
		} else if (isMultipleOfThree(num)) {
			return "Fizz";
		} else if (isMultipleOfFive(num)) {
			return "Buzz";
		}
		return String.valueOf(num);
	}

	private static boolean isMultipleOfThree(int num) {
		return num % 3 == 0;
	}

	private static boolean isMultipleOfFive(int num) {
		return num % 5 == 0;
	}

}
