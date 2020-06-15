package javaproject01;

public class Squares {
	void printSquares() {
		for (int i = 1; i <= 30; i = i + 2) {
			System.out.printf("%d = %d", i, i * i).println();
		}
	}

	public static void main(String[] args) {
		Squares obj = new Squares();

		obj.printSquares();
	}

}
