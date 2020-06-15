package condition_if;

public class PrintNumberTriangle {
	void printNumber(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumberTriangle number = new PrintNumberTriangle();
		number.printNumber(8);

	}

}
