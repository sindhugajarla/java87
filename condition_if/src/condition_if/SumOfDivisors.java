package condition_if;

public class SumOfDivisors {
	int sum = 0;

	void sumOfDivisor(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				int div = number / i;
				if (div != 1 && div != number) {
					sum = sum + div;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDivisors sum1 = new SumOfDivisors();
		sum1.sumOfDivisor(16);

	}

}
