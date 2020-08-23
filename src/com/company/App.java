package com.company;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
	
    }

    public static int[] lessThanFive(int[] arr) {
	if (arr.length < 5) {
	    return null;
	}

	int[] copy = new int[arr.length];
	int count1 = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] < 5) {
		copy[count1] = arr[i];
		count1++;
	    }
	}
	int copy2[] = new int[count1];
	for (int i = 0; i < copy2.length; i++) {
	    copy2[i] = copy[i];
	}
	return copy2;
    }

    public static int[] everyThird(int[] arr) {
	if (arr.length < 3) {
	    return null;
	}
	int[] copy = new int[arr.length];
	int count = 0;
	int j = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (j % 2 == 0 && i != 0 && j != 0 && i != arr.length - 1) {
		copy[count] = arr[i];
		count++;
		j = 0;
	    } else {
		j++;
	    }
	}

	int[] third = new int[count];
	for (int i = 0; i < third.length; i++) {
	    third[i] = copy[i];
	}

	return third;
    }

    private static String concatenateString(String[] str) {
	String result = "";
	for (int i = 0; i < str.length; i++) {
	    result = result + str[i];
	}
	return result;
    }

    private static int[] reverse(int[] arr) {

	int copy[] = new int[arr.length];
	int count = 0;
	for (int i = arr.length - 1; i >= 0; i--) {
	    copy[count] = arr[i];
	    count++;
	}

	return copy;
    }

    private static String[] swapFirstAndLast(String[] stringArray) {

	String first = stringArray[0];
	String last = stringArray[stringArray.length - 1];
	stringArray[0] = last;
	stringArray[stringArray.length - 1] = first;
	return stringArray;
    }

    private static int secondLargestNumber(int[] num) {
	int temp;
	int size = num.length;
	for (int i = 0; i < size; i++) {
	    for (int j = i + 1; j < size; j++) {
		if (num[i] > num[j]) {
		    temp = num[i];
		    num[i] = num[j];
		    num[j] = temp;
		}
	    }
	}
	return num[size - 2];
    }
}
