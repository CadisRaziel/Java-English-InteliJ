package youtube;

public class WrapperClass {
    public static void main(String[] args) {
        //provides a way to use primitive data types as reference data types
        //reference data types contain useful methods
        //can be used with collections (eg ArryasList)

        //Primitive         //Wrapper
        //--------          //--------
        //boolean           Boolean
        //char              Character
        //int               Integer
        //double            Double

        //autoboxing -> the automatic conversation that the java compilation does between the primitive types and their corresponding object wrapper class
        //unboxing -> the inverse of autoboxing. Automatic conversion from wrapper class to primitive

        //Wrapper -> can use all the methods a primitive uses
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 1.5;
        String e = "bro";

        if(a == true) {
            System.out.println("This is true");
        }
        if(b == '@') {
            System.out.println("This is true");
        }

    }
}
