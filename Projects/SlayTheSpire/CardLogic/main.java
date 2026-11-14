package SlayTheSpire.CardLogic;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CardGenerator generator = new CardGenerator();
        TheLeech character = new TheLeech(generator);

        System.out.println("Deck");
        character.displayDeck();
        System.out.println("-------------------");

        System.out.println("Hand");
        character.displayHand();
        System.out.println("-------------------");

        System.out.println("Select Card: ");
        character.useCard(scan.nextLine().replace(" ", ""));

        System.out.println("Hand after using a card");
        character.displayHand();
        System.out.println("-------------------");







    }
}
