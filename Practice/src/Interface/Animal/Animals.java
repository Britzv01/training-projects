package Interface.Animal;

public class Animals {
    public static void main(String [] args){
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();


        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}

class Rabbit implements Prey {

    @Override
    public void flee(){
        System.out.println("Rabbit flees");
    }
}

class Hawk implements Predator {

    @Override
    public void hunt(){
        System.out.println("Hawk hunts");
    }
}

class Fish implements Predator, Prey {

    @Override
    public void flee(){
        System.out.println("Fish flees");
    }

    @Override
    public void hunt(){
        System.out.println("Fish hunts");
    }
}