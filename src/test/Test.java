package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
	/**
	 * 1. `AgeAgain`: Write a program that asks for the user's age and then asks a
	 * follow-up question based on the value: Less than 14: Ask what grade they're
	 * in and then prints "Wow! [user answer] grade - that sounds exciting!" Between
	 * 14 and 18 (inclusive): Ask if they're planning to go to college. If the
	 * answer is "yes" (all lowercase), ask what college and then print "[user
	 * answer] is a great school!". If the answer is "no" (all lowercase), ask what
	 * they want to do after high school, then print "Wow, <user answer> sounds like
	 * a plan!" Greater than 18: Ask what their job is, then print "[user answer]
	 * sounds like a great job!"
	 */

	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your age?");
	int age = scanner.nextInt();
	if (age < 14) {
	    scanner.nextLine();
	    System.out.println("What grade are you in?");
	    String grade = scanner.nextLine();
	    System.out.println("Wow! " + grade + " grade - that sounds exciting! ");
	} else if (age >= 14 && age <= 18) {
	    scanner.nextLine();
	    System.out.println("Are you planning to go to College?");
	    String answer = scanner.nextLine();
	    if (answer.equals("yes")) {
		String collegeName = scanner.nextLine();
		System.out.println(collegeName + " is a great school!");
	    } else if (answer.equals("no")) {
		System.out.println("What do you want to do after highschool?");
		String ans = scanner.nextLine();
		System.out.println("Wow, " + ans + " sounds like a plan!");
	    }
	} else {
	    scanner.nextLine();
	    System.out.println("What is your plan?");
	    String plan = scanner.nextLine();
	    System.out.println(plan + " sounds like a great job!");
	}

	scanner.close();

    }
}
