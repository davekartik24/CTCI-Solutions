

public class PalindromePermutationWithArrayAsHashTable {

	public boolean isPalidromePermute(String inputString) {

		inputString = inputString.replace(" ", "");

		int oddCount = 0;

		char[] inputCharArray = inputString.toCharArray();

		int[] indexCountArray = new int[26];

		for(char element : inputCharArray) {

			indexCountArray[element - 'a']++;
		} 

		for(char element : inputCharArray) {

			if((indexCountArray[element - 'a'] % 2) != 0) {

				oddCount++;

				if(oddCount > 1) return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		PalindromePermutationWithArrayAsHashTable testInstance = new PalindromePermutationWithArrayAsHashTable();

		System.out.println(testInstance.isPalidromePermute("tact coaa"));
	}
}