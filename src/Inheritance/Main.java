package Inheritance;

public class Main {
    public static void main(String[] args){
        // inheritance -> the process where one class acquires,
        // inheritance -> the attributes and methods of another.

        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        //sout -> System.out.println

        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }
}
