package com.solveet.kata.tdd.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.solveet.kata.tdd.java.FizzBuzz;

public class FizzBuzzTest {
	@Test
	public void shouldReturnNumberIfNotDivisibleByThreeAndFive() {;
		assertEqualsAnswerFor(1, "1");
		assertEqualsAnswerFor(2, "2");
		assertEqualsAnswerFor(4, "4");
		assertEqualsAnswerFor(7, "7");
		assertEqualsAnswerFor(13, "13");
	}
	
	@Test
	public void shouldReturnFizzForMultiplesOfThree() {
		assertEqualsAnswerFor(3, "Fizz");
		assertEqualsAnswerFor(33, "Fizz");
		assertEqualsAnswerFor(129, "Fizz");
	}
	
	@Test
	public void shouldReturnBuzzForMultipleOfFive() {
		assertEqualsAnswerFor(5, "Buzz");
		assertEqualsAnswerFor(10, "Buzz");
		assertEqualsAnswerFor(5000, "Buzz");
	}
	
	@Test
	public void shouldReturnFizzBuzzForMultiplesOfThreeAndFive() {
		assertEqualsAnswerFor(15, "FizzBuzz");
		assertEqualsAnswerFor(1005, "FizzBuzz");
		assertEqualsAnswerFor(6000, "FizzBuzz");
	}
	

	private void assertEqualsAnswerFor(int num, String matcher) {
		assertEquals(FizzBuzz.getAnswerFor(num), matcher);
	}
	
}
