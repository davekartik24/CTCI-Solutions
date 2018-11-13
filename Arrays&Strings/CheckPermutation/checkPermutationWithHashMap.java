

import java.util.*;

public class checkPermutationWithHashMap {

	public boolean isPermute(String first, String second) {

		int firstLength = first.length();
		int secondLength = second.length();

		HashMap<Character, Integer> map = new HashMap<>();

		if(firstLength != secondLength) return false;

		char[] firstCharArray = first.toCharArray();
		char[] secondCharArray = second.toCharArray();

		for(char element : firstCharArray) {

			if(map.containsKey(element)) {

				map.put(element, map.get(element) + 1);
			} else {

				map.put(element, 1);
			}
		}

		for(char element : secondCharArray) {

			if(map.containsKey(element)) {

				if(map.get(element) == 0) {

					return false;
				} else {

					map.put(element, map.get(element) - 1);
				}
			} else {

				return false;
			}
		}

		return true;


	}


	public static void main(String[] args) {

		checkPermutationWithHashMap testInstance = new checkPermutationWithHashMap();

		System.out.println(testInstance.isPermute("aaac", "aaba"));

	}
}