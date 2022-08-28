package Interface;

public class Main {
    public static void main(String[] args) {
        //interface -> a template that can be applied to a class.
        //interface -> similar to inheritance, but specifies what the class has/must do.
        //interface -> classes can apply more than one interface,
        //interface -> inheritance is limited to 1 super

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();
    }
}
