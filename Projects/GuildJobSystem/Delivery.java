package GuildJobSystem;

public class Delivery extends GuildJob{
    int distance;
    double travelTax = 10;

    Delivery(String title, double baseRewards, int distance){
        super(title, baseRewards);
        this.distance = distance;
    }

    @Override
    boolean attemptJob(){
        System.out.printf("Travelled [%d] miles to deliver the package. %s", distance);
        return true;
    }

    @Override
    public double calculatePayout(){
        return baseReward - travelTax;
    }
}
