import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("you say: ");
        String str = (new Scanner(System.in)).nextLine();

        if (str.equals("hello")){
            System.out.println("お入りください");
        }
        else {
            System.out.println("合言葉が違います");
        }


    }

}

