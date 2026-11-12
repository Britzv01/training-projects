package SlayTheSpire.CardLogic;

public class main {
    public static void main(String[] args) {
        CardGenerator generator = new CardGenerator();
        DeckPile deck = new DeckPile(generator);
        HandPile hand = new HandPile(deck);

        hand.displayHand();

    }
}
