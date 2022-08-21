package youtube;

import java.util.ArrayList;

public class ArrayDynamic {
    public static void main(String[] args) {
        //dynamic array

        ArrayList<String> food = new ArrayList<String>();

        //add -> add itens in list array
        food.add("Pizza");
        food.add("Cachorro-Quente");
        food.add("Sorvete");

        //set -> let's change the index 0 which is "Pizza" for "sushi"
        //food.set(0, "sushi");

        //remove -> remove indice 0
        //food.remove(0);

        //clear -> remove all elements in array
        //food.clear();


        //in dynamic arrays we don't use the .length in the for, for that we use the .size
        for(int i = 0; i < food.size(); i++) {
       //notice that we also don't use food[i], we use get
        System.out.println(food.get(i));
        }
    }
}
