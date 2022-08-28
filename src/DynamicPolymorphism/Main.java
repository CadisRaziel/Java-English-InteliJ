package DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewAnimal animal;

        System.out.println("What animal do you want?");
        System.out.println("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new NewDog();
            animal.speak();
        } else if(choice == 2){
            animal = new NewCat();
            animal.speak();
        } else {
            animal = new NewAnimal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
