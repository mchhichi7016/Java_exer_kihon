import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("入力：");
        int n = (new Scanner(System.in)).nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 ==0){
                    System.out.print("□");
                }else {
                    System.out.print("■");
                }
            }
            System.out.println();

        }
    }
}
