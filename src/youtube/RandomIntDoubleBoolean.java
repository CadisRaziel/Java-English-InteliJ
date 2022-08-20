package youtube;
import java.util.Random;

public class RandomIntDoubleBoolean {
    public static void main(String[] args) {
        Random random = new Random();

        //if we "don't" put the +1, it puts the number 0 example = 0-99
        //and if we "put" the +1, it doesn't put the number 0 example = 1-99
        int x = random.nextInt(100)+1;
        System.out.println("inteiro aleatorio : " + x);

        double y = random.nextDouble(100);
        System.out.println("double aleatorio : " + y);

        boolean z = random.nextBoolean();
        System.out.println("boolean aleatorio : " + z);
    }
}
