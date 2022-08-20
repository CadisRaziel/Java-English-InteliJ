package youtube;

import java.util.Scanner;
//import java.util.Scanner; -> to use 'scanner'
public class InputOutputTerminal {
    public static void main(String[] args) {
        //scanner -> user input
       Scanner scanner  = new Scanner(System.in);
       System.out.println("What is your name?");
       String name = scanner.nextLine();
       System.out.println("Hello "+ name);

       System.out.println("How old are you?");
       int age = scanner.nextInt();
       System.out.println("Wow you are "+ age +" years old" );
       scanner.nextLine();
       System.out.println("What is your favorite food?");
       String food = scanner.nextLine();
       System.out.println("So you like "+ food);

    }
}
