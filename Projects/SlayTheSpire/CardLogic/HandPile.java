package SlayTheSpire.CardLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HandPile {
    private HashMap<String, Card> hand = new HashMap<>();
    private final int defaultInitialCards = 4;
    private int totalHandCards;

    public HandPile(DeckPile deck) {
        /*for (int i = 0; i < defaultInitialCards; i++) {\
            hand.put(deck,;
        }*/

        totalHandCards = hand.size();
    }

    public void displayHand() {
        for (int i = 0; i < totalHandCards; i++) {
            hand.get(i).displayCard();
        }
    }

    public Card getCard(String name){


        /*if (name.equalsIgnoreCase(hand.get(Collections.binarySearch(hand, ))))
        return hand.get();*/
    }
}
