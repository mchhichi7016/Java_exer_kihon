public class Main {
    public static void main(String[] args) {
        int[][] array = { { 1, 8, 12, 17, 20},
                { 2, 5, 11, 13, 18},
                { 4, 6, 9, 19, 21}
        };
        int[] c = new int[5];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
