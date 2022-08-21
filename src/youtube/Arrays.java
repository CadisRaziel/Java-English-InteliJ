package youtube;

public class Arrays {
    public static void main(String[] args) {
        /*
        String[] car = {"fusca", "Tesla", "Kombi"};
        car[0] = "Mustang";
        System.out.println(car[0]);
         */


        String[] car = new String[3];
        car[0] = "camaro";
        car[1] = "Coverte";
        car[2] = "Tesla";

        for(int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

    }
}



