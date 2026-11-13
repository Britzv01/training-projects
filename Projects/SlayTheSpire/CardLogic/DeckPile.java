package SlayTheSpire.CardLogic;

import java.util.ArrayList;
import java.util.Collections;

public class DeckPile {

    ArrayList<Card> deck = new ArrayList<>();

    private int initialDeckQuantity = 6;
    private String [] initialDeckCards = {"Ricochet", "Neutralize", "Strike", "Block", "Blur", "Cloak"};
    int totalDeckCards;

    public DeckPile(CardGenerator generate){
        for (int i = 0; i < initialDeckQuantity; i++){
            for (int j = 0; j < generate.totalCards; j++){
                if (initialDeckCards[i].equalsIgnoreCase(generate.getCard(j).getName())){
                    deck.add(generate.getCard(j));
                }
            }
        }

        Collections.shuffle(deck);
        totalDeckCards = deck.size();
    }

    public void addCard(Card card){
        deck.add(card);
        totalDeckCards++;
    }

    public void removeCard(Card card){
        deck.remove(card);
        totalDeckCards--;
    }

    public Card getCard(int index){
        return deck.get(index);
    }

    public Card drawCard(int index){
        return deck.get(index);
    }

    public Card returnDeck(){
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public void displayDeck(){
        for (int i = 0; i < totalDeckCards; i++){
            deck.get(i).displayCard();
        }
    }


}
