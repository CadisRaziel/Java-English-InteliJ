package ScopeVariable;
import java.util.Random;
public class DiceRolller {
    //variable global
    Random random;
    int number;

    DiceRolller() {
        random = new Random();
        roll();

        //local
        // Random random = new Random();
        // int number = 0;
        // roll(random, number);
    }

    //local
    //void roll(Random random, int number){
        //number = random.nextInt(6)+1;
        //System.out.println(number);
   //}

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
