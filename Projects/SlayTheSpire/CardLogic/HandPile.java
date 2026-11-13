package SlayTheSpire.CardLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HandPile {
    private HashMap<String, Card> hand = new HashMap<>();
    private final int defaultInitialCards = 4;
    private int totalHandCards;

    public HandPile(DeckPile deck) {
        for (int i = 0; i < defaultInitialCards; i++) {
            hand.put(deck.getCard(i).getName(), deck.getCard(i));
        }

        totalHandCards = hand.size();
    }

    public void displayHand() {
        for (Card cards : hand.values()){
            cards.displayCard();
        }
    }

    public Card getCard(String name){
        return hand.get(name);
    }
}
