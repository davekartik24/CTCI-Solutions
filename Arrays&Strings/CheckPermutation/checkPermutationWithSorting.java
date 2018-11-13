
import java.util.*;

public class checkPermutationWithSorting{

	public boolean isPermute(String first, String second) {

		if(first.length() != second.length()) return false;

		char[] firstCharArray = first.toCharArray();

		char[] secondCharArray = second.toCharArray();

		Arrays.sort(firstCharArray);

		Arrays.sort(secondCharArray);

		for(int i = 0; i < first.length(); i++) {

			if(firstCharArray[i] != secondCharArray[i]) return false;
		}

		return true;


	}

	public static void main(String[] args) {

		checkPermutationWithSorting testInstance = new checkPermutationWithSorting();

		System.out.println(testInstance.isPermute("bbbaa", "babaa"));
	}
}