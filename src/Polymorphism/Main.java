package Polymorphism;

public class Main {
    public static void main(String[] args){
        //polymorphism ->  greek word for poly-'many', morp-'from'
        //polymorphism -> the ability of an object to identify as more than one type

        CarUm car = new CarUm();
        BicycleUm bicycleUm = new BicycleUm();
        Boat boat = new Boat();

        VehicleUm[] racers = {car, bicycleUm, boat};

        for(VehicleUm x : racers) {
            x.go();
        }
    }
}
