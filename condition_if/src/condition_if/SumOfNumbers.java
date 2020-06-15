package condition_if;

public class SumOfNumbers {
	int sum = 0;

	void sumofNumbers(int number) {
		for (int i = 1; i <= number; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbers number = new SumOfNumbers();
		number.sumofNumbers(10);
	}
}
