package Abstraction;

public class Main {
    public static void main(String[] args) {
        //abstract -> abstract classes cannot be instantiated,
        //abstract -> but they can have a subclass,
        //abstract -> abstract methods are declared without an implementation
        Car car = new Car();
        car.go();
    }
}
