package youtube;

public class VariablesAndPrint {
    public static void main(String[] args) {
        //println -> LN = \n
        //\n -> skip line
        //\t -> give a tab
        System.out.println("\tOla");
        System.out.println("\"Ola\"");
        System.out.println("\\Ola");
        System.out.println("20 pinho");

        //boolean -> true or false
        boolean x = false;

        //byte -> size 1 byte (-128 to 127)
        byte x1 = 0;

        //short -> size 2 byte (-32,768 to 32,767)
        short x2 = 0;

        //int -> size 4 byte (-2 billion to 2 billion)
        int x3 = 0;

        //long -> size 8 byte (-9 quintillion to 9 quintillion)
        long x4 = 0;

        //float -> size 4 byte (fractional number up to 6-7 digits (ex. 3.141592f)
        float x5 = 2.212f;

        //double -> size 8 byte (fractional number up to 15 digits (ex. 3.141592)
        //in this variable double i don't need the 'f'
        double x6 = 2.212;

        //char -> size 2 byte (single character/letter/ASCII value (ex. 'f')
        //note that they are single quotes ''
        char x7 = 'f';

        //String -> size varies (a sequence of characters ex. "Hello World)
        //note that they are double quotes ""
        String x8 = "Olá";

        int z = 500;
        System.out.println("My number is " + z);

    }
}
