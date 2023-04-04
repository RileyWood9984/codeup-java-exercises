public class ServerNameGenerator {
    static String[] adj= {"Frightful","Horrid","Dire","Gruesome","Ruthless","Delightful","Friendly","Safe","Luminous","Generous","Fun"};
    static String[] noun={"Nightmare","Labyrinth","Hollow","Pit","Wasteland","Sun","Flower","Dream","Sanctuary","Haven"};

    static String Generator(String[] Adj,String[] Noun){
        int rand = (int)(Math.random()*(Adj.length-1));
        int rand2 = (int)(Math.random()*(Noun.length-1));
        return Adj[rand]+"-"+Noun[rand2];
    }
    public static void main(String[] args) {
        System.out.println(Generator(adj,noun));
    }
}
