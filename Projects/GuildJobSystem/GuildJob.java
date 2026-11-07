package GuildJobSystem;

public abstract class GuildJob implements Payable {
    String title;
    double baseReward;

    GuildJob(String title, double baseReward){
        this.title = title;
        this.baseReward = baseReward;
    }

    abstract boolean attemptJob();

    @Override
    public String toString(){
        String display = String.format("""
               | Job: %s              
               | Base Reward: $%.2f
                """, title, baseReward);
        return display;
    }
}
