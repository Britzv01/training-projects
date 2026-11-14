package SlayTheSpire.CardLogic;

public class TheLeech extends Character {
    private static final String BASE_NAME = "The Leech";
    private static final int  BASE_HEALTH = 50;

    TheLeech(CardGenerator generator){
        super(BASE_NAME, BASE_HEALTH, generator);
    }
}
