public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 6;

        if (a > b){
            if (a > c){
                System.out.println(a);
            }else if (a == c){
                System.out.println("最大值是："+ a + " , " + c);
            }
            else {
                System.out.println(c);
            }
        } else if (a == b) {
            if (a > c){
                System.out.println(a);
            }else if (a == c){
                System.out.println("a = b = c");
            }
            else {
                System.out.println(c);
            }
        } else{
            if (b > c){
                System.out.println(b);
            }else if (b == c){
                System.out.println("最大值是："+ a + " , " + c);
            }
            else {
                System.out.println(c);
            }
        }

    }

}
