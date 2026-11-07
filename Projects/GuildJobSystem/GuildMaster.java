package GuildJobSystem;

public class GuildMaster {
    void processReward(Payable job){
        double finalGold = job.calculatePayout();
        System.out.printf("The Guild Master hands over $%.2f Gold", finalGold);
    }
}
