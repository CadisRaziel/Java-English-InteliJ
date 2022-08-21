package youtube;

public class StringMethods {
    public static void main(String[] args){
        //String -> a reference data type that can store one or more characters
        //reference data types have access to useful methods

        String name = "Vitor";

        //equals -> if the word is the same as another
        boolean result = name.equals("Vitor");
        System.out.println("Equals = " + result);

        //equalsIgnoreCase -> to ignore capital letters
        boolean result1 = name.equalsIgnoreCase("Vitor");
        System.out.println("EqualsIgonre = " + result1);

        int result2 = name.length();
        System.out.println("Length = " + result2);

        char result3 = name.charAt(0);
        System.out.println("charAt = " + result3);

        int result4 = name.indexOf("i");
        System.out.println("indexOf = " + result4);

        boolean result5 = name.isEmpty();
        System.out.println("isEmpty = " + result5);

        String result6 = name.toUpperCase();
        System.out.println("toUpperCase = " + result6);

        String result7 = name.toLowerCase();
        System.out.println("toLowerCase = " + result7);

        String result8 = name.trim();
        System.out.println("Trim, remove spaces = " + result8);

        String result9 = name.replace("V", "U");
        System.out.println("Replace char, V to U = " + result9);

        String result10 = name.replaceAll("i", "t");
        System.out.println("Replace all, for long text, i to t = " + result10);

        String result11 = name.replaceFirst("Vitor","Bitor");
        System.out.println("Replace firs caracter, = " + result11);
    }
}
