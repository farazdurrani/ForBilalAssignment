package test;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class isJavaKeyword {

    public static void main(String[] args) {
	/**
	 * IsJavaKeyword` Write a program that get user input (a String) and print out
	 * whether or not it is a Java keyword. You will need to find a list of keywords
	 * for this kata.
	 */
	String[] javaKeywords = { "abstract", "assert", "boolean", "break", "byte", "case",
	        "catch", "char", "class", "continue", "default", "do", "double", "else",
	        "enum", "exports", "extends", "final", "finally", "float", "for", "if",
	        "implements", "import", "instanceof", "int", "interface", "long", "module",
	        "native", "new", "package", "private", "protected", "public", "requires",
	        "return", "short", "static", "strictfp", "super", "switch", "synchronized",
	        "this", "throw", "throws", "transient", "try", "void", "volatile", "while" };

	Scanner s = new Scanner(System.in);

	while (true) {
	    System.out.println("enter something");
	    String input = s.nextLine();
	    Optional<String> opt = Arrays.stream(javaKeywords).filter(x -> x.equals(input))
	            .findFirst();
	    if (opt.isPresent()) {
		System.out.println("is a java keyword");
		break;
	    } else {
		System.out.println("not a java keyword");
	    }
	}
	s.close();
    }

}
