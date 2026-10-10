package DungeonArenaVersion2;

public class Characters {
    String name;
    String role;
    int health;
    double attackPower;
    int defense;
    double attackDamage;
    int attack1Power;
    int attack2Power;
    String attackName1;
    String attackName2;
    String attack1Description;
    String attack2Description;
    int attack2Cooldown;
    boolean isAttack2InCooldown;
    boolean isAttack2OnCast;

    Characters(String name){
        this.name = name;
    }

    void displayStats () {
        System.out.printf("""
                Name: %s
                Role: %s
                Health: %d
                Attack Power: %d
                Defense: %d%n""", name, role, health, (int) attackPower, defense);
    }

    void attack(Characters character, int move, Monsters monster){
        if (character.role.equalsIgnoreCase("warrior")) {
            if (move == 1) {
                attackDamage = attack1Power * (attackPower / monster.defense);
                monster.health -= (int) attackDamage;
            }

            else if (move == 2) {
                attackDamage = attack2Power * (attackPower / monster.defense);
                monster.health -= (int) attackDamage;
                attackPower += 5;
                isAttack2OnCast  = true;
                attack2Cooldown = 3;
            }
        }

        if (character.role.equalsIgnoreCase("mage")) {
            if (move == 1) {
                attackDamage = attack1Power * (attackPower / monster.defense);
                monster.health -= (int) attackDamage;
            }

            else if (move == 2) {
                attackDamage = attack2Power * (attackPower / monster.defense);
                monster.health -= (int) attackDamage;
                double freezeChance = 0.3;

                if (Math.random() <= freezeChance){
                    System.out.println("You Froze the Enemy");
                    monster.isControlled = true;
                }

                attack2Cooldown = 2;
                isAttack2InCooldown = true;
            }
        }

        if (character.role.equalsIgnoreCase("vanguard")) {
            if (move == 1) {
                attackDamage = attack1Power * (attackPower / monster.defense);
                monster.health -= (int) attackDamage;
            }

            else if (move == 2) {
                attackDamage = attack2Power * (attackPower / monster.defense);
                monster.health -= (int) attackDamage;
                health += 25;
                attack2Cooldown = 4;
            }
        }
    }
}

class Warrior extends Characters {
    Warrior(String name){
        super(name);

        this.role = "Warrior";
        this.health = 130;
        this.attackPower = 25;
        this.defense = 20;

        this.attackName1 = "Heavy Slash";
        this.attack1Power = 30;
        this.attack1Description = "Slashes the Enemy Heavily";

        this.attackName2 = "War Cry";
        this.attack2Power = 10;
        this.attack2Description = "Screams and Increases Attack by 5";
    }
}

class Mage extends Characters {
    Mage(String name){
        super(name);

        this.role = "Mage";
        this.health = 80;
        this.attackPower = 40;
        this.defense = 10;

        this.attackName1 = "Ember";
        this.attack1Power = 25;
        this.attack1Description = "Expels a Fire Spell and Burns the Enemy";

        this.attackName2 = "Frostbite";
        this.attack2Power = 40;
        this.attack2Description = "Conjures a Blizzard and 30% chance to Freeze Opponent";
    }

}

class Vanguard extends Characters {
    Vanguard(String name){
        super(name);

        this.role = "Vanguard";
        this.health = 170;
        this.attackPower = 15;
        this.defense = 35;

        this.attackName1 = "Shield Bash";
        this.attack1Power = 20;
        this.attack1Description = "Slams the Enemy using a Shield";

        this.attackName2 = "Fortify";
        this.attack2Power = 5;
        this.attack2Description = "Releases a Shockwave and Heals Health and Increases Defense by 5";
    }
}