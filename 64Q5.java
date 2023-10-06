public class Main {
    public static void main(String[] args) {

        int age = 19;
        boolean members = false;
        int fee = 0;

        if (age >= 20){
            if (members){
                fee = 1100;
            }else {
                fee = 1500;
            }
        }else {
            if (members){
                fee = 500;
            } else{
                fee = 800;
            }
        }
        System.out.println(fee);

    }

}
