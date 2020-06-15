package condition_if;

public class IsPrime {
	void isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % 2 == 0) {
				System.out.println(number + "  not a prime number");
				break;
			} else {
				System.out.println(number + "  is prime");
				break;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime number = new IsPrime();
		number.isPrime(181);
	}

}
