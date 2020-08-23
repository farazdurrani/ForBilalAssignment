package test;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
	/**
	 * FavoriteProgrammingLanguage`: Write a program that continues to ask for the
	 * user's favorite programming language until they type in "Java". Once they do,
	 * print "That's what I was looking for! Java is definitely the answer!"
	 */

	Scanner s = new Scanner(System.in);
	System.out.println("What is your favorite programming language?");
	String answer = s.nextLine();
	if (answer.equals("Java")) {
	    System.out
	            .println("That's what I was looking for! Java is definitely the answer!");
	} else {
	    while (true) {
		System.out.println("Type again");
		answer = s.nextLine();
		if (answer.equals("Java")) {
		    System.out.println(
		            "That's what I was looking for! Java is definitely the answer!");
		    break;
		} else {
		    continue;
		}
	    }
	}
	s.close();
    }

}
