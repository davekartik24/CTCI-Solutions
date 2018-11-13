

public class checkPermutationWithArrayAsHashTable{

	public boolean isPermute(String first, String second) {

		if(first.length() != second.length()) return false;

		char[] firstCharArray = first.toCharArray();
		char[] secondCharArray = second.toCharArray();

		int[] countOfChar = new int[26];

		for(char element : firstCharArray) {

			countOfChar[element - 'a']++;
		}

		for(char element : secondCharArray) {

			if(countOfChar[element - 'a'] == 0) return false;

			countOfChar[element - 'a']--;
		}

		return true;
	} 


	public static void main(String[] args) {

		checkPermutationWithArrayAsHashTable testInstance = new checkPermutationWithArrayAsHashTable();

		System.out.println(testInstance.isPermute("ababa", "bbaaa"));
	}
}