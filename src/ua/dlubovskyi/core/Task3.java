package ua.dlubovskyi.core;

import java.math.BigInteger;

/**
 * 
 * @author Dlubovskyi Oleg
 *
 */
public class Task3 {
	/**
	 * 
	 * @param num -number for counting sum
	 */
	public static void executeTask3(int num) {
		// temp string with num digits
		String number = (getFactorial(num) + "");
		// result of num digits sum
		int res = 0;
		// count sum of digits
		for (int i = 0; i < number.length(); i++)
			// convert char to int and add to result value
			res += Character.getNumericValue(number.charAt(i));
		System.out.println(res);
	}

	/**
	 * Method for getting factorial
	 * 
	 * @param num -number for factorial count
	 * @return factorial of number param
	 */
	private static BigInteger getFactorial(int num) {
		// container for factorial count
		BigInteger result = BigInteger.ONE;
		// count factorial
		for (int i = 1; i <= num; i++)
			// covert int to BigInteger and multiply with result
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}
}
