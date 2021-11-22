package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter one word: ");
		String word = in.nextLine();
		String reverseWord = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			
			char c = word.charAt(i);
			reverseWord += c;
		}
		
		
		System.out.println("Word choosen: " + word);
		System.out.println("Reverse word: " + reverseWord.toLowerCase());
		if(word.equalsIgnoreCase(reverseWord)) {
			
			System.out.println("It's a palindrome.");
		} else {
			
			System.out.println("It isn't a palindrome.");
		}
		System.out.println("Word's length: " + word.length());
		
		in.close();
	}

}
