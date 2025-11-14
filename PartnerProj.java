public class PartnerProj{

    public static int[][] createRandomSquareArray(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int)(Math.random() * 10) + 1;
            }
        }

        return array;
    }


	public static Integer findFirstEven(int[][] array) {
	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array[i].length; j++) {
	            if (array[i][j] % 2 == 0) {
	                return array[i][j];
	            }
	        }
	    }
	    return null;
	}



	public static Integer findFirstEvenWithNeighborSum(int[][] array) {
	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array[i].length; j++) {
	            int value = array[i][j];
	            if (value % 2 == 0) {

	                if (j > 0 && j < array[i].length - 1) {
	                    int left = array[i][j - 1];
	                    int right = array[i][j + 1];
	                    if (left + right > 17) {
	                        return value;
	                    }
	                }
	            }
	        }
	    }
	    return null;
	}


	public static Integer findFirstOddWithFullNeighborSum(int[][] array) {
	    for (int i = 1; i < array.length - 1; i++) {
	        for (int j = 1; j < array[i].length - 1; j++) {

	            int value = array[i][j];


	            if (value % 2 != 0) {

	                int above = array[i - 1][j];
	                int below = array[i + 1][j];
	                int left  = array[i][j - 1];
	                int right = array[i][j + 1];

	                int sum = above + below + left + right;

	                if (sum > 33) {
	                    return value;
	                }
	            }
	        }
	    }
	    return null;
	}


    public static void main(String[] args) {
        int size = 5;
        int[][] result = createRandomSquareArray(size);

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}