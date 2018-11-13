
import java.util.*;


public class isUniqueWithExtraSpace {


	public boolean findUnique(String inputString) {

			HashSet<Character> elementSet = new HashSet<>();

			char[] inputCharString = inputString.toCharArray();

			for(char element : inputCharString) {

				if(!elementSet.add(element)) return false;
			} 

			return true;
	}


	public static void main(String[] args) {

			isUniqueWithExtraSpace testInstance = new isUniqueWithExtraSpace();

			System.out.println(testInstance.findUnique("hitman"));

	}
}