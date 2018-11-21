

public class ZeroMatrixNMSpace{

	public void replaceZero(int[][] inputMatrix) {

		int m = inputMatrix.length;

		int n;

		if(m > 0) {
			n = inputMatrix[0].length;
		} else {
			return;
		}

		int[][] newMatrix = new int[m][n];

		for(int i = 0; i < m; i++) {

			for(int j = 0; j < n; j++) {

				if(inputMatrix[i][j] == 0) {

					newMatrix[i][j] = 1;
				}
			}
		}

		for(int i = 0; i < m; i++) {

			for(int j = 0; j < n; j++) {

				if(newMatrix[i][j] == 1) {

					for(int k = 0; k < m; k++) {

						inputMatrix[k][j] = 0;
					}

					for(int l = 0; l < n; l++) {

						inputMatrix[i][l] = 0;
					}
				}
			}
		}
	}


	public static void main(String[] args) {

		ZeroMatrix testInstace = new ZeroMatrix();

		int[][] inputMatrix = {
  								{0,1,2,0},
  								{3,4,5,2},
  								{1,3,1,5}
							  };

		testInstace.replaceZero(inputMatrix);

		for(int i = 0; i < inputMatrix.length; i++) {

			for(int j = 0; j < inputMatrix[i].length; j++) {

				System.out.print(inputMatrix[i][j] + " ");
			}

			System.out.println("");
		}

	}
}