package practice;

import java.util.Scanner;

public class Palindrome {
	private static Scanner sc = new Scanner(System.in);

	private String palindrome() {
		String input = sc.nextLine();
		// the first letter index
		int firstIndex = 0;
		// the last letter index
		int lastIndex = input.length() - 1;

		if (!(lastIndex == 0)) {
			// if the first and the last letters are the same,
			if (input.charAt(firstIndex) == input.charAt(lastIndex)) {
				System.out.println("palindrome");
			}
			// if not
			else {
				System.out.println("not palindrome");
			}
		} else {
			System.out.println("you wrote only one word!");
			System.out.println("try other word : ");
			new Palindrome().palindrome();
		}
		return input;
	}

	public static void main(String[] args) {
		System.out.println("write your word : ");
		new Palindrome().palindrome();
	}
}
