package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("Result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero! (Especific error)");
        } catch (InputMismatchException e){
            System.out.println("Please enter a number! (Especific error)");
        } catch (Exception e){
            System.out.println("Generic for all errors");
        } finally {
            scanner.close();
            System.out.println("This will always print");
        }
    }
}
