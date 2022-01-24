package pattern;

import java.util.Scanner;

/**
 * Pattern :-
 * 1 2 3
 * 1 2 
 * 1
 * @author Ravi Dudhat
 * @version 1.01 2022-01-23
 */
public class Pattern5 {

	public static void main(String[] args) {
		 // Take input from the user
		Scanner scanner = new Scanner (System.in); 
		System.out.println("Enter the no:- ");
		int number = scanner.nextInt();

		for(int i = number; i >= 1; i--) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
