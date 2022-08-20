package youtube;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        //&& = (AND) both conditions must be true
        //|| = (OR) either condition must be true
        //!= = (NOT) reverses boolean value of a condition

        /*
        int temp = 24;

        if(temp >= 10 && temp <= 24) {
            System.out.println("Oh YEAH is true");
        } else {
            System.out.println("Oh SHIT is false");
        }
        */


        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
        //if(!response.equals("q") && !response.equals("Q")) {
            // && -> You are still playing the game *pew pew
            // || ->  You quit the game
            //System.out.println("You are still playing the game *pew pew");
            System.out.println("You quit the game");
        } else {
            // && -> You quit the game
            // || -> You are still playing the game *pew pew*
            System.out.println("You are still playing the game *pew pew");
            //System.out.println("You quit the game");
        }
    }
}
