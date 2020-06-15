package condition_if;

public class WhileNumberPlayer {
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.print("squares are:  ");
		while (i * i < limit) {

			System.out.print(i * i + " ");
			i++;
		}

	}

	public void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println();
		System.out.print("cubes are    ");
		while (i * i * i < limit) {

			System.out.print(i * i * i + "  ");
			i++;
		}

	}

}
