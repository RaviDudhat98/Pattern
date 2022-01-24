package pattern;

import java.util.Scanner;

/**
 * Pattern 2:-
 *   *
 *  * *
 * * * * 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-23
 */
public class Pattern2 {

	public static void main(String[] args) {
		// Take input from the user
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ente the number :- ");
		int number = scanner.nextInt();

		for(int i = 1; i <= number; i++) {
			for(int j = number - i ; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
