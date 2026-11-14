package SlayTheSpire.CardLogic;

import java.util.LinkedHashMap;

public class HandPile {
    private LinkedHashMap<String, Card> hand = new LinkedHashMap<>();
    private final int defaultInitialCards = 4;
    int totalHandCards;

    public HandPile(DeckPile deck) {
        for (int i = 0; i < defaultInitialCards; i++) {
            Card drawnCard = deck.drawCard();
            hand.put(drawnCard.getName(), drawnCard);
        }

        totalHandCards = hand.size();
    }

    public void displayHand() {
        for (Card cards : hand.values()){
            cards.displayCard();
        }
    }

    public Card getCard(String name){
        // add more
        return hand.get(name);
    }

    public void removeCard(String name){
        hand.remove(name);
        totalHandCards--;
    }

    public void deckDraw(DeckPile deck){
        Card drawnCard = deck.drawCard();
        hand.put(drawnCard.getName(), drawnCard);
        totalHandCards++;
    }
}
