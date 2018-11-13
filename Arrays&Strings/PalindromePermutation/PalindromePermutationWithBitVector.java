

public class PalindromePermutationWithBitVector{

	public boolean isPalindromePermute(String inputString) {

		char[] inputCharArray = inputString.toCharArray();

		int oddCount = 0;

		int check = 0;

		for(char element : inputCharArray) {

			int value = element - 'a';

			if((check & (1 << value)) > 0) {

				--oddCount;

				check ^= (1 << value);
			} else {

				++oddCount;
				check |= (1 << value);
			}
		}

		if(oddCount > 1) return false;

		return true;
	}

	public static void main(String[] args) {

		PalindromePermutationWithBitVector testInstance = new PalindromePermutationWithBitVector();

		System.out.println(testInstance.isPalindromePermute("tactcoaa"));
	}
}