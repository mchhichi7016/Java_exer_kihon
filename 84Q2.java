public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] array1 = new int[5];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] * 2;
        }

        for (int i:array1) {
            System.out.println(i);
        }

    }
}
