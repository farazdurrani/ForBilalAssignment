package com.company;

import java.util.Scanner;

public class YourAgeCan {
    public static void main(String[] args) {
	/**
	 * Write a program that asks the user's age and then prints out whether that
	 * person can: Vote (18+) Drink alcohol (21+) Be president (35+) Is eligible for
	 * AARP (55+) Can retire (65+) Is an octogenerian (80-89) Is more than a century
	 * old (100+)
	 * 
	 */
	Scanner s = new Scanner(System.in);
	int age = s.nextInt();
	if (age >= 18 && age < 21) {
	    System.out.println("vote");
	} else if (age >= 21 && age < 35) {
	    System.out.println("alcohal");
	} else if (age >= 35 && age < 55) {
	    System.out.println("president");
	} else if (age >= 55 && age < 65) {
	    System.out.println("aarp");
	} else if (age >= 65 && age < 80) {
	    System.out.println("retire");
	} else if (age >= 80 && age < 90) {
	    System.out.println("octogenerian");
	} else if (age > 99) {
	    System.out.println("century");
	}

	s.close();
    }
}
