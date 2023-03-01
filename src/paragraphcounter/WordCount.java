package paragraphcounter;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Write a sentence or paragraph:");
		String word = in.nextLine();
		in.close();

		int words = 1;

		if (word.charAt(0) == ' ') {
			words = words - 1;
		}

		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) == ' ' && word.charAt(i + 1) != ' ') {
				words++;
			}
		}
		System.out.println("The total number of words are : " + words);

	}

}
