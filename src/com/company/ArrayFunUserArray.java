package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] userInput = new int[5];
	System.out.println("Please enter 5 digits 1 by 1");
	for (int i = 0; i < 5; i++) {
	    int num = scan.nextInt();
	    userInput[i] = num;
	}
	for (int i = 0; i < userInput.length; i++) {
	    System.out.print(userInput[i] + " ");
	}
	scan.close();
    }

}
