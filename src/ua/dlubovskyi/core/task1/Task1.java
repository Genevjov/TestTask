package ua.dlubovskyi.core.task1;

/**
 * Getting quantity of brackets sequence
 * 
 * @author Dlubovskyi Oleg
 *
 */
public class Task1 {
	/**
	 * Method for getting quantity of brackets sequence using formula 
	 * 	   n-1 
	 * d[i] = E d[i]*d[i - 1 - j] 
	 * 	   i=0
	 * 
	 * @param num -number to find
	 */
	public static void executeFirstTask(int num) {
		// validation
		if (num < 1) {
			System.out.println(-1);
		}
		// array length will eq = num +1
		int[] array = new int[num + 1];
		// init default values cause we can't get less than 1 variant with value more
		// than 0
		array[0] = 1;
		// count
		for (int i = 1; i <= num; i++) {
			// count for each element before number
			for (int j = 0; j <= i - 1; j++) {
				// using formula and setting count of varints for this number
				array[i] += array[j] * array[i - 1 - j];
			}
		}
		System.out.println(array[num]);
	}
}
