public class Main {
    public static void main(String[] args) {
        intoroduce("Alice",12,"料理");
        System.out.println(area(3,4));

    }

    public static void intoroduce(String name,int age,String hobby){
        System.out.println(name + "の興味は" + hobby + "で、年齢は" + age + "歳です。");
    }

    public static int area(int x,int y){
        return x * y;
    }
}
