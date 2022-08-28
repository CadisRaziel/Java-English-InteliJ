package Encapsulation;

public class Main {
    public static void main(String[] args) {
        //encapsulation -> attributes of a class will be hidden or private,
        //encapsulation -> Can be accessed only through methods (getters & setters)
        //encapsulation -> You should make attributes private if you don't
        //encapsulation -> have a reason to make them public/protected

    CarOne car = new CarOne("chevrolet", "camaro", 2022);

    car.setYear(2050);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
