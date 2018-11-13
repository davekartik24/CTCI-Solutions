
import java.util.*;

public class isUniqueWithBitOprator{

	public boolean findUnique(String inputString) {

		int maintainBitPosition = 0;

		char[] inputCharString = inputString.toCharArray();

		for(char element : inputCharString) {

			int index = element - 'a';

			if((maintainBitPosition & (1 << index)) > 0) return false;

			maintainBitPosition |= (1 << index);
		}

		return true;
	}



	public static void main(String[] args) {

		isUniqueWithBitOprator testInstance = new isUniqueWithBitOprator();

		System.out.println(testInstance.findUnique("hihi"));

	}
}