package AcessModifier.folder2;
import AcessModifier.folder1.*;


public class Asub extends A {
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage );
        System.out.println(c.protectedMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedM);

    }
}
