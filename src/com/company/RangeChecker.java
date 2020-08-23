package com.company;

import java.util.Scanner;

public class RangeChecker {
    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	while (true) {
	    System.out.println("Enter a number between 15 and 32 (not inclusive)");
	    int input = s.nextInt();
	    if (input >= 15 && input < 32) {
		System.out.println(input);
		break;
	    }
	}

	s.close();
    }
}
