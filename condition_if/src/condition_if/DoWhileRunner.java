package condition_if;

import java.util.Scanner;

public class DoWhileRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entered_number = -1;
		do {
			if (entered_number != -1) {
				System.out.println("cube is   :" + (entered_number * entered_number * entered_number));
			}
			System.out.println("enter a number : ");
			entered_number = sc.nextInt();
		} while (entered_number >= 0);
		System.out.println("thankyou !");

	}

}
