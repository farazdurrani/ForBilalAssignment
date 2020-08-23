package com.company;

import java.util.Scanner;

public class UltimateQuestion {
    public static void main(String[] args) {
	/**
	 * Write a program that continues to ask for input between 1 and 100 until the
	 * user enters 42. Once they do, print "That's the number I was looking for! 42
	 * is definitely the answer!"
	 */

	Scanner s = new Scanner(System.in);

	while (true) {
	    System.out.println("Enter a number between 1 and 100");
	    int input = s.nextInt();
	    if (input >= 1 && input <= 100) {
		if (input == 42) {
		    System.out.println(
		        "That's the number I was looking for! 42 is definitely the answer!");
		    break;
		}
	    } else {
		break;
	    }
	}

	s.close();
    }
}
