package GuildJobSystem;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        GuildMaster master = new GuildMaster();

        GuildJob[] board = {
                new BountyHunt("Slay the Spire", 1200),
                new BountyHunt("Kill the loathsome Orc at Kinley Forest", 200),
                new Delivery("Deliver to Quagmire of Asura", 50, 100),
                new BountyHunt("Fetch mana crystals in the Arcane Caverns", 40),
                new Delivery("Deliver the molten heart to Charmie", 20, 300)
        };

        for (int i = 0; i < board.length; i++){
            System.out.print(board[i]);
            System.out.println("------------------");
        }

        System.out.println("Enter the title of the job you want to take: ");
        String job = scan.nextLine().replace(" ", "");
        System.out.println("------------------");

        boolean isFound = false;
        for (int j = 0; j < board.length; j++){
            if (job.equalsIgnoreCase(board[j].title.replace(" ", ""))){
                isFound = true;

                if(board[j].attemptJob()){
                    master.processReward(board[j]);
                    break;
                }

                else {
                    System.out.println("------------------");
                    System.out.println("You failed the job!");
                }
            }
        }

        if (!isFound){
            System.out.println("Job not found!");
        }

        scan.close();
    }
}
