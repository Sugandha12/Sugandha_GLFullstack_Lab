package com.gl.lab3.question1;

import java.util.Scanner;

import java.util.Stack;

public class MatchingBrackets {

	public static boolean isBalanced(String str) {
		char[] arr = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			switch (ch) {
			case '[':
			case '{':
			case '(':
				stack.push(ch);
				break;
			case ']':

				if (stack.isEmpty() || stack.pop() != '[') {
					return false;

				}
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;

				}
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;

				}
				break;

			default:
				return false;

			}

		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string of brackets: ");
		String str = sc.nextLine();

		if (isBalanced(str)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

		sc.close();
	}

}
