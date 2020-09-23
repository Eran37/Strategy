package strategy;

public class Main {

    public static void main(String[] args) {

        Player eran = new GuitarPlayer("Eran");
        Player aviad = new DrumsPlayer("Aviad");

        System.out.println("*******Running An Example Of Strategy*********");
        printPlayers(eran, aviad);
        System.out.println("**********Setting New Instruments************");
        eran.setInstrument(new Drums());
        aviad.setInstrument(new Guitar());
        printPlayers(eran, aviad);

    }

    private static void printPlayers(Player... players){
        for (Player player: players)
            System.out.println(player.myInstrument());
    }

}



