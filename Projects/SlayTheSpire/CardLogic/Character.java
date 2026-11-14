package SlayTheSpire.CardLogic;

public abstract class Character {
    private final String name;
    private final int health;
    private static final int BASE_ENERGY = 3;

    private final DeckPile deck;
    private final HandPile hand;
    private final DiscardPile discard;

    Character(String name, int health, CardGenerator generator){
        this.name = name;
        this.health = health;
        this.deck = new DeckPile(generator);
        this.hand = new HandPile(deck);
        this.discard = new DiscardPile();
    }

    void useCard(String name){
        Card cardInUse = hand.getCard(name);
        if (cardInUse.getType().equals("Attack")){
            System.out.println("Correct Attack");
        }

        else if (cardInUse.getType().equals("Skill")){
            System.out.println("Correct Skill");
        }

        hand.removeCard(name);
    }

    void displayDeck(){
        deck.displayDeck();
    }

    void displayHand(){
        hand.displayHand();
    }

    void displayDiscard(){
        discard.displayDiscard();
    }

}


