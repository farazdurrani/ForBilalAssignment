package com.company;

public class ArrayFunReverseIt {
    public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 4, 5 };
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
	System.out.println();
	int rev[] = reverse(arr);
	for (int i = 0; i < rev.length; i++) {
	    System.out.print(rev[i] + " ");
	}
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
}
