package com.company;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = s.nextInt();
	if (num % 3 == 0 && num % 5 == 0) {
	    System.out.println("FIZZBUZZ");
	} else if (num % 3 == 0) {
	    System.out.println("FIZZ");
	} else if (num % 5 == 0) {
	    System.out.println("BUZZ");
	}
	s.close();
    }
}
