package youtube;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        /*
        int x = 0;
        while(x <= 100) {
            System.out.println("this is the x : " + x);
        x++;
        }
         */

        /*
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+ name);

         */

        Scanner scanner = new Scanner(System.in);
        String name = "";

        //do -> makes it always run the code inside it first
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank());
        System.out.println("Hello "+ name);

    }
}
