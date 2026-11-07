package GuildJobSystem;
import java.util.Random;

public class BountyHunt extends GuildJob {
    double hazardBonus = 50;

    BountyHunt(String title, double baseRewards){
        super(title, baseRewards);
    }

    @Override
    boolean attemptJob() {
        Random random = new Random();

        int randomValue = random.nextInt(1, 101);

        boolean result =  randomValue > 30 ? true : false;

        if (result){
            System.out.println("Monster has been slain!");
            return true;
        }

        else {
            System.out.println("Monster escaped!");
            return false;
        }
    }

    @Override
    public double calculatePayout() {
        return baseReward + hazardBonus;
    }
}
