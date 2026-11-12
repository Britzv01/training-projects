package SlayTheSpire.CardLogic;

public class AttackCard extends Card {
    private static final String BASE_TYPE = "Attack";
    private int attackPower;

    AttackCard(String name, String description, int attackPower, int cardEnergy){
        super(BASE_TYPE, name, description, cardEnergy);
        this.attackPower = attackPower;
    }
}