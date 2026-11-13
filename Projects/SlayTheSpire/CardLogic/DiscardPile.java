package SlayTheSpire.CardLogic;

import java.util.ArrayList;

public class DiscardPile {

    ArrayList<Card> discard = new ArrayList<>();
    int totalDiscardCards;

    DiscardPile(){
        this.totalDiscardCards = 0;
    }

    void discardCard(HandPile hand){
        totalDiscardCards++;
    }

    void displayDiscard(){
        for (int i = 0; i < totalDiscardCards; i++){
            discard.get(i).displayCard();
        }
    }

    void returnDeck(DeckPile deck){
    }
}
