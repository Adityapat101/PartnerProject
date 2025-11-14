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