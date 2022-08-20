package youtube;

public class MethodsMath {
    static public void main(String[] args) {
        double xi = 3.14;
        double yi = 10;

        //Math.max -> compares the two numbers and displays the larger
        double zi = Math.max(xi, yi);
        System.out.println(zi);

        //Math.min -> compares the two numbers and displays the min
        double zii = Math.min(xi, yi);
        System.out.println(zii);

        //sqrt -: square root
        //Nan -> not a number
        double ziii = Math.sqrt(yi);
        System.out.println(ziii);

        //round -> round a broken number
        double ziiii = Math.round(yi);
        System.out.println(ziiii);

        //ceil -> round up
        double ziiiii = Math.ceil(yi);
        System.out.println(ziiiii);

        //floor -> round down
        double ziiiiii = Math.floor(yi);
        System.out.println(ziiiiii);
    }

}
