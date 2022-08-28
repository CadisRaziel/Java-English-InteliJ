package AcessModifier.folder1;
import AcessModifier.folder2.*;

public class A {
    protected String protectedM = "this is protected";
    /*
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.publicMessage );
    }
     */
    public static void main(String[] args){
        B b = new B();
        System.out.println(b);
    }
}
