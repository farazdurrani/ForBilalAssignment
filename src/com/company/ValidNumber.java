package com.company;

import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {
	/**
	 * The program must do the following: 1. Prompt the user to enter a number
	 * between 1 and 10. 1. If the user enters a number less than 1 or greater than
	 * 10, display the following error message and prompt the user for another
	 * entry: "You must enter a number between 1 and 10, please try again." 1. When
	 * the user enters a valid number, print the number to the screen and exit.
	 */
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number between 1 and 10 please");
	while (true) {
	    int num = scanner.nextInt();
	    if (num < 1 || num > 10) {
		System.out
		    .println("You must enter a number between 1 and 10, please try again.");
	    } else {
		System.out.println(num);
		break;
	    }
	}
	scanner.close();
    }

}
