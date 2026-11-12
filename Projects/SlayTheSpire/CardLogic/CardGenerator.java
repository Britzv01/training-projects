package SlayTheSpire.CardLogic;

import java.util.ArrayList;

public class CardGenerator {
    String [] attackNames = {
            "Ricochet",
            "Neutralize",
            "Strike",
            "Slice",
            "Predator"
    };

    String [] attackDescriptions = {
            "Deals 2 Damage",
            "Deals 3 Damage",
            "Deals 6 Damage",
            "Deals 8 Damage",
            "Deals 15 Damage"
    };

    int [] attackPowers = {
            2,
            3,
            6,
            8,
            15
    };

    int [] attackEnergy = {
            0,
            1,
            1,
            2,
            3
    };

    String [] skillNames = {
            "Block",
            "Blur",
            "Cloak",
            "Dodge and Roll",
            "AfterImage"
    };

    String [] skillDescriptions = {
            "Blocks 2 Damage",
            "Blocks 3 Damage",
            "Blocks 6 Damage",
            "Blocks 8 Damage",
            "Blocks 15 Damage"
    };

    int [] skillPowers = {
            2,
            3,
            6,
            8,
            15
    };

    int [] skillEnergy = {
            0,
            1,
            1,
            2,
            3
    };

    int totalCards = attackNames.length + skillNames.length;

    private ArrayList<Card> allCards = new ArrayList<>();

    public CardGenerator(){
        // Initialize all attack cards
        for (int i = 0; i <  attackNames.length; i++){
            allCards.add(new AttackCard(attackNames[i], attackDescriptions[i], attackPowers[i], attackEnergy[i]));
        }

        // Initialize all skill cards
        for (int j = 0; j < skillNames.length; j++){
            allCards.add(new SkillCard(skillNames[j], skillDescriptions[j], skillPowers[j], skillEnergy[j]));
        }
    }

    void displayCards(){
        for (int i = 0; i < allCards.size(); i++){
            System.out.printf("""
                | Name: %-10s | Energy: %d
                | Type: %-10s | Description: %s%n
                """, allCards.get(i).getName(), allCards.get(i).getEnergy(), allCards.get(i).getType(), allCards.get(i).getDescription());
        }
    }

    Card getCard(int index){
        return allCards.get(index);
    }
}
