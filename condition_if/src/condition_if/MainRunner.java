package condition_if;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 :");
		int number1 = sc.nextInt();
		System.out.println("enter number 2");
		int number2 = sc.nextInt();
		System.out.println("number you entered first is:" + number1);
		System.out.println("number you entered second is:" + number2);

		System.out.println("");

		System.out.println("1 - ADD");
		System.out.println("2 - SUB");
		System.out.println("3 - MUL");
		System.out.println("4 - DIV");
		System.out.println("choose operation");

		int choosed = sc.nextInt();
		System.out.println(choosed);

		if (choosed > 4 || choosed < 1) {
			System.out.println("choose number between 1-4");
		}

		if (choosed == 1) {
			System.out.println("Result =" + (number1 + number2));
		} else if (choosed == 2) {
			System.out.println("Result =" + (number1 - number2));
		} else if (choosed == 3) {
			System.out.println("Result =" + (number1 * number2));
		} else if (choosed == 4) {

			System.out.println("Result =" + (number1 / number2));
		} else {
			System.out.println("");
		}
	}

}
