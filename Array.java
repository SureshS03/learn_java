public class Array {
    public static void main(String[] args) {

        // Array need on spot memory space length, like frds[3] or define value at on spot, but ArrayList can be flexible
        
        String[] frds = {"suresh", "arya", "bro", "devg", "botigl"};

        String[] lang = new String[3];
        lang[0] = "golang"; //1
        lang[1] = "java"; //2
        lang[2] = "python"; //3

        

        for (String l : lang) { // adavance looping syntax
            System.out.println(l);
        }

        switch(frds[0]) {
            case "Suresh" -> { //this is adavance switch syntaz, here no need for break; after each case
                System.err.println("Hello boss");
                System.err.println(frds[0]);
            }
            case "Arya" -> {
                System.err.println("Hello Dev");
                System.err.println(frds[0]);
            }                
            default -> {
                System.err.println("Who are You??");
            }
        }

        //2d array

        String[][] games = new String[2][2];
        games[0][0] = "PUBG";
        games[0][1] = "valo";
        games[1][0] = "CR";
        games[1][1] = "COC";


        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < games[i].length; j++) {
                System.out.println(games[i][j]);
            }
        }
    }
}
