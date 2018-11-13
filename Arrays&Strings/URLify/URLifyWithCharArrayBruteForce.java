

public class URLifyWithCharArrayBruteForce{


	public char[] replace(char[] input, int actualLenght){

		for(int i = 0; i < actualLenght; i++) {

			if(input[i] == ' ') {

				for(int j = actualLenght - 1; j > i; j--) {

					input[j + 2] = input[j];
				}

				input[i] = '%';
				input[i+1] = '2';
				input[i+2] = '0';

				actualLenght = actualLenght + 2;
			}
		}

		return input;

	}

	public static void main(String[] args) {

		URLifyWithCharArrayBruteForce testInstance = new URLifyWithCharArrayBruteForce();

		String input = "Mr Kartik Dave    ";

		int length = 14;

		System.out.println(testInstance.replace(input.toCharArray(), length));
	}
}