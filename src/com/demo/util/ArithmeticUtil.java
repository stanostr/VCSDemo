package com.demo.util;

public class ArithmeticUtil {
	private ArithmeticUtil() {
	}

	/**
	 * Returns the sum of two integers
	 * 
	 * @param a first integer
	 * @param b second integer
	 * @return sum
	 */
	public static Integer sum(Integer a, Integer b) {
		return a + b;
	}

	/**
	 * Returns the difference of two integers
	 * 
	 * @param a the minuend
	 * @param b the subtrahend
	 * @return difference between a and b
	 */
	public static Integer difference(Integer a, Integer b) {
		return a - b;
	}

	/**
	 * Returns the product of two integers
	 * 
	 * @param a first integer
	 * @param b second integer
	 * @return product
	 */
	public static Integer product(Integer a, Integer b) {
		return a * b;
	}
	public static Integer division(Integer a, Integer b) {
		return a / b;
	}
}
