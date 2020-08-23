package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] userInput = new String[5];
	System.out.println("Please enter 5 words 1 by 1");
	for (int i = 0; i < 5; i++) {
	    userInput[i] = scan.nextLine();
	}
	for (int i = 0; i < userInput.length; i++) {
	    System.out.print(userInput[i] + " ");
	}
	scan.close();
    }
}
