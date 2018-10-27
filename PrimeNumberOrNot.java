
// The Loop should start with 2 as we are dealing with prime numbers =
// The complexity of the algorithm will be O(SqRt(n))


public class PrimeNumberOrNot {

	public void isPrime(int input) {

		for(int i = 2; (i * i) < input; i++) {

			if((input % i) == 0) {

				System.out.println("The number is not prime");
				return;
			}
		}

		System.out.println("The number is a prime number");
	}
 
	public static void main(String[] args) {

		PrimeNumberOrNot testInstance = new PrimeNumberOrNot();

		int input = 10;

		testInstance.isPrime(input);
	}
}