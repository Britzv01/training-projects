package SlayTheSpire.CardLogic;

public abstract class Card {
    private final String type;
    private final String name;
    private final String description;
    private final int energy;

    Card(String type, String name, String description, int energy) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.energy = energy;
    }

    void displayCard(){
        System.out.printf("""
                 ------------------------------------
                | Name: %-10s | Energy: %-10d
                | Type: %-10s | Description: %-10s
                 ------------------------------------
                """, name, energy, type, description);
    }

    String getName(){
        return this.name;
    }

    String getType(){
        return this.type;
    }

    String getDescription(){
        return this.description;
    }

    int getEnergy(){
        return this.energy;
    }
}
