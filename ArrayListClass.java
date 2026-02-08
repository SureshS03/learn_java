import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        /*
            ArrayList
                - resizeable array
                - no need on spot length defination like normal array
                - can add or remove after compilation phase
                - store only non-primitive AKA reference data type only
                - if u want to use primitive type, use its correct wrapper class eg:- int -> Integer etc..
        */

        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> foods = new ArrayList<String>(); //initial capacity is ten

        foods.add("dosa");
        foods.add("idli");
        foods.add("sambar");

        for (int i = 0; i < foods.size(); i++) { //use size() instead of length, beacuse its diff then normal array
            System.out.println(foods.get(i)); //use get func not just with index
        }

        foods.set(1, "masala dosa not idli");
        System.out.println(foods.get(1));
        foods.remove(2); //remove sambar
        foods.clear(); //delete all and leave empty with default size 10


        //2d arraylist
        //ArrayList<ArrayList<String>> games = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> games = new ArrayList<>(); // still good, alloacte the data type dynamic bu redandent data type define
        
        ArrayList<String> aaa = new ArrayList<>();
        aaa.add("rdr");
        aaa.add("gta");

        ArrayList<String> comptitive = new ArrayList<>();
        comptitive.add("pubg");
        comptitive.add("valo");
        comptitive.add("cs2");
        
        ArrayList<String> moviegames = new ArrayList(); //still works, but not safety, datatype maybe vary, not best pratice
        moviegames.add("last of us");
        moviegames.add("spider-man");

        games.add(aaa);
        games.add(comptitive);
        games.add(moviegames);

        System.out.println(games);
        System.out.println(games.get(0).get(1)); // works beacuse both are arraylist //gta

        for (ArrayList<String> g : games) {
            for (String s : g) {
                System.out.println("game is "+ s);
            }
        }

    }
}
