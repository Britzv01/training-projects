package DungeonArenaVersion2;

public class Monsters {
    String type;
    int health;
    double defense;
    double attackPower;
    static int activeMonsters = 0;
    boolean isDefeated;
    String attack1Name;
    int attack1Power;
    double enemyAttackDamage;
    boolean isControlled = false;

    Monsters(int enemyChoice) {
        if (enemyChoice == 0) {
            this.type = "Slime";
            this.health = 60;
            this.defense = 10;
            this.attackPower = 10;
            this.isDefeated = false;

            this.attack1Name = "Acid Splash";
            this.attack1Power = 15;
        }

        if (enemyChoice == 1) {
            this.type = "Goblin";
            this.health = 90;
            this.defense = 15;
            this.attackPower = 20;
            this.isDefeated = false;

            this.attack1Name = "Stab";
            this.attack1Power = 25;
        }

        if (enemyChoice == 2) {
            this.type = "Skeleton";
            this.health = 70;
            this.defense = 5;
            this.attackPower = 35;
            this.isDefeated = false;

            this.attack1Name = "Bone Dart";
            this.attack1Power = 35;
        }

        if (enemyChoice == 3) {
            this.type = "Witch";
            this.health = 110;
            this.defense = 20;
            this.attackPower = 30;
            this.isDefeated = false;

            this.attack1Name = "Life Drain";
            this.attack1Power = 20;
        }

        if (enemyChoice ==  4) {
            this.type = "Troll";
            this.health = 220;
            this.defense = 30;
            this.attackPower = 20;
            this.isDefeated = false;

            this.attack1Name = "Earthquake";
            this.attack1Power = 50;
        }

        activeMonsters++;
    }

    void attack(String enemy, Characters hero) {
        if (enemy.equalsIgnoreCase("slime")) {
            enemyAttackDamage = attack1Power * (attackPower / hero.defense);
            hero.health -= (int) enemyAttackDamage;

            hero.defense -= 2;
            System.out.println("Attack reduced your defense by 2");
        }

        else if (enemy.equalsIgnoreCase("goblin")){
            enemyAttackDamage = attack1Power * (attackPower / hero.defense);
            hero.health -= (int) enemyAttackDamage;
        }

        else if (enemy.equalsIgnoreCase("skeleton")){
            enemyAttackDamage = attack1Power * (attackPower / hero.defense);
            hero.health -= (int) enemyAttackDamage;

            System.out.println("Enemy received 10 recoil damage");
            this.health -= 10;
        }

        else if (enemy.equalsIgnoreCase("witch")){
            enemyAttackDamage = attack1Power * (attackPower / hero.defense);
            hero.health -= (int) enemyAttackDamage;
            this.health += (int) enemyAttackDamage;
            System.out.println("Enemy healed for " + enemyAttackDamage);
        }

        else if (enemy.equalsIgnoreCase("troll")){
            if (Math.random() <= 0.4) {
                System.out.println("Enemy attack missed");
            }

            else {
                enemyAttackDamage = attack1Power * (attackPower / hero.defense);
                hero.health -= (int) enemyAttackDamage;
            }
        }
    }
}
