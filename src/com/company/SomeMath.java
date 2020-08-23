package com.company;

public class SomeMath {

    public static void main(String[] args) {
	/**
	 * In this program, you will create three methods and call them from ```main```
	 * with the specified parameters. Your solution must be in a Java file called
	 * ```SomeMath```.
	 * 
	 * 1. Create a method called ```total5```. This method must take 5 int
	 * parameters and return the total. You must call the method with the following
	 * parameters and print the returned total to the screen: 1, 2, 3, 4, 5. 1.
	 * Create a method called ```average5```. This method must take 5 int parameters
	 * and return the average of the numbers as a double. You must call the method
	 * with the following parameters and print the returned average to the screen:
	 * 1, 3, 5, 7, 9. 1. Create a method called ```largest5```. This method must
	 * take 5 double parameters and return the largest. You must call the method
	 * with the following parameters and print the returned value to the screen:
	 * 42.0, 35.1, 2.3, 40.2, 15.6.
	 */

	int total = total5(1, 2, 3, 4, 5);
	System.out.println(total);

	double average = average5(1, 3, 4, 7, 9);
	System.out.println(average);

	double largest = largest5(42.0, 35.1, 2.3, 40.2, 15.6);
	System.out.println(largest);
    }

    private static double largest5(double d, double e, double f, double g, double h) {
	double[] arr = { d, e, f, g, h };
	double largest = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] > largest ) {
		largest = arr[i];
	    }
	}
	return largest;
    }

    private static double average5(int i, int j, int k, int l, int m) {
	int total = total5(i, j, k, l, m);
	double average = total / 2;
	return average;
    }

    private static int total5(int i, int j, int k, int l, int m) {
	return i + j + k + l + m;
    }

}
