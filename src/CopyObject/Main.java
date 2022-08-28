package CopyObject;

public class Main {
    public static void main(String[] args) {
        CarCopy car1 = new CarCopy("Chevrolet", "camaro", 2022);
        CarCopy car2 = new CarCopy("Ford", "mustang", 2022);

        CarCopy carContructorCopy = new CarCopy(car1);

        System.out.println(carContructorCopy);

        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
