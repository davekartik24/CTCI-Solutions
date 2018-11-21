


public class RotateMatrix{

	public void rotate90(int[][] inputMatrix) {

		int nValue = inputMatrix.length;

		for(int i = 0; i < (nValue / 2); i++) {

			for(int j = i; j < (nValue - 1) - i; j++) {

				swap(inputMatrix, i, j, j,((nValue - 1) - i));
				swap(inputMatrix, i, j, ((nValue - 1) - i), ((nValue - 1) - i) - (j - i));
				swap(inputMatrix, i, j, ((nValue - 1) - i) - (j - i),i);
			}
		}
	}

	public void swap(int[][] inputMatrix, int firstA, int firstB, int secondA, int secondB) {

		int temp = inputMatrix[firstA][firstB];
		inputMatrix[firstA][firstB] = inputMatrix[secondA][secondB];
		inputMatrix[secondA][secondB] = temp;
	}


	public static void main(String[] args) {

		RotateMatrix testInstace = new RotateMatrix();

		int[][] inputArray = { {1, 2, 3, 4},
							   {5, 6, 7, 8},
							   {9, 10, 11, 12},
							   {13, 14, 15, 16}
				  			 };

		testInstace.rotate90(inputArray);

		for(int[] firstLoopElement : inputArray) {

			for(int element : firstLoopElement) {

				System.out.print(element + " ");
			}

			System.out.println("");
		}

	}
}