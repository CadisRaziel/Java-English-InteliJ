package youtube;

import java.util.ArrayList;

public class TwoDArrayDynamic {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> allList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        //System.out.println(bakeryList.get(0));

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");
        //System.out.println(produceList);

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");
        //System.out.println(drinksList);

        allList.add(bakeryList);
        allList.add(produceList);
        allList.add(drinksList);

        //to display only the first list -> bakeryList
        System.out.println(allList.get(0));

        //to display only the second list -> produceList
        System.out.println(allList.get(1));

        //to display only the third list -> drinksList
        System.out.println(allList.get(2));


        //to show all lists without [] as if it were just one
        for(int i = 0; i < allList.size(); i++) {
            String list = String.valueOf(allList.get(i));
        System.out.println(list.replace("[", " ").replace("]", " "));
        }
     }
}
