package DungeonArenaVersion2;

import java.util.Scanner;

public class DungeonArenaVer2 {
    Scanner scan = new Scanner(System.in);
    Monsters [] enemy = new Monsters[5];
    Items item = new Items();
    int enemyType;

    DungeonArenaVer2(){
        for (int i = 0; i < enemy.length; i++){
            enemy[i] = new Monsters(i);
        }
    }

    Characters characterSelect(){
        System.out.print("Enter name: ");
        String name = scan.nextLine();

        while(true){
            System.out.println("----------------");
            System.out.println("""
                    Select a Role:
                    · Warrior
                    · Mage
                    · Vanguard""");
            System.out.print(": ");
            String role = scan.nextLine().toLowerCase();
            System.out.println("----------------");

            if ((!role.equals("warrior")) && (!role.equals("mage")) && !role.equals("vanguard")) {
                System.out.println("Invalid Role!");
                System.out.println("----------------");
                continue;
            }

            Characters character = new Characters(name);
            character.displayStats();
            System.out.println("----------------");
            return character;
        }
    }

    Monsters enemySelect() {
        while(true) {
            System.out.println("Select an Enemy");
            for (int i = 0; i < enemy.length; i++) {
                System.out.printf("[%d] - %-8s | %s%n", (i + 1), enemy[i].type, (!enemy[i].isDefeated) ? "Available" : "Defeated");
            }
            System.out.print(": ");
            enemyType = scan.nextInt() - 1;

            if (enemy[enemyType].isDefeated) {
                System.out.println("------------------");
                System.out.println("Enemy is Defeated! Choose Again!");
                System.out.println("------------------");
                continue;
            }

            break;
        }

        System.out.println("----------------");
        System.out.printf("You encountered a %s!%n", enemy[enemyType].type);
        System.out.printf("Enemy Health: %d%n", enemy[enemyType].health);

        return enemy[enemyType];
    }

    void attackOption(Characters character, Monsters enemy) {
        int move;

        while(true) {
            System.out.println("----------------");
            System.out.printf("""
                            Attack the Enemy
                            [1] - %-12s | %d  | Cooldown: %d
                            Description: %s
                            [2] - %-12s | %d  | Cooldown: %d
                            Description: %s
                            [3] - Exit%n""", character.attackName1, character.attack1Power, 0, character.attack1Description,
                    character.attackName2, character.attack2Power, character.attack2Cooldown, character.attack2Description);
            System.out.print(": ");
            move = scan.nextInt();

            if (move == 3) {
                break;
            }

            else if (move == 2 && character.attack2Cooldown > 0) {
                System.out.println("Skill in Cooldown!");
                continue;
            }

            else if ((move != 1) && (move != 2)) {
                System.out.println("Invalid Attack!");
                continue;
            }

            System.out.println("----------------");

            switch (move) {
                case 1 -> {
                    System.out.println("You used " + character.attackName1);
                    character.attack(character, move, enemy);
                    System.out.println("You dealt " + (int) character.attackDamage);
                }
                case 2 -> {
                    System.out.println("You used " + character.attackName2);
                    character.attack(character, move, enemy);
                    System.out.println("You dealt " + (int) character.attackDamage);
                }
            }

            if (enemy.health > 0) {
                System.out.println("Enemy Health: " + enemy.health);
                System.out.println("----------------");

                System.out.println("Enemy used " + enemy.attack1Name);
                enemy.attack(enemy.type, character);
                System.out.println("Enemy dealt " + (int) enemy.enemyAttackDamage);

                if (character.health <= 0) {
                    System.out.println("Health: " + 0);
                    System.out.println("----------------");
                    System.out.println("Defeated! Try Again!");
                    System.out.println("----------------");
                    break;
                }

                System.out.println("Your Health: " + character.health);
                break;

            }

            if (character.isAttack2OnCast) {
                character.isAttack2OnCast = false;
                continue;
            }

            character.attack2Cooldown--;

            if (enemy.health <= 0) {
                System.out.println("----------------");
                System.out.println("You successfully defeated the enemy " + enemy.type);
                enemy.isDefeated = true;
                Monsters.activeMonsters--;
                character.attack2Cooldown = 0;
                System.out.println("----------------");
                break;
            }
        }
    }

    void checkInventory(Characters character){
        while(true) {
            System.out.println("----------------");
            System.out.println("Available Inventory");
            for (int j = 0; j < Items.numItems; j++){
                System.out.printf("""
                    [%d] - %-15s | %-15s | %d
                    """, (j + 1), item.itemName[j], item.itemDescription[j], item.itemQuantity[j]);
            }
            System.out.printf("[%d] - Exit%n", Items.numItems + 1);
            System.out.print(": ");
            int itemChoice = scan.nextInt();
            System.out.println("----------------");

            if (itemChoice == (Items.numItems + 1)) {
                break;
            }

            if (item.itemQuantity[itemChoice] <= 0) {
                System.out.println("Invalid Item!");
                continue;
            }

            item.useItem(character, itemChoice);
            character.attack2Cooldown--;
            break;
        }
    }

    public static void main(String[] args) {
        DungeonArenaVer2 game = new DungeonArenaVer2();
        int gameChoice;

        System.out.println("Dungeon Arena V2");
        System.out.println("----------------");

        Characters character = game.characterSelect();

        while(Monsters.activeMonsters > 0) {
            Monsters enemy = game.enemySelect();
            System.out.println("----------------");

            while (character.health > 0 && enemy.health > 0){
                System.out.println("""
                        Select Choice: 
                        [1] - Attack 
                        [2] - Check Inventory""");
                System.out.print(": ");
                gameChoice = game.scan.nextInt();

                if (gameChoice == 1) {
                    game.attackOption(character, enemy);
                }

                else if (gameChoice == 2) {
                    game.checkInventory(character);
                }
            }
            if (character.health <= 0) {
                break;
            }
        }
        game.scan.close();
    }
}