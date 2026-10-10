package DungeonArenaVersion2;

public class Items {
    String [] itemName = new String[4];
    int [] itemBuff = new int[4];
    double [] itemDropOdds = new double[4];
    String [] itemDescription = new String[4];
    String [] itemFunction = new String[4];
    int [] itemQuantity = new int[4];
    static int numItems;

    Items(){
        itemName[0] = "Health Potion";
        itemBuff[0] = 50;
        itemDropOdds[0] = 0.4;
        itemDescription[0] = "Heals 50 HP";
        itemFunction[0] = "Heal";
        itemQuantity[0] = 0;
        numItems++;

        itemName[1] = "Whetstone";
        itemBuff[1] = 5;
        itemDropOdds[1] = 0.2;
        itemDescription[1] = "+5 Attack";
        itemFunction[1] = "Attack";
        itemQuantity[1] = 0;
        numItems++;

        itemName[2] = "Iron Plating";
        itemBuff[2] = 5;
        itemDropOdds[2] = 0.2;
        itemDescription[2] = "+5 Defense";
        itemFunction[2] = "Defense";
        itemQuantity[2] = 0;
        numItems++;

        itemName[3] = "Energy Vial";
        itemBuff[3] = 5;
        itemDropOdds[3] = 0.1;
        itemDescription[3] = "Resets Cooldown";
        itemFunction[3] = "Cooldown";
        itemQuantity[3] = 0;
        numItems++;
    }

    void useItem(Characters hero, int itemChoice) {
        if (itemChoice == 1) {
            hero.health += itemBuff[itemChoice - 1];
            System.out.println("You healed for " + itemBuff[itemChoice - 1]);
        }

        else if (itemChoice == 2) {
            hero.attackPower += itemBuff[itemChoice - 1];
            System.out.println("You increased your attack by " + itemBuff[itemChoice - 1]);
        }

        else if (itemChoice == 3) {
            hero.defense += itemBuff[itemChoice - 1];
            System.out.println("You increased your defense by " + itemBuff[itemChoice - 1]);
        }

        else if (itemChoice == 4) {
            hero.attack2Cooldown = 0;
            System.out.println("You refreshed all your skills!");
        }
    }
}