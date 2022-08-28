package ToStringMethod;

public class Main {
    public static void main(String[] args) {
        //toString() -> special method that all objects inherit,
        //toString() -> that returns a string than "textually represents" an object.
        //toString() -> can be used both implicitly and explicitly

        Car car = new Car();

        System.out.println(car.toString());
        //or
        //System.out.println(car);
    }


}
