package com.company;

import java.util.Scanner;

public class PrimeFinder {

    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int ans = s.nextInt();
	for (int i = 1; i <= ans; i++) {
	    if (prime(i)) {
		System.out.println(i);
	    }
	}
	s.close();
    }

    public static boolean prime(int n) {
	if (n <= 1)
	    return false;
	for (int i = 2; i < n; i++)
	    if (n % i == 0)
		return false;

	return true;
    }

}
