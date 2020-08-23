package com.company;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class HiLow {
    public static void main(String[] args) {
	/**
	 * The program displays a message that says, “Welcome to Hi-Low!” 2. The program
	 * prompts for the user’s name. 3. The program displays a message that says,
	 * “OK, [name of user], here are the rules:” Code the game to follow these
	 * rules: 1. The computer will come up with a number between 1 and 100
	 * (inclusive). 2. The user will be prompted to guess the number. 3. If the user
	 * guesses the number correctly, the program displays: 1. “Congratulations,
	 * [name of user]! You win!” 2. "It took you [number of guesses] guesses to find
	 * my number!" 4. If the user does not guess the number correctly, the program
	 * will display “Too low!” if the guess is too low and “Too high!” if the guess
	 * is too high, and then will prompt the user for another guess. This goes on
	 * until the number is guessed correctly.
	 */
	Scanner s = new Scanner(System.in);
	System.out.println("Welcome to Hi-Low!");
	System.out.println("What is your name?");
	String name = s.nextLine();
	System.out.println("OK, " + name + ", here are the rules:");
	System.out.println("Some Rules...");
	int tries = 0;
	Random rand = new SecureRandom();
	while (true) {
	    tries++;
	    int num = rand.nextInt(101);
	    System.out.println("random number : " + num);
	    System.out.println("Guess a number");
	    int guess = s.nextInt();
	    s.nextLine();
	    if (guess == num) {
		System.out.println("Congratulations," + name + "! You win!");
		break;
	    } else if (guess < num) {
		System.out.println("Too low!");
	    } else {
		System.out.println("Too high!");
	    }

	}
	System.out.println("It took you " + tries + " guesses to find my number!");
	s.close();

    }
}
