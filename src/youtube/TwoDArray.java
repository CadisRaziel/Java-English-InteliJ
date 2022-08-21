package youtube;

public class TwoDArray {
    public static void main(String[] args) {
        //2D array -> An Array of Arrays

        String[][] carros = new String[3][3];
        carros[0][0] = "fusca";
        carros[0][1] = "gol";
        carros[0][2] = "chevet";
        carros[1][0] = "saveiro";
        carros[1][1] = "moto";
        carros[1][2] = "bicicleta";
        carros[2][0] = "patinete";
        carros[2][1] = "aviao";
        carros[2][2] = "onibus";

        for (int z = 0; z < carros.length; z++) {
            System.out.println();
                for(int h = 0; h < carros[z].length; h++) {
                    System.out.print(carros[z][h] + " ");
                }
        }

        //we can do static and bizarre like this /\ or we can do it in a more automated way like this \/

        //[][] -> for multiples list
        String[][] cars = {
                {
                        "Camaro", "Corvette", "Silverado"
                },
                {
                        "Mustang", "Ranger", "F-150"
                },
                {
                        "Ferrari", "Lambo", "Tesla"
                },
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        //OR for simplified in java \/
        //is the same but in a simpler syntax

        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.print(s + " ");
            }
        }
    }
}
