package SlayTheSpire.CardLogic;

public abstract class Character {
    private final String name;
    private final int health;
    private static final int BASE_ENERGY = 3;
    private HandPile hand;

    Character(String name, int health, DeckPile deck){
        this.name = name;
        this.health = health;
        hand = new HandPile(deck);
    }

    void useCard(String name){
        hand.getCard(name);
    }
}


