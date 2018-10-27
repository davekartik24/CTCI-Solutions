
// The logic of prefix is used
// The complexity of the algorithm will be n!

import java.util.*;

public class StringPermutation{

	public void permutation(String inputString) {

		printPermutation(inputString, ""); 
	}

	public void printPermutation(String inputString, String prefix) {

		if(inputString.length() == 0) {

			System.out.println(prefix);
		} else {

			for(int i = 0; i < inputString.length(); i++) {

				String remaining = inputString.substring(0, i) + inputString.substring(i+1);

				printPermutation(remaining, prefix + inputString.charAt(i));
			}
		}
	}


	public static void main(String[] args) {

		String inputString = "abc";

		StringPermutation testInstance = new StringPermutation();

		testInstance.permutation(inputString);
	}

}