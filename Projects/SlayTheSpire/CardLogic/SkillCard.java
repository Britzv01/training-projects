package SlayTheSpire.CardLogic;

public class SkillCard extends Card {
    private static final String BASE_TYPE = "Skill";
    private int blockPower;

    SkillCard(String name, String description, int blockPower, int cardEnergy){
        super(BASE_TYPE, name, description, cardEnergy);
        this.blockPower = blockPower;
    }
}
