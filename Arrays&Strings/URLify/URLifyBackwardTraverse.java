

public class URLifyBackwardTraverse{

	public char[] replace(String input, int rLength) {

		char[] inputCharArray = input.toCharArray();

		int completeLength = inputCharArray.length;

		int jump = completeLength - rLength;

		for(int i = rLength - 1; i >= 0; i--) {

			if(jump == 0) break;

			if(inputCharArray[i] == ' ') {

				inputCharArray[i + jump] = '0';
				inputCharArray[i + jump - 1] = '2';
				inputCharArray[i + jump - 2] = '%';
				jump = jump - 2;
			} else {

				inputCharArray[i + jump] = inputCharArray[i];
			}
		}

		return inputCharArray;
	}

	public static void main(String[] args) {

		URLifyBackwardTraverse testInstance = new URLifyBackwardTraverse();

		System.out.println(testInstance.replace("    My Name  is    Kartik                      ", 25));
	}
}