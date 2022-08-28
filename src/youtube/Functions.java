package youtube;

public class Functions {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);

        hello();

    }
    static void hello(){
        System.out.println("Hello");
    }

    static int add(int x, int y){
        return x + y;
    }

}
